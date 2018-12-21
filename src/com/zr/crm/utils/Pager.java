package com.zr.crm.utils;

import java.util.HashMap;
import java.util.List;



/**
 * @author LiuPing
 *分页数据封装类，该类携带分页参数和当前页数据。在分页查询中�?过传入和返回该类达到统一
 *分页操作的目的�?
 */
public class Pager {
	
	private static int PAGE_SIZE = 500;
	private int totalRows; 		// 总行�?
	private int startRow;
	private int pageSize = PAGE_SIZE; 	// 每页显示的行�?
	private int currentPage; 	// 当前页号
	private int totalPages; 	// 总页�?
	private List list;          // 存放查询出的数据结果
	//对外使用
	private String pageNo;
	private String pageScale;
	
	public Pager() {
		
	}
	public Pager(String pageNo) {
		setPageNo(pageNo);
	}

	public Pager(String pageNo , String pageScale) {
		setPageNo(pageNo);
		setPageScale(pageScale);
	}
	
	public void setTotalRows(HashMap<String, Object> param,int totalRows){
		this.totalRows = totalRows;
		totalPages = totalRows / pageSize;
		
		int mod = totalRows % pageSize;
		if (mod > 0) {
			totalPages++;
		}
		setCurrentPage(this.currentPage);
		param.put("startRow", this.getStartRow());
		param.put("pageSize", this.getPageSize());
		param.put("endRow", this.getStartRow()+this.getPageSize());
	}
	/**
	 * 设置当前�?
	 * @param currentPage
	 */
	private void setCurrentPage(int currentPage) {
		//当前页小于第�?��
		if(currentPage < 1){
			this.currentPage = 1 ;
		}else if(currentPage > this.totalPages ){           //当前页大于�?页数
			this.currentPage = this.totalPages;
		}else {                                            
			this.currentPage = currentPage;
		}
		this.pageNo = String.valueOf(this.currentPage);
		this.startRow = (this.currentPage - 1)*this.pageSize;
		if(this.currentPage == 0){
			this.startRow = 0;
		}
	}
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	/**
	 * @return the totalRows
	 */
	public int getTotalRows() {
		return totalRows;
	}

	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}


	public void setPageNo(String pageNo) {
		if (pageNo == null || "".equals(pageNo)) {
			this.currentPage = 1;
		} else {
			try {
				this.currentPage = Integer.parseInt(pageNo);
			} catch (Exception e) {
				this.currentPage = 1;
			}
		}
		this.pageNo = String.valueOf(this.currentPage);
	}

	public String getPageScale() {
		return pageScale;
	}

	public void setPageScale(String pageScale) {
		this.pageScale = pageScale;
		if(pageScale == null || "".equals(pageScale)){
			this.pageSize = PAGE_SIZE;
		}else{
			try {
				this.pageSize = Integer.parseInt(pageScale);
			} catch (Exception e) {
				this.pageSize = PAGE_SIZE;
			}
		}
		this.pageScale = String.valueOf(this.pageSize);
	}

	public String getPageNo() {
		return pageNo;
	}
	public int getStartRow(){
		return this.startRow;
	}
	public int getPageSize(){
		return this.pageSize;
	}
	
}
