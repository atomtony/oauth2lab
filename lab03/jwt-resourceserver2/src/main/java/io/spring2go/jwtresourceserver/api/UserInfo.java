package io.spring2go.jwtresourceserver.api;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserInfo {

    private String name;

    private String email;

    @Min(value = 1,message = "age非法")
    @Max(value = 5,message = "age非法")
    @NotNull
    private Integer age;

    public UserInfo() {
    }

    public UserInfo(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
