package com.bless.web.controller;


import com.bless.entity.SysUser;
import com.bless.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/list")
    public Object list(@RequestBody SysUser sysUser){
        return sysUserService.selectUserList(sysUser);
    }



}
