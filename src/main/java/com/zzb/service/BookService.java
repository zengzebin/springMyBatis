package com.zzb.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzb.dao.BookDAO;
import com.zzb.xml.Book;
import com.zzb.xml.User;
import java.util.List;
import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

	private static final List<Book> Book = null;
	@Resource
	private BookDAO bookdao;

	/**
	 * ·ÖÒ³
	 * 
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Book> queryByPage(Integer pageNo, Integer pageSize) {

		PageHelper.startPage(1, 10, false);

		PageInfo<Book> page = new PageInfo<Book>(Book);
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
