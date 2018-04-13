package com.zzb.dao;

import java.util.List;

import com.zzb.xml.OrderDetail;
import com.zzb.xml.Orders;
import com.zzb.xml.OrdersCustom;

/**
 * https://www.cnblogs.com/selene/p/4627446.html
 * 
 * @ClassName: OrdersMapperCustom
 * @Description: TODO(OrdersMapperCustom��mapper)
 * @author ��������
 */
public interface OrdersCustomMapper {

	/*
	 * �̳�ttps://www.cnblogs.com/selene/p/4627446.html
	 */
	/** ��ѯ������������ѯ�û���Ϣ */
	public List<OrdersCustom> findOrdersUser();

	/** ��ѯ����������ѯ�û���Ϣ��ʹ��reslutMapʵ�� */
	public List<Orders> findOrdersUserResultMap();

	/** ��ѯ�����������û����Լ�������ϸ */
	public List<OrderDetail> findOrdersAndOrderDetailResultMap();
}
