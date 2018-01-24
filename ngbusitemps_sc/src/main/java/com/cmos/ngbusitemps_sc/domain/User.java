package com.cmos.ngbusitemps_sc.domain;

import java.io.Serializable;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 14:07 2018/1/24
 * @Modified By:
 */
public class User implements Serializable {
    private Long  id;
    private String userName;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Override public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
