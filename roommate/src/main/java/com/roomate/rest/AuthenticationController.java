package com.roomate.rest;

import com.roomate.domain.Admin;
import com.roomate.domain.Customer;
import com.roomate.request.CustomerResponse;
import com.roomate.request.LoginRequest;
import com.roomate.request.CustomerRequest;
import com.roomate.service.AdminService;
import com.roomate.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/api/loan")
@Component
public class AuthenticationController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AdminService adminService;

    @POST
    @Path("/login")
    public CustomerResponse authenticate(LoginRequest loginRequest) {
        return customerService.authenticate(loginRequest.getEmailAddress(), loginRequest.getPassword());
    }

    @POST
    @Path("/customer")
    public void saveCustomer(CustomerRequest customerRequest) {
        Customer customer = getCustomerModel(customerRequest);
        customerService.saveCustomer(customer);
    }

    @POST
    @Path("/admin")
    public void saveAdmin(LoginRequest adminRequest) {
        Admin admin = getAdminModel(adminRequest);
        adminService.saveAdmin(admin);
    }

    private Customer getCustomerModel(CustomerRequest customerRequest) {

        Customer customer = new Customer();
        customer.setCustomerType(Customer.CustomerType.STANDARD);
        // customer.setAddress(customerRequest.getAddress());
        customer.setFirstName(customerRequest.getFirstName());
        customer.setLastName(customerRequest.getLastName());
        customer.setEmail(customerRequest.getEmailAddress());
        customer.setPassword(customerRequest.getPassword());

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = null;
        try {
            dt = formatter.parse(customerRequest.getBirthday());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        customer.setMobile(customerRequest.getMobilePhone());
        customer.setCustomerStatus(Customer.CustomerStatus.ACTIVE);

        return customer;
    }

    private Admin getAdminModel(LoginRequest adminRequest) {
        Admin admin = new Admin();
        admin.setFirstName(adminRequest.getFirstName());
        admin.setLastName(adminRequest.getLastName());
        admin.setEmail(adminRequest.getEmailAddress());
        admin.setPassword(adminRequest.getPassword());

        return admin;
    }
}
