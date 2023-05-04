package com.zhoupb.test1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zhoupb.test1.model.entity.User;

@Mapper
public interface UserMapper {

	@Select("select * from p_user where id = #{id}")
	public User selectById(int id);
	
}
