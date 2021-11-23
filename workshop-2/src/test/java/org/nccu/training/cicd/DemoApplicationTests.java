package org.nccu.training.cicd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.nccu.training.cicd.application.SpringBootForCicdApplication;
import org.nccu.training.cicd.model.Account;
import org.nccu.training.cicd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = SpringBootForCicdApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Autowired
	AccountService accountService;

	@Test
	void contextLoads() {
		assertNotNull(new String("Spring Context Loaded"));
	}

	@Test
	void tset(){
		Account account = this.accountService.findByUserId("user6");
		Assertions.assertEquals(account.getEmail(), "user6@demo.com");
	}



}
