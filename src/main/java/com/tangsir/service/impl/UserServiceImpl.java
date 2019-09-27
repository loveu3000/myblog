package com.tangsir.service.impl;

import com.tangsir.entity.User;
import com.tangsir.mapper.UserMapper;
import com.tangsir.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 唐sir
 * @since 2019-08-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
