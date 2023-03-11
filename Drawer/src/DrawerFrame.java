import javax.swing.*;

public class DrawerFrame extends JFrame {
    DrawerFrame() {
        setTitle("Drawer");
        setSize(700,700);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addMouseListener(new MyMouseListener(this));
    }

}
