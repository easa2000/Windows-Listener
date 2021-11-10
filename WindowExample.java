import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowExample extends Frame implements WindowListener {
    WindowExample() {
        addWindowListener(this);

        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowExample();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("opened...");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing...");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("closed.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Deactivated");
    }
}
