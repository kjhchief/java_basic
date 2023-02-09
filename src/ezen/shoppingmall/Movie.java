package ezen.shoppingmall;

public class Movie extends Item {
	//원래 배열로 만들어야 함. 감독과 배우는 여러명일 수 있기에.
	private String director;
	private String actor; 

	public Movie() {
	}

	public Movie(int id, String name, int price, String director, String actor) {
		super(id, name, price);
		this.director = director;
		this.actor = actor;
		
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	@Override
	public String toString() { //toString 오버라이드 안 하면 ezen.shoppingmall.Album@43a25848 이렇게 나옴
		return super.toString() + "\t" + director + "\t" + actor;
	}

	
	
	

}
