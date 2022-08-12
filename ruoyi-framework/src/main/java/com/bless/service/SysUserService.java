package com.bless.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bless.entity.SysUser;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
public interface SysUserService extends IService<SysUser> {

    List<SysUser> selectUserList(SysUser sysUser);

}
