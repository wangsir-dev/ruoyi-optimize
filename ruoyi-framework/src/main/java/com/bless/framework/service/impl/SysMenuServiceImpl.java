package com.bless.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.entity.SysMenu;
import com.bless.framework.service.SysMenuService;
import com.bless.mapper.SysMenuMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

}
