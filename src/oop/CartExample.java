package oop;

import java.util.Date;

import com.ezen.shop.Cart;

import static java.lang.System.out;
import static java.lang.Math.*;

//import com.ezen.shop.Cart; //순서 중요. 패키지 밑에.
//import com.ezen.shop.*; //shop 패키지 모든 클래스 쓴다. but 비권장.
//import com.*; //이런건 안먹음

public class CartExample {

	public static void main(String[] args) {
		Cart cart;
		cart = new Cart();
		cart.addItem("초코파이");
		
		Date today;
		today = new Date();
		String ymd=today.toLocaleString();
		
		System.out.println(ymd);
		
		out.println("static import 사용하기");
		
		int x = 40, y = 35;
		int result = Math.max(x, y);
		System.out.println(result);
	}

}
