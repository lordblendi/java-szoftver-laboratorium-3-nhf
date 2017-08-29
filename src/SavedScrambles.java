import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class SavedScrambles
  implements Iterable<Scramble>, Serializable
{
  private ArrayList<Scramble> Scrambles;
  private int NumberOfScrambles;
  private int WhereAmI;

  public SavedScrambles()
  {
    this.Scrambles = new ArrayList();
    this.NumberOfScrambles = this.Scrambles.size();
  }

  public String save()
  {
    try
    {
      FileOutputStream fos = new FileOutputStream("SavedScrambles.SS");
      ObjectOutputStream out = new ObjectOutputStream(fos);
      out.writeObject(this.Scrambles);
      out.close();
      fos.close();

      return "Scrambles are exported to SavedScrambles.SS.";
    }
    catch (FileNotFoundException e)
    {
      return "File not found.";
    }
    catch (IOException e)
    {
      System.out.println("problem");
      e.printStackTrace();
    }
    return "problem";
  }

  public String load()
  {
    try
    {
      FileInputStream fis = new FileInputStream("SavedScrambles.SS");
      ObjectInputStream in = new ObjectInputStream(fis);
      try {
        this.Scrambles = ((ArrayList)in.readObject());
      } catch (ClassNotFoundException e) {
        System.out.println("Class not found");
      }
      in.close();
      fis.close();

      return "Scrambles are imported from SavedScrambles.SS. If the Next button is not enabled, then you imported an empty scramble list.";
    }
    catch (FileNotFoundException e)
    {
      return "File not found.";
    }
    catch (IOException e)
    {
      System.out.println("problem");
      e.printStackTrace();
    }
    return "problem";
  }

  public Iterator<Scramble> iterator()
  {
    return this.Scrambles.iterator();
  }

  public String writetofile()
  {
    try {
      FileWriter wr = new FileWriter("MyScrambles.txt");

      for (Scramble i : this)
      {
        wr.write(i.print());
      }
      wr.close();
      return "You can find your Scrambles in MyScrambles.txt.";
    }
    catch (IOException e) {
      System.out.println("File not found");
    }
    return "problem";
  }

  public String newscramble(int cubesize)
  {
    this.Scrambles.add(Scrambler.NewScramble(cubesize));
    this.NumberOfScrambles = this.Scrambles.size();
    this.WhereAmI = (this.NumberOfScrambles - 1);
    return ((Scramble)this.Scrambles.get(this.WhereAmI)).getscramble();
  }

  public String previousscramble() {
    this.WhereAmI -= 1;
    return ((Scramble)this.Scrambles.get(this.WhereAmI)).getscramble();
  }

  public String nextscramble()
  {
    this.WhereAmI += 1;
    return ((Scramble)this.Scrambles.get(this.WhereAmI)).getscramble();
  }

  public int getcubesize()
  {
    return ((Scramble)this.Scrambles.get(this.WhereAmI)).getsize();
  }

  public void setWMI()
  {
    this.WhereAmI = -1;
  }

  public void setNOS() {
    this.NumberOfScrambles = this.Scrambles.size();
  }

  public int getWMI() {
    return this.WhereAmI;
  }

  public int getNOS() {
    return this.NumberOfScrambles;
  }

  public String getscramble() {
    return ((Scramble)this.Scrambles.get(this.WhereAmI)).getscramble();
  }

  public String getscr(int i)
  {
    return ((Scramble)this.Scrambles.get(i)).getscramble();
  }
}
