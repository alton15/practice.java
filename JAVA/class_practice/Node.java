
public class Node {	//Node�� ��ǥ�� ���Ѵ�.
	private int x;	//private�� �ܺο��� �Ժη� ���ٲٰ�
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {	//x�� ���� �����Ϸ���
		this.x = x;	//�ڽ� ������ �Ӽ��� �ٲ��� �� this�� ����.
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
	
	public Node getCenter(Node other) {	//getCenter�� �ٸ� ��带 �Ű������� �޴´�.
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}	//�ٸ� ���� ���ؼ� ���߾��� ���� ���Ѵ�.
	
}
