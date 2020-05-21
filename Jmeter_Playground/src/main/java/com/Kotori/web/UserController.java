package com.Kotori.web;

import com.Kotori.domain.AjaxResult;
import com.Kotori.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/userAdd.action")
    @ResponseBody
    public AjaxResult userAdd(User user) {
        System.out.println(user);
        AjaxResult ajaxResult = new AjaxResult();

        ajaxResult.setResult(true);
        ajaxResult.setMsg("successful");

        return ajaxResult;
    }
}
