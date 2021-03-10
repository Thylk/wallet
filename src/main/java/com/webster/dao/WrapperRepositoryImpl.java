package com.webster.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webster.entity.User;
import com.webster.entity.Wrapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WrapperRepositoryImpl implements WrapperRepository {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Wrapper readAllFromJson() throws IOException {
        Wrapper wrapper = objectMapper.readValue(new File("Level1/data/output.json"), new TypeReference<Wrapper>(){});
        System.out.println(wrapper);
        return wrapper;
    }

    @Override
    public void saveWrapperAsJson(Wrapper wrapper) throws IOException {
        String content = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(wrapper);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Level1/data/output.json"))) {
            writer.write(content);
        }
    }

}
