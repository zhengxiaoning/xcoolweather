package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 晓宁 on 2017/8/9.
 */

public class City extends DataSupport {
    private int id;
    private String cityName; //记录市的名字
    private int cityCode;   //记录市的代号
	private int provinceId; //记录当前市所属省的id值

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public int getCityCode() {

		return cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public int getId() {
		return id;
	}

	public int getProvinceId() {
		return provinceId;
	}
}
