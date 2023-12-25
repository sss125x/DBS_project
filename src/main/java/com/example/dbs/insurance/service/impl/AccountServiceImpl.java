package com.example.dbs.insurance.service.impl;

import com.example.dbs.insurance.entity.Account;
import com.example.dbs.insurance.mapper.AccountMapper;
import com.example.dbs.insurance.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author PuW
 * @since 2023-12-22
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
