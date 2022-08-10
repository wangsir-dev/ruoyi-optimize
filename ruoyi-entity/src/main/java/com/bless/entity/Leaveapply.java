package com.bless.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 请假表
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Leaveapply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 请假人
     */
    private String userId;

    /**
     * 起始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 类型
     */
    private String leaveType;

    /**
     * 原因
     */
    private String reason;

    /**
     * 申请时间
     */
    private LocalDateTime applyTime;

    /**
     * 实际起始时间
     */
    private LocalDateTime realityStartTime;

    /**
     * 实际结束时间
     */
    private LocalDateTime realityEndTime;


}
