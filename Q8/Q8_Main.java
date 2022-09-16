import javax.swing.JFrame;
public class Q8_Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Q8_Name Name = new Q8_Name();
        frame.add(Name);

        frame.setVisible(true);
    }
}
