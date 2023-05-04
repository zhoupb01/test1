package com.zhoupb.test1.model;

public class PageData {

	private long total;

	private int page;

	private int pers;

	private boolean hasNext;

	private Object data;

	public PageData(long total, int page, int pers, boolean hasNext, Object data) {
		super();
		this.total = total;
		this.page = page;
		this.pers = pers;
		this.hasNext = hasNext;
		this.data = data;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPers() {
		return pers;
	}

	public void setPers(int pers) {
		this.pers = pers;
	}

	public boolean isHasNext() {
		return hasNext;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
