package edu.scu.pzhlsm.service;

import edu.scu.pzhlsm.pojo.User;
import edu.scu.pzhlsm.util.Sha256;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getByIdAndPaswdTest() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String id = "0123456789";
        String passwd = Sha256.getSHA256("123456") ;


        Assert.assertEquals(new User(),userService.getByIdAndPaswd(id, passwd));

    }
}
