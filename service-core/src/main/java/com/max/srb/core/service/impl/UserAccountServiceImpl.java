package com.max.srb.core.service.impl;

import com.max.srb.core.pojo.entity.UserAccount;
import com.max.srb.core.mapper.UserAccountMapper;
import com.max.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author max
 * @since 2021-09-13
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
