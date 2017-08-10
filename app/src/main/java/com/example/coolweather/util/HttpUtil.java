package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 晓宁 on 2017/8/10.
 */

public class HttpUtil {
	public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
		OkHttpClient client=new OkHttpClient();
		Request request=new Request.Builder().url(address).build();
		client.newCall(request);
	}
}