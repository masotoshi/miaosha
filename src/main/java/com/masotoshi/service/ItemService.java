package com.masotoshi.service;

import com.masotoshi.error.BusinessException;
import com.masotoshi.service.model.ItemModel;

import java.util.List;

public interface ItemService {
    //创建商品
    public ItemModel createItem(ItemModel itemModel) throws BusinessException;

    //返回商品列表
    public List<ItemModel> listItem();

    //商品详情浏览
    public ItemModel getItemById(Integer id);

    //库存扣减
    boolean decreaseStock(Integer itemId,Integer amount);

    //商品销量增加
    void increaseSales(Integer itemId,Integer amount) throws BusinessException;
}
