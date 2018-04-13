package com.zzb.xml;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import tk.mybatis.mapper.entity.IDynamicTableName;

/**
 * ͼ��ʵ��
 */
@Table(name = "books")
public class Book implements Serializable {
	/**
	 * ���
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	/**
	 * ����
	 */
	@Column(name = "title")
	private String title;
	/**
	 * �۸�
	 */
	@Column(name = "price")
	private double price;
	/**
	 * ��������
	 */
	@Column(name = "publishDate")
	private Date publishDate;

	public Book(int id, String title, double price, Date publishDate) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
	}

	public Book() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}