package new_practice;

public class InfinityAndNaN {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;		//연산 하고 싶은 라인을 뺸 곳에 주석처리를 해준다.
		//double z = x % y;
		
		System.out.println(Double.isInfinite(z));	//값이 infinity인지 확인
		System.out.println(Double.isNaN(z));	//값이 Nan인지 확인
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값을 산출 할 수 없습니다.");
		}
		else {
			System.out.println(z + 2);
		}
	}
}
