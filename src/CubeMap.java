public class CubeMap
{
  private static String scramble;
  private static int[] ketteselemek = new int[24];
  private static int[] harmaselemek = new int[54];
  private static int[] negyeselemek = new int[96];
  private static int[] otoselemek = new int[''];
  private static int[] hatoselemek = new int['Ø'];
  private static int[] heteselemek = new int[294];

  CubeMap() {
    restart();
  }
  public static void setkeveres(String m) {
    scramble = m;
  }
  public static int[] solve(int meret, String m) {
    setkeveres(m);
    restart();
    if (meret == 2) {
      solve2x2();
      return ketteselemek;
    }
    if (meret == 3) {
      solve3x3();
      return harmaselemek;
    }
    if (meret == 4) {
      solve4x4();
      return negyeselemek;
    }
    if (meret == 5) {
      solve5x5();
      return otoselemek;
    }
    if (meret == 6) {
      solve6x6();
      return hatoselemek;
    }

    solve7x7();
    return heteselemek;
  }

  public static void restart()
  {
    for (int i = 0; i < 24; i++) {
      if (i < 4) {
        ketteselemek[i] = 1;
      }
      else if (i < 8) {
        ketteselemek[i] = 2;
      }
      else if (i < 12) {
        ketteselemek[i] = 3;
      }
      else if (i < 16) {
        ketteselemek[i] = 4;
      }
      else if (i < 20) {
        ketteselemek[i] = 5;
      }
      else {
        ketteselemek[i] = 6;
      }
    }

    for (int i = 0; i < 54; i++) {
      if (i < 9) {
        harmaselemek[i] = 1;
      }
      else if (i < 18) {
        harmaselemek[i] = 2;
      }
      else if (i < 27) {
        harmaselemek[i] = 3;
      }
      else if (i < 36) {
        harmaselemek[i] = 4;
      }
      else if (i < 45) {
        harmaselemek[i] = 5;
      }
      else {
        harmaselemek[i] = 6;
      }
    }
    for (int i = 0; i < 96; i++) {
      if (i < 16) {
        negyeselemek[i] = 1;
      }
      else if (i < 32) {
        negyeselemek[i] = 2;
      }
      else if (i < 48) {
        negyeselemek[i] = 3;
      }
      else if (i < 64) {
        negyeselemek[i] = 4;
      }
      else if (i < 80) {
        negyeselemek[i] = 5;
      }
      else {
        negyeselemek[i] = 6;
      }
    }
    for (int i = 0; i < 150; i++) {
      if (i < 25) {
        otoselemek[i] = 1;
      }
      else if (i < 50) {
        otoselemek[i] = 2;
      }
      else if (i < 75) {
        otoselemek[i] = 3;
      }
      else if (i < 100) {
        otoselemek[i] = 4;
      }
      else if (i < 125) {
        otoselemek[i] = 5;
      }
      else {
        otoselemek[i] = 6;
      }
    }
    for (int i = 0; i < 216; i++) {
      if (i < 36) {
        hatoselemek[i] = 1;
      }
      else if (i < 72) {
        hatoselemek[i] = 2;
      }
      else if (i < 108) {
        hatoselemek[i] = 3;
      }
      else if (i < 144) {
        hatoselemek[i] = 4;
      }
      else if (i < 180) {
        hatoselemek[i] = 5;
      }
      else {
        hatoselemek[i] = 6;
      }
    }
    for (int i = 0; i < 294; i++)
      if (i < 49) {
        heteselemek[i] = 1;
      }
      else if (i < 98) {
        heteselemek[i] = 2;
      }
      else if (i < 147) {
        heteselemek[i] = 3;
      }
      else if (i < 196) {
        heteselemek[i] = 4;
      }
      else if (i < 245) {
        heteselemek[i] = 5;
      }
      else
        heteselemek[i] = 6;
  }

  public static void solve2x2()
  {
    String[] scr = scramble.split(" ");

    for (int i = 0; i < scr.length; i++)
      if (scr[i].equals("R")) {
        KettesR();
      }
      else if (scr[i].equals("R2")) {
        KettesR();
        KettesR();
      }
      else if (scr[i].equals("R'")) {
        KettesR();
        KettesR();
        KettesR();
      }
      else if (scr[i].equals("F")) {
        KettesF();
      }
      else if (scr[i].equals("F2")) {
        KettesF();
        KettesF();
      }
      else if (scr[i].equals("F'")) {
        KettesF();
        KettesF();
        KettesF();
      }
      else if (scr[i].equals("U")) {
        KettesU();
      }
      else if (scr[i].equals("U2")) {
        KettesU();
        KettesU();
      }
      else if (scr[i].equals("U'")) {
        KettesU();
        KettesU();
        KettesU();
      }
  }

  public static void solve3x3()
  {
    String[] scr = scramble.split(" ");

    for (int i = 0; i < scr.length; i++)
      if (scr[i].equals("R")) {
        HarmasR();
      }
      else if (scr[i].equals("R2")) {
        HarmasR();
        HarmasR();
      }
      else if (scr[i].equals("R'")) {
        HarmasR();
        HarmasR();
        HarmasR();
      }
      else if (scr[i].equals("L")) {
        HarmasL();
      }
      else if (scr[i].equals("L2")) {
        HarmasL();
        HarmasL();
      }
      else if (scr[i].equals("L'")) {
        HarmasL();
        HarmasL();
        HarmasL();
      }
      else if (scr[i].equals("F")) {
        HarmasF();
      }
      else if (scr[i].equals("F2")) {
        HarmasF();
        HarmasF();
      }
      else if (scr[i].equals("F'")) {
        HarmasF();
        HarmasF();
        HarmasF();
      }
      else if (scr[i].equals("B")) {
        HarmasB();
      }
      else if (scr[i].equals("B2")) {
        HarmasB();
        HarmasB();
      }
      else if (scr[i].equals("B'")) {
        HarmasB();
        HarmasB();
        HarmasB();
      }
      else if (scr[i].equals("U")) {
        HarmasU();
      }
      else if (scr[i].equals("U2")) {
        HarmasU();
        HarmasU();
      }
      else if (scr[i].equals("U'")) {
        HarmasU();
        HarmasU();
        HarmasU();
      }
      else if (scr[i].equals("D")) {
        HarmasD();
      }
      else if (scr[i].equals("D2")) {
        HarmasD();
        HarmasD();
      }
      else if (scr[i].equals("D'")) {
        HarmasD();
        HarmasD();
        HarmasD();
      }
  }

  public static void solve4x4() {
    String[] scr = scramble.split(" ");

    for (int i = 0; i < scr.length; i++)
      if (scr[i].equals("R")) {
        NegyesR();
      }
      else if (scr[i].equals("R2")) {
        NegyesR();
        NegyesR();
      }
      else if (scr[i].equals("R'")) {
        NegyesR();
        NegyesR();
        NegyesR();
      }
      else if (scr[i].equals("L")) {
        NegyesL();
      }
      else if (scr[i].equals("L2")) {
        NegyesL();
        NegyesL();
      }
      else if (scr[i].equals("L'")) {
        NegyesL();
        NegyesL();
        NegyesL();
      }
      else if (scr[i].equals("F")) {
        NegyesF();
      }
      else if (scr[i].equals("F2")) {
        NegyesF();
        NegyesF();
      }
      else if (scr[i].equals("F'")) {
        NegyesF();
        NegyesF();
        NegyesF();
      }
      else if (scr[i].equals("B")) {
        NegyesB();
      }
      else if (scr[i].equals("B2")) {
        NegyesB();
        NegyesB();
      }
      else if (scr[i].equals("B'")) {
        NegyesB();
        NegyesB();
        NegyesB();
      }
      else if (scr[i].equals("U")) {
        NegyesU();
      }
      else if (scr[i].equals("U2")) {
        NegyesU();
        NegyesU();
      }
      else if (scr[i].equals("U'")) {
        NegyesU();
        NegyesU();
        NegyesU();
      }
      else if (scr[i].equals("D")) {
        NegyesD();
      }
      else if (scr[i].equals("D2")) {
        NegyesD();
        NegyesD();
      }
      else if (scr[i].equals("D'")) {
        NegyesD();
        NegyesD();
        NegyesD();
      }
      else if (scr[i].equals("Rw")) {
        NegyesR();

        Negyesr();
      }
      else if (scr[i].equals("Rw2")) {
        Negyesr();
        Negyesr();

        NegyesR();
        NegyesR();
      }
      else if (scr[i].equals("Rw'")) {
        Negyesr();
        Negyesr();
        Negyesr();

        NegyesR();
        NegyesR();
        NegyesR();
      }
      else if (scr[i].equals("Lw")) {
        Negyesl();
        NegyesL();
      }
      else if (scr[i].equals("Lw2")) {
        Negyesl();
        Negyesl();

        NegyesL();
        NegyesL();
      }
      else if (scr[i].equals("Lw'")) {
        Negyesl();
        Negyesl();
        Negyesl();

        NegyesL();
        NegyesL();
        NegyesL();
      }
      else if (scr[i].equals("Fw")) {
        Negyesf();

        NegyesF();
      }
      else if (scr[i].equals("Fw2")) {
        Negyesf();
        Negyesf();

        NegyesF();
        NegyesF();
      }
      else if (scr[i].equals("Fw'")) {
        Negyesf();
        Negyesf();
        Negyesf();

        NegyesF();
        NegyesF();
        NegyesF();
      }
      else if (scr[i].equals("Bw")) {
        Negyesb();

        NegyesB();
      }
      else if (scr[i].equals("Bw2")) {
        Negyesb();
        Negyesb();

        NegyesB();
        NegyesB();
      }
      else if (scr[i].equals("Bw'")) {
        Negyesb();
        Negyesb();
        Negyesb();

        NegyesB();
        NegyesB();
        NegyesB();
      }
      else if (scr[i].equals("Uw")) {
        Negyesu();

        NegyesU();
      }
      else if (scr[i].equals("Uw2")) {
        Negyesu();
        Negyesu();

        NegyesU();
        NegyesU();
      }
      else if (scr[i].equals("Uw'")) {
        Negyesu();
        Negyesu();
        Negyesu();

        NegyesU();
        NegyesU();
        NegyesU();
      }
      else if (scr[i].equals("Dw")) {
        Negyesd();

        NegyesD();
      }
      else if (scr[i].equals("Dw2")) {
        Negyesd();
        Negyesd();

        NegyesD();
        NegyesD();
      }
      else if (scr[i].equals("Dw'")) {
        Negyesd();
        Negyesd();
        Negyesd();

        NegyesD();
        NegyesD();
        NegyesD();
      }
  }

  public static void solve5x5() {
    String[] scr = scramble.split(" ");

    for (int i = 0; i < scr.length; i++)
      if (scr[i].equals("R")) {
        OtosR();
      }
      else if (scr[i].equals("R2")) {
        OtosR();
        OtosR();
      }
      else if (scr[i].equals("R'")) {
        OtosR();
        OtosR();
        OtosR();
      }
      else if (scr[i].equals("L")) {
        OtosL();
      }
      else if (scr[i].equals("L2")) {
        OtosL();
        OtosL();
      }
      else if (scr[i].equals("L'")) {
        OtosL();
        OtosL();
        OtosL();
      }
      else if (scr[i].equals("F")) {
        OtosF();
      }
      else if (scr[i].equals("F2")) {
        OtosF();
        OtosF();
      }
      else if (scr[i].equals("F'")) {
        OtosF();
        OtosF();
        OtosF();
      }
      else if (scr[i].equals("B")) {
        OtosB();
      }
      else if (scr[i].equals("B2")) {
        OtosB();
        OtosB();
      }
      else if (scr[i].equals("B'")) {
        OtosB();
        OtosB();
        OtosB();
      }
      else if (scr[i].equals("U")) {
        OtosU();
      }
      else if (scr[i].equals("U2")) {
        OtosU();
        OtosU();
      }
      else if (scr[i].equals("U'")) {
        OtosU();
        OtosU();
        OtosU();
      }
      else if (scr[i].equals("D")) {
        OtosD();
      }
      else if (scr[i].equals("D2")) {
        OtosD();
        OtosD();
      }
      else if (scr[i].equals("D'")) {
        OtosD();
        OtosD();
        OtosD();
      }
      else if (scr[i].equals("Rw")) {
        OtosR();

        Otosr();
      }
      else if (scr[i].equals("Rw2")) {
        Otosr();
        Otosr();

        OtosR();
        OtosR();
      }
      else if (scr[i].equals("Rw'")) {
        Otosr();
        Otosr();
        Otosr();

        OtosR();
        OtosR();
        OtosR();
      }
      else if (scr[i].equals("Lw")) {
        Otosl();
        OtosL();
      }
      else if (scr[i].equals("Lw2")) {
        Otosl();
        Otosl();

        OtosL();
        OtosL();
      }
      else if (scr[i].equals("Lw'")) {
        Otosl();
        Otosl();
        Otosl();

        OtosL();
        OtosL();
        OtosL();
      }
      else if (scr[i].equals("Fw")) {
        Otosf();

        OtosF();
      }
      else if (scr[i].equals("Fw2")) {
        Otosf();
        Otosf();

        OtosF();
        OtosF();
      }
      else if (scr[i].equals("Fw'")) {
        Otosf();
        Otosf();
        Otosf();

        OtosF();
        OtosF();
        OtosF();
      }
      else if (scr[i].equals("Bw")) {
        Otosb();

        OtosB();
      }
      else if (scr[i].equals("Bw2")) {
        Otosb();
        Otosb();

        OtosB();
        OtosB();
      }
      else if (scr[i].equals("Bw'")) {
        Otosb();
        Otosb();
        Otosb();

        OtosB();
        OtosB();
        OtosB();
      }
      else if (scr[i].equals("Uw")) {
        Otosu();

        OtosU();
      }
      else if (scr[i].equals("Uw2")) {
        Otosu();
        Otosu();

        OtosU();
        OtosU();
      }
      else if (scr[i].equals("Uw'")) {
        Otosu();
        Otosu();
        Otosu();

        OtosU();
        OtosU();
        OtosU();
      }
      else if (scr[i].equals("Dw")) {
        Otosd();

        OtosD();
      }
      else if (scr[i].equals("Dw2")) {
        Otosd();
        Otosd();

        OtosD();
        OtosD();
      }
      else if (scr[i].equals("Dw'")) {
        Otosd();
        Otosd();
        Otosd();

        OtosD();
        OtosD();
        OtosD();
      }
  }

  public static void solve6x6() {
    String[] scr = scramble.split(" ");

    for (int i = 0; i < scr.length; i++)
      if (scr[i].equals("R")) {
        HatosR();
      }
      else if (scr[i].equals("R2")) {
        HatosR();
        HatosR();
      }
      else if (scr[i].equals("R'")) {
        HatosR();
        HatosR();
        HatosR();
      }
      else if (scr[i].equals("2R")) {
        Hatos2R();

        HatosR();
      }
      else if (scr[i].equals("2R2")) {
        Hatos2R();
        Hatos2R();

        HatosR();
        HatosR();
      }
      else if (scr[i].equals("2R'")) {
        Hatos2R();
        Hatos2R();
        Hatos2R();

        HatosR();
        HatosR();
        HatosR();
      }
      else if (scr[i].equals("3R")) {
        Hatos3R();

        Hatos2R();

        HatosR();
      }
      else if (scr[i].equals("3R2")) {
        Hatos3R();
        Hatos3R();

        Hatos2R();
        Hatos2R();

        HatosR();
        HatosR();
      }
      else if (scr[i].equals("3R'")) {
        Hatos3R();
        Hatos3R();
        Hatos3R();

        Hatos2R();
        Hatos2R();
        Hatos2R();

        HatosR();
        HatosR();
        HatosR();
      }
      else if (scr[i].equals("L")) {
        HatosL();
      }
      else if (scr[i].equals("L2")) {
        HatosL();
        HatosL();
      }
      else if (scr[i].equals("L'")) {
        HatosL();
        HatosL();
        HatosL();
      }
      else if (scr[i].equals("2L")) {
        Hatos2L();

        HatosL();
      }
      else if (scr[i].equals("2L2")) {
        Hatos2L();
        Hatos2L();

        HatosL();
        HatosL();
      }
      else if (scr[i].equals("2L'")) {
        Hatos2L();
        Hatos2L();
        Hatos2L();

        HatosL();
        HatosL();
        HatosL();
      }
      else if (scr[i].equals("3L")) {
        Hatos3L();

        Hatos2L();

        HatosL();
      }
      else if (scr[i].equals("3L2")) {
        Hatos3L();
        Hatos3L();

        Hatos2L();
        Hatos2L();

        HatosL();
        HatosL();
      }
      else if (scr[i].equals("3L'")) {
        Hatos3L();
        Hatos3L();
        Hatos3L();

        Hatos2L();
        Hatos2L();
        Hatos2L();

        HatosL();
        HatosL();
        HatosL();
      }
      else if (scr[i].equals("F")) {
        HatosF();
      }
      else if (scr[i].equals("F2")) {
        HatosF();
        HatosF();
      }
      else if (scr[i].equals("F'")) {
        HatosF();
        HatosF();
        HatosF();
      }
      else if (scr[i].equals("2F")) {
        Hatos2F();

        HatosF();
      }
      else if (scr[i].equals("2F2")) {
        Hatos2F();
        Hatos2F();

        HatosF();
        HatosF();
      }
      else if (scr[i].equals("2F'")) {
        Hatos2F();
        Hatos2F();
        Hatos2F();

        HatosF();
        HatosF();
        HatosF();
      }
      else if (scr[i].equals("3F")) {
        Hatos3F();

        Hatos2F();

        HatosF();
      }
      else if (scr[i].equals("3F2")) {
        Hatos3F();
        Hatos3F();

        Hatos2F();
        Hatos2F();

        HatosF();
        HatosF();
      }
      else if (scr[i].equals("3F'")) {
        Hatos3F();
        Hatos3F();
        Hatos3F();

        Hatos2F();
        Hatos2F();
        Hatos2F();

        HatosF();
        HatosF();
        HatosF();
      }
      else if (scr[i].equals("B")) {
        HatosB();
      }
      else if (scr[i].equals("B2")) {
        HatosB();
        HatosB();
      }
      else if (scr[i].equals("B'")) {
        HatosB();
        HatosB();
        HatosB();
      }
      else if (scr[i].equals("2B")) {
        Hatos2B();

        HatosB();
      }
      else if (scr[i].equals("2B2")) {
        Hatos2B();
        Hatos2B();

        HatosB();
        HatosB();
      }
      else if (scr[i].equals("2B'")) {
        Hatos2B();
        Hatos2B();
        Hatos2B();

        HatosB();
        HatosB();
        HatosB();
      }
      else if (scr[i].equals("3B")) {
        Hatos3B();

        Hatos2B();

        HatosB();
      }
      else if (scr[i].equals("3B2")) {
        Hatos3B();
        Hatos3B();

        Hatos2B();
        Hatos2B();

        HatosB();
        HatosB();
      }
      else if (scr[i].equals("3B'")) {
        Hatos3B();
        Hatos3B();
        Hatos3B();

        Hatos2B();
        Hatos2B();
        Hatos2B();

        HatosB();
        HatosB();
        HatosB();
      }
      else if (scr[i].equals("U")) {
        HatosU();
      }
      else if (scr[i].equals("U2")) {
        HatosU();
        HatosU();
      }
      else if (scr[i].equals("U'")) {
        HatosU();
        HatosU();
        HatosU();
      }
      else if (scr[i].equals("2U")) {
        Hatos2U();

        HatosU();
      }
      else if (scr[i].equals("2U2")) {
        Hatos2U();
        Hatos2U();

        HatosU();
        HatosU();
      }
      else if (scr[i].equals("2U'")) {
        Hatos2U();
        Hatos2U();
        Hatos2U();

        HatosU();
        HatosU();
        HatosU();
      }
      else if (scr[i].equals("3U")) {
        Hatos3U();

        Hatos2U();

        HatosU();
      }
      else if (scr[i].equals("3U2")) {
        Hatos3U();
        Hatos3U();

        Hatos2U();
        Hatos2U();

        HatosU();
        HatosU();
      }
      else if (scr[i].equals("3U'")) {
        Hatos3U();
        Hatos3U();
        Hatos3U();

        Hatos2U();
        Hatos2U();
        Hatos2U();

        HatosU();
        HatosU();
        HatosU();
      }
      else if (scr[i].equals("D")) {
        HatosD();
      }
      else if (scr[i].equals("D2")) {
        HatosD();
        HatosD();
      }
      else if (scr[i].equals("D'")) {
        HatosD();
        HatosD();
        HatosD();
      }
      else if (scr[i].equals("2D")) {
        Hatos2D();

        HatosD();
      }
      else if (scr[i].equals("2D2")) {
        Hatos2D();
        Hatos2D();

        HatosD();
        HatosD();
      }
      else if (scr[i].equals("2D'")) {
        Hatos2D();
        Hatos2D();
        Hatos2D();

        HatosD();
        HatosD();
        HatosD();
      }
      else if (scr[i].equals("3D")) {
        Hatos3D();

        Hatos2D();

        HatosD();
      }
      else if (scr[i].equals("3D2")) {
        Hatos3D();
        Hatos3D();

        Hatos2D();
        Hatos2D();

        HatosD();
        HatosD();
      }
      else if (scr[i].equals("3D'")) {
        Hatos3D();
        Hatos3D();
        Hatos3D();

        Hatos2D();
        Hatos2D();
        Hatos2D();

        HatosD();
        HatosD();
        HatosD();
      }
  }

  public static void solve7x7() {
    String[] scr = scramble.split(" ");

    for (int i = 0; i < scr.length; i++)
      if (scr[i].equals("R")) {
        HetesR();
      }
      else if (scr[i].equals("R2")) {
        HetesR();
        HetesR();
      }
      else if (scr[i].equals("R'")) {
        HetesR();
        HetesR();
        HetesR();
      }
      else if (scr[i].equals("2R")) {
        Hetes2R();

        HetesR();
      }
      else if (scr[i].equals("2R2")) {
        Hetes2R();
        Hetes2R();

        HetesR();
        HetesR();
      }
      else if (scr[i].equals("2R'")) {
        Hetes2R();
        Hetes2R();
        Hetes2R();

        HetesR();
        HetesR();
        HetesR();
      }
      else if (scr[i].equals("3R")) {
        Hetes3R();

        Hetes2R();

        HetesR();
      }
      else if (scr[i].equals("3R2")) {
        Hetes3R();
        Hetes3R();

        Hetes2R();
        Hetes2R();

        HetesR();
        HetesR();
      }
      else if (scr[i].equals("3R'")) {
        Hetes3R();
        Hetes3R();
        Hetes3R();

        Hetes2R();
        Hetes2R();
        Hetes2R();

        HetesR();
        HetesR();
        HetesR();
      }
      else if (scr[i].equals("L")) {
        HetesL();
      }
      else if (scr[i].equals("L2")) {
        HetesL();
        HetesL();
      }
      else if (scr[i].equals("L'")) {
        HetesL();
        HetesL();
        HetesL();
      }
      else if (scr[i].equals("2L")) {
        Hetes2L();

        HetesL();
      }
      else if (scr[i].equals("2L2")) {
        Hetes2L();
        Hetes2L();

        HetesL();
        HetesL();
      }
      else if (scr[i].equals("2L'")) {
        Hetes2L();
        Hetes2L();
        Hetes2L();

        HetesL();
        HetesL();
        HetesL();
      }
      else if (scr[i].equals("3L")) {
        Hetes3L();

        Hetes2L();

        HetesL();
      }
      else if (scr[i].equals("3L2")) {
        Hetes3L();
        Hetes3L();

        Hetes2L();
        Hetes2L();

        HetesL();
        HetesL();
      }
      else if (scr[i].equals("3L'")) {
        Hetes3L();
        Hetes3L();
        Hetes3L();

        Hetes2L();
        Hetes2L();
        Hetes2L();

        HetesL();
        HetesL();
        HetesL();
      }
      else if (scr[i].equals("F")) {
        HetesF();
      }
      else if (scr[i].equals("F2")) {
        HetesF();
        HetesF();
      }
      else if (scr[i].equals("F'")) {
        HetesF();
        HetesF();
        HetesF();
      }
      else if (scr[i].equals("2F")) {
        Hetes2F();

        HetesF();
      }
      else if (scr[i].equals("2F2")) {
        Hetes2F();
        Hetes2F();

        HetesF();
        HetesF();
      }
      else if (scr[i].equals("2F'")) {
        Hetes2F();
        Hetes2F();
        Hetes2F();

        HetesF();
        HetesF();
        HetesF();
      }
      else if (scr[i].equals("3F")) {
        Hetes3F();

        Hetes2F();

        HetesF();
      }
      else if (scr[i].equals("3F2")) {
        Hetes3F();
        Hetes3F();

        Hetes2F();
        Hetes2F();

        HetesF();
        HetesF();
      }
      else if (scr[i].equals("3F'")) {
        Hetes3F();
        Hetes3F();
        Hetes3F();

        Hetes2F();
        Hetes2F();
        Hetes2F();

        HetesF();
        HetesF();
        HetesF();
      }
      else if (scr[i].equals("B")) {
        HetesB();
      }
      else if (scr[i].equals("B2")) {
        HetesB();
        HetesB();
      }
      else if (scr[i].equals("B'")) {
        HetesB();
        HetesB();
        HetesB();
      }
      else if (scr[i].equals("2B")) {
        Hetes2B();

        HetesB();
      }
      else if (scr[i].equals("2B2")) {
        Hetes2B();
        Hetes2B();

        HetesB();
        HetesB();
      }
      else if (scr[i].equals("2B'")) {
        Hetes2B();
        Hetes2B();
        Hetes2B();

        HetesB();
        HetesB();
        HetesB();
      }
      else if (scr[i].equals("3B")) {
        Hetes3B();

        Hetes2B();

        HetesB();
      }
      else if (scr[i].equals("3B2")) {
        Hetes3B();
        Hetes3B();

        Hetes2B();
        Hetes2B();

        HetesB();
        HetesB();
      }
      else if (scr[i].equals("3B'")) {
        Hetes3B();
        Hetes3B();
        Hetes3B();

        Hetes2B();
        Hetes2B();
        Hetes2B();

        HetesB();
        HetesB();
        HetesB();
      }
      else if (scr[i].equals("U")) {
        HetesU();
      }
      else if (scr[i].equals("U2")) {
        HetesU();
        HetesU();
      }
      else if (scr[i].equals("U'")) {
        HetesU();
        HetesU();
        HetesU();
      }
      else if (scr[i].equals("2U")) {
        Hetes2U();
        HetesU();
      }
      else if (scr[i].equals("2U2")) {
        Hetes2U();
        Hetes2U();

        HetesU();
        HetesU();
      }
      else if (scr[i].equals("2U'")) {
        Hetes2U();
        Hetes2U();
        Hetes2U();

        HetesU();
        HetesU();
        HetesU();
      }
      else if (scr[i].equals("3U")) {
        Hetes3U();

        Hetes2U();

        HetesU();
      }
      else if (scr[i].equals("3U2")) {
        Hetes3U();
        Hetes3U();

        Hetes2U();
        Hetes2U();

        HetesU();
        HetesU();
      }
      else if (scr[i].equals("3U'")) {
        Hetes3U();
        Hetes3U();
        Hetes3U();

        Hetes2U();
        Hetes2U();
        Hetes2U();

        HetesU();
        HetesU();
        HetesU();
      }
      else if (scr[i].equals("D")) {
        HetesD();
      }
      else if (scr[i].equals("D2")) {
        HetesD();
        HetesD();
      }
      else if (scr[i].equals("D'")) {
        HetesD();
        HetesD();
        HetesD();
      }
      else if (scr[i].equals("2D")) {
        Hetes2D();

        HetesD();
      }
      else if (scr[i].equals("2D2")) {
        Hetes2D();
        Hetes2D();

        HetesD();
        HetesD();
      }
      else if (scr[i].equals("2D'")) {
        Hetes2D();
        Hetes2D();
        Hetes2D();

        HetesD();
        HetesD();
        HetesD();
      }
      else if (scr[i].equals("3D")) {
        Hetes3D();

        Hetes2D();

        HetesD();
      }
      else if (scr[i].equals("3D2")) {
        Hetes3D();
        Hetes3D();

        Hetes2D();
        Hetes2D();

        HetesD();
        HetesD();
      }
      else if (scr[i].equals("3D'")) {
        Hetes3D();
        Hetes3D();
        Hetes3D();

        Hetes2D();
        Hetes2D();
        Hetes2D();

        HetesD();
        HetesD();
        HetesD();
      }
  }

  public static void KettesU()
  {
    int temp = ketteselemek[0];
    ketteselemek[0] = ketteselemek[2];
    ketteselemek[2] = ketteselemek[3];
    ketteselemek[3] = ketteselemek[1];
    ketteselemek[1] = temp;

    for (int i = 0; i < 2; i++) {
      temp = ketteselemek[(4 + i)];
      ketteselemek[(4 + i)] = ketteselemek[(16 + i)];
      ketteselemek[(16 + i)] = ketteselemek[(20 + i)];
      ketteselemek[(20 + i)] = ketteselemek[(12 + i)];
      ketteselemek[(12 + i)] = temp;
    }
  }

  public static void KettesF()
  {
    int temp = ketteselemek[4];
    ketteselemek[4] = ketteselemek[6];
    ketteselemek[6] = ketteselemek[7];
    ketteselemek[7] = ketteselemek[5];
    ketteselemek[5] = temp;

    for (int i = 0; i < 2; i++) {
      temp = ketteselemek[(2 + i)];
      ketteselemek[(2 + i)] = ketteselemek[(15 - 2 * i)];
      ketteselemek[(15 - 2 * i)] = ketteselemek[(9 - i)];
      ketteselemek[(9 - i)] = ketteselemek[(16 + 2 * i)];
      ketteselemek[(16 + 2 * i)] = temp;
    }
  }

  public static void KettesR()
  {
    int temp = ketteselemek[16];
    ketteselemek[16] = ketteselemek[18];
    ketteselemek[18] = ketteselemek[19];
    ketteselemek[19] = ketteselemek[17];
    ketteselemek[17] = temp;

    for (int i = 0; i < 2; i++) {
      temp = ketteselemek[(1 + 2 * i)];
      ketteselemek[(1 + 2 * i)] = ketteselemek[(5 + 2 * i)];
      ketteselemek[(5 + 2 * i)] = ketteselemek[(9 + 2 * i)];
      ketteselemek[(9 + 2 * i)] = ketteselemek[(22 - 2 * i)];
      ketteselemek[(22 - 2 * i)] = temp;
    }
  }

  public static void HarmasR()
  {
    int temp = 0;

    for (int i = 0; i < 9; i += 3) {
      temp = harmaselemek[(2 + i)];
      harmaselemek[(2 + i)] = harmaselemek[(11 + i)];
      harmaselemek[(11 + i)] = harmaselemek[(20 + i)];
      harmaselemek[(20 + i)] = harmaselemek[(51 - i)];
      harmaselemek[(51 - i)] = temp;
    }

    for (int i = 0; i < 2; i++) {
      temp = harmaselemek[(36 + i)];
      harmaselemek[(36 + i)] = harmaselemek[(42 - 3 * i)];
      harmaselemek[(42 - 3 * i)] = harmaselemek[(44 - i)];
      harmaselemek[(44 - i)] = harmaselemek[(38 + 3 * i)];
      harmaselemek[(38 + 3 * i)] = temp;
    }
  }

  public static void HarmasL() {
    int temp = 0;

    for (int i = 0; i < 9; i += 3) {
      temp = harmaselemek[(0 + i)];
      harmaselemek[(0 + i)] = harmaselemek[(53 - i)];
      harmaselemek[(53 - i)] = harmaselemek[(18 + i)];
      harmaselemek[(18 + i)] = harmaselemek[(9 + i)];
      harmaselemek[(9 + i)] = temp;
    }

    for (int i = 0; i < 2; i++) {
      temp = harmaselemek[(28 - i)];
      harmaselemek[(28 - i)] = harmaselemek[(30 + 3 * i)];
      harmaselemek[(30 + 3 * i)] = harmaselemek[(34 + i)];
      harmaselemek[(34 + i)] = harmaselemek[(32 - 3 * i)];
      harmaselemek[(32 - 3 * i)] = temp;
    }
  }

  public static void HarmasU() {
    int temp = 0;

    for (int i = 0; i < 3; i++) {
      temp = harmaselemek[(9 + i)];
      harmaselemek[(9 + i)] = harmaselemek[(36 + i)];
      harmaselemek[(36 + i)] = harmaselemek[(45 + i)];
      harmaselemek[(45 + i)] = harmaselemek[(27 + i)];
      harmaselemek[(27 + i)] = temp;
    }

    for (int i = 0; i < 2; i++) {
      temp = harmaselemek[(0 + i)];
      harmaselemek[(0 + i)] = harmaselemek[(6 - 3 * i)];
      harmaselemek[(6 - 3 * i)] = harmaselemek[(8 - i)];
      harmaselemek[(8 - i)] = harmaselemek[(2 + 3 * i)];
      harmaselemek[(2 + 3 * i)] = temp;
    }
  }

  public static void HarmasD() {
    int temp = 0;

    for (int i = 0; i < 3; i++) {
      temp = harmaselemek[(33 + i)];
      harmaselemek[(33 + i)] = harmaselemek[(51 + i)];
      harmaselemek[(51 + i)] = harmaselemek[(42 + i)];
      harmaselemek[(42 + i)] = harmaselemek[(15 + i)];
      harmaselemek[(15 + i)] = temp;
    }

    for (int i = 0; i < 2; i++) {
      temp = harmaselemek[(18 + i)];
      harmaselemek[(18 + i)] = harmaselemek[(24 - 3 * i)];
      harmaselemek[(24 - 3 * i)] = harmaselemek[(26 - i)];
      harmaselemek[(26 - i)] = harmaselemek[(20 + 3 * i)];
      harmaselemek[(20 + 3 * i)] = temp;
    }
  }

  public static void HarmasF() {
    int temp = 0;

    for (int i = 0; i < 3; i++) {
      temp = harmaselemek[(6 + i)];
      harmaselemek[(6 + i)] = harmaselemek[(35 - 3 * i)];
      harmaselemek[(35 - 3 * i)] = harmaselemek[(20 - i)];
      harmaselemek[(20 - i)] = harmaselemek[(36 + 3 * i)];
      harmaselemek[(36 + 3 * i)] = temp;
    }

    for (int i = 0; i < 2; i++) {
      temp = harmaselemek[(9 + i)];
      harmaselemek[(9 + i)] = harmaselemek[(15 - 3 * i)];
      harmaselemek[(15 - 3 * i)] = harmaselemek[(17 - i)];
      harmaselemek[(17 - i)] = harmaselemek[(11 + 3 * i)];
      harmaselemek[(11 + 3 * i)] = temp;
    }
  }

  public static void HarmasB() {
    int temp = 0;

    for (int i = 0; i < 3; i++) {
      temp = harmaselemek[(2 - i)];
      harmaselemek[(2 - i)] = harmaselemek[(44 - 3 * i)];
      harmaselemek[(44 - 3 * i)] = harmaselemek[(24 + i)];
      harmaselemek[(24 + i)] = harmaselemek[(27 + 3 * i)];
      harmaselemek[(27 + 3 * i)] = temp;
    }

    for (int i = 0; i < 2; i++) {
      temp = harmaselemek[(45 + i)];
      harmaselemek[(45 + i)] = harmaselemek[(51 - 3 * i)];
      harmaselemek[(51 - 3 * i)] = harmaselemek[(53 - i)];
      harmaselemek[(53 - i)] = harmaselemek[(47 + 3 * i)];
      harmaselemek[(47 + 3 * i)] = temp;
    }
  }

  public static void NegyesU()
  {
    for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(16 + i)];
      negyeselemek[(16 + i)] = negyeselemek[(64 + i)];
      negyeselemek[(64 + i)] = negyeselemek[(80 + i)];
      negyeselemek[(80 + i)] = negyeselemek[(48 + i)];
      negyeselemek[(48 + i)] = temp;
    }

    int temp2 = negyeselemek[5];
    negyeselemek[5] = negyeselemek[9];
    negyeselemek[9] = negyeselemek[10];
    negyeselemek[10] = negyeselemek[6];
    negyeselemek[6] = temp2;

    for (int i = 0; i < 3; i++) {
      int temp = negyeselemek[(0 + i)];
      negyeselemek[(0 + i)] = negyeselemek[(12 - 4 * i)];
      negyeselemek[(12 - 4 * i)] = negyeselemek[(15 - i)];
      negyeselemek[(15 - i)] = negyeselemek[(3 + 4 * i)];
      negyeselemek[(3 + 4 * i)] = temp;
    }
  }

  public static void Negyesu() { for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(20 + i)];
      negyeselemek[(20 + i)] = negyeselemek[(68 + i)];
      negyeselemek[(68 + i)] = negyeselemek[(84 + i)];
      negyeselemek[(84 + i)] = negyeselemek[(52 + i)];
      negyeselemek[(52 + i)] = temp;
    } }

  public static void NegyesD() {
    for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(28 + i)];
      negyeselemek[(28 + i)] = negyeselemek[(60 + i)];
      negyeselemek[(60 + i)] = negyeselemek[(92 + i)];
      negyeselemek[(92 + i)] = negyeselemek[(76 + i)];
      negyeselemek[(76 + i)] = temp;
    }
    int temp2 = negyeselemek[37];
    negyeselemek[37] = negyeselemek[41];
    negyeselemek[41] = negyeselemek[42];
    negyeselemek[42] = negyeselemek[38];
    negyeselemek[38] = temp2;

    for (int i = 0; i < 3; i++) {
      int temp = negyeselemek[(32 + i)];
      negyeselemek[(32 + i)] = negyeselemek[(44 - 4 * i)];
      negyeselemek[(44 - 4 * i)] = negyeselemek[(47 - i)];
      negyeselemek[(47 - i)] = negyeselemek[(35 + 4 * i)];
      negyeselemek[(35 + 4 * i)] = temp;
    }
  }

  public static void Negyesd() { for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(24 + i)];
      negyeselemek[(24 + i)] = negyeselemek[(56 + i)];
      negyeselemek[(56 + i)] = negyeselemek[(88 + i)];
      negyeselemek[(88 + i)] = negyeselemek[(72 + i)];
      negyeselemek[(72 + i)] = temp;
    } }

  public static void NegyesR() {
    for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(3 + 4 * i)];
      negyeselemek[(3 + 4 * i)] = negyeselemek[(19 + 4 * i)];
      negyeselemek[(19 + 4 * i)] = negyeselemek[(35 + 4 * i)];
      negyeselemek[(35 + 4 * i)] = negyeselemek[(92 - 4 * i)];
      negyeselemek[(92 - 4 * i)] = temp;
    }
    int temp2 = negyeselemek[69];
    negyeselemek[69] = negyeselemek[73];
    negyeselemek[73] = negyeselemek[74];
    negyeselemek[74] = negyeselemek[70];
    negyeselemek[70] = temp2;

    for (int i = 0; i < 3; i++) {
      int temp = negyeselemek[(64 + i)];
      negyeselemek[(64 + i)] = negyeselemek[(76 - 4 * i)];
      negyeselemek[(76 - 4 * i)] = negyeselemek[(79 - i)];
      negyeselemek[(79 - i)] = negyeselemek[(67 + 4 * i)];
      negyeselemek[(67 + 4 * i)] = temp;
    }
  }

  public static void Negyesr() { for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(2 + 4 * i)];
      negyeselemek[(2 + 4 * i)] = negyeselemek[(18 + 4 * i)];
      negyeselemek[(18 + 4 * i)] = negyeselemek[(34 + 4 * i)];
      negyeselemek[(34 + 4 * i)] = negyeselemek[(93 - 4 * i)];
      negyeselemek[(93 - 4 * i)] = temp;
    } }

  public static void NegyesL() {
    for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(0 + 4 * i)];
      negyeselemek[(0 + 4 * i)] = negyeselemek[(95 - 4 * i)];
      negyeselemek[(95 - 4 * i)] = negyeselemek[(32 + 4 * i)];
      negyeselemek[(32 + 4 * i)] = negyeselemek[(16 + 4 * i)];
      negyeselemek[(16 + 4 * i)] = temp;
    }

    int temp2 = negyeselemek[53];
    negyeselemek[53] = negyeselemek[57];
    negyeselemek[57] = negyeselemek[58];
    negyeselemek[58] = negyeselemek[54];
    negyeselemek[54] = temp2;

    for (int i = 0; i < 3; i++) {
      int temp = negyeselemek[(48 + i)];
      negyeselemek[(48 + i)] = negyeselemek[(60 - 4 * i)];
      negyeselemek[(60 - 4 * i)] = negyeselemek[(63 - i)];
      negyeselemek[(63 - i)] = negyeselemek[(51 + 4 * i)];
      negyeselemek[(51 + 4 * i)] = temp;
    }
  }

  public static void Negyesl() { for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(1 + 4 * i)];
      negyeselemek[(1 + 4 * i)] = negyeselemek[(94 - 4 * i)];
      negyeselemek[(94 - 4 * i)] = negyeselemek[(33 + 4 * i)];
      negyeselemek[(33 + 4 * i)] = negyeselemek[(17 + 4 * i)];
      negyeselemek[(17 + 4 * i)] = temp;
    } }

  public static void NegyesF() {
    for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(12 + i)];
      negyeselemek[(12 + i)] = negyeselemek[(63 - 4 * i)];
      negyeselemek[(63 - 4 * i)] = negyeselemek[(35 - i)];
      negyeselemek[(35 - i)] = negyeselemek[(64 + 4 * i)];
      negyeselemek[(64 + 4 * i)] = temp;
    }

    int temp2 = negyeselemek[21];
    negyeselemek[21] = negyeselemek[25];
    negyeselemek[25] = negyeselemek[26];
    negyeselemek[26] = negyeselemek[22];
    negyeselemek[22] = temp2;

    for (int i = 0; i < 3; i++) {
      int temp = negyeselemek[(16 + i)];
      negyeselemek[(16 + i)] = negyeselemek[(28 - 4 * i)];
      negyeselemek[(28 - 4 * i)] = negyeselemek[(31 - i)];
      negyeselemek[(31 - i)] = negyeselemek[(19 + 4 * i)];
      negyeselemek[(19 + 4 * i)] = temp;
    }
  }

  public static void Negyesf() { for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(8 + i)];
      negyeselemek[(8 + i)] = negyeselemek[(62 - 4 * i)];
      negyeselemek[(62 - 4 * i)] = negyeselemek[(39 - i)];
      negyeselemek[(39 - i)] = negyeselemek[(65 + 4 * i)];
      negyeselemek[(65 + 4 * i)] = temp;
    } }

  public static void NegyesB()
  {
    for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(0 + i)];
      negyeselemek[(0 + i)] = negyeselemek[(67 + 4 * i)];
      negyeselemek[(67 + 4 * i)] = negyeselemek[(47 - i)];
      negyeselemek[(47 - i)] = negyeselemek[(60 - 4 * i)];
      negyeselemek[(60 - 4 * i)] = temp;
    }

    int temp2 = negyeselemek[85];
    negyeselemek[85] = negyeselemek[89];
    negyeselemek[89] = negyeselemek[90];
    negyeselemek[90] = negyeselemek[86];
    negyeselemek[86] = temp2;

    for (int i = 0; i < 3; i++) {
      int temp = negyeselemek[(80 + i)];
      negyeselemek[(80 + i)] = negyeselemek[(92 - 4 * i)];
      negyeselemek[(92 - 4 * i)] = negyeselemek[(95 - i)];
      negyeselemek[(95 - i)] = negyeselemek[(83 + 4 * i)];
      negyeselemek[(83 + 4 * i)] = temp;
    }
  }

  public static void Negyesb() { for (int i = 0; i < 4; i++) {
      int temp = negyeselemek[(4 + i)];
      negyeselemek[(4 + i)] = negyeselemek[(66 + 4 * i)];
      negyeselemek[(66 + 4 * i)] = negyeselemek[(43 - i)];
      negyeselemek[(43 - i)] = negyeselemek[(61 - 4 * i)];
      negyeselemek[(61 - 4 * i)] = temp;
    }
  }

  public static void OtosU()
  {
    for (int i = 0; i < 4; i++) {
      int temp = otoselemek[(0 + i)];
      otoselemek[(0 + i)] = otoselemek[(20 - 5 * i)];
      otoselemek[(20 - 5 * i)] = otoselemek[(24 - i)];
      otoselemek[(24 - i)] = otoselemek[(4 + 5 * i)];
      otoselemek[(4 + 5 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = otoselemek[(6 + i)];
      otoselemek[(6 + i)] = otoselemek[(16 - 5 * i)];
      otoselemek[(16 - 5 * i)] = otoselemek[(18 - i)];
      otoselemek[(18 - i)] = otoselemek[(8 + 5 * i)];
      otoselemek[(8 + 5 * i)] = temp;
    }

    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(25 + i)];
      otoselemek[(25 + i)] = otoselemek[(100 + i)];
      otoselemek[(100 + i)] = otoselemek[(125 + i)];
      otoselemek[(125 + i)] = otoselemek[(75 + i)];
      otoselemek[(75 + i)] = temp;
    }
  }

  public static void Otosu()
  {
    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(30 + i)];
      otoselemek[(30 + i)] = otoselemek[(105 + i)];
      otoselemek[(105 + i)] = otoselemek[(130 + i)];
      otoselemek[(130 + i)] = otoselemek[(80 + i)];
      otoselemek[(80 + i)] = temp;
    }
  }

  public static void OtosD() { for (int i = 0; i < 4; i++) {
      int temp = otoselemek[(50 + i)];
      otoselemek[(50 + i)] = otoselemek[(70 - 5 * i)];
      otoselemek[(70 - 5 * i)] = otoselemek[(74 - i)];
      otoselemek[(74 - i)] = otoselemek[(54 + 5 * i)];
      otoselemek[(54 + 5 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = otoselemek[(56 + i)];
      otoselemek[(56 + i)] = otoselemek[(66 - 5 * i)];
      otoselemek[(66 - 5 * i)] = otoselemek[(68 - i)];
      otoselemek[(68 - i)] = otoselemek[(58 + 5 * i)];
      otoselemek[(58 + 5 * i)] = temp;
    }

    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(45 + i)];
      otoselemek[(45 + i)] = otoselemek[(95 + i)];
      otoselemek[(95 + i)] = otoselemek[(145 + i)];
      otoselemek[(145 + i)] = otoselemek[(120 + i)];
      otoselemek[(120 + i)] = temp;
    }
  }

  public static void Otosd()
  {
    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(40 + i)];
      otoselemek[(40 + i)] = otoselemek[(90 + i)];
      otoselemek[(90 + i)] = otoselemek[(140 + i)];
      otoselemek[(140 + i)] = otoselemek[(115 + i)];
      otoselemek[(115 + i)] = temp;
    }
  }

  public static void OtosR() { for (int i = 0; i < 4; i++) {
      int temp = otoselemek[(100 + i)];
      otoselemek[(100 + i)] = otoselemek[(120 - 5 * i)];
      otoselemek[(120 - 5 * i)] = otoselemek[(124 - i)];
      otoselemek[(124 - i)] = otoselemek[(104 + 5 * i)];
      otoselemek[(104 + 5 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = otoselemek[(106 + i)];
      otoselemek[(106 + i)] = otoselemek[(116 - 5 * i)];
      otoselemek[(116 - 5 * i)] = otoselemek[(118 - i)];
      otoselemek[(118 - i)] = otoselemek[(108 + 5 * i)];
      otoselemek[(108 + 5 * i)] = temp;
    }

    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(4 + 5 * i)];
      otoselemek[(4 + 5 * i)] = otoselemek[(29 + 5 * i)];
      otoselemek[(29 + 5 * i)] = otoselemek[(54 + 5 * i)];
      otoselemek[(54 + 5 * i)] = otoselemek[(145 - 5 * i)];
      otoselemek[(145 - 5 * i)] = temp;
    } }

  public static void Otosr() {
    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(3 + 5 * i)];
      otoselemek[(3 + 5 * i)] = otoselemek[(28 + 5 * i)];
      otoselemek[(28 + 5 * i)] = otoselemek[(53 + 5 * i)];
      otoselemek[(53 + 5 * i)] = otoselemek[(146 - 5 * i)];
      otoselemek[(146 - 5 * i)] = temp;
    }
  }

  public static void OtosL() { for (int i = 0; i < 4; i++) {
      int temp = otoselemek[(75 + i)];
      otoselemek[(75 + i)] = otoselemek[(95 - 5 * i)];
      otoselemek[(95 - 5 * i)] = otoselemek[(99 - i)];
      otoselemek[(99 - i)] = otoselemek[(79 + 5 * i)];
      otoselemek[(79 + 5 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = otoselemek[(81 + i)];
      otoselemek[(81 + i)] = otoselemek[(91 - 5 * i)];
      otoselemek[(91 - 5 * i)] = otoselemek[(93 - i)];
      otoselemek[(93 - i)] = otoselemek[(83 + 5 * i)];
      otoselemek[(83 + 5 * i)] = temp;
    }

    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(0 + 5 * i)];
      otoselemek[(0 + 5 * i)] = otoselemek[(149 - 5 * i)];
      otoselemek[(149 - 5 * i)] = otoselemek[(50 + 5 * i)];
      otoselemek[(50 + 5 * i)] = otoselemek[(25 + 5 * i)];
      otoselemek[(25 + 5 * i)] = temp;
    } }

  public static void Otosl() {
    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(1 + 5 * i)];
      otoselemek[(1 + 5 * i)] = otoselemek[(148 - 5 * i)];
      otoselemek[(148 - 5 * i)] = otoselemek[(51 + 5 * i)];
      otoselemek[(51 + 5 * i)] = otoselemek[(26 + 5 * i)];
      otoselemek[(26 + 5 * i)] = temp;
    }
  }

  public static void OtosF() { for (int i = 0; i < 4; i++) {
      int temp = otoselemek[(25 + i)];
      otoselemek[(25 + i)] = otoselemek[(45 - 5 * i)];
      otoselemek[(45 - 5 * i)] = otoselemek[(49 - i)];
      otoselemek[(49 - i)] = otoselemek[(29 + 5 * i)];
      otoselemek[(29 + 5 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = otoselemek[(31 + i)];
      otoselemek[(31 + i)] = otoselemek[(41 - 5 * i)];
      otoselemek[(41 - 5 * i)] = otoselemek[(43 - i)];
      otoselemek[(43 - i)] = otoselemek[(33 + 5 * i)];
      otoselemek[(33 + 5 * i)] = temp;
    }

    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(20 + i)];
      otoselemek[(20 + i)] = otoselemek[(99 - 5 * i)];
      otoselemek[(99 - 5 * i)] = otoselemek[(54 - i)];
      otoselemek[(54 - i)] = otoselemek[(100 + 5 * i)];
      otoselemek[(100 + 5 * i)] = temp;
    }
  }

  public static void Otosf()
  {
    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(15 + i)];
      otoselemek[(15 + i)] = otoselemek[(98 - 5 * i)];
      otoselemek[(98 - 5 * i)] = otoselemek[(59 - i)];
      otoselemek[(59 - i)] = otoselemek[(101 + 5 * i)];
      otoselemek[(101 + 5 * i)] = temp;
    }
  }

  public static void OtosB() { for (int i = 0; i < 4; i++) {
      int temp = otoselemek[(125 + i)];
      otoselemek[(125 + i)] = otoselemek[(145 - 5 * i)];
      otoselemek[(145 - 5 * i)] = otoselemek[(149 - i)];
      otoselemek[(149 - i)] = otoselemek[(129 + 5 * i)];
      otoselemek[(129 + 5 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = otoselemek[(131 + i)];
      otoselemek[(131 + i)] = otoselemek[(141 - 5 * i)];
      otoselemek[(141 - 5 * i)] = otoselemek[(143 - i)];
      otoselemek[(143 - i)] = otoselemek[(133 + 5 * i)];
      otoselemek[(133 + 5 * i)] = temp;
    }

    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(0 + i)];
      otoselemek[(0 + i)] = otoselemek[(104 + 5 * i)];
      otoselemek[(104 + 5 * i)] = otoselemek[(74 - i)];
      otoselemek[(74 - i)] = otoselemek[(95 - 5 * i)];
      otoselemek[(95 - 5 * i)] = temp;
    }
  }

  public static void Otosb()
  {
    for (int i = 0; i < 5; i++) {
      int temp = otoselemek[(5 + i)];
      otoselemek[(5 + i)] = otoselemek[(103 + 5 * i)];
      otoselemek[(103 + 5 * i)] = otoselemek[(69 - i)];
      otoselemek[(69 - i)] = otoselemek[(96 - 5 * i)];
      otoselemek[(96 - 5 * i)] = temp;
    }
  }

  public static void HatosU()
  {
    for (int i = 0; i < 5; i++) {
      int temp = hatoselemek[(0 + i)];
      hatoselemek[(0 + i)] = hatoselemek[(30 - 6 * i)];
      hatoselemek[(30 - 6 * i)] = hatoselemek[(35 - i)];
      hatoselemek[(35 - i)] = hatoselemek[(5 + 6 * i)];
      hatoselemek[(5 + 6 * i)] = temp;
    }

    for (int i = 0; i < 3; i++) {
      int temp = hatoselemek[(7 + i)];
      hatoselemek[(7 + i)] = hatoselemek[(25 - 6 * i)];
      hatoselemek[(25 - 6 * i)] = hatoselemek[(28 - i)];
      hatoselemek[(28 - i)] = hatoselemek[(10 + 6 * i)];
      hatoselemek[(10 + 6 * i)] = temp;
    }

    int temp2 = hatoselemek[14];
    hatoselemek[14] = hatoselemek[20];
    hatoselemek[20] = hatoselemek[21];
    hatoselemek[21] = hatoselemek[15];
    hatoselemek[15] = temp2;

    for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(36 + i)];
      hatoselemek[(36 + i)] = hatoselemek[(144 + i)];
      hatoselemek[(144 + i)] = hatoselemek[(180 + i)];
      hatoselemek[(180 + i)] = hatoselemek[(108 + i)];
      hatoselemek[(108 + i)] = temp;
    }
  }

  public static void Hatos2U() { for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(42 + i)];
      hatoselemek[(42 + i)] = hatoselemek[(150 + i)];
      hatoselemek[(150 + i)] = hatoselemek[(186 + i)];
      hatoselemek[(186 + i)] = hatoselemek[(114 + i)];
      hatoselemek[(114 + i)] = temp;
    } }

  public static void Hatos3U() {
    for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(48 + i)];
      hatoselemek[(48 + i)] = hatoselemek[(156 + i)];
      hatoselemek[(156 + i)] = hatoselemek[(192 + i)];
      hatoselemek[(192 + i)] = hatoselemek[(120 + i)];
      hatoselemek[(120 + i)] = temp;
    }
  }

  public static void HatosD() { for (int i = 0; i < 5; i++) {
      int temp = hatoselemek[(72 + i)];
      hatoselemek[(72 + i)] = hatoselemek[(102 - 6 * i)];
      hatoselemek[(102 - 6 * i)] = hatoselemek[(107 - i)];
      hatoselemek[(107 - i)] = hatoselemek[(77 + 6 * i)];
      hatoselemek[(77 + 6 * i)] = temp;
    }

    for (int i = 0; i < 3; i++) {
      int temp = hatoselemek[(79 + i)];
      hatoselemek[(79 + i)] = hatoselemek[(97 - 6 * i)];
      hatoselemek[(97 - 6 * i)] = hatoselemek[(100 - i)];
      hatoselemek[(100 - i)] = hatoselemek[(82 + 6 * i)];
      hatoselemek[(82 + 6 * i)] = temp;
    }

    int temp2 = hatoselemek[86];
    hatoselemek[86] = hatoselemek[92];
    hatoselemek[92] = hatoselemek[93];
    hatoselemek[93] = hatoselemek[87];
    hatoselemek[87] = temp2;

    for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(66 + i)];
      hatoselemek[(66 + i)] = hatoselemek[(138 + i)];
      hatoselemek[(138 + i)] = hatoselemek[(210 + i)];
      hatoselemek[(210 + i)] = hatoselemek[(174 + i)];
      hatoselemek[(174 + i)] = temp;
    } }

  public static void Hatos2D() {
    for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(60 + i)];
      hatoselemek[(60 + i)] = hatoselemek[(132 + i)];
      hatoselemek[(132 + i)] = hatoselemek[(204 + i)];
      hatoselemek[(204 + i)] = hatoselemek[(168 + i)];
      hatoselemek[(168 + i)] = temp;
    }
  }

  public static void Hatos3D() { for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(54 + i)];
      hatoselemek[(54 + i)] = hatoselemek[(126 + i)];
      hatoselemek[(126 + i)] = hatoselemek[(198 + i)];
      hatoselemek[(198 + i)] = hatoselemek[(162 + i)];
      hatoselemek[(162 + i)] = temp;
    } }

  public static void HatosR() {
    for (int i = 0; i < 5; i++) {
      int temp = hatoselemek[(144 + i)];
      hatoselemek[(144 + i)] = hatoselemek[(174 - 6 * i)];
      hatoselemek[(174 - 6 * i)] = hatoselemek[(179 - i)];
      hatoselemek[(179 - i)] = hatoselemek[(149 + 6 * i)];
      hatoselemek[(149 + 6 * i)] = temp;
    }

    for (int i = 0; i < 3; i++) {
      int temp = hatoselemek[(151 + i)];
      hatoselemek[(151 + i)] = hatoselemek[(169 - 6 * i)];
      hatoselemek[(169 - 6 * i)] = hatoselemek[(172 - i)];
      hatoselemek[(172 - i)] = hatoselemek[(154 + 6 * i)];
      hatoselemek[(154 + 6 * i)] = temp;
    }

    int temp2 = hatoselemek[''];
    hatoselemek[''] = hatoselemek['¤'];
    hatoselemek['¤'] = hatoselemek['¥'];
    hatoselemek['¥'] = hatoselemek[''];
    hatoselemek[''] = temp2;

    for (int i = 0; i < 36; i += 6) {
      int temp = hatoselemek[(5 + i)];
      hatoselemek[(5 + i)] = hatoselemek[(41 + i)];
      hatoselemek[(41 + i)] = hatoselemek[(77 + i)];
      hatoselemek[(77 + i)] = hatoselemek[(210 - i)];
      hatoselemek[(210 - i)] = temp;
    }
  }

  public static void Hatos2R() { for (int i = 0; i < 36; i += 6) {
      int temp = hatoselemek[(4 + i)];
      hatoselemek[(4 + i)] = hatoselemek[(40 + i)];
      hatoselemek[(40 + i)] = hatoselemek[(76 + i)];
      hatoselemek[(76 + i)] = hatoselemek[(211 - i)];
      hatoselemek[(211 - i)] = temp;
    } }

  public static void Hatos3R() {
    for (int i = 0; i < 36; i += 6) {
      int temp = hatoselemek[(3 + i)];
      hatoselemek[(3 + i)] = hatoselemek[(39 + i)];
      hatoselemek[(39 + i)] = hatoselemek[(75 + i)];
      hatoselemek[(75 + i)] = hatoselemek[(212 - i)];
      hatoselemek[(212 - i)] = temp;
    }
  }

  public static void HatosL() { for (int i = 0; i < 5; i++) {
      int temp = hatoselemek[(108 + i)];
      hatoselemek[(108 + i)] = hatoselemek[(138 - 6 * i)];
      hatoselemek[(138 - 6 * i)] = hatoselemek[(143 - i)];
      hatoselemek[(143 - i)] = hatoselemek[(113 + 6 * i)];
      hatoselemek[(113 + 6 * i)] = temp;
    }

    for (int i = 0; i < 3; i++) {
      int temp = hatoselemek[(115 + i)];
      hatoselemek[(115 + i)] = hatoselemek[(133 - 6 * i)];
      hatoselemek[(133 - 6 * i)] = hatoselemek[(136 - i)];
      hatoselemek[(136 - i)] = hatoselemek[(118 + 6 * i)];
      hatoselemek[(118 + 6 * i)] = temp;
    }

    int temp2 = hatoselemek[122];
    hatoselemek[122] = hatoselemek[''];
    hatoselemek[''] = hatoselemek[''];
    hatoselemek[''] = hatoselemek[123];
    hatoselemek[123] = temp2;

    for (int i = 0; i < 36; i += 6) {
      int temp = hatoselemek[(0 + i)];
      hatoselemek[(0 + i)] = hatoselemek[(215 - i)];
      hatoselemek[(215 - i)] = hatoselemek[(72 + i)];
      hatoselemek[(72 + i)] = hatoselemek[(36 + i)];
      hatoselemek[(36 + i)] = temp;
    } }

  public static void Hatos2L() {
    for (int i = 0; i < 36; i += 6) {
      int temp = hatoselemek[(1 + i)];
      hatoselemek[(1 + i)] = hatoselemek[(214 - i)];
      hatoselemek[(214 - i)] = hatoselemek[(73 + i)];
      hatoselemek[(73 + i)] = hatoselemek[(37 + i)];
      hatoselemek[(37 + i)] = temp;
    }
  }

  public static void Hatos3L() { for (int i = 0; i < 36; i += 6) {
      int temp = hatoselemek[(2 + i)];
      hatoselemek[(2 + i)] = hatoselemek[(213 - i)];
      hatoselemek[(213 - i)] = hatoselemek[(74 + i)];
      hatoselemek[(74 + i)] = hatoselemek[(38 + i)];
      hatoselemek[(38 + i)] = temp;
    } }

  public static void HatosF() {
    for (int i = 0; i < 5; i++) {
      int temp = hatoselemek[(36 + i)];
      hatoselemek[(36 + i)] = hatoselemek[(66 - 6 * i)];
      hatoselemek[(66 - 6 * i)] = hatoselemek[(71 - i)];
      hatoselemek[(71 - i)] = hatoselemek[(41 + 6 * i)];
      hatoselemek[(41 + 6 * i)] = temp;
    }

    for (int i = 0; i < 3; i++) {
      int temp = hatoselemek[(43 + i)];
      hatoselemek[(43 + i)] = hatoselemek[(61 - 6 * i)];
      hatoselemek[(61 - 6 * i)] = hatoselemek[(64 - i)];
      hatoselemek[(64 - i)] = hatoselemek[(46 + 6 * i)];
      hatoselemek[(46 + 6 * i)] = temp;
    }

    int temp2 = hatoselemek[50];
    hatoselemek[50] = hatoselemek[56];
    hatoselemek[56] = hatoselemek[57];
    hatoselemek[57] = hatoselemek[51];
    hatoselemek[51] = temp2;

    for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(30 + i)];
      hatoselemek[(30 + i)] = hatoselemek[(143 - 6 * i)];
      hatoselemek[(143 - 6 * i)] = hatoselemek[(77 - i)];
      hatoselemek[(77 - i)] = hatoselemek[(144 + 6 * i)];
      hatoselemek[(144 + 6 * i)] = temp;
    }
  }

  public static void Hatos2F() { for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(24 + i)];
      hatoselemek[(24 + i)] = hatoselemek[(142 - 6 * i)];
      hatoselemek[(142 - 6 * i)] = hatoselemek[(83 - i)];
      hatoselemek[(83 - i)] = hatoselemek[(145 + 6 * i)];
      hatoselemek[(145 + 6 * i)] = temp;
    } }

  public static void Hatos3F() {
    for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(18 + i)];
      hatoselemek[(18 + i)] = hatoselemek[(141 - 6 * i)];
      hatoselemek[(141 - 6 * i)] = hatoselemek[(89 - i)];
      hatoselemek[(89 - i)] = hatoselemek[(146 + 6 * i)];
      hatoselemek[(146 + 6 * i)] = temp;
    }
  }

  public static void HatosB() { for (int i = 0; i < 5; i++) {
      int temp = hatoselemek[(180 + i)];
      hatoselemek[(180 + i)] = hatoselemek[(210 - 6 * i)];
      hatoselemek[(210 - 6 * i)] = hatoselemek[(215 - i)];
      hatoselemek[(215 - i)] = hatoselemek[(185 + 6 * i)];
      hatoselemek[(185 + 6 * i)] = temp;
    }

    for (int i = 0; i < 3; i++) {
      int temp = hatoselemek[(187 + i)];
      hatoselemek[(187 + i)] = hatoselemek[(205 - 6 * i)];
      hatoselemek[(205 - 6 * i)] = hatoselemek[(208 - i)];
      hatoselemek[(208 - i)] = hatoselemek[(190 + 6 * i)];
      hatoselemek[(190 + 6 * i)] = temp;
    }

    int temp2 = hatoselemek['Â'];
    hatoselemek['Â'] = hatoselemek['È'];
    hatoselemek['È'] = hatoselemek['É'];
    hatoselemek['É'] = hatoselemek['Ã'];
    hatoselemek['Ã'] = temp2;

    for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(149 + 6 * i)];
      hatoselemek[(149 + 6 * i)] = hatoselemek[(107 - i)];
      hatoselemek[(107 - i)] = hatoselemek[(138 - 6 * i)];
      hatoselemek[(138 - 6 * i)] = hatoselemek[(0 + i)];
      hatoselemek[(0 + i)] = temp;
    } }

  public static void Hatos2B() {
    for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(148 + 6 * i)];
      hatoselemek[(148 + 6 * i)] = hatoselemek[(101 - i)];
      hatoselemek[(101 - i)] = hatoselemek[(139 - 6 * i)];
      hatoselemek[(139 - 6 * i)] = hatoselemek[(6 + i)];
      hatoselemek[(6 + i)] = temp;
    }
  }

  public static void Hatos3B() { for (int i = 0; i < 6; i++) {
      int temp = hatoselemek[(147 + 6 * i)];
      hatoselemek[(147 + 6 * i)] = hatoselemek[(95 - i)];
      hatoselemek[(95 - i)] = hatoselemek[(140 - 6 * i)];
      hatoselemek[(140 - 6 * i)] = hatoselemek[(12 + i)];
      hatoselemek[(12 + i)] = temp;
    }
  }

  public static void HetesU()
  {
    for (int i = 0; i < 6; i++) {
      int temp = heteselemek[(0 + i)];
      heteselemek[(0 + i)] = heteselemek[(42 - 7 * i)];
      heteselemek[(42 - 7 * i)] = heteselemek[(48 - i)];
      heteselemek[(48 - i)] = heteselemek[(6 + 7 * i)];
      heteselemek[(6 + 7 * i)] = temp;
    }

    for (int i = 0; i < 4; i++) {
      int temp = heteselemek[(8 + i)];
      heteselemek[(8 + i)] = heteselemek[(36 - 7 * i)];
      heteselemek[(36 - 7 * i)] = heteselemek[(40 - i)];
      heteselemek[(40 - i)] = heteselemek[(12 + 7 * i)];
      heteselemek[(12 + 7 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = heteselemek[(16 + i)];
      heteselemek[(16 + i)] = heteselemek[(30 - 7 * i)];
      heteselemek[(30 - 7 * i)] = heteselemek[(32 - i)];
      heteselemek[(32 - i)] = heteselemek[(18 + 7 * i)];
      heteselemek[(18 + 7 * i)] = temp;
    }

    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(49 + i)];
      heteselemek[(49 + i)] = heteselemek[(196 + i)];
      heteselemek[(196 + i)] = heteselemek[(245 + i)];
      heteselemek[(245 + i)] = heteselemek[(147 + i)];
      heteselemek[(147 + i)] = temp;
    }
  }

  public static void Hetes2U() { for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(56 + i)];
      heteselemek[(56 + i)] = heteselemek[(203 + i)];
      heteselemek[(203 + i)] = heteselemek[(252 + i)];
      heteselemek[(252 + i)] = heteselemek[(154 + i)];
      heteselemek[(154 + i)] = temp;
    } }

  public static void Hetes3U() {
    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(63 + i)];
      heteselemek[(63 + i)] = heteselemek[(210 + i)];
      heteselemek[(210 + i)] = heteselemek[(259 + i)];
      heteselemek[(259 + i)] = heteselemek[(161 + i)];
      heteselemek[(161 + i)] = temp;
    }
  }

  public static void HetesD() { for (int i = 0; i < 6; i++) {
      int temp = heteselemek[(98 + i)];
      heteselemek[(98 + i)] = heteselemek[(140 - 7 * i)];
      heteselemek[(140 - 7 * i)] = heteselemek[(146 - i)];
      heteselemek[(146 - i)] = heteselemek[(104 + 7 * i)];
      heteselemek[(104 + 7 * i)] = temp;
    }

    for (int i = 0; i < 4; i++) {
      int temp = heteselemek[(106 + i)];
      heteselemek[(106 + i)] = heteselemek[(134 - 7 * i)];
      heteselemek[(134 - 7 * i)] = heteselemek[(138 - i)];
      heteselemek[(138 - i)] = heteselemek[(110 + 7 * i)];
      heteselemek[(110 + 7 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = heteselemek[(114 + i)];
      heteselemek[(114 + i)] = heteselemek[(128 - 7 * i)];
      heteselemek[(128 - 7 * i)] = heteselemek[(130 - i)];
      heteselemek[(130 - i)] = heteselemek[(116 + 7 * i)];
      heteselemek[(116 + 7 * i)] = temp;
    }

    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(91 + i)];
      heteselemek[(91 + i)] = heteselemek[(189 + i)];
      heteselemek[(189 + i)] = heteselemek[(287 + i)];
      heteselemek[(287 + i)] = heteselemek[(238 + i)];
      heteselemek[(238 + i)] = temp;
    } }

  public static void Hetes2D() {
    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(84 + i)];
      heteselemek[(84 + i)] = heteselemek[(182 + i)];
      heteselemek[(182 + i)] = heteselemek[(280 + i)];
      heteselemek[(280 + i)] = heteselemek[(231 + i)];
      heteselemek[(231 + i)] = temp;
    }
  }

  public static void Hetes3D() { for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(77 + i)];
      heteselemek[(77 + i)] = heteselemek[(175 + i)];
      heteselemek[(175 + i)] = heteselemek[(273 + i)];
      heteselemek[(273 + i)] = heteselemek[(224 + i)];
      heteselemek[(224 + i)] = temp;
    } }

  public static void HetesR() {
    for (int i = 0; i < 6; i++) {
      int temp = heteselemek[(196 + i)];
      heteselemek[(196 + i)] = heteselemek[(238 - 7 * i)];
      heteselemek[(238 - 7 * i)] = heteselemek[(244 - i)];
      heteselemek[(244 - i)] = heteselemek[(202 + 7 * i)];
      heteselemek[(202 + 7 * i)] = temp;
    }

    for (int i = 0; i < 4; i++) {
      int temp = heteselemek[(204 + i)];
      heteselemek[(204 + i)] = heteselemek[(232 - 7 * i)];
      heteselemek[(232 - 7 * i)] = heteselemek[(236 - i)];
      heteselemek[(236 - i)] = heteselemek[(208 + 7 * i)];
      heteselemek[(208 + 7 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = heteselemek[(212 + i)];
      heteselemek[(212 + i)] = heteselemek[(226 - 7 * i)];
      heteselemek[(226 - 7 * i)] = heteselemek[(228 - i)];
      heteselemek[(228 - i)] = heteselemek[(214 + 7 * i)];
      heteselemek[(214 + 7 * i)] = temp;
    }

    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(6 + 7 * i)];
      heteselemek[(6 + 7 * i)] = heteselemek[(55 + 7 * i)];
      heteselemek[(55 + 7 * i)] = heteselemek[(104 + 7 * i)];
      heteselemek[(104 + 7 * i)] = heteselemek[(287 - 7 * i)];
      heteselemek[(287 - 7 * i)] = temp;
    }
  }

  public static void Hetes2R() { for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(5 + 7 * i)];
      heteselemek[(5 + 7 * i)] = heteselemek[(54 + 7 * i)];
      heteselemek[(54 + 7 * i)] = heteselemek[(103 + 7 * i)];
      heteselemek[(103 + 7 * i)] = heteselemek[(288 - 7 * i)];
      heteselemek[(288 - 7 * i)] = temp;
    } }

  public static void Hetes3R() {
    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(4 + 7 * i)];
      heteselemek[(4 + 7 * i)] = heteselemek[(53 + 7 * i)];
      heteselemek[(53 + 7 * i)] = heteselemek[(102 + 7 * i)];
      heteselemek[(102 + 7 * i)] = heteselemek[(289 - 7 * i)];
      heteselemek[(289 - 7 * i)] = temp;
    }
  }

  public static void HetesL() { for (int i = 0; i < 6; i++) {
      int temp = heteselemek[(147 + i)];
      heteselemek[(147 + i)] = heteselemek[(189 - 7 * i)];
      heteselemek[(189 - 7 * i)] = heteselemek[(195 - i)];
      heteselemek[(195 - i)] = heteselemek[(153 + 7 * i)];
      heteselemek[(153 + 7 * i)] = temp;
    }

    for (int i = 0; i < 4; i++) {
      int temp = heteselemek[(155 + i)];
      heteselemek[(155 + i)] = heteselemek[(183 - 7 * i)];
      heteselemek[(183 - 7 * i)] = heteselemek[(187 - i)];
      heteselemek[(187 - i)] = heteselemek[(159 + 7 * i)];
      heteselemek[(159 + 7 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = heteselemek[(163 + i)];
      heteselemek[(163 + i)] = heteselemek[(177 - 7 * i)];
      heteselemek[(177 - 7 * i)] = heteselemek[(179 - i)];
      heteselemek[(179 - i)] = heteselemek[(165 + 7 * i)];
      heteselemek[(165 + 7 * i)] = temp;
    }

    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(0 + 7 * i)];
      heteselemek[(0 + 7 * i)] = heteselemek[(293 - 7 * i)];
      heteselemek[(293 - 7 * i)] = heteselemek[(98 + 7 * i)];
      heteselemek[(98 + 7 * i)] = heteselemek[(49 + 7 * i)];
      heteselemek[(49 + 7 * i)] = temp;
    } }

  public static void Hetes2L() {
    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(1 + 7 * i)];
      heteselemek[(1 + 7 * i)] = heteselemek[(292 - 7 * i)];
      heteselemek[(292 - 7 * i)] = heteselemek[(99 + 7 * i)];
      heteselemek[(99 + 7 * i)] = heteselemek[(50 + 7 * i)];
      heteselemek[(50 + 7 * i)] = temp;
    }
  }

  public static void Hetes3L() { for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(2 + 7 * i)];
      heteselemek[(2 + 7 * i)] = heteselemek[(291 - 7 * i)];
      heteselemek[(291 - 7 * i)] = heteselemek[(100 + 7 * i)];
      heteselemek[(100 + 7 * i)] = heteselemek[(51 + 7 * i)];
      heteselemek[(51 + 7 * i)] = temp;
    } }

  public static void HetesF() {
    for (int i = 0; i < 6; i++) {
      int temp = heteselemek[(49 + i)];
      heteselemek[(49 + i)] = heteselemek[(91 - 7 * i)];
      heteselemek[(91 - 7 * i)] = heteselemek[(97 - i)];
      heteselemek[(97 - i)] = heteselemek[(55 + 7 * i)];
      heteselemek[(55 + 7 * i)] = temp;
    }

    for (int i = 0; i < 4; i++) {
      int temp = heteselemek[(57 + i)];
      heteselemek[(57 + i)] = heteselemek[(85 - 7 * i)];
      heteselemek[(85 - 7 * i)] = heteselemek[(89 - i)];
      heteselemek[(89 - i)] = heteselemek[(61 + 7 * i)];
      heteselemek[(61 + 7 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = heteselemek[(65 + i)];
      heteselemek[(65 + i)] = heteselemek[(79 - 7 * i)];
      heteselemek[(79 - 7 * i)] = heteselemek[(81 - i)];
      heteselemek[(81 - i)] = heteselemek[(67 + 7 * i)];
      heteselemek[(67 + 7 * i)] = temp;
    }

    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(42 + i)];
      heteselemek[(42 + i)] = heteselemek[(195 - 7 * i)];
      heteselemek[(195 - 7 * i)] = heteselemek[(104 - i)];
      heteselemek[(104 - i)] = heteselemek[(196 + 7 * i)];
      heteselemek[(196 + 7 * i)] = temp;
    }
  }

  public static void Hetes2F() { for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(35 + i)];
      heteselemek[(35 + i)] = heteselemek[(194 - 7 * i)];
      heteselemek[(194 - 7 * i)] = heteselemek[(111 - i)];
      heteselemek[(111 - i)] = heteselemek[(197 + 7 * i)];
      heteselemek[(197 + 7 * i)] = temp;
    } }

  public static void Hetes3F() {
    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(28 + i)];
      heteselemek[(28 + i)] = heteselemek[(193 - 7 * i)];
      heteselemek[(193 - 7 * i)] = heteselemek[(118 - i)];
      heteselemek[(118 - i)] = heteselemek[(198 + 7 * i)];
      heteselemek[(198 + 7 * i)] = temp;
    }
  }

  public static void HetesB() { for (int i = 0; i < 6; i++) {
      int temp = heteselemek[(245 + i)];
      heteselemek[(245 + i)] = heteselemek[(287 - 7 * i)];
      heteselemek[(287 - 7 * i)] = heteselemek[(293 - i)];
      heteselemek[(293 - i)] = heteselemek[(251 + 7 * i)];
      heteselemek[(251 + 7 * i)] = temp;
    }

    for (int i = 0; i < 4; i++) {
      int temp = heteselemek[(253 + i)];
      heteselemek[(253 + i)] = heteselemek[(281 - 7 * i)];
      heteselemek[(281 - 7 * i)] = heteselemek[(285 - i)];
      heteselemek[(285 - i)] = heteselemek[(257 + 7 * i)];
      heteselemek[(257 + 7 * i)] = temp;
    }
    for (int i = 0; i < 2; i++) {
      int temp = heteselemek[(261 + i)];
      heteselemek[(261 + i)] = heteselemek[(275 - 7 * i)];
      heteselemek[(275 - 7 * i)] = heteselemek[(277 - i)];
      heteselemek[(277 - i)] = heteselemek[(263 + 7 * i)];
      heteselemek[(263 + 7 * i)] = temp;
    }

    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(0 + i)];
      heteselemek[(0 + i)] = heteselemek[(202 + 7 * i)];
      heteselemek[(202 + 7 * i)] = heteselemek[(146 - i)];
      heteselemek[(146 - i)] = heteselemek[(189 - 7 * i)];
      heteselemek[(189 - 7 * i)] = temp;
    } }

  public static void Hetes2B() {
    for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(7 + i)];
      heteselemek[(7 + i)] = heteselemek[(201 + 7 * i)];
      heteselemek[(201 + 7 * i)] = heteselemek[(139 - i)];
      heteselemek[(139 - i)] = heteselemek[(190 - 7 * i)];
      heteselemek[(190 - 7 * i)] = temp;
    }
  }

  public static void Hetes3B() { for (int i = 0; i < 7; i++) {
      int temp = heteselemek[(14 + i)];
      heteselemek[(14 + i)] = heteselemek[(200 + 7 * i)];
      heteselemek[(200 + 7 * i)] = heteselemek[(132 - i)];
      heteselemek[(132 - i)] = heteselemek[(191 - 7 * i)];
      heteselemek[(191 - 7 * i)] = temp;
    }
  }
}
