package mypackage.service;


import mypackage.dao.UserDAO;
import mypackage.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final Logger log= LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDAO userDAO;

    public void insertUser(){

        User user=new User();
        user.setName("Alex");
        log.info("Name of user is chosen and set. It is "+user.getName());
        userDAO.insertUser(user);

    }



}