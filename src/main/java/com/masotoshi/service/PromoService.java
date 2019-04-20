package com.masotoshi.service;

import com.masotoshi.service.model.PromoModel;

public interface PromoService {
    //根据itemid获取正在进行的或者即将开始的活动
    PromoModel getPromoByItemId(Integer itemId);
}
