package com.wh.test.domain.base;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 *
 * @author dxyun.com
 */
public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public R() {
        put("code", StatusCodes.SUCCESS);
        put("message", "success");
    }

    public static R error() {
        return error(StatusCodes.ERROR, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(StatusCodes.ERROR, msg);
    }

    public static R error(String code, String message) {
        R r = new R();
        r.put("code", code);
        r.put("message", message);
        return r;
    }

    public static R ok(String message) {
        R r = new R();
        r.put("message", message);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
