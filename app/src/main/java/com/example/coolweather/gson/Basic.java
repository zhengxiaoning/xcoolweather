package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 晓宁 on 2017/8/11.
 */

public class Basic {
	//由于json中的一些字段可能不太适合直接作为java字段命名
	//使用@SerializedName注解的方式来让Json字段和java字段之间建立映射关系
	@SerializedName("city")
	public String cityName;
	@SerializedName("id")
	public String weatherId;
	public Update update;
	public class Update{
		@SerializedName("loc")
		public String updateTime;
	}

}
