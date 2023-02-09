package basic;

public class OperatorExample {

	public static void main(String[] args) {
		// 자바에서 사용 가능한 연산자들....
		// 산술연산자(+, -, *, /, %)
		int x = 30, y=10;
		int result = x + y ;
		System.out.println(result);
		
		result = x % y;
		System.out.println(result);
		
		x = 1; 
		y = 2;
		
		System.out.println((double)x/y);
		
		int xx = 1; 
		int yy = 2;
		
		System.out.println(xx/(double)yy);
		
		// 복합 대입연산자(+=, -=, ......);
		
		x = 100;
		y = 10;
		x = x + 10; //할당 연산자는 우선순위가 제일 낮다.
		x += 10; //x에 +를 먼저 계산하고 그 다음 =으로 할당한다.
		System.out.println(x);
		// 비교연산(==, !=, ...)
		x = 10;
		y = 20;
		boolean res = x==y;
		System.out.println(res);
		System.out.println(x != y);
		
		// 증감 연산자(++, --)
		//x = x + 1;
		//x++;
		//x +=1;
		System.out.println(x++); //10
		System.out.println(x); //11
		
		// 논리연산자 (&&, ||, !)
		boolean a = true ,b = false;
		
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
		
		if(true && x++ > 1) {
			System.out.println("나 실행됐다아");
		}
		
		int a1 = 4, a2 = 7, a3 = 10, max;
//		max = a1 > a2 ? a1 : a2;
//		System.out.println(max);
//		max = max > a3 ? max : a3;
//		System.out.println(max);
		if(a1 > a2) {
			max = a1;
		}
		else {
			max = a2;
		}
		System.out.println(max);
		if(max > a3) {
			max = max;
		}
		else {
			max = a3;
		}
		System.out.println(max);
		
		System.out.println((1+2)*3);
		
		

	}

}
