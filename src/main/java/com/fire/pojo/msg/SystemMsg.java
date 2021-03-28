package com.fire.pojo.msg;

public class SystemMsg {
    public static int LOGIN_SUCCESS=001;
    public static int USER_NOT_EXIST=002;
    public static int PASSWORD_WRONG=003;
    public static int GET_ALL_SUCCESS=004;
    public static int GET_ONE_SUCCESS=005;
    public static int UPDATE_ONE_SUCCESS=006;
    public static int DELETE_ONE_SUCCESS=007;
    public static int INTERNAL_SERVICE_ERR=8;
    public static int UPDATE_ONE_FAILED=9;
    public static int DELETE_ONE_FAILED=10;
    public static int ADD_ONE_SUCCESS=11;
    public static int ADD_ONE_FAILED=12;




    public static String LOGIN_SUCCESS_STR="登录成功";
    public static String USER_NOT_EXIST_STR="用户不存在";
    public static String PASSWORD_WRONG_STR="密码错误";
    public static String GET_ALL_SUCCESS_STR="获取全部成功";
    public static String GET_ONE_SUCCESS_STR="获得一个成功";
    public static String UPDATE_ONE_SUCCESS_STR="更改一个成功";
    public static String DELETE_ONE_SUCCESS_STR="删除一个成功";
    public static String INTERNAL_SERVICE_ERR_STR="服务器内部错误";
    public static String UPDATE_ONE_FAILED_STR="修改失败";
    public static String DELETE_ONE_FAILED_STR="删除失败";
    public static String ADD_ONE_SUCCESS_STR="添加成功";
    public static String ADD_ONE_FAILED_STR="添加失败";
}
