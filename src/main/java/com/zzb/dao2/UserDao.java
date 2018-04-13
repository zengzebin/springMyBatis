package com.zzb.dao2;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.zzb.xml.User;

@Repository
public class UserDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	public User getUser(int id) {
		return sqlSessionTemplate.selectOne(this.getClass().getName() + ".getUser", 1);
	}
}
