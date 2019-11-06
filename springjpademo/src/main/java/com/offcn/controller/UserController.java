package com.offcn.controller;

import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import com.offcn.mapper.UserMapper;
import com.offcn.pojo.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//@RestController
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/getUserMap")
    public List<User> showUserList(){
        return userDao.findAll();
    }
    @RequestMapping("/getUserList")

    public String getUserList(Model model){
        List<User> userlist = userDao.findAll();
        model.addAttribute("userList",userlist);
        return "user";
    }
    //SpringBoot整合mybatis
    @RequestMapping("/getMUserList")
    public String getMUserList(Model model){
        List<MUser> mUserslist = userMapper.getUserList();
        model.addAttribute("muserList",mUserslist);
        return "user";
    }
}
