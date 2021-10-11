package com.max.srb.core.service.impl;

import com.max.srb.core.pojo.entity.UserLoginRecord;
import com.max.srb.core.mapper.UserLoginRecordMapper;
import com.max.srb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author max
 * @since 2021-09-13
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
