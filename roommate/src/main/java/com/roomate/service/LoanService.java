package com.roomate.service;

import com.roomate.domain.Customer;
import com.roomate.domain.Loan;
import com.roomate.request.LoanRequest;

import java.util.List;

/**
 * Created by dogukan.ozturkan on 28.11.2016.
 */
public interface LoanService {

        void saveApply(LoanRequest loanRequest, Customer customer);

        List<Loan> getLoanApplyByCustomerId(long customerId);

        List<Loan> findByIpAddressAndCustomerId(String ipAddress, long customerId);
}
