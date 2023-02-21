import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame {

    // Initializations

    JPanel mainPnl;
    JPanel topPnl;
    JPanel midPnl;
    JPanel lowPnl;

    JLabel titleLbl;
    ImageIcon imgIcon;

    Font titleFont = new Font(Font.SANS_SERIF, Font.BOLD, 48);
    Font fortuneFont = new Font(Font.SANS_SERIF, Font.PLAIN, 12);
    Font btnFont = new Font(Font.SANS_SERIF, Font.PLAIN, 14);

    JTextArea fortuneTA;
    JScrollPane scroller;

    JButton fortuneBtn;
    JButton quitBtn;


}
