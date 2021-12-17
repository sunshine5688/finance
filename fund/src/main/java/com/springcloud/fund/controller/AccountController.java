package com.springcloud.fund.controller;


import com.springcloud.common.vo.ResultMessage;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/fund")
public class AccountController {
    @PostMapping("/account/balance/{userId}/{amount}")
    public ResultMessage deductingBalance(@PathVariable("userId") String userId, @PathVariable("amount") String amount,
                                          HttpServletRequest request){
        // 打印当前服务的端口用于监测
        String message = "端口：【" + request.getServerPort() + "】扣减成功";
        System.out.println(message);
        ResultMessage resultMessage = new ResultMessage(true, message);
        return resultMessage;

    }

    @GetMapping("/account/balance/{userId}/{amount}")
    public ResultMessage deductingBalance2(@PathVariable("userId") String userId, @PathVariable("amount") String amount,
                                          HttpServletRequest request){
        // 打印当前服务的端口用于监测
        String message = "端口：【" + request.getServerPort() + "】扣减成功";
        ResultMessage resultMessage = new ResultMessage(true, message);
        return resultMessage;

    }
}
