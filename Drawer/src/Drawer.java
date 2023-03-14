import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Drawer {


    public static void main(String[] args) {

        JFrame drawerFrame = new DrawerFrame();
        drawerFrame.setVisible(true);

    }

}

/*class DrawerFrame extends JFrame implements MouseListener{ // Interface 를 받아서 구현하지 않은 메서드 마저 명시를 했어야 했다.


    DrawerFrame() {
        setTitle("Drawer");
        setLocation(100,100);
        setSize(700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
        int x = e.getX();
        int y = e.getY();
        Graphics g = getGraphics();
        g.drawLine(x-10,y-10,x+10,y+10);
        g.drawLine(x+10,y-10,x-10,y+10);

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    */

/*
//version 3 추상 클래스를 이용해 불필요한 메서드를 필드에 선언하지 않는다.
class MyMouseListener extends MouseAdapter {

   DrawerFrame frame;
   MyMouseListener(DrawerFrame frame){
       this.frame = frame;
   }

    @Override
    public void mousePressed(MouseEvent e){
        System.out.println("mousePressed");
        int x = e.getX();
        int y = e.getY();
        Graphics g = frame.getGraphics();
        g.drawLine(x-10,y-10,x+10,y+10);
        g.drawLine(x+10,y-10,x-10,y+10);


    }

}

class DrawerFrame extends JFrame{
    DrawerFrame(){
        setTitle("Drawer");
        setLocation(100,100);
        setSize(700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(new MyMouseListener(this));
    }
}
*/



