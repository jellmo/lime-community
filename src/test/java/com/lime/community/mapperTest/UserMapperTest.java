package com.lime.community.mapperTest;

import com.lime.community.entity.User;
import com.lime.community.repository.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * <p></p>
 *
 * @author mohe
 * @date 2022-02-20 11:58:29
 */
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
//        User user = userMapper.selectById(101);
//        System.out.println(user);

//        User user = userMapper.selectByName("liubei");
//        System.out.println(user);

        User user = userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(user);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("123456");
        user.setSalt("abc");
        user.setEmail("test@qq.com");
        user.setHeaderUrl("http://images.nowcoder.com/head/101t.png");
        user.setCreatTime(new Date());

        int row = userMapper.insertUser(user);
        System.out.println(row);
        System.out.println(user.getId());
    }

    @Test
    public void testUpdate() {
        System.out.println(userMapper.updateHeader(150, "http://images.nowcoder.com/head/150t.png"));
        System.out.println(userMapper.updateStatus(150, 1));
        System.out.println(userMapper.updatePassword(150, "hello"));
    }
}
