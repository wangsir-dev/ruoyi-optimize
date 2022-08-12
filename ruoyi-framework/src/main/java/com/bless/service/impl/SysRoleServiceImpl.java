package com.bless.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.entity.SysRole;
import com.bless.service.SysRoleService;
import com.bless.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色信息表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> selectRoles(SysRole sysRole) {
        return null;
    }
}
