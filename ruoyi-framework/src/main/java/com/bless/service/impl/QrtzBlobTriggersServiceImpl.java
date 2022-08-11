package com.bless.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.service.QrtzBlobTriggersService;
import com.bless.entity.QrtzBlobTriggers;
import com.bless.mapper.QrtzBlobTriggersMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Blob类型的触发器表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class QrtzBlobTriggersServiceImpl extends ServiceImpl<QrtzBlobTriggersMapper, QrtzBlobTriggers> implements QrtzBlobTriggersService {

}
