package com.bless.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.entity.QrtzSimpleTriggers;
import com.bless.framework.service.QrtzSimpleTriggersService;
import com.bless.mapper.QrtzSimpleTriggersMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 简单触发器的信息表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class QrtzSimpleTriggersServiceImpl extends ServiceImpl<QrtzSimpleTriggersMapper, QrtzSimpleTriggers> implements QrtzSimpleTriggersService {

}
