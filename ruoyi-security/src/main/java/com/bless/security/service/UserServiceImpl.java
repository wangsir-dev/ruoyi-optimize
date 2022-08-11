package com.bless.security.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bless.entity.SysUser;
import com.bless.service.SysUserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class UserServiceImpl implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<SysUser> sysUserQueryWrapper = new QueryWrapper<>();
        sysUserQueryWrapper.eq("login_name",username);
        SysUser sysUser = sysUserService.getOne(sysUserQueryWrapper);

        return new UserInfo()
                .setUsername(sysUser.getLoginName())
                .setDeptCode(sysUser.getDelFlag())
                .setEnable(sysUser.getStatus().equals("1")?true:false);
    }

    @Data
    @Accessors(chain = true)
    @NoArgsConstructor
    @AllArgsConstructor
    public class UserInfo implements UserDetails{


        private String username;

        private Boolean enable;

        private Boolean lock;

        private String dept;

        private String role;

        private String token;

        private String deptCode;

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return null;
        }

        @Override
        public String getPassword() {
            return null;
        }

        @Override
        public String getUsername() {
            return username;
        }

        @Override
        public boolean isAccountNonExpired() {
            return false;
        }

        @Override
        public boolean isAccountNonLocked() {
            return lock;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return false;
        }

        @Override
        public boolean isEnabled() {
            return enable;
        }
    }
}
