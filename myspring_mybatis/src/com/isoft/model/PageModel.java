package com.isoft.model;

public class PageModel {

	// �ӵڼ��п�ʼ
    private int startPage;
    // ÿҳ������ 
    private int linePerPage;
    // ���ж����м�¼
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
