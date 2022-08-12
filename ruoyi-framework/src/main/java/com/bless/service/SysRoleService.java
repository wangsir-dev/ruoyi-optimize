package com.bless.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bless.entity.SysRole;

import java.util.List;

/**
 * <p>
 * 角色信息表 服务类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
public interface SysRoleService extends IService<SysRole> {

    List<SysRole> selectRoles(SysRole sysRole);

}
