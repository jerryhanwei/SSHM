package com.isoft.test;
// Generated 2016-4-18 14:23:37 by Hibernate Tools 3.5.0.Final

/**
 * TCart generated by hbm2java
 */
public class TCart implements java.io.Serializable {

	private String TCartId;
	private String TProductId;
	private String TNum;
	private String TUserId;
	private String TStatus;

	public TCart() {
	}

	public TCart(String TCartId) {
		this.TCartId = TCartId;
	}

	public TCart(String TCartId, String TProductId, String TNum, String TUserId, String TStatus) {
		this.TCartId = TCartId;
		this.TProductId = TProductId;
		this.TNum = TNum;
		this.TUserId = TUserId;
		this.TStatus = TStatus;
	}

	public String getTCartId() {
		return this.TCartId;
	}

	public void setTCartId(String TCartId) {
		this.TCartId = TCartId;
	}

	public String getTProductId() {
		return this.TProductId;
	}

	public void setTProductId(String TProductId) {
		this.TProductId = TProductId;
	}

	public String getTNum() {
		return this.TNum;
	}

	public void setTNum(String TNum) {
		this.TNum = TNum;
	}

	public String getTUserId() {
		return this.TUserId;
	}

	public void setTUserId(String TUserId) {
		this.TUserId = TUserId;
	}

	public String getTStatus() {
		return this.TStatus;
	}

	public void setTStatus(String TStatus) {
		this.TStatus = TStatus;
	}

}
