import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    DrawerFrame frame;
    MyMouseListener(DrawerFrame frame){
        this.frame = frame;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mouse Pressed");
        int x = e.getX();
        int y = e.getY();
        Graphics g = frame.getGraphics();
        g.drawLine(x-10, y-10, x+10,y+10);
        g.drawLine(x+10, y-10, x-10,y+10);

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
}
