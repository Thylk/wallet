package com.webster;

import com.webster.dao.WrapperRepository;
import com.webster.dao.WrapperRepositoryImpl;
import com.webster.entity.Company;
import com.webster.entity.Distribution;
import com.webster.entity.Wrapper;
import com.webster.service.DistributionService;
import com.webster.service.DistributionServiceImpl;

import java.io.IOException;
import java.util.List;

public class MainLevel1 {

    public static void main(String[] args) throws IOException {

        // from input to output
        WrapperRepository wrapperRepository = new WrapperRepositoryImpl();
        Wrapper wrapper = wrapperRepository.readAllFromJson();
        wrapperRepository.saveWrapperAsJson(wrapper);


        /*
        Company company = new Company(1, "Google", 1000);
        System.out.println(company.toString());
        User userToGift = new User("Abdel", 300);
        System.out.println(userToGift.toString());
        CompanyService companyService = new CompanyServiceImpl();
        if (companyService.checkBalance(company)) {
            companyService.giveGiftCards(company, userToGift);
        }
        System.out.println(company.toString());
        System.out.println(userToGift.toString());
        */
    }
}
