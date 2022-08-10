package com.bless.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * Cron类型的触发器表
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class QrtzCronTriggers implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 调度名称
     */
    private String schedName;

    /**
     * qrtz_triggers表trigger_name的外键
     */
    private String triggerName;

    /**
     * qrtz_triggers表trigger_group的外键
     */
    private String triggerGroup;

    /**
     * cron表达式
     */
    private String cronExpression;

    /**
     * 时区
     */
    private String timeZoneId;


}
