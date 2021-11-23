package org.nccu.training.cicd.dao;

import org.nccu.training.cicd.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AccountDAO extends JpaRepository<Account, String> {

    public List<Account> findByEmail(String email);

    public Account findByUserId(String userId);
}
