package com.kinbo.boot2deep.aspect;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UserLog {
    String module();
    String operate();
}
