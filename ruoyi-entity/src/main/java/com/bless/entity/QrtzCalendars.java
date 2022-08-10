package com.bless.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Blob;

/**
 * <p>
 * 日历信息表
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class QrtzCalendars implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 调度名称
     */
    private String schedName;

    /**
     * 日历名称
     */
    private String calendarName;

    /**
     * 存放持久化calendar对象
     */
    private Blob calendar;


}
