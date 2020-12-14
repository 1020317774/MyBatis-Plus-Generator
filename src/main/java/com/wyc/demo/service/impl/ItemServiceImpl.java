package com.wyc.demo.service.impl;

import com.wyc.demo.entity.ItemEntity;
import com.wyc.demo.mapper.ItemMapper;
import com.wyc.demo.service.IItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * item商品表 服务实现类
 * </p>
 *
 * @author knox
 * @since 2020-12-15
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, ItemEntity> implements IItemService {

}
