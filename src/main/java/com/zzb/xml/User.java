package com.zzb.xml;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: User
 * @Description: TODO(�û�ʵ��)
 * @author ��������
 */
public class User {
	private Integer id;
	// ����
	private String username;
	// �Ա�
	private String sex;
	// ��ַ
	private String address;
	// ����
	private Date birthday;
	// �û������Ķ����б�
	private List<Orders> ordersList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public List<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

}
