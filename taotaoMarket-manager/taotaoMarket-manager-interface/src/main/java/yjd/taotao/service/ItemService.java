package yjd.taotao.service;

import yjd.taotao.pojo.TbItem;

/**
 *  @author: yjd
 *  @Data: 2019-07-16
 *  @Description: 根据ID查找Item的商品信息
 */
public interface ItemService {

    TbItem getItemById(long id);
}
