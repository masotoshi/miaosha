package com.masotoshi;


import com.masotoshi.error.BusinessException;
import com.masotoshi.service.UserService;
import com.masotoshi.service.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Apptest {
    @Autowired
    private UserService userService;
    @Test
    public void addUser() throws BusinessException {
        UserModel userModel = new UserModel();
        userModel.setTelphone("11111111");
        userModel.setEncrptPassword("123");
        userModel.setGender(1);
        userModel.setAge(1);
        userModel.setName("小新");
        userModel.setThirdPartyId("byphone");
        userService.register(userModel);
    }
}
