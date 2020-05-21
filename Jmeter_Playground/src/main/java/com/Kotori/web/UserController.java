package com.Kotori.web;

import com.Kotori.domain.AjaxResult;
import com.Kotori.domain.User;
import com.Kotori.domain.WebCounter;
import org.apache.shiro.crypto.hash.Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;

@Controller
public class UserController {
    @Autowired
    private WebCounter webCounter;

    @RequestMapping("/userAdd.action")
    @ResponseBody
    public AjaxResult userAdd(User user) {
        System.out.println(user);
        AjaxResult ajaxResult = new AjaxResult();

        ajaxResult.setResult(true);
        ajaxResult.setMsg("successful");

        return ajaxResult;
    }

    @RequestMapping("/userClick.action")
    public void userClick(){
        webCounter.setUserClickCounter(webCounter.getUserClickCounter() + 1);
        System.out.println(webCounter.getUserClickCounter());
    }
}
