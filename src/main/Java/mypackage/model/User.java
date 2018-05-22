package mypackage.model;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {

    private final Logger log= LoggerFactory.getLogger(User.class);



    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        log.info("Setter of User.class is working");
    }
}
