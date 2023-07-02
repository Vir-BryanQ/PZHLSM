package edu.scu.pzhlsm.service;

import edu.scu.pzhlsm.dao.UserInfoDAO;
import edu.scu.pzhlsm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    public User getByIdAndPaswd(String id, String passwd) {
        List<User> users = userInfoDAO.findAll();
        for (User u : users) {
            if (id.equals(u.getId()) && passwd.equals(u.getPasswd())) {
                return u;
            }
        }
        return null;
    }


}
