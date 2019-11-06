package com.offcn.dao;

import com.offcn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lijun
 * @date 2019/11/5 10:24
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
