package com.douzon.bookmall.vo;

public class BookVo {
	private long no;
	private String kind;
	private String title;
	private long cost;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}

	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return no+" ,"+title+" ,"+kind+" ,"+cost;
	}
	
}
