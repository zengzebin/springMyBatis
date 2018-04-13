/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.zzb.service3;

import org.apache.ibatis.session.RowBounds;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * 通用接口
 */
public interface IService<T extends Serializable> {

	public T selectOne(T record);

	public List<T> select(T record);

	public List<T> selectAll();

	public int selectCount(T record);

	public T selectByPrimaryKey(Object key);

	public int insert(T record);

	public int insertSelective(T record);

	public int updateByPrimaryKey(T record);

	public int updateByPrimaryKeySelective(T record);

	public int delete(T record);

	public int deleteByPrimaryKey(Object key);

	public List<T> selectByExample(Object example);

	public int selectCountByExample(Object example);

	public int deleteByExample(Object example);

	public int updateByExample(T record, Object example);

	public int updateByExampleSelective(T record, Object example);

	public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds);

	public List<T> selectByRowBounds(T record, RowBounds rowBounds);

}
