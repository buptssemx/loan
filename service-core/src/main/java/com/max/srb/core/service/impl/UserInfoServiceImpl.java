package com.max.srb.core.service.impl;

import com.max.srb.core.pojo.entity.UserInfo;
import com.max.srb.core.mapper.UserInfoMapper;
import com.max.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author max
 * @since 2021-09-13
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
