
public class Main {

	public static void main(String[] args) {
		Node one = new Node(10, 20);	//x = 10, y = 20
		Node two = new Node(30, 40);
		Node result = one.getCenter(two);	//x끼리 더하고 x에 넣고, y끼리 더하고 y에 넣는다.
		
		System.out.println("x: " + result.getX() + ", y: " + result.getY());
	}

}
