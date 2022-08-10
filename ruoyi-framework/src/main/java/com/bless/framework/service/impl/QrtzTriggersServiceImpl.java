package com.bless.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.entity.QrtzTriggers;
import com.bless.framework.service.QrtzTriggersService;
import com.bless.mapper.QrtzTriggersMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 触发器详细信息表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class QrtzTriggersServiceImpl extends ServiceImpl<QrtzTriggersMapper, QrtzTriggers> implements QrtzTriggersService {

}
