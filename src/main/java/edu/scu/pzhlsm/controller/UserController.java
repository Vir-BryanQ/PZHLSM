package edu.scu.pzhlsm.controller;

import edu.scu.pzhlsm.pojo.User;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.UserService;
import edu.scu.pzhlsm.util.Sha256;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String id = requestUser.getId();
        id = HtmlUtils.htmlEscape(id);
        String passwd = requestUser.getPasswd();
        passwd = HtmlUtils.htmlEscape(passwd);
        passwd = Sha256.getSHA256(passwd);

        if (userService.getByIdAndPaswd(id, passwd) == null) {
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
