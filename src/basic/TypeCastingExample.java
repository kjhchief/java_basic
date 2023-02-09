package basic;

public class TypeCastingExample {

	public static void main(String[] args) {
		// 자동형변환(Promotion) - Up Casting
		double weight = 30;
		System.out.println(weight);
		double result= 10.0 + 25;
		System.out.println(result);
		System.out.println("몸무게: " + weight); //"몸무게: " + "30"
		
		int x= 'a';
		System.out.println(x); //자동형변환
		
		//강제형변환(Demotion) - Down Casting
		weight= 55.55;
		System.out.println(weight);
		weight= (int)55.55;
		System.out.println(weight);
		weight= 55.55;
		System.out.println((int)weight);
		
		int score = (int)98.34;
		System.out.println(score);
		
		
		

	}

}
