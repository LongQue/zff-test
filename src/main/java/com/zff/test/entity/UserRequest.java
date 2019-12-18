package com.zff.test.entity;

import lombok.Data;
import sun.security.util.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author ZhouFufeng
 * @since 2019/12/16
 **/
@Data
public class UserRequest {

    public interface Login{}

    public interface Create{}

    @NotNull(message = "id不能为空",groups = Login.class)
    private Integer userId;
    @NotEmpty(message = "密码不能为空",groups = {Create.class, Login.class})
    private String password;
}
