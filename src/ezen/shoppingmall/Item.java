package ezen.shoppingmall;

/**
 * 쇼핑몰에서 취급하는 모든 상품들에 대한 공통속성과 기능 정의를 위한 부모클래스
 * @Author 김재훈
 * @Date 2023. 1. 5.
 */
public class Item {
	private int id;
	private String name;
	private int price;
	
	public Item() {}
	public Item(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price =price;
	}
	
	//세터게터 내가 천천히 만들어보기
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() { //toString 오버라이드 안 하면 ezen.shoppingmall.Album@43a25848 이렇게 나옴
		return id+"\t"+name+"\t"+price;
	}
	
	
	
	
}
