package com.itheima.ssm.service;


import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @Author : shi zhao heng
 * @Date :   2021/2/6 20:53
 * @Description :
 */
public interface IUserService extends UserDetailsService{
    List<UserInfo> findAll() throws Exception;;

    void save(UserInfo userInfo) throws Exception;

    UserInfo findById(String id) throws Exception;
}
