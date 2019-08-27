package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);//通过订单id获取商品列表
	/**
	 * 在保存订单时，减少商品库存
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}
