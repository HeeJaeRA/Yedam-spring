package com.example.demo.member.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberVO {
	String memberId;
	String memberPw;
	String memberOnum;
	String memberOprice;
	String memberGrade;
}
