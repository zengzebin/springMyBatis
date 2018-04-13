package com.zzb.dao;

import java.util.List;

import com.zzb.xml.OrderDetail;
import com.zzb.xml.Orders;
import com.zzb.xml.OrdersCustom;

/**
 * https://www.cnblogs.com/selene/p/4627446.html
 * 
 * @ClassName: OrdersMapperCustom
 * @Description: TODO(OrdersMapperCustom的mapper)
 * @author 阿赫瓦里
 */
public interface OrdersCustomMapper {

	/*
	 * 教程ttps://www.cnblogs.com/selene/p/4627446.html
	 */
	/** 查询订单，关联查询用户信息 */
	public List<OrdersCustom> findOrdersUser();

	/** 查询订单关联查询用户信息，使用reslutMap实现 */
	public List<Orders> findOrdersUserResultMap();

	/** 查询订单（关联用户）以及订单明细 */
	public List<OrderDetail> findOrdersAndOrderDetailResultMap();
}
