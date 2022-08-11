package com.bless.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bless.entity.QrtzJobDetails;
import com.bless.service.QrtzJobDetailsService;
import com.bless.mapper.QrtzJobDetailsMapper;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务详细信息表 服务实现类
 * </p>
 *
 * @author wyx
 * @since 2022-08-10
 */
@Service
public class QrtzJobDetailsServiceImpl extends ServiceImpl<QrtzJobDetailsMapper, QrtzJobDetails> implements QrtzJobDetailsService {

}
