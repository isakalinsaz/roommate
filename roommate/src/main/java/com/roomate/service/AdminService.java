package com.roomate.service;

import com.roomate.domain.Admin;

/**
 * Created by dogukan.ozturkan on 28.11.2016.
 */
public interface AdminService {

    void saveAdmin(Admin admin);

    String authenticate(String emailAddress, String password);
}
