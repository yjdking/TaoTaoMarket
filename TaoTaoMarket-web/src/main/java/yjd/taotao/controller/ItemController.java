package yjd.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yjd.taotao.pojo.TbItem;
import yjd.taotao.service.ItemService;

/**
 * @author:  yjd
 * @Data: 2019-07-17
 * @Description: 商品管理Controller
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemID}")
    @ResponseBody
    public TbItem getITemByID(@PathVariable Long itemID){
        return itemService.getItemById(itemID);
    }
}
