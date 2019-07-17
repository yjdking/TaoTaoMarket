package yjd.taotao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yjd.taotao.mapper.TbItemMapper;
import yjd.taotao.pojo.TbItem;
import yjd.taotao.service.ItemService;

/**
 *  @author: yjd
 *  @Data: 2019-07-16
 *  @Description: 根据ID查找Item的商品信息
 */

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper ibItemMapper;

    @Override
    public TbItem getItemById(long id) {
        TbItem item = ibItemMapper.selectByPrimaryKey(id);
        return item;
    }
}
