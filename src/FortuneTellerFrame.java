import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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

    ArrayList<String> fortunes = new ArrayList<>();
//    fortunes.add("The man or woman you desire feels the same about you.");
//    fortunes.add("Your shoes will make you happy today.");
//    fortunes.add("A stranger, is a friend you have not spoken to yet.");
//    fortunes.add("Our deeds determine us, as much as we determine our deeds.");
//    fortunes.add("If winter comes, can spring be far behind?");
//    fortunes.add("Jealousy doesn't open doors, it closes them!");
//    fortunes.add("The man on the top of the mountain did not fall there.");
//    fortunes.add("Nothing astonishes men so much as common sense and plain dealing.");
//    fortunes.add("Land is always on the mind of a flying bird.");
//    fortunes.add("Serious trouble will bypass you.");
//    fortunes.add("You already know the answer to the questions lingering inside your head.");
//    fortunes.add("The greatest risk is not taking one.");
    public FortuneTellerFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Fortune Teller");

        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        mainPnl.add(topPnl, BorderLayout.NORTH);

    }

    private void createTopPanel() {

        topPnl = new JPanel();
        imgIcon = new ImageIcon("src/fortuneImg.png");
        titleLbl = new JLabel("Fortune Teller", imgIcon, JLabel.CENTER);
        titleLbl.setFont(titleFont);
        titleLbl.setVerticalTextPosition(JLabel.BOTTOM);
        titleLbl.setHorizontalTextPosition(JLabel.CENTER);

        topPnl.add(titleLbl);
    }

}
