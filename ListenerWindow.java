import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class ListenerWindow extends JFrame implements WindowStateListener {
    ListenerWindow() {
        super("Main Frame");
        setSize(500, 500);

        JFrame f = new JFrame("Sub");
        f.addWindowStateListener(this);
        f.setSize(400,400);
        show();
        f.show();

    }

    @Override
    public void windowStateChanged(WindowEvent e) {
        JOptionPane.showMessageDialog(this, "window state changed");

    }

    public static void main(String[] args) {
        ListenerWindow l = new ListenerWindow();
    }
}
