package com.webster.entity;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Wrapper {

    private List<Company> companies;
    private List<User> users;
    private List<Distribution> distributions;

    public Wrapper() {
    }

    // Contructor Level0
    public Wrapper(List<User> users) {
        this.users = users;
    }

    // Constructor Level1
    public Wrapper(List<User> users, List<Company> companies, List<Distribution> distributions) {
        this.users = users;
        this.companies = companies;
        this.distributions = distributions;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Distribution> getDistributions() {
        return distributions;
    }

    public void setDistributions(List<Distribution> distributions) {
        this.distributions = distributions;
    }

}
