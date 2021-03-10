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

public class UserRepositoryImpl implements UserRepository {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void saveUserListAsJson(Wrapper wrapper) throws IOException {
        String content = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(wrapper);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Level0/data/output.json"))) {
            writer.write(content);
        }
    }

    @Override
    public List<User> readAllUserFromJson() throws IOException {
        Wrapper userListFromJson = objectMapper.readValue(new File("Level0/data/output.json"), new TypeReference<Wrapper>(){});
        return userListFromJson.getUsers();
    }

}