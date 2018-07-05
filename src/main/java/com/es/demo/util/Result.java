package com.es.demo.util;

import com.es.demo.bean.ResponseBean;

public class Result<T> {
	private boolean isOk;
	private int code;
	private String message;
	private T data;

	public Result() {
	}

	public Result(boolean isOk, int code, String message, T data) {
		this.isOk = isOk;
		this.code = code;
		this.message = message;
		this.data = data;
	}
	public Result<Object> returnVo(int i, String str, Object object){
		Result<Object> result = new Result<>(false, ResponseBean.CODE_NOTVALIDATE,str+"失败",object);
		if (i > 0){
			result = new Result<>(true, ResponseBean.CODE_SUCCESS,str+"成功",object);
		}
		return result;
	}
	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
