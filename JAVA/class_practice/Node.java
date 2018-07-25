
public class Node {	//Node는 좌표를 뜻한다.
	private int x;	//private는 외부에서 함부로 못바꾸게
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {	//x의 값을 설정하려고
		this.x = x;	//자신 고유의 속성을 바꿔줄 때 this를 쓴다.
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {	//getCenter는 다른 노드를 매개변수로 받는다.
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}	//다른 값과 비교해서 정중앙의 값을 구한다.
	
}
