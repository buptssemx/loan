package com.max.common.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname R
 * @Description  统一封装返回的结果
 * @Author max
 * @Date 2021/9/14 14:42
 */
@Data
public class R {

    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    /**
     * 构造函数私有化
     */
    private R() {

    }

    /**
     * 返回成功结果
     * @return R
     */
    public static R ok() {
        R r = new R();
        r.setCode(ResponseEnum.SUCCESS.getCode());
        r.setMessage(ResponseEnum.SUCCESS.getMessage());
        return r;
    }

    /**
     * 返回失败结果
     * @return R
     */
    public static R error() {
        R r = new R();
        r.setCode(ResponseEnum.ERROR.getCode());
        r.setMessage(ResponseEnum.ERROR.getMessage());
        return r;
    }

    /**
     * 设置特定的结果
     * @param result 枚举类型参数
     * @return R
     */
    public static R setResult(ResponseEnum result) {
        R r = new R();
        r.setCode(result.getCode());
        r.setMessage(result.getMessage());
        return r;
    }

    /**
     * 设置返回的data值
     * @param key 自定义
     * @param value 返回的结果
     * @return R
     */
    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    /**
     * 直接返回集合的返回值
     * @param map 返回的集合
     * @return R
     */
    public R data(Map<String,Object> map) {
        this.setData(map);
        return this;
    }

    /**
     * 设置返回的消息
     * @param message 消息
     * @return R
     */
    public R message(String message) {
        this.setMessage(message);
        return this;
    }

    /**
     * 设置特定的响应码
     * @param code
     * @return
     */
    public R code(Integer code){
        this.setCode(code);
        return this;
    }
}
