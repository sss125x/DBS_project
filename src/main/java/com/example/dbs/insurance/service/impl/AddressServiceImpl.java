package com.example.dbs.insurance.service.impl;

import com.example.dbs.insurance.entity.Address;
import com.example.dbs.insurance.mapper.AddressMapper;
import com.example.dbs.insurance.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
