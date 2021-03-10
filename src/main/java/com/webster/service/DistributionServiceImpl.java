package com.webster.service;

import com.webster.dao.WrapperRepository;
import com.webster.dao.WrapperRepositoryImpl;
import com.webster.entity.Company;
import com.webster.entity.Distribution;
import com.webster.entity.User;

import java.io.File;
import java.util.Date;

public class DistributionServiceImpl implements DistributionService {


    @Override
    public void giveGiftCards(int companyId, int userId, int amount, String startDate) {

        if (new File("Level1/data/output.json") != null) {

        } else {

        }

        if (.getBalance() >= amount) {

            int balance = company.getBalance();
            int newBalance = (balance-100);
            company.setBalance(newBalance);

            int userBalance = user.getBalance();
            int newUserBalance = (userBalance+100);
            user.setBalance(newUserBalance);

            //Distribution distribution = new Distribution(1, 100, new Date(), new Date(), company.getId(), user.getId());
        }

    }

}
