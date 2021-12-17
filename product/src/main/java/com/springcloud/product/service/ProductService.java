package com.springcloud.product.service;

import com.springcloud.common.vo.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    public RestTemplate restTemplate;

    /**
     *
     * @param userId
     * @param amount
     * @return
     */
    public ResultMessage purchaseProduct(String userId, String amount){

        System.out.println("扣减产品余额。");
        String url = "http://FUND/fund/account/balance/{userId}/{amount}";
        Map params = new HashMap();
        params.put("userId",userId);
        params.put("amount", amount);

        ResultMessage resultMessage = restTemplate.postForObject(url,null,ResultMessage.class,params);
        System.out.println(resultMessage.getMessage());


        System.out.println("记录交易信息");
        return resultMessage;
    }
}
