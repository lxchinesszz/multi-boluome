package iflyer;

import iflyer.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.CrossOrigin;

import static org.junit.Assert.*;

/**
 * @Package: iflyer
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/3/23 上午10:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = IflyerApplication.class)
public class IflyerApplicationTest {
    @Autowired
    UserDao userDao;
    @Test
    public void getUser() throws Exception {
        System.out.println(userDao.getUser("liuixn").getName());
    }
}