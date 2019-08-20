package com.wh.test.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TaxLog {
    boolean isStore() default true;

    boolean isShowParam() default true;

    String value() default "";
}
