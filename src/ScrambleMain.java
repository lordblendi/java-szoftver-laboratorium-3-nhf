import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class ScrambleMain
{
  private SavedScrambles SS;
  private ScrambleFrame SF;

  public ScrambleMain()
  {
    this.SS = new SavedScrambles();
    this.SF = new ScrambleFrame();

    this.SF.addNewButtonActionListener(new ScrambleMain.NewButtonActionListener());
    this.SF.addNextButtonActionListener(new ScrambleMain.NextButtonActionListener());
    this.SF.addPreviousButtonActionListener(new ScrambleMain.PreviousButtonActionListener());
    this.SF.addLoadActionListener(new ScrambleMain.LoadActionListener());
    this.SF.addSaveActionListener(new ScrambleMain.SaveActionListener());
    this.SF.addExitActionListener(new ScrambleMain.ExitActionListener());
    this.SF.addWTFActionListener(new ScrambleMain.WTFActionListener());
    this.SF.setPreviousDisabled();
    this.SF.setNextDisabled();
    this.SF.setTA("");
  }

  public static void main(String[] args)
  {
    ScrambleMain proba = new ScrambleMain();
  }

  public class ExitActionListener
    implements ActionListener
  {
    public ExitActionListener()
    {
    }

    public void actionPerformed(ActionEvent e)
    {
      System.exit(0);
    }
  }

  public class LoadActionListener
    implements ActionListener
  {
    public LoadActionListener()
    {
    }

    public void actionPerformed(ActionEvent e)
    {
      ScrambleMain.this.SF.setTA("");
      ScrambleMain.this.SF.SetSTA(ScrambleMain.this.SS.load());
      ScrambleMain.this.SS.setWMI();
      ScrambleMain.this.SS.setNOS();
      ScrambleMain.this.SF.setPreviousDisabled();
      if (ScrambleMain.this.SS.getNOS() > 0) {
        ScrambleMain.this.SF.setNextEnabled();
      }
      ScrambleMain.this.SF.setKeveres(new JPanel());
    }
  }

  public class NewButtonActionListener
    implements ActionListener
  {
    public NewButtonActionListener()
    {
    }

    public void actionPerformed(ActionEvent e)
    {
      Integer size = ScrambleMain.this.SF.GetCS();
      ScrambleMain.this.SF.SetSTA(ScrambleMain.this.SS.newscramble(size.intValue()));
      ScrambleMain.this.SF.setTA("Scramble for " + size + "x" + size + "x" + size + ":");
      ScrambleMain.this.SF.setKeveres(CubeFrame.makecubeframe(CubeMap.solve(ScrambleMain.this.SS.getcubesize(), ScrambleMain.this.SS.getscramble())));
      if (ScrambleMain.this.SS.getWMI() <= 0) {
        ScrambleMain.this.SF.setPreviousDisabled();
      }
      else {
        ScrambleMain.this.SF.setPreviousEnabled();
      }
      ScrambleMain.this.SF.setNextDisabled();
    }
  }

  public class NextButtonActionListener implements ActionListener {
    public NextButtonActionListener() {
    }

    public void actionPerformed(ActionEvent e) { if (ScrambleMain.this.SS.getWMI() == ScrambleMain.this.SS.getNOS() - 1) {
        ScrambleMain.this.SF.setNextDisabled();
      }
      else if ((ScrambleMain.this.SS.getNOS() == 1) || (ScrambleMain.this.SS.getNOS() == 0)) {
        ScrambleMain.this.SF.setNextDisabled();
        ScrambleMain.this.SF.setPreviousDisabled();
      }
      else if (ScrambleMain.this.SS.getWMI() < ScrambleMain.this.SS.getNOS() - 1) {
        ScrambleMain.this.SF.SetSTA(ScrambleMain.this.SS.nextscramble());
        Integer size2 = Integer.valueOf(ScrambleMain.this.SS.getcubesize());
        ScrambleMain.this.SF.setTA("Scramble for " + size2 + "x" + size2 + "x" + size2 + ":");
        ScrambleMain.this.SF.setKeveres(CubeFrame.makecubeframe(CubeMap.solve(ScrambleMain.this.SS.getcubesize(), ScrambleMain.this.SS.getscramble())));
        ScrambleMain.this.SF.setPreviousEnabled();
        if (ScrambleMain.this.SS.getWMI() == ScrambleMain.this.SS.getNOS() - 1)
          ScrambleMain.this.SF.setNextDisabled();
      }
    }
  }

  public class PreviousButtonActionListener
    implements ActionListener
  {
    public PreviousButtonActionListener()
    {
    }

    public void actionPerformed(ActionEvent e)
    {
      if (ScrambleMain.this.SS.getWMI() == 0) {
        ScrambleMain.this.SF.setTA("");
        ScrambleMain.this.SF.SetSTA("");
        ScrambleMain.this.SF.setPreviousDisabled();
      }
      else if (ScrambleMain.this.SS.getNOS() == 0)
      {
        ScrambleMain.this.SF.setPreviousDisabled();
        ScrambleMain.this.SF.setNextDisabled();
      }
      else if (ScrambleMain.this.SS.getNOS() == 1)
      {
        ScrambleMain.this.SF.setPreviousDisabled();
        ScrambleMain.this.SF.setNextDisabled();
        ScrambleMain.this.SF.SetSTA(ScrambleMain.this.SS.previousscramble());
        Integer size = Integer.valueOf(ScrambleMain.this.SS.getcubesize());
        ScrambleMain.this.SF.setTA("Scramble for " + size + "x" + size + "x" + size + ":");
        ScrambleMain.this.SF.setKeveres(CubeFrame.makecubeframe(CubeMap.solve(ScrambleMain.this.SS.getcubesize(), ScrambleMain.this.SS.getscramble())));
      }
      else
      {
        ScrambleMain.this.SF.setPreviousEnabled();
        ScrambleMain.this.SF.SetSTA(ScrambleMain.this.SS.previousscramble());
        Integer size = Integer.valueOf(ScrambleMain.this.SS.getcubesize());

        if (ScrambleMain.this.SS.getWMI() == 0) {
          ScrambleMain.this.SF.setPreviousDisabled();
        }
        ScrambleMain.this.SF.setTA("Scramble for " + size + "x" + size + "x" + size + ":");
        ScrambleMain.this.SF.setKeveres(CubeFrame.makecubeframe(CubeMap.solve(ScrambleMain.this.SS.getcubesize(), ScrambleMain.this.SS.getscramble())));

        if (ScrambleMain.this.SS.getWMI() <= ScrambleMain.this.SS.getNOS() - 1) {
          ScrambleMain.this.SF.setNextEnabled();
        }
        else
          ScrambleMain.this.SF.setNextDisabled();
      }
    }
  }

  public class SaveActionListener
    implements ActionListener
  {
    public SaveActionListener()
    {
    }

    public void actionPerformed(ActionEvent e)
    {
      ScrambleMain.this.SF.setTA("");
      ScrambleMain.this.SF.SetSTA(ScrambleMain.this.SS.save());
    }
  }

  public class WTFActionListener
    implements ActionListener
  {
    public WTFActionListener()
    {
    }

    public void actionPerformed(ActionEvent e)
    {
      ScrambleMain.this.SF.setTA("");
      ScrambleMain.this.SF.SetSTA(ScrambleMain.this.SS.writetofile());
    }
  }
}
