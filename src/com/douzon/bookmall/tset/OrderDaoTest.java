package com.douzon.bookmall.tset;

import java.util.List;



import com.douzon.bookmall.dao.OrderDao;
import com.douzon.bookmall.vo.OrderVo;

public class OrderDaoTest {
	public static void main(String[] args) {
		//insertTest((13500*3),"센텀으로오세용",1);
		getListTest();
	}
	
	public static void insertTest(long totalcost, String address ,long memberno) {
		OrderVo vo = new OrderVo();
		
		vo.setTotalcost(totalcost);
		vo.setMemberno(memberno);
		vo.setAddress(address);
		
		new OrderDao().insert(vo);
	}
	
	public static void getListTest() {
		List<OrderVo> list = new OrderDao().getList();
		for(OrderVo vo : list) {
			System.out.println(vo);
		}
	}
}
