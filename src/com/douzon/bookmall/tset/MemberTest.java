package com.douzon.bookmall.tset;

import java.util.List;

import com.douzon.bookmall.dao.MemberDao;
import com.douzon.bookmall.vo.MemberVo;

public class MemberTest {
	public static void main(String[] args) {
//		insertTest("루피", "01012342386", "fnvl@naver.com", "1234");
//		insertTest("조로", "01012358612", "whfh@gmail.com", "1234");
//		insertTest("나미", "01012342386", "skal@naver.com", "1234");
//		insertTest("상디", "01012358612", "tkdel@gmail.com", "1234");
//		insertTest("우솝", "01012342386", "dnthq@naver.com", "1234");
//		insertTest("쵸파", "01012358612", "cyvk@gmail.com", "1234");

		getListTest();
	}

	public static void insertTest(String name, String phonenumber, String email, String password) {
		MemberVo vo = new MemberVo();

		vo.setName(name);
		vo.setPhonenumber(phonenumber);
		vo.setEmail(email);
		vo.setPassword(password);

		new MemberDao().insert(vo);
	}

	public static void getListTest() {
		List<MemberVo> list = new MemberDao().getList();
		for (MemberVo vo : list) {
			System.out.println(
					vo.getNo() + ". " + 
					vo.getName() + ", " + 
					vo.getEmail() + ", " + 
					vo.getPhonenumber() 
					);
		}
	}
}
