package com.tiny.ums.service.impl;

import com.tiny.ums.entity.TbUser;
import com.tiny.ums.mapper.TbUserMapper;
import com.tiny.ums.service.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author knox
 * @since 2021-01-07
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
