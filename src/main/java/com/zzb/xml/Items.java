package com.zzb.xml;

import java.util.Date;

/**
 * @ClassName: Items
 * @Description: TODO(��Ʒʵ����)
 * @author ��������
 */
public class Items {
	/** ��Ʒ������Id */
	private Integer id;
	/** ��Ʒ���� */
	private String itemsName;
	/** ��Ʒ���� */
	private float price;
	/** ��Ʒ���� */
	private String detail;
	/** ��ƷͼƬ */
	private String picture;
	/** �������� */
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
