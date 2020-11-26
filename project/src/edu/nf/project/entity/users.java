package edu.nf.project.entity;

public class users {
    private String username;
    private String password;
    private int age;

    public users() {
    }

    public users(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
