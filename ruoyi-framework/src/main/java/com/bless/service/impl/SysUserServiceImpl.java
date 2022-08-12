package com.bless.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.service.SysUserService;
import com.bless.entity.SysUser;
import com.bless.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {


    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectUserList(SysUser sysUser) {
        return sysUserMapper.selectUser(sysUser);
    }
}
