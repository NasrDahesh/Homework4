import javax.swing.*;
import java.awt.*;

public class Q8_Name extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle A=new Rectangle();

        g2.setColor(Color.BLUE);
        g2.fillRect(50, 50, 200, 100);
        g2.setColor(Color.RED);
        g2.drawString("NasrDahech", 100, 100);

    }
}
