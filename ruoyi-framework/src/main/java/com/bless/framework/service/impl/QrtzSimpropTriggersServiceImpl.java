package com.bless.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.entity.QrtzSimpropTriggers;
import com.bless.framework.service.QrtzSimpropTriggersService;
import com.bless.mapper.QrtzSimpropTriggersMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 同步机制的行锁表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class QrtzSimpropTriggersServiceImpl extends ServiceImpl<QrtzSimpropTriggersMapper, QrtzSimpropTriggers> implements QrtzSimpropTriggersService {

}
