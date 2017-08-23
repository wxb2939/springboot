package com.imooc.utils;

import com.imooc.domain.Result;

/**
 * Created by xuebing on 2017/8/22.
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(null);
        return result;
    }


    public static Result error(Integer code,String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(message);
        return result;
    }
}
