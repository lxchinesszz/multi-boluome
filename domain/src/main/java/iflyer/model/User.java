package iflyer.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by liuxin on 17/1/20.
 */
@Document(collection = "User")
public class User {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
