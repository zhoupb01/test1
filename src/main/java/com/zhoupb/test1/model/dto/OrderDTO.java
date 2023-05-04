package com.zhoupb.test1.model.dto;

import java.util.Date;

import com.zhoupb.test1.model.entity.Order;

public class OrderDTO {

	private Integer id;

	private Date created_at;

	private Date updated_at;

	private String mobile;

	private String nickname;

	private String product_name;

	private String totalPrice;

	private Integer count;

	private Integer unit_price;

	private Byte status;

	private Byte payType;

	public OrderDTO(Order order) {
		this.id = order.getId();
		this.created_at = order.getCreatedAt();
		this.updated_at = order.getUpdatedAt();
		this.product_name = order.getProductName();
		this.totalPrice = order.getTotalPrice();
		this.count = order.getCount();
		this.unit_price = order.getUnitPrice();
		this.status = order.getStatus();
		this.payType = order.getPayType();
		if (order.getUser() != null) {
			this.mobile = order.getUser().getMobile();
			this.nickname = order.getUser().getNickname();
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Integer unit_price) {
		this.unit_price = unit_price;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Byte getPayType() {
		return payType;
	}

	public void setPayType(Byte payType) {
		this.payType = payType;
	}

}
