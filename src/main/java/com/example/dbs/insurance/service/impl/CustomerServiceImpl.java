package com.example.dbs.insurance.service.impl;

import com.example.dbs.insurance.entity.Customer;
import com.example.dbs.insurance.mapper.CustomerMapper;
import com.example.dbs.insurance.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author PuW
 * @since 2023-12-23
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
