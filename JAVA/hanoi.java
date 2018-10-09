package hanoi;

import java.util.Arrays;

public class main {
	class Hanoi {
		  int count=0;
		  public int[][] hanoi(int n) {
		    int[][] answer = new int[(int)Math.pow(2, n)-1][2];
		    answer = moveHanoi(1, 2, 3, n, answer);

		    return answer;
		  }
		  
		  public int[][] moveHanoi(int fi, int se, int th, int n, int[][] answer) {
		    if(n==1) {
		      answer[count][0]=fi;
		      answer[count][1]=th;
		      ++count;
		    }
		    else {
		      moveHanoi(fi, th, se, n-1, answer);
		      answer[count][0]=fi;
		      answer[count][1]=th;
		      ++count;
		      moveHanoi(se, fi, th, n-1, answer);
		    }
		    return answer;
		  }

		 
		 public void main(String[] args) {
		   Hanoi h = new Hanoi();
		   System.out.println(Arrays.deepToString(h.hanoi(2)));
		 }

		}
}
