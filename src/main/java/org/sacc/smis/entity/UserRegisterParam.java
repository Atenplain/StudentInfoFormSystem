package org.sacc.smis.entity;

import lombok.Data;

/**
 * Created by 林夕
 * Date 2021/1/19 20:21
 */
@Data
public class UserRegisterParam {
    private String studentId;

    private String password;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
}
