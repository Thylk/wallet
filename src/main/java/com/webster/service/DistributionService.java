package com.webster.service;

import com.webster.entity.Company;
import com.webster.entity.User;

public interface DistributionService {

    void giveGiftCards(int companyId, int userId, int amount, String startDate);

}
