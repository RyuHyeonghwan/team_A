package org.zerock.domain;

import java.util.Date;

public class GoodVO {
	
	
	private int goodId;
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public int getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(int goodPrice) {
		this.goodPrice = goodPrice;
	}
	public int getGoodStock() {
		return goodStock;
	}
	public void setGoodStock(int goodStock) {
		this.goodStock = goodStock;
	}
	public String getGoodIntro() {
		return goodIntro;
	}
	public void setGoodIntro(String goodIntro) {
		this.goodIntro = goodIntro;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	private String cateCode;
	private String goodName;
	private int goodPrice;
	private int goodStock;
	private String goodIntro;
	private Date regDate;
	private Date updateDate;
	
	@Override
	public String toString() {
		return "GoodVO [goodId=" + goodId + ", cateCode=" + cateCode + ", goodName=" + goodName + ", goodPrice="
				+ goodPrice + ", goodStock=" + goodStock + ", goodIntro=" + goodIntro + ", regDate=" + regDate
				+ ", updateDate=" + updateDate + "]";
	}
	
}
