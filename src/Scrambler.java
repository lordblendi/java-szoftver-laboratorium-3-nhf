public class Scrambler
{
  public static Scramble NewScramble(int cubesize)
  {
    int[] sidetype = new int[12];
    int[] st = new int[12];
    for (int szam = 0; szam < 12; szam++)
    {
      sidetype[szam] = 0;
      st[szam] = 0;
    }

    String swcube = "";

    int random = 1; int r = 0; int t = 0; int elozo = 0; int elozo2 = 0;
    int newcubesize;
    if (cubesize % 2 == 1)
    {
      newcubesize = (cubesize - 1) / 2 + 1;
    }
    else
    {
      newcubesize = cubesize / 2 + 1;
    }

    for (int i = 0; i < 12; i += 4)
    {
      sidetype[i] = random;
      sidetype[(i + 1)] = random;
      sidetype[(i + 2)] = random;
      sidetype[(i + 3)] = random;
      random++;
    }
    random = 0;

    for (int i = 0; i < 12; random++)
    {
      st[i] = random;
      st[(i + 1)] = random;

      i += 2;
    }

    String[] sides = { "Rw", "R", "Lw", "L", "Uw", "U", "Dw", "D", "Fw", "F", "Bw", "B" };

    String[] type = { " ", "' ", "2 " };

    if ((cubesize == 4) || (cubesize == 5))
    {
      if (cubesize == 4)
      {
        t = 40;
      }
      else
      {
        t = 60;
      }

      int[] elozok = new int[t];
      for (int szam = 0; szam < t; szam++) {
        elozok[szam] = 0;
      }
      while (r < t)
      {
        if (r < 2)
        {
          random = 0 + (int)(Math.random() * 12.0D);
          if ((r > 0) && (elozo == st[random]))
          {
            while (elozo == st[random])
            {
              random = 0 + (int)(Math.random() * 12.0D);
            }
          }
          elozok[r] = sidetype[random];
          swcube = swcube.concat(sides[random]);
          elozo = st[random];
          random = 0 + (int)(Math.random() * 3.0D);
          swcube = swcube.concat(type[random]);
        }
        else
        {
          random = 0 + (int)(Math.random() * 12.0D);
          if ((elozok[(r - 1)] == elozok[r]) && (sidetype[random] == elozok[r]))
          {
            while (sidetype[random] == elozok[r])
            {
              random = 0 + (int)(Math.random() * 12.0D);
            }
            elozok[r] = sidetype[random];
            swcube = swcube.concat(sides[random]);
            elozo = st[random];
            random = 0 + (int)(Math.random() * 3.0D);
            swcube = swcube.concat(type[random]);
          }
          else if (elozo == random)
          {
            while (elozo == random)
            {
              random = 0 + (int)(Math.random() * 12.0D);
            }
            elozok[r] = sidetype[random];
            swcube = swcube.concat(sides[random]);
            elozo = random;
            random = 0 + (int)(Math.random() * 3.0D);
            swcube = swcube.concat(type[random]);
          }
          else
          {
            elozok[r] = sidetype[random];
            swcube = swcube.concat(sides[random]);
            elozo = random;
            random = 0 + (int)(Math.random() * 3.0D);
            swcube = swcube.concat(type[random]);
          }
        }
        r++;
      }

    }
    else if (cubesize == 3)
    {
      t = 18 + (int)(Math.random() * 5.0D);
      int[] elozok = new int[t]; for (int szam = 0; szam < t; szam++) elozok[szam] = 0;
      while (r < t)
      {
        if (r < 2)
        {
          random = 0 + (int)(Math.random() * 12.0D);
          if (random % 2 != 1)
          {
            while (random % 2 != 1)
            {
              random = 0 + (int)(Math.random() * 12.0D);
            }
          }
          random += 0;

          if ((r > 0) && (elozo == random))
          {
            while (elozo == random)
            {
              random = 0 + (int)(Math.random() * 12.0D);
              if (random % 2 != 1)
              {
                while (random % 2 != 1)
                {
                  random = 0 + (int)(Math.random() * 12.0D);
                }
              }
            }
          }

          elozok[r] = sidetype[random];

          swcube = swcube.concat(sides[random]);
          elozo = random;
          random = 0 + (int)(Math.random() * 3.0D);
          swcube = swcube.concat(type[random]);
        }
        else
        {
          random = 0 + (int)(Math.random() * 12.0D);
          if (random % 2 != 1)
          {
            while (random % 2 != 1)
            {
              random = 0 + (int)(Math.random() * 12.0D);
            }
          }
          elozo += 0;

          if ((elozok[(r - 2)] == elozok[(r - 1)]) && (sidetype[random] == elozok[(r - 1)]))
          {
            while (sidetype[random] == elozok[(r - 1)])
            {
              random = 0 + (int)(Math.random() * 12.0D);
              if (random % 2 != 1)
              {
                while (random % 2 != 1)
                {
                  random = 0 + (int)(Math.random() * 12.0D);
                }
              }
            }
            elozok[r] = sidetype[random];
            swcube = swcube.concat(sides[random]);
            elozo = random;
            random = 0 + (int)(Math.random() * 3.0D);
            swcube = swcube.concat(type[random]);
          }
          else if (elozo == random)
          {
            while (elozo == random)
            {
              random = 0 + (int)(Math.random() * 12.0D);
              if (random % 2 != 1)
              {
                while (random % 2 != 1)
                {
                  random = 0 + (int)(Math.random() * 12.0D);
                }
              }
            }
            elozok[r] = sidetype[random];
            swcube = swcube.concat(sides[random]);
            elozo = random;
            random = 0 + (int)(Math.random() * 3.0D);
            swcube = swcube.concat(type[random]);
          }
          else
          {
            elozok[r] = sidetype[random];
            swcube = swcube.concat(sides[random]);
            elozo = random;
            random = 0 + (int)(Math.random() * 3.0D);
            swcube = swcube.concat(type[random]);
          }
        }
        r++;
      }

    }
    else if (cubesize > 5)
    {
      t = (cubesize - 5) * 20 + 60;
      while (r < t)
      {
        random = 1 + (int)(Math.random() * (newcubesize - 1));
        if (r < 2)
        {
          if (r > 0)
          {
            if (random != elozo2)
            {
              if (random != 1)
              {
                swcube = swcube.concat(Integer.toString(random));
              }
              elozo2 = random;
            }
            else
            {
              while (random == elozo2)
              {
                random = 1 + (int)(Math.random() * (newcubesize - 1));
              }
              if (random != 1)
              {
                swcube = swcube.concat(Integer.toString(random));
              }

              elozo2 = random;
            }
          }
          else
          {
            if (random != 1)
            {
              swcube = swcube.concat(Integer.toString(random));
            }
            elozo2 = random;
          }

          random = 0 + (int)(Math.random() * 12.0D);
          if (random % 2 != 1)
          {
            while (random % 2 != 1)
            {
              random = 0 + (int)(Math.random() * 12.0D);
            }
          }
          swcube = swcube.concat(sides[random]);
          random = 0 + (int)(Math.random() * 3.0D);
          swcube = swcube.concat(type[random]);
        }
        else
        {
          if (random != elozo2)
          {
            if (random != 1)
            {
              swcube = swcube.concat(Integer.toString(random));
            }
            elozo2 = random;
          }
          else
          {
            while (random == elozo2)
            {
              random = 1 + (int)(Math.random() * (newcubesize - 1));
            }
            if (random != 1)
            {
              swcube = swcube.concat(Integer.toString(random));
            }
            elozo2 = random;
          }

          random = 0 + (int)(Math.random() * 12.0D);
          if (random % 2 != 1)
          {
            while (random % 2 != 1)
            {
              random = 0 + (int)(Math.random() * 12.0D);
            }
          }
          swcube = swcube.concat(sides[random]);
          random = 0 + (int)(Math.random() * 3.0D);
          swcube = swcube.concat(type[random]);
        }
        r++;
      }

    }
    else
    {
      String[] two = { "R", "F", "U" };
      String before = "e";

      t = 6 + (int)(Math.random() * 7.0D);
      while (r < t)
      {
        random = 0 + (int)(Math.random() * 3.0D);
        if (two[random] == before)
        {
          while (two[random] == before)
          {
            random = 0 + (int)(Math.random() * 3.0D);
          }
        }
        swcube = swcube.concat(two[random]);
        before = two[random];
        random = 0 + (int)(Math.random() * 3.0D);
        swcube = swcube.concat(type[random]);
        r++;
      }
    }

    Scramble ki = new Scramble(swcube, cubesize);
    return ki;
  }
}
