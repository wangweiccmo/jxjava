package com.smartcampus.provider.entity;

import com.smartcampus.provider.utils.StringUtils;

public class PageSearchEntity {

	private Integer page = 1;
	private Integer pageSize = 50;
	private Integer offSet = 0;
	private Integer total = 0;


	public PageSearchEntity(Integer page,Integer pageSize){
		this.page = page;
		this.pageSize = pageSize;
		this.offSet = (page - 1) * pageSize;
	}
	public PageSearchEntity(String page,String pageSize){
		if(!StringUtils.isBlank(page) && !StringUtils.isBlank(pageSize)){
			this.page = Integer.valueOf(page);
			this.pageSize = Integer.valueOf(pageSize);
			this.offSet = (this.page - 1) * this.pageSize;
		}
	}
	public Integer getOffSet() {
		return offSet;
	}

	public void setOffSet(Integer offSet) {
		this.offSet = offSet;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
}
