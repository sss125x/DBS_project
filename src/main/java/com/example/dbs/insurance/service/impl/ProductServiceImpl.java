package com.example.dbs.insurance.service.impl;

import com.example.dbs.insurance.entity.Product;
import com.example.dbs.insurance.mapper.ProductMapper;
import com.example.dbs.insurance.service.IProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
