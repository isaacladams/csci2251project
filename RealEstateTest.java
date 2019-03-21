import javax.swing.JFrame;

public class RealEstateTest {
	public static void main(String[] args) throws InterruptedException {
		ClientGui clientGui = new ClientGui();
		clientGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clientGui.setSize(800,700);
		clientGui.setVisible(true); 
		while(true) {
			Thread.sleep(50);
		}
	}
}
