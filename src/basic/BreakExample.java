package basic;

public class BreakExample {

	public static void main(String[] args) {
		
		int i = 0;
		while (true) {
			System.out.println("i= "+i);
			i++;
			if(i == 100) {
				break; //break는 if랑 상관없음. for while switch랑만 세트임.
			}
		}
		
		//레이블(Label) 사용하기
		
		i = 0;
		OUT:
		while (i < 100) {
			int j = 0;
			while (j < 100) {
				System.out.println("i="+i+", j="+j);
				j++;
				if(j == 50) {
					break OUT;
				}
				
			}
			i++;
		}

	}

}
