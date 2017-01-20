package iflyer.dao;

import iflyer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

/**
 * Created by liuxin on 17/1/20.
 * 此类提供两个方法
 * 1.保存用户
 * 2.根据用户名得到用户info
 */
@Component
public class UserDao {
    @Autowired
    MongoTemplate mongoTemplate;

    public User getUser(String name) {
        User user = mongoTemplate.findOne(new Query(Criteria.where("name").is(name)), User.class);
        if (user == null) {
            user = new User("不存在该用户", "xx");
        }
        return user;
    }

    public User saveUser(String name,String age){
        mongoTemplate.save(new User(name,age));
        return mongoTemplate.findOne(new Query(Criteria.where("name").is(name)), User.class);
    }
}
