package org.nccu.training.cicd.controller;

//import org.nccu.training.cicd.controller.vo.DemoReq;
//import org.nccu.training.cicd.model.Account;
//import org.nccu.training.cicd.service.AccountService;
import org.nccu.training.cicd.controller.vo.DemoResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/nccu/demo")
public class DemoRestController {

//    @Autowired
//    private AccountService accountService;

    public DemoRestController() {
        System.out.println("init controller");
    }

    @GetMapping("/say/hello/{yourName}")
    public DemoResp sayHello(@PathVariable("yourName") String yourName) {
        DemoResp demoResp = new DemoResp(
                HttpStatus.OK.value(),
                "Hello World, " + yourName
        );

        return demoResp;
    }

//    @GetMapping("/account/{userId}")
//    public Account getAccountByUserId(@PathVariable("userId") String userId) {
//        return this.accountService.findByUserId(userId);
//    }

}
