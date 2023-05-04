package com.zhoupb.test1.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhoupb.test1.mapper.OrderMapper;
import com.zhoupb.test1.model.JSONResponse;
import com.zhoupb.test1.model.PageData;
import com.zhoupb.test1.model.dto.OrderDTO;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

	/**
	 * Hello，你好呀~
	 * 感谢您的查看，如若有不足之处，希望您能指出我的不足，我好改正哦。
	 * 非常期待您的回复。
	 * 谢谢啦。
	 * email: zhoupb@zhoupb.com
	 */
	
	private final OrderMapper orderMapper;
	
	public OrderController(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}

	/**
	 * 接口1. 分页接口
	 * @param page
	 * @param pers
	 * @return
	 */
	@PostMapping("/list")
	public JSONResponse list(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int pers) {
		long total = orderMapper.count();
		int start = (page - 1) * pers;
		List<OrderDTO> list = orderMapper.selectByLimit(start, pers).stream().map(i -> new OrderDTO(i)).collect(Collectors.toList());
		PageData data = new PageData(total, page, pers, start + pers < total, list);
		return JSONResponse.response(10000, "操作成功", data);
	}
	
	
	/**
	 * 查询出每个用户的最后一笔订单
	 * @return
	 */
	@PostMapping("/user")
	public JSONResponse userLastOrder() {
		return JSONResponse.response(10000, "操作成功", orderMapper.selectByUserLastOrder().stream().map(i -> new OrderDTO(i)).collect(Collectors.toList()));
	}
	
}
