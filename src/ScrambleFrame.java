import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ScrambleFrame
{
  private JFrame frame;
  private JButton news;
  private JButton previouss;
  private JButton nexts;
  private JTextArea ScrambleTextArea;
  private JComboBox cubesize;
  private JPanel Buttons;
  private JPanel Progr;
  private JPanel Tarea;
  private JPanel also;
  private JMenuBar menu;
  private JMenu setmenu;
  private JMenuItem save;
  private JMenuItem load;
  private JMenuItem wtf;
  private JMenuItem exit;
  private JLabel TA;
  private JLabel CS;

  public ScrambleFrame()
  {
    this.frame = new JFrame();
    this.frame.setTitle("Szepes Nóra Scramble Program");
    this.frame.setDefaultCloseOperation(3);
    this.frame.setMinimumSize(new Dimension(800, 520));
    this.frame.pack();
    this.frame.setResizable(false);

    this.news = new JButton();
    this.news.setText("New scramble");

    this.previouss = new JButton();
    this.previouss.setText("Previous scramble");
    this.previouss.setEnabled(false);

    this.nexts = new JButton();
    this.nexts.setText("Next scramble");
    this.nexts.setEnabled(false);

    this.cubesize = new JComboBox();
    for (int i = 2; i < 8; i++) {
      this.cubesize.addItem(Integer.valueOf(i));
    }

    this.ScrambleTextArea = new JTextArea();
    this.ScrambleTextArea.setEditable(false);
    this.ScrambleTextArea.setColumns(70);
    this.ScrambleTextArea.setRows(4);
    this.ScrambleTextArea.setLineWrap(true);
    this.ScrambleTextArea.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

    this.setmenu = new JMenu("File");
    this.menu = new JMenuBar();
    this.save = new JMenuItem();
    this.load = new JMenuItem();
    this.wtf = new JMenuItem();
    this.exit = new JMenuItem();

    this.save.setText("Save");
    this.load.setText("Load");
    this.wtf.setText("Write to File");
    this.exit.setText("Exit");

    this.setmenu.add(this.save);
    this.setmenu.add(this.load);
    this.setmenu.add(this.wtf);
    this.setmenu.add(this.exit);

    this.menu.add(this.setmenu);

    this.Buttons = new JPanel(new FlowLayout(0));
    this.Buttons.add(this.previouss);
    this.Buttons.add(this.nexts);
    this.Buttons.add(this.news);

    this.CS = new JLabel("Cubesize:");
    this.Progr = new JPanel(new FlowLayout());
    this.Progr.add(this.CS);
    this.Progr.add(this.cubesize);
    this.Progr.add(this.Buttons);

    this.TA = new JLabel();
    this.Tarea = new JPanel(new GridLayout(2, 1));
    this.Tarea.add(this.TA);
    this.Tarea.add(this.ScrambleTextArea);

    this.also = new JPanel(new FlowLayout());
    this.also.setBorder(BorderFactory.createCompoundBorder());

    this.frame.setLayout(new FlowLayout());
    this.frame.setJMenuBar(this.menu);
    this.frame.add(this.Progr);
    this.frame.add(this.Tarea);
    this.frame.add(this.also);

    this.frame.setVisible(true);
  }

  public void SetSTA(String j)
  {
    this.ScrambleTextArea.setText(j);
  }

  public Integer GetCS()
  {
    return (Integer)this.cubesize.getSelectedItem();
  }

  public void setTA(String k)
  {
    this.TA.setText(k);
  }

  public void addPreviousButtonActionListener(ActionListener e)
  {
    this.previouss.addActionListener(e);
  }
  public void addNextButtonActionListener(ActionListener e) {
    this.nexts.addActionListener(e);
  }
  public void addNewButtonActionListener(ActionListener e) {
    this.news.addActionListener(e);
  }
  public void addSaveActionListener(ActionListener e) {
    this.save.addActionListener(e);
  }
  public void addLoadActionListener(ActionListener e) {
    this.load.addActionListener(e);
  }
  public void addExitActionListener(ActionListener e) {
    this.exit.addActionListener(e);
  }
  public void addWTFActionListener(ActionListener e) {
    this.wtf.addActionListener(e);
  }

  public void setPreviousDisabled()
  {
    this.previouss.setEnabled(false);
  }
  public void setPreviousEnabled() {
    this.previouss.setEnabled(true);
  }
  public void setNextDisabled() {
    this.nexts.setEnabled(false);
  }
  public void setNextEnabled() {
    this.nexts.setEnabled(true);
  }

  public void setKeveres(JPanel kev)
  {
    removeKeveres();
    this.also.add(kev);
    this.frame.validate();
  }
  public void removeKeveres() {
    this.also.removeAll();
    this.also.validate();
    this.frame.validate();
  }
}
