package org.sacc.smis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by 林夕
 * Date 2021/1/21 20:55
 */

@Getter
public enum Business {
    STUDENT_ID_IS_EXIT(1000,"该学号已存在")
    ,
    EMAIL_IS_EXIT(1001,"该邮箱已存在");

    private final int code;
    private final String message;

    Business(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
