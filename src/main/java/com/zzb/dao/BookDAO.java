package com.zzb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.zzb.xml.Book;

 

/**
 * ͼ�����ݷ��ʽӿ�
 */
public interface BookDAO {
	/**
	 * �������ͼ��
	 */
	public List<Book> getAllBooks();

	/**
	 * ����ͼ���Ż��ͼ�����
	 */
	public Book getBookById(@Param("id") int id);

	/**
	 * ���ͼ��
	 */
	public int add(Book entity);

	/**
	 * ����ͼ����ɾ��ͼ��
	 */
	public int delete(int id);

	/**
	 * ����ͼ��
	 */
	public int update(Book entity);

	/**
	 * ��ҳ
	 * 
	 * @param userName
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PageInfo<Book> queryByPage(Integer pageNo, Integer pageSize);
}