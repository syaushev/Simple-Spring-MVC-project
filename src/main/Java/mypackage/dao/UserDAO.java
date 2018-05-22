package mypackage.dao;

import mypackage.model.User;
import mypackage.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class UserDAO {
    private final Logger log= LoggerFactory.getLogger(UserDAO.class);

    String name="root";
    String password="100987";
    String url="jdbc:mysql://localhost:3306/my_dptest";


    public UserDAO() {

    }

    public void insertUser(User user){

//        User user=new User();
//        user.setName("Alex");
        try(Connection connection= DriverManager.getConnection(url,name,password)) {
            log.info("Connection is set");
            System.out.println("We are connected");
            System.out.println("User "+user.getName()+" has been added");

            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO user (name) VALUES (?);");


            preparedStatement.setString(1,user.getName());

            preparedStatement.execute();
            log.info("Statement has been executed");


        } catch (SQLException e) {
            e.printStackTrace();
            log.error("SQL exeption");
        }

    }





}
