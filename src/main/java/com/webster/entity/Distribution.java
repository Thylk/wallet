package com.webster.entity;

import java.util.Date;

public class Distribution {

    private int distributionId;
    private int amount;
    private Date startDate;
    private Date endDate;
    private int companyId;
    private int userId;

    public Distribution() {
    }

    public Distribution(int transactionId, int amount, Date startDate, Date endDate, int companyId, int userId) {
        this.distributionId = transactionId;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.companyId = companyId;
        this.userId = userId;
    }

    public int getTransactionId() {
        return distributionId;
    }

    public void setTransactionId(int transactionId) {
        this.distributionId = transactionId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
