package kr.or.member;

import kr.or.member.MemberVO;

public class MemberService {
	//액션-서비스 클래스 - 출력용 메서드 작성
	//매개변수로 클래스배열을 받아서 출력하는 형태로 작성
	public void printMembers(MemberVO[] members) {
		//향상된  for문(loop)문 사용 ( 형태: 단일값 : 전체값
		for(MemberVO m : members) {//배열 전체의 내용 (members)안에 하나의 (m)만 출력 
			System.out.println("이름은: "+ m.getName() +"|나이는: " +m.getAge()+ "|전화번호는: "+m.getPhoneNum());
		}
	}

}
