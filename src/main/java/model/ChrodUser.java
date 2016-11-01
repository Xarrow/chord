package model;

/**
 * @Author zhangjian5
 * @Time 2016/10/18
 */
public class ChrodUser {
    private String username;
    private String password;

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ChrodUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

