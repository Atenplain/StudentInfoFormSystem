package org.sacc.smis.service;

import org.sacc.smis.entity.UpdatePasswordParam;
import org.sacc.smis.entity.User;
import org.sacc.smis.entity.UserLoginParam;
import org.sacc.smis.entity.UserRegisterParam;
import org.sacc.smis.exception.LoginException;
import org.sacc.smis.exception.UpdatePasswordException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 林夕
 * Date 2021/1/19 22:02
 */
public interface UserService {
    List<User> findAll();

    boolean register(UserRegisterParam userRegisterParam);

    boolean updateInfo(User user);

    boolean login(UserLoginParam userLoginParam) throws LoginException;

    boolean updatePassword(UpdatePasswordParam updatePasswordParam) throws UpdatePasswordException;
}
