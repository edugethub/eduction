package com.education.api.out;

/**
 * @program: eduction
 * @description: 统一返回模型
 * @author: duxiangyu
 * @create: 2019-06-05 11:22
 */
public class ApiResult<T> {
    private  String code;
    private  String msg;
    private  T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static ApiResult  sucess(Object data){
        ApiResult result=new ApiResult();
        result.setCode("0");
        result.setMsg("成功");
        result.setData(data);
        return  result;
    }
}