package com.bless.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.entity.QrtzCronTriggers;
import com.bless.framework.service.QrtzCronTriggersService;
import com.bless.mapper.QrtzCronTriggersMapper;

import org.springframework.stereotype.Service;

/**
 * <p>
 * Cron类型的触发器表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class QrtzCronTriggersServiceImpl extends ServiceImpl<QrtzCronTriggersMapper, QrtzCronTriggers> implements QrtzCronTriggersService {

}
