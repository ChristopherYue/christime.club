package club.christime.writing.dao;

import club.christime.writing.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void insert() {
        User user = new User();
        user.setUserId(1L);
        user.setUserName("CHRS");
        userDao.insert(user);
    }
}