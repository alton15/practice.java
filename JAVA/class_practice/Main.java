
public class Main {

	public static void main(String[] args) {
		Node one = new Node(10, 20);	//x = 10, y = 20
		Node two = new Node(30, 40);
		Node result = one.getCenter(two);	//x���� ���ϰ� x�� �ְ�, y���� ���ϰ� y�� �ִ´�.
		
		System.out.println("x: " + result.getX() + ", y: " + result.getY());
	}

}
