package ezen.shoppingmall;

/**
 * 쇼핑몰에서 취급하는 모든 상품들을 담고, 빼고, 검색하고 등 기능 제공
 * 
 * @Author 김재훈
 * @Date 2023. 1. 5.
 */
public class Cart {
	// private Album[] albums;
	// private Movie[] movies; 만약 다형성이 없다면 이렇게 다 일일이 만들어야 함.
	private Item[] items; // 필드의 다형성
	private int count;
	private int capacity;

	public Cart() {
	}

	public Cart(int capacity)/* count는 0으로 자동 초기화니까 따로 안 함 */ {
		this.capacity = capacity;
		items = new Item[capacity]; // 초기화를 이렇게 하는것. 배열이라 다른거랑 약간 다르다.
	}

	// 카트에 담긴 전체 상품 목록 반환
	public Item[] getItems() { // 전체 상품 목록
		return items;
	}

//	public void setItems(Item[] items) { set은 데이터 변경 기능인데, 카트에 그런 기능 없으니 제거.
//		this.items = items;
//	}
	public int getCount() {
		return count;
	}
//	public void setCount(int count) { 이것도 데이터 변경이니 뺀다?
//		this.count = count;
//	}

	// 카트에 상품 담기
	// 매개변수의 다형성
	public void addItem(Item item) {
		this.items[count++] = item;
	}

	// 상품 이름으로 상품 검색
	public Item findByName(String name) {
		for (int i = 0; i < count; i++) {
			if (items[i].getName().equals(name)) {
				return items[i];
			}

		}
		return null;
	}

//	public Item findByName(String name) {
//		for (int i = 0; i < count; i++) {
//			Item item = items[i];
//			boolean exist = item.getName().equals(name);
//			if(exist) {
//				return item;
//			
//		}
//		}
//		return null; //왜 null을 반환하는가?
//	}
//	카트에서 상품 제거
	public boolean removeItem(String name) {
		for (int i = 0; i < count; i++) { // i번째 즉 목록만큼 전체 반복
			if (items[i].getName().equals(name)) {
				for (int j = i; j < count - 1; j++) {
					items[i] = items[j + 1];
				}
				count--;
				return true;
			}
		}

		return false;
	}

//	카트에서 모든 상품 제거 (비우기)
	public void removeAll() {
//		for (int i = 0; i < count; i++) {
//			items[i] = null;
//		}
		items = new Item[capacity];
		count = 0;
	}

}
