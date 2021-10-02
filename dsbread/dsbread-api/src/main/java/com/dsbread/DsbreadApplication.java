package com.dsbread;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan(basePackages = "com.dsbread.mapper")
public class DsbreadApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(DsbreadApplication.class,args);
    }
}
