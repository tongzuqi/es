package com.es.demo.util;

import java.util.List;

public class PageList<T> {

	/** 当前页码 */
	private int pageNumber = 1;
	/** 每页记录数 */
	private int pageSize = 20;
	/** 总记录数目 */
	private long totalRecord = 0;
	/** 总页数 */
	private long totalPage = 0;
	/** 数据集 */
	private List<T> list;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public long getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(long totalRecord) {
		this.totalRecord = totalRecord;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}


	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public PageList() {
	}
	
	public PageList(long totalRecord, int pageSize,int pageNumber) {
		this.pageNumber = pageNumber;
		this.totalRecord = totalRecord;
		this.pageSize = pageSize > 0 ? pageSize : this.pageSize;
		if(totalRecord == 0){
			this.totalPage =0;
		}else{
			this.totalPage = totalRecord%pageSize == 0 ? totalRecord/pageSize : (totalRecord/pageSize+1);
		}
	}
	
}
