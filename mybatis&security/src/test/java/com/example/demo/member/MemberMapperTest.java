package com.example.demo.member;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.member.mapper.MemberMapper;
import com.example.demo.member.service.MemberVO;

@SpringBootTest
public class MemberMapperTest {
	
	@Autowired MemberMapper mapper;
	
	@Test
	public void list() {
		String id = "CHOI";
		MemberVO vo = mapper.getMember(id);
		System.out.println(vo);
		assertThat(vo.getMemberId()).isEqualTo(id);
	}

}
