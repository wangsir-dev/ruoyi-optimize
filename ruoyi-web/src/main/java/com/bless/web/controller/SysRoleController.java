package com.bless.web.controller;


import com.bless.entity.SysRole;
import com.bless.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 角色信息表 前端控制器
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@RestController
@RequestMapping("/sys-role")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @PostMapping("/list")
    public Object list(@RequestBody SysRole sysRole){
        return null;
    }
}
