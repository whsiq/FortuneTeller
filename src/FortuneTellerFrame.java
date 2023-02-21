import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

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

    Random rnd = new Random();

    int newFortune;
    int storedFortune;

    public FortuneTellerFrame() {

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        createTopPanel();
        mainPnl.add(topPnl, BorderLayout.NORTH);

        createMiddlePanel();
        mainPnl.add(midPnl, BorderLayout.CENTER);

        createBottomPanel();
        mainPnl.add(lowPnl, BorderLayout.SOUTH);

        add(mainPnl);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Fortune Teller");
        setSize((int) (screenWidth * .75), (int) ((screenHeight) * .75));
        setLocation(screenWidth / 8, screenHeight / 8);
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

    private void createMiddlePanel() {
        midPnl = new JPanel();
        fortuneTA = new JTextArea(15, 60);
        fortuneTA.setEditable(false);
        fortuneTA.setFont(fortuneFont);
        scroller = new JScrollPane(fortuneTA);

        midPnl.add(scroller);
    }

    private void createBottomPanel() {
        fortunes.add("The man or woman you desire feels the same about you.");
        fortunes.add("Your shoes will make you happy today.");
        fortunes.add("A stranger, is a friend you have not spoken to yet.");
        fortunes.add("Our deeds determine us, as much as we determine our deeds.");
        fortunes.add("If winter comes, can spring be far behind?");
        fortunes.add("Jealousy doesn't open doors, it closes them!");
        fortunes.add("The man on the top of the mountain did not fall there.");
        fortunes.add("Nothing astonishes men so much as common sense and plain dealing.");
        fortunes.add("Land is always on the mind of a flying bird.");
        fortunes.add("Serious trouble will bypass you.");
        fortunes.add("You already know the answer to the questions lingering inside your head.");
        fortunes.add("The greatest risk is not taking one.");

        lowPnl = new JPanel();
        lowPnl.setLayout(new GridLayout(1,2));

        fortuneBtn = new JButton("Read My Fortune!");
        fortuneBtn.setFont(btnFont);
        fortuneBtn.addActionListener((ActionEvent ae) -> {
            newFortune = rnd.nextInt(11);

            // Ensure that the same fortune isn't picked twice in a row

            if (newFortune == storedFortune) {
                while (newFortune == storedFortune) {
                    newFortune = rnd.nextInt(11);
                }
                fortuneTA.append(fortunes.get(newFortune) + "\n");
            }

            else {
                fortuneTA.append(fortunes.get(newFortune) + "\n");
            }
            storedFortune = newFortune;
        });

        quitBtn = new JButton("Quit");
        quitBtn.setFont(btnFont);
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        lowPnl.add(fortuneBtn);
        lowPnl.add(quitBtn);
    }

}
