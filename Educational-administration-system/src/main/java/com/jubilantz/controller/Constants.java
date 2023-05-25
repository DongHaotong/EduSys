package com.jubilantz.controller;

/**
 * 存储在session容器中的，一些常用的关键字
 */
public interface Constants {
    public static final String LOGIN_USER = "login_user";

    public static final String LOGIN_USER_PERS = "user_pers";

    // 正确的验证码
    public static final String VALIDATE_CODE = "validateCode";

    // 用户输入的验证码
    public static final String RANDOM_CODE = "randomCode";

    public static final String CODE_ERROR = "randomCodeError";

    //在个人资料位置用到过 数据库更改会有一点影响
    public static final String STUDENT = "学生";

    public static final String TEACHER = "教师";

}
