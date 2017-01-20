package iflyer.service;

import iflyer.dao.UserDao;
import iflyer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuxin on 17/1/20.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUser(String name){
        return userDao.getUser(name);
    }

    public User saveUser(String name,String age){
        return userDao.saveUser(name,age);
    }
}
