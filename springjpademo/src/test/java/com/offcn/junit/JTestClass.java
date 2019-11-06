package com.offcn.junit;

import com.offcn.SpringJpaApplication;
import com.offcn.mapper.UserMapper;
import com.offcn.pojo.MUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringJpaApplication.class)
public class JTestClass {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test01(){
        List<MUser> userList = userMapper.getUserList();
        System.out.println(userList);
    }
    @Test
    public void getRedis(){
        //存到redis数据库
        redisTemplate.opsForValue().set("uname","1234");
        // 取——上面存入的键（key），取时要加上“”
        String str = (String)redisTemplate.opsForValue().get("uname");
        MUser user = new MUser();
        user.setId(1);
        user.setUsername("小天使");
        user.setPassword("123");
        user.setName("泽村荣纯");
        redisTemplate.opsForValue().set("user",user);
        MUser user1 = (MUser) redisTemplate.opsForValue().get("user");
        System.out.println(user1);
    }

}
