package com.webster.dao;

import com.webster.entity.User;
import com.webster.entity.Wrapper;

import java.io.IOException;
import java.util.List;

public interface UserRepository {

    void saveUserListAsJson(Wrapper wrapper) throws IOException;
    List<User> readAllUserFromJson() throws IOException;

}
