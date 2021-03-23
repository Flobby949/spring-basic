package top.flobby.boot.jdbc.service;


import top.flobby.boot.jdbc.entity.User;

import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/18
 * @description :
 */

public interface UserService {
    boolean postUser(User user);
    List<User> getAll();
}
