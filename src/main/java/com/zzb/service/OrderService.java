package com.zzb.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzb.dao.BookDAO;
import com.zzb.dao.OrdersCustomMapper;
import com.zzb.xml.Book;
import com.zzb.xml.OrderDetail;
import com.zzb.xml.Orders;
import com.zzb.xml.OrdersCustom;
import com.zzb.xml.User;
import java.util.List;
import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

	@Resource
	private OrdersCustomMapper ordersCustomMapper;

	/**
	 * ·ÖÒ³
	 * 
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageInfo<OrdersCustom> queryByPage(Integer pageNo, Integer pageSize) {
		PageHelper.startPage(1, 2, false);
		List<Orders> orders = ordersCustomMapper.findOrdersUserResultMap();
		PageHelper.startPage(1, 2, false);
		List<OrderDetail> OrderDetails = ordersCustomMapper.findOrdersAndOrderDetailResultMap();

		PageHelper.startPage(1, 2, false);
		List<OrdersCustom> list = ordersCustomMapper.findOrdersUser();
		PageInfo<OrdersCustom> page = new PageInfo<OrdersCustom>(list);
		System.out.println(page.getPageNum());
		System.out.println(page.getPageSize());
		System.out.println(page.getStartRow());
		System.out.println(page.getEndRow());
		System.out.println(page.getTotal());
		System.out.println(page.getPages());
		System.out.println(page.getFirstPage());
		System.out.println(page.getLastPage());
		System.out.println(page.isHasPreviousPage());
		System.out.println(page.isHasNextPage());
		return page;
	}

}
