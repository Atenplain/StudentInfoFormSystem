package org.sacc.smis.controller;

import org.sacc.smis.entity.UpdatePasswordParam;
import org.sacc.smis.entity.User;
import org.sacc.smis.entity.UserLoginParam;
import org.sacc.smis.entity.UserRegisterParam;
import org.sacc.smis.exception.LoginException;
import org.sacc.smis.exception.UpdatePasswordException;
import org.sacc.smis.model.RestResult;
import org.sacc.smis.model.UserInfo;
import org.sacc.smis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 林夕
 * Date 2021/1/19 20:19
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/register")
    public RestResult<Boolean> register( UserRegisterParam userRegisterParam){
        return RestResult.success(userService.register(userRegisterParam));
    }

    @ResponseBody
    @GetMapping("/findAll")
    public RestResult<List<User>> findAll(){
        return RestResult.success(userService.findAll());
    }

    @ResponseBody
    @PostMapping("/update")
    /**
     * Authentication authentication 从session中拿到用户信息
     */
    public RestResult<Boolean> update( User user, Authentication authentication){
        UserInfo userInfo = (UserInfo)authentication.getPrincipal();
        user.setId(userInfo.getId());
        return RestResult.success(userService.updateInfo(user));
    }

    @ResponseBody
    @GetMapping("/userInfo")
    @PreAuthorize("hasRole('STUDENT')")
    public RestResult<User> getUserInfo(Authentication authentication){
        UserInfo userInfo = (UserInfo)authentication.getPrincipal();
        // 隐藏密码等敏感信息
        userInfo.setPassword("n/a");
        return RestResult.success(userInfo);
    }

    /**
     * 登录
     * @param userLoginParam
     * @return
     * @throws LoginException
     */
    @ResponseBody
    @PostMapping("/login")
    public RestResult<Boolean> login(UserLoginParam userLoginParam) throws LoginException {
        return RestResult.success(userService.login(userLoginParam));
    }

    @ResponseBody
    @PostMapping("/updatePassword")
    public RestResult<Boolean> updatePassword(UpdatePasswordParam updatePasswordParam) throws UpdatePasswordException {
        return RestResult.success(userService.updatePassword(updatePasswordParam));
    }

}
