package org.nccu.training.cicd.service.impl;

import org.nccu.training.cicd.dao.AccountDAO;
import org.nccu.training.cicd.model.Account;
import org.nccu.training.cicd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public List<Account> findByEmail(String email) {
        return this.accountDAO.findByEmail(email);
    }

    @Override
    public Account findByUserId(String id) {
        return this.accountDAO.findByUserId(id);
    }
}
