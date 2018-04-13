package com.zzb.dao3;

import com.zzb.xml.Book;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * ͼ�����ݷ��ʽӿ�
 */
public interface BookMapperDAO extends Mapper<Book>, MySqlMapper<Book> {
	public Book getBookById(int id);
}