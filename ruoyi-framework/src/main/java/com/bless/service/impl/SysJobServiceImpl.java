package com.bless.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.entity.SysJob;
import com.bless.service.SysJobService;
import com.bless.mapper.SysJobMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class SysJobServiceImpl extends ServiceImpl<SysJobMapper, SysJob> implements SysJobService {

}
