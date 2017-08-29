import java.io.Serializable;

public class Scramble
  implements Serializable
{
  private String scramble;
  private int CubeSize;

  public Scramble(String kev, int size)
  {
    this.scramble = kev;
    this.CubeSize = size;
  }

  public String print()
  {
    String ki = "Scramble for  " + this.CubeSize + "x" + this.CubeSize + "x" + this.CubeSize + ": " + this.scramble + "\n\n";
    return ki;
  }

  public String getscramble()
  {
    return this.scramble;
  }

  public int getsize() {
    return this.CubeSize;
  }
}
