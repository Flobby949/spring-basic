package top.flobby.boot.jdbc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.flobby.boot.jdbc.dao.UserDAO;
import top.flobby.boot.jdbc.entity.User;
import top.flobby.boot.jdbc.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/18
 * @description :
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;
    @Override
    public boolean postUser(User user) {
        User saveUser = userDAO.postUser(user);
        return saveUser != null;
    }

    @Override
    public List<User> getAll() {
        List<User> userList = userDAO.selectAll();
        return userList;
    }
}
