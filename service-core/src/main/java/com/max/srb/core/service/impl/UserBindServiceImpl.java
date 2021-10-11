package com.max.srb.core.service.impl;

import com.max.srb.core.pojo.entity.UserBind;
import com.max.srb.core.mapper.UserBindMapper;
import com.max.srb.core.service.UserBindService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户绑定表 服务实现类
 * </p>
 *
 * @author max
 * @since 2021-09-13
 */
@Service
public class UserBindServiceImpl extends ServiceImpl<UserBindMapper, UserBind> implements UserBindService {

}
