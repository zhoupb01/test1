package com.zhoupb.test1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.zhoupb.test1.model.entity.Order;

@Mapper
public interface OrderMapper {

	@Results({
		@Result(property = "user", column = "user_id", one = @One(select = "com.zhoupb.test1.mapper.UserMapper.selectById"))
	})
	@Select("select * from p_order limit #{start}, #{size}")
	public List<Order> selectByLimit(@Param("start") int start, @Param("size") int size);

	@Select("select count(*) from p_order")
	public long count();
	
	@Results({
		@Result(property = "user", column = "user_id", one = @One(select = "com.zhoupb.test1.mapper.UserMapper.selectById"))
	})
	@Select("select o1.* from p_order o1 where created_at = ( select max(created_at) from p_order o2 where o1.user_id = o2.user_id )")
	public List<Order> selectByUserLastOrder();
	
}
