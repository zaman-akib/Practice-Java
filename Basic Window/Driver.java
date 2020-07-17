import java.awt.*;

public class Driver extends Frame {
    Driver(){
    	Button b=new Button("Click Here");
    	b.setBounds(30, 100, 80, 30);
    	add(b);
    	setSize(300,300);
    	setLayout(null);
    	setVisible(false);
    }
	public static void main(String[] args) {
		Driver f=new Driver();

	}
}
