import javax.swing.JFrame;
public class Q9_Main {
    public static void main(String[] args) {
        JFrame F = new JFrame();
        F.setSize(800, 1000);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Q9_Traffic A = new Q9_Traffic();
        F.add(A);

        F.setVisible(true);
    }
}
