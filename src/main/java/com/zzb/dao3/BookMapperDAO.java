package com.zzb.dao3;

import com.zzb.xml.Book;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 图书数据访问接口
 */
public interface BookMapperDAO extends Mapper<Book>, MySqlMapper<Book> {
	public Book getBookById(int id);
}