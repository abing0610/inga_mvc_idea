package com.inga.utils;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 方便org.mybatis.spring.mapper.MapperScannerConfigurer扫描
 * Created by abing on 2015/6/11.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisDao {
    /**
     * The value may indicate a suggestion for a logical component name,
     * to be turned into a Spring bean in case of an autodetected component.
     * @return the suggested component name, if any
     */
    String value() default "";
}
