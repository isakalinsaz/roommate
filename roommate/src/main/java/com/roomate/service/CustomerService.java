package com.roomate.service;

import com.roomate.domain.Customer;
import com.roomate.request.CustomerResponse;

/**
 * Created by dogukan.ozturkan on 28.11.2016.
 */
public interface CustomerService {

    CustomerResponse authenticate(String emailAddress, String password);

    void saveCustomer(Customer customer);

    Customer findOne(long customerId);

}
