package org.mvnsearch.h2.mysql;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * date time functions for mysql
 *
 * @author linux_china
 */
public class DateTimeFunctions {

    /**
     * function for UNIX_TIMESTAMP
     *
     * @return current time millis
     */
    public static Long unixTimestamp() {
        return System.currentTimeMillis();
    }

    /**
     * function for UNIX_TIMESTAMP
     *
     * @return current time millis
     */
    public static Long unixTimestamp(String text) throws Exception {
        return DateUtils.parseDate(text, "YYYY-MM-DD HH:MM:SS", "YYYY-MM-DD").getTime();
    }

    public static Date fromUnixTime(Long unixTime) {
        return new Date(unixTime * 1000);
    }
}