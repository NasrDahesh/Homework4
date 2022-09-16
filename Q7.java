import javax.swing.*;
import java.awt.*;

public class Q7 extends JFrame{
    public Q7 (){
        setTitle("Q7");
        setSize(900, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint (Graphics A){
        A.setColor(Color.MAGENTA);
        A.fillRect(700, 175, 50, 50);
        A.setColor(Color.PINK);
        A.fillRect(700, 225, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(700, 275, 50, 50);
        A.setColor(Color.PINK);
        A.fillRect(650, 275, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(600, 275, 50, 50);
        A.setColor(Color.red);
        A.fillRect(600, 175, 50, 50);
        A.setColor(Color.PINK);
        A.fillRect(550, 275, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(500, 275, 50, 50);
        A.setColor(Color.PINK);
        A.fillRect(500, 225, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(500, 175, 50, 50);
        A.setColor(Color.PINK);
        A.fillRect(450, 175, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(400, 175, 50, 50);
        A.setColor(Color.PINK);
        A.fillRect(400, 225, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(400, 275, 50, 50);
        A.setColor(Color.PINK);
        A.fillRect(400, 325, 50, 50);

        A.setColor(Color.PINK);
        A.fillRect(450, 275, 50, 50);

        A.setColor(Color.PINK);
        A.fillRect(350, 275, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(300, 275, 50, 50);
        A.setColor(Color.PINK);
        A.fillRect(250, 275, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(250, 225, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(250, 325, 50, 50);
        A.setColor(Color.PINK);
        A.fillRect(250, 375, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(200, 375, 50, 50);
        A.setColor(Color.PINK);
        A.fillRect(150, 375, 50, 50);
        A.setColor(Color.MAGENTA);
        A.fillRect(100, 375, 50, 50);
    }

    public static void main(String[] args) {
        Q7 A=new Q7();
        A.paint(null);
    }
}

