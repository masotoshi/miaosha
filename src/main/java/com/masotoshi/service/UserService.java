package com.masotoshi.service;

import com.masotoshi.error.BusinessException;
import com.masotoshi.service.model.UserModel;

public interface UserService {
    //通过用户id获取用户
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;
    /*
    telphone：用户注册手机
    encrptPassword：用户加密后的密码
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
