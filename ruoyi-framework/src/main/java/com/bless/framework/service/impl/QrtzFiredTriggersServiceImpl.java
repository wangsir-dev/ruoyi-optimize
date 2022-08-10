package com.bless.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.entity.QrtzFiredTriggers;
import com.bless.framework.service.QrtzFiredTriggersService;
import com.bless.mapper.QrtzFiredTriggersMapper;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 已触发的触发器表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class QrtzFiredTriggersServiceImpl extends ServiceImpl<QrtzFiredTriggersMapper, QrtzFiredTriggers> implements QrtzFiredTriggersService {

}
