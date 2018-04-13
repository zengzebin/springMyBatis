package com.zzb.service3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzb.dao3.BookMapperDAO;
import com.zzb.xml.Book;
import com.zzb.xml.User;

import tk.mybatis.mapper.common.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("bookMapperService")
public class BookMapperService extends BaseService<Book> {

	@Autowired
	private BookMapperDAO dao;

	@Override
	public Mapper<Book> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}

	public Book getBookById(int id) {
		return dao.getBookById(id);
	}

}
