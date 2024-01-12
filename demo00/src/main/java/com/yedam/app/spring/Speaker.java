package com.yedam.app.spring;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
	public void on() {
		System.out.println("스피커를 실행했습니다.");
	}
}
