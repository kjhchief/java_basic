package ezen.shoppingmall;

public class EzenShoppingMall {

	public static void main(String[] args) {
		Cart myCart = new Cart(100);
		
		Album album = new Album(10, "Dynamite", 10000, "BTS");
		
		// 카트에 상품 담기
		myCart.addItem(album);
		
		Movie movie = new Movie(11, "아바타2", 15000, "제임스 카메론", "김재훈");
		myCart.addItem(movie);
		
		//카트 상품 전체조회
		Item[] myItems =myCart.getItems();
		for (int i = 0; i < myCart.getCount(); i++) {
			System.out.println(myItems[i]);
//			System.out.println(myItems[i].toString()); 자동 호출 됨. 왜?
		}
		//카트 상품 이름으로 검색
		System.out.println("----- 상품 이름으로 검색 -----");
		String searchName ="Dynamite";
		Item searchItem = myCart.findByName(searchName);
		if(searchItem != null) {
			System.out.println(searchItem.toString()); //자동 호출되는거 보여주려고 toString 쓴 것
			Album al = (Album)searchItem;
			al.getArtist();
		} else {
			System.out.println("검색된 상품이 없습니다.");
		}
		
		//카트에서 상품 제거
		System.out.println("----- 삭제 테스트 -----");
		if(myCart.removeItem("아바타2")) {
			System.out.println("삭제 되었습니다.");
		}
		else {
			System.out.println("삭제 되지 않았습니다.");
		}
		
		
	}

}
