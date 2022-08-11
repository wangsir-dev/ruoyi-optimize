package com.bless.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.service.QrtzLocksService;
import com.bless.entity.QrtzLocks;
import com.bless.mapper.QrtzLocksMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储的悲观锁信息表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class QrtzLocksServiceImpl extends ServiceImpl<QrtzLocksMapper, QrtzLocks> implements QrtzLocksService {

}
