package com.douzon.bookmall.tset;

import java.util.List;

import com.douzon.bookmall.dao.OrderBookDao;
import com.douzon.bookmall.vo.OrderBookVo;

public class OrderBookDaoTest {

	public static void main(String[] args) {
//		insertTest(1,"고요할수록밝아지는것들",4);
//		insertTest(2,"원피스극장판",1);
		insertTest(1,1,1);

		getListTest();
	}
	public static void insertTest(long count,long odertextno, long bookno) {
		OrderBookVo vo = new OrderBookVo();
		
		vo.setCount(count);
		vo.setOrdertextno(odertextno);
		vo.setBookno(bookno);
		
		new OrderBookDao().insert(vo);
	}
	
	public static void getListTest() {
		List<OrderBookVo> list = new OrderBookDao().getList();
		for(OrderBookVo vo : list) {
			System.out.println(vo);
		}
	}
}
