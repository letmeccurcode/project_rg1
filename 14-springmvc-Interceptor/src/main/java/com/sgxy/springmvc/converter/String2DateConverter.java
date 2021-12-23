package com.sgxy.springmvc.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.converter
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/14 10:58
 */
public class String2DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if (s == null) {
            throw new RuntimeException("请传入具体的字符串!");
        }
        try {
            if (s.contains("-")) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date date = format.parse(s);
                return date;
            }

            if (s.contains("/")) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                Date date = format.parse(s);
                return date;
            }

            if (s.contains("=")) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy=MM=dd");
                Date date = format.parse(s);
                return date;
            }
            if (s.contains(".")) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
                Date date = format.parse(s);
                return date;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
