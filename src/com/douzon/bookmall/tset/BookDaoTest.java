package com.douzon.bookmall.tset;


import java.util.List;
import com.douzon.bookmall.dao.BookDao;
import com.douzon.bookmall.vo.BookVo;



public class BookDaoTest {
	public static void main(String[] args) {
		
		getListTest();
	}
	

	
	public static void getListTest() {
		List<BookVo> list = new BookDao().getList();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}
}
