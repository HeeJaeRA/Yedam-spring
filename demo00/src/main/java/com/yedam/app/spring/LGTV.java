package com.yedam.app.spring;

public class LGTV implements TV {

	@Override
	public void on() {
		System.out.println("LG TV를 켰습니다.");
	}

}
