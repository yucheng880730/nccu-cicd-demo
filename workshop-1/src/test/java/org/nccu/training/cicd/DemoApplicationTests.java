package org.nccu.training.cicd;

import org.junit.jupiter.api.Test;
import org.nccu.training.cicd.application.SpringBootForCicdApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = SpringBootForCicdApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Test
	void contextLoads() {
		assertNotNull(new String("Spring Context Loaded"));
	}

}
