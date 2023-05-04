package com.zhoupb.test1.model;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;


public class JSONResponse {

	private Integer code = null;
	private Object data = null;
	private String message = null;

	private JSONResponse(Integer code, Object data, String message) {
		super();
		this.code = code;
		this.data = data;
		if (!StringUtils.hasText(message))
			try {
				this.message = HttpStatus.valueOf(code).getReasonPhrase();
			} catch (IllegalArgumentException e) {
			}
		else
			this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setCode(HttpStatus status) {
		this.code = status.value();
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "JSONResponse [code=" + code + ", data=" + data + ", message=" + message + "]";
	}

	public static JSONResponse response(HttpStatus status, String message, Object data) {
		return new JSONResponse(status.value(), data, message);
	}

	public static JSONResponse response(int status, String message, Object data) {
		return new JSONResponse(status, data, message);
	}

	public static JSONResponse error(HttpStatus status, String message) {
		return new JSONResponse(status.value(), null, message);
	}

	public static JSONResponse error(int status, String message) {
		return new JSONResponse(status, null, message);
	}

}
