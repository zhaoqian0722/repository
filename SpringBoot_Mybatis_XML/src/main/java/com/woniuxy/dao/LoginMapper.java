package com.woniuxy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.woniuxy.bean.LoginBean;
@Mapper
public interface LoginMapper {
	public LoginBean findById(@Param("id") int i);
}
