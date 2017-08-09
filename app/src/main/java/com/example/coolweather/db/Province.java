package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 晓宁 on 2017/8/9.
 */

public class Province extends DataSupport {
	/*
	* LitePal中的每一个实体类都是必须继承自DataSupport类的
	*/
	private int id; //每个实体类中都应该有的字段
	private String provinceName;//记录省的名字
	private int provinceCode;//记录省的代号
	public int getId(){
		return id;
	}

	public int getProvinceCode() {
		return provinceCode;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProvinceCode(int provinceCode) {
		this.provinceCode = provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
}
