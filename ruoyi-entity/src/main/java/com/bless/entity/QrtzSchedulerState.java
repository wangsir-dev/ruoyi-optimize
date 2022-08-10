package com.bless.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 调度器状态表
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class QrtzSchedulerState implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 调度名称
     */
    private String schedName;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 上次检查时间
     */
    private Long lastCheckinTime;

    /**
     * 检查间隔时间
     */
    private Long checkinInterval;


}
