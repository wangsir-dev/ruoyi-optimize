package com.bless.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bless.entity.SysUser;

import java.util.List;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> selectUser(SysUser sysUser);

}
