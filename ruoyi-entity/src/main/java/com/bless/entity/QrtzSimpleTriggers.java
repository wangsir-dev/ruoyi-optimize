package com.bless.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 简单触发器的信息表
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class QrtzSimpleTriggers implements Serializable {

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
     * 重复的次数统计
     */
    private Long repeatCount;

    /**
     * 重复的间隔时间
     */
    private Long repeatInterval;

    /**
     * 已经触发的次数
     */
    private Long timesTriggered;


}
