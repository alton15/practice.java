package new_practice;

public class ArrayCopy {
	public static void main(String[] args) {
		//for문으로 배열 복사
		int[] oldArr = { 1, 2, 3 };
		int[] newArr = new int[5];
		
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		
		/************************************/
		
		//System.arraycopy()로 배열 복사
		String[] oldArray = { "김", "기", "강" };
		String[] newArray = new String[5];
				//원본 배열, 복사 시작할 인덱스, 새 배열, 새 배열에 넣을 시작 인덱스, 복사할 갯수
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		for(int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
}
