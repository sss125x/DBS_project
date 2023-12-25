package com.example.dbs.insurance.controller;

import com.example.dbs.insurance.entity.Account;
import com.example.dbs.insurance.service.IAccountService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author PuW
 * @since 2023-12-22
 */
@RestController
@RequestMapping("/insurance/account")
public class AccountController {
    @Resource
    IAccountService iAccountService;

    @GetMapping("{id}")
    public ResponseEntity<Account> test(@PathVariable("id") int id) {
        Account res = iAccountService.getById(id);
        System.out.println(iAccountService.getById(id));
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping
    public boolean Login(@RequestParam(value = "id") Integer id, @RequestParam(value = "pwd") String pwd) {
        System.out.println(id);
        System.out.println(pwd);
        String realP = iAccountService.getById(id).getPassword();
        System.out.println(realP);
        return realP.equals(pwd);
    }

    @PostMapping("signup")
    public ResponseEntity<String> Signup(@RequestParam(value = "AccountName", defaultValue = "test") String name, @RequestParam(value = "pwd", defaultValue = "test") String pwd, @RequestParam(value = "id", defaultValue = "1") Integer id) {
        System.out.println("signup");
        System.out.println(id);
        System.out.println(pwd);
        System.out.println(name);
        if (iAccountService.getById(id) != null)
            return new ResponseEntity<>("duplicate userID", HttpStatus.OK);
        else {
            Account newAcc = new Account();
            newAcc.setAccountID(id);
            newAcc.setAccountName(name);
            newAcc.setPassword(pwd);
            newAcc.setStartDate(LocalDateTime.now());
            if (iAccountService.save(newAcc))
                return new ResponseEntity<>("created successfully", HttpStatus.OK);
            else
                return new ResponseEntity<>("dont know why cannot create", HttpStatus.OK);
        }
    }
}
