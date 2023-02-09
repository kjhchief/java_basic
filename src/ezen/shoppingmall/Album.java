package ezen.shoppingmall;

public class Album extends Item {
	private String artist;
//	private int isbn;

	public Album() {
	}

	public Album(int id, String name, int price, String artist) {
		super(id, name, price);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() { //toString 오버라이드 안 하면 ezen.shoppingmall.Album@43a25848 이렇게 나옴
		return super.toString() + "\t" + artist;
	}

}
