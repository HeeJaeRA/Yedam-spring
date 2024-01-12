package com.yedam.app.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 방법3.어노테이션
public class SamsungTV implements TV {
	@Autowired
	Speaker speaker;

//	스프링에서는 자바와 다르게 new 대신에 클래스를 이렇게 불러옴
//	방법1. 생성자방식
//	@Autowired // 의존성 주입 : 사용하고자 하는 생성자 위에 넣으면 됨
	SamsungTV(Speaker speaker) {
		this.speaker = speaker;
	}

//	방법2.setter방식
	SamsungTV() {
	}

	// 위의 생성자방식 없었으면 'SamsungTV(){}' 삭제해도 됨 하지만 위에서 생성자를 하나라도 만들었기 때문에 아래것도 자동으로
	// 만들어지지않고 직접 만들어줘야함
	@Autowired
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void on() {
		System.out.println("삼성 TV를 켰습니다.");
		speaker.on();
	}

}
