package org.nccu.training.cicd.service;


import org.nccu.training.cicd.model.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findByEmail(String email);

    public Account findByUserId(String id);
}
