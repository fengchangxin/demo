package com.project.demo.date;

import com.alibaba.fastjson.JSON;

import java.time.*;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoField;
import java.util.Date;

/**
 * @author: fengchangxin
 * @create: 2019-12-10 16:42
 * @description:
 **/
public class Main {
    public static void main(String[] args) {
        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(LocalDateTime.of(2019, 12, 13, 16, 13));

        //时间戳转LocalDateTime
        LocalDateTime a = LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault());
        Long a1 = localDateTime.toEpochSecond(ZoneOffset.ofHours(8));
        System.out.println(a1);

        //Date 转LocalDateTime需要中转类Instant
        LocalDateTime b = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        Date c = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());

    }
}
