package com.douzon.bookmall.main;


import com.douzon.bookmall.tset.BookDaoTest;
import com.douzon.bookmall.tset.CartDaoTest;
import com.douzon.bookmall.tset.CategoryDaoTest;
import com.douzon.bookmall.tset.MemberTest;
import com.douzon.bookmall.tset.OrderBookDaoTest;
import com.douzon.bookmall.tset.OrderDaoTest;


public class BookMall {

	public static void main(String[] args) {
		
		System.out.println("회원정보");
		MemberTest.getListTest();
		System.out.println("=================================================");
		
		
		System.out.println("카테고리 리스트");
		CategoryDaoTest.getListTest();
		System.out.println("=================================================");
		
		
		
		System.out.println("상품 리스트");
		BookDaoTest.getListTest();
		System.out.println("=================================================");
		
		
		
		System.out.println("카트 리스트");
		CartDaoTest.getListTest();
		System.out.println("=================================================");
		
		
		System.out.println("주문리스트");
		OrderDaoTest.getListTest();
		System.out.println("=================================================");
		
		
		
		System.out.println("주문도서리스트");		
		OrderBookDaoTest.getListTest();
		System.out.println("=================================================");
		
	}
}
