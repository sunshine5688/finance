package com.springcloud.product.controller;


import com.springcloud.common.vo.ResultMessage;
import com.springcloud.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/purchase/{userId}/{productId}/{amount}")
    public ResultMessage purchaseProduct(@PathVariable("userId") String userId,
                                         @PathVariable("productId") String productId,
                                         @PathVariable("amount") String amount){

        ResultMessage rs = productService.purchaseProduct(userId,amount);

        return rs;
    }
}
