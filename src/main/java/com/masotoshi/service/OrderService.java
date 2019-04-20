package com.masotoshi.service;

import com.masotoshi.error.BusinessException;
import com.masotoshi.service.model.OrderModel;

public interface OrderService {
    //1.通过前端url上传过来的秒杀活动id，然后下单接口内校验对应id是否属于对应商品且活动已开始  推荐
    //2.在下单接口内判断对应的商品是否存在秒杀活动，存在则以秒杀价格下单
    OrderModel createOrder(Integer userId, Integer itemId,Integer promoId, Integer amount) throws BusinessException;
}
