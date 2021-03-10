package com.webster.dao;

import com.webster.entity.User;
import com.webster.entity.Wrapper;

import java.io.IOException;
import java.util.List;

public interface WrapperRepository {

    Wrapper readAllFromJson() throws IOException;
    void saveWrapperAsJson(Wrapper wrapper) throws IOException;

}
