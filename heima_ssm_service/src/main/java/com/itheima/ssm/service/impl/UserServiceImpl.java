package com.itheima.ssm.service.impl;

import com.itheima.ssm.service.IUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author : shi zhao heng
 * @Date :   2021/2/6 20:54
 * @Description :
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService{
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
