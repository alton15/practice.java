package new_practice;

public class WhileKeyControl {
	public static void main(String[] args) throws Exception {
		int speed = 0;		//throws Exception�� System.in.read�� ���� ���� ó�� �ڵ��.
		int keycode = 0;
		boolean power = true;
		
		while(power) {
			if(keycode != 13 && keycode != 10) {
				System.out.println("*****************************************");
				System.out.println("1. Speed Up | 2. Speed Down | 3. Stop");
				System.out.println("*****************************************");
				System.out.print("����: ");
			}
			
			keycode = System.in.read();
			
			if(keycode == 49) {
				speed++;
				System.out.println("Current Speed: " + speed);
			}
			else if(keycode == 50) {
				speed--;
				System.out.println("Current Speed: " + speed);
			}
			else if(keycode == 51) {
				power = false;
			}
		}
		
		System.out.println("Power Off");
	}
}
