package com.demojack;

public class Demojack {
	private String comapnayName;
	private String desp;
	private int noofemo;
	public String getComapnayName() {
		return comapnayName;
	}
	public void setComapnayName(String comapnayName) {
		this.comapnayName = comapnayName;
	}
	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	public int getNoofemo() {
		return noofemo;
	}
	public void setNoofemo(int noofemo) {
		this.noofemo = noofemo;
	}
	
	@Override
	public String toString()
	{
		return "Demojack[company_name="+comapnayName+"desp="+desp+"empcount="+noofemo +"]";
	}

}
