import javax.swing.JFrame;
import java.awt.*;

public abstract class AbsFrame extends JFrame {

    public AbsFrame() {
        // Set the JFrame
        setSize(300, 300);
        setLocationRelativeTo(null); // sets the location of this frame at the center of the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Snakes And Ladders");
    }

}
