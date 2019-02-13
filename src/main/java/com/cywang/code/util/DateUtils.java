package com.cywang.code.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateUtils {

    private static Logger logger = LoggerFactory.getLogger(DateUtils.class);

    /**
     * 按照指定格式将字符串(默认为yyyy-MM-dd HH:mm:ss格式)转换成日期格式
     */
    public static Date strToDate(String dateStr, String type) {
        Date date = null;
        if (StringUtils.isEmpty(dateStr)) {
            return null;
        }
        if (StringUtils.isEmpty(type)) {
            type = "yyyy-MM-dd HH:mm:ss";
        }
        try {
            date = new SimpleDateFormat(type).parse(dateStr);
        } catch (ParseException e) {
            logger.info("DateUtils.strToDate params type undefined! type = {}", type);
        }

        return date;
    }

    /**
     * 计算指定日期的倒计日
     */
    public static String calculateCountDown(String dateStr, String type) {
        if (StringUtils.isEmpty(dateStr)) {
            return null;
        }
        Date date = strToDate(dateStr, type);
        if (date == null) {
            return null;
        }
        long countDown = LocalDate.now().until(
                LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalDate(),ChronoUnit.DAYS);
        return String.valueOf(countDown);
    }

}
