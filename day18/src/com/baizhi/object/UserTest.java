package com.baizhi.object;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Objects;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("一如既往",123456,"13051800688");
        User user1 = new User("一如既往",123456,"13051800688");
        System.out.println(user.equals(user1));
    }
}
class User{
    private String username;
    private int password;
    private String tel;

    public User() {
    }

    public User(String username, int password, String tel) {

        this.username = username;
        this.password = password;
        this.tel = tel;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", tel=" + tel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return password == user.password && tel == user.tel && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, tel);
    }
}