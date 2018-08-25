package com.isoft.model;

public class PageModel {

	// 从第几行开始
    private int startPage;
    // 每页多少行 
    private int linePerPage;
    // 共有多少行记录
    private int totalRows;
    
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getLinePerPage() {
		return linePerPage;
	}
	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
    
	
    
}
