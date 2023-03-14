import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class DrawerFrame extends JFrame {
    DrawerFrame() {
        setTitle("Drawer");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int screenHeight = d.height;
        int screenWidth = d.width;
        setSize(screenWidth*2/3,screenHeight*2/3);
        setLocation(screenWidth/6, screenHeight/6);

        // 메뉴바를 붙이는 로직
        JMenuBar menus = new JMenuBar();
        setJMenuBar(menus);

        JMenu fileMenu = new JMenu("파일(F)");
        menus.add(fileMenu);


        JMenuItem newFile = new JMenuItem("새 파일(N)");
        fileMenu.add(newFile);
        newFile.setMnemonic('N'); // 단축기로써 작동할 수 있도록 조치가 되는 것이다.
        //newFile.setIcon(new ImageIcon("new.gif")); 이런식으로 아이콘을 저장해 줄 수 있다.
        newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));


        JMenuItem openFile = new JMenuItem("열기(O)");
        fileMenu.add(openFile);
        openFile.setMnemonic('O'); // 단축기로써 작동할 수 있도록 조치가 되는 것이다.
        //newFile.setIcon(new ImageIcon("new.gif")); 이런식으로 아이콘을 저장해 줄 수 있다.
        openFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        openFile.addActionListener((e) -> System.out.println("열기"));



        JMenuItem saveFile = new JMenuItem("저장(S)");
        fileMenu.add(saveFile);
        saveFile.setMnemonic('S'); // 단축기로써 작동할 수 있도록 조치가 되는 것이다.
        //newFile.setIcon(new ImageIcon("new.gif")); 이런식으로 아이콘을 저장해 줄 수 있다.
        saveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));

        JMenuItem anotherFile = new JMenuItem("다른 이름으로 저장(A)");
        fileMenu.add(anotherFile);
        anotherFile.setMnemonic('A'); // 단축기로써 작동할 수 있도록 조치가 되는 것이다.
        //newFile.setIcon(new ImageIcon("new.gif")); 이런식으로 아이콘을 저장해 줄 수 있다.
        anotherFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));

        fileMenu.addSeparator();
        JMenuItem exit = new JMenuItem("종료(X)");
        fileMenu.add(exit);
        newFile.setMnemonic('X'); // 단축기로써 작동할 수 있도록 조치가 되는 것이다.
        //newFile.setIcon(new ImageIcon("new.gif")); 이런식으로 아이콘을 저장해 줄 수 있다.
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JMenu helpMenu = new JMenu("도움말(H)");
        menus.add(helpMenu);

        JMenuItem infoHelp = new JMenuItem("Drawer 정보(I)");
        helpMenu.add(infoHelp);
        infoHelp.addActionListener( (e) -> {
            JOptionPane.showMessageDialog(null,"Author: KIM Tae-dong\r\nCompany: BUFS","Drawer Infomation",JOptionPane.INFORMATION_MESSAGE);
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
