package com.bless.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TestTable1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long table1Id;

    private Long verson;


}
