package com.masotoshi.service.model;

import java.math.BigDecimal;

//用户下单的交易模型
public class OrderModel {
    //20181021交易号与时间有关，用String
    private String id;

    private Integer userId;

    private Integer itemId;

    private  Integer amount;



    //购买商品的单价，若promoId非空，表示以秒杀价格下单
    private BigDecimal itemPrice;

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    //非空，表示以秒杀方式下单
    private Integer promoId;

    //商品下单价格，若promoId非空，表示以秒杀价格下单
    private BigDecimal orderPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }



    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}
