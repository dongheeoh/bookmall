package com.douzon.bookmall.tset;

import java.util.List;

import com.douzon.bookmall.dao.CartDao;
import com.douzon.bookmall.vo.CartVo;


public class CartDaoTest {

	public static void main(String[] args) {
		
		//insertTest( 3, 2, 1);
		

		
		getListTest();
	}
	public static void insertTest(long count, long bookno, long memberno) {
		CartVo vo = new CartVo();
		
		
		vo.setCount(count);
		vo.setBookno(bookno);
		vo.setMemberno(memberno);
		
		new CartDao().insert(vo);
	}
	
	public static void getListTest() {
		List<CartVo> list = new CartDao().getList();
		for(CartVo vo : list) {
			System.out.println(vo);
		}
	}
}
