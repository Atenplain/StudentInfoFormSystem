package org.sacc.smis.service;

import org.sacc.smis.entity.User;
import org.sacc.smis.entity.UserRegisterParam;

import java.util.List;

/**
 * Created by 林夕
 * Date 2021/1/19 22:02
 */
public interface UserService {
    List<User> findAll();

    boolean register(UserRegisterParam userRegisterParam);

    boolean updateInfo(User user);

    boolean modify(User user, String oldPassword, String newPassword);
}
