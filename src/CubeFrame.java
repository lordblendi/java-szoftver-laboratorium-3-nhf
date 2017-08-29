import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class CubeFrame
{
 public static JPanel makecubeframe(int[] cube)
 {
   JPanel cubemap = new JPanel(new GridLayout(3, 4));

   JPanel ures = new JPanel();
   JPanel ures2 = new JPanel();
   JPanel ures3 = new JPanel();
   JPanel ures4 = new JPanel();
   JPanel ures5 = new JPanel();
   JPanel ures6 = new JPanel();
   JPanel u = new JPanel();
   JPanel d = new JPanel();
   JPanel r = new JPanel();
   JPanel l = new JPanel();
   JPanel f = new JPanel();
   JPanel b = new JPanel();

   cubemap.setSize(300, 400);
   u.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
   d.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
   r.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
   l.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
   b.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
   f.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));

   ures.setSize(100, 100);
   ures2.setSize(100, 100);
   ures3.setSize(100, 100);
   ures4.setSize(100, 100);
   ures5.setSize(100, 100);
   ures6.setSize(100, 100);

   u.setSize(100, 100);
   d.setSize(100, 100);
   r.setSize(100, 100);
   l.setSize(100, 100);
   f.setSize(100, 100);
   b.setSize(100, 100);

   if (cube.length == 24)
   {
     u.setLayout(new GridLayout(2, 2));
     d.setLayout(new GridLayout(2, 2));
     r.setLayout(new GridLayout(2, 2));
     l.setLayout(new GridLayout(2, 2));
     f.setLayout(new GridLayout(2, 2));
     b.setLayout(new GridLayout(2, 2));

     for (int i = 0; i < 24; i++) {
       if (i < 4) {
         u.add(createSticker(cube[i]));
       }
       else if (i < 8) {
         f.add(createSticker(cube[i]));
       }
       else if (i < 12) {
         d.add(createSticker(cube[i]));
       }
       else if (i < 16) {
         l.add(createSticker(cube[i]));
       }
       else if (i < 20) {
         r.add(createSticker(cube[i]));
       }
       else {
         b.add(createSticker(cube[i]));
       }
     }
   }
   else if (cube.length == 54) {
     u.setLayout(new GridLayout(3, 3));
     d.setLayout(new GridLayout(3, 3));
     r.setLayout(new GridLayout(3, 3));
     l.setLayout(new GridLayout(3, 3));
     f.setLayout(new GridLayout(3, 3));
     b.setLayout(new GridLayout(3, 3));

     for (int i = 0; i < 54; i++) {
       if (i < 9) {
         u.add(createSticker(cube[i]));
       }
       else if (i < 18) {
         f.add(createSticker(cube[i]));
       }
       else if (i < 27) {
         d.add(createSticker(cube[i]));
       }
       else if (i < 36) {
         l.add(createSticker(cube[i]));
       }
       else if (i < 45) {
         r.add(createSticker(cube[i]));
       }
       else {
         b.add(createSticker(cube[i]));
       }
     }
   }
   else if (cube.length == 96) {
     u.setLayout(new GridLayout(4, 4));
     d.setLayout(new GridLayout(4, 4));
     r.setLayout(new GridLayout(4, 4));
     l.setLayout(new GridLayout(4, 4));
     f.setLayout(new GridLayout(4, 4));
     b.setLayout(new GridLayout(4, 4));

     for (int i = 0; i < 96; i++) {
       if (i < 16) {
         u.add(createSticker(cube[i]));
       }
       else if (i < 32) {
         f.add(createSticker(cube[i]));
       }
       else if (i < 48) {
         d.add(createSticker(cube[i]));
       }
       else if (i < 64) {
         l.add(createSticker(cube[i]));
       }
       else if (i < 80) {
         r.add(createSticker(cube[i]));
       }
       else {
         b.add(createSticker(cube[i]));
       }
     }
   }
   else if (cube.length == 150) {
     u.setLayout(new GridLayout(5, 5));
     d.setLayout(new GridLayout(5, 5));
     r.setLayout(new GridLayout(5, 5));
     l.setLayout(new GridLayout(5, 5));
     f.setLayout(new GridLayout(5, 5));
     b.setLayout(new GridLayout(5, 5));

     for (int i = 0; i < 150; i++) {
       if (i < 25) {
         u.add(createSticker(cube[i]));
       }
       else if (i < 50) {
         f.add(createSticker(cube[i]));
       }
       else if (i < 75) {
         d.add(createSticker(cube[i]));
       }
       else if (i < 100) {
         l.add(createSticker(cube[i]));
       }
       else if (i < 125) {
         r.add(createSticker(cube[i]));
       }
       else {
         b.add(createSticker(cube[i]));
       }
     }
   }
   else if (cube.length == 216) {
     u.setLayout(new GridLayout(6, 6));
     d.setLayout(new GridLayout(6, 6));
     r.setLayout(new GridLayout(6, 6));
     l.setLayout(new GridLayout(6, 6));
     f.setLayout(new GridLayout(6, 6));
     b.setLayout(new GridLayout(6, 6));

     for (int i = 0; i < 216; i++) {
       if (i < 36) {
         u.add(createSticker(cube[i]));
       }
       else if (i < 72) {
         f.add(createSticker(cube[i]));
       }
       else if (i < 108) {
         d.add(createSticker(cube[i]));
       }
       else if (i < 144) {
         l.add(createSticker(cube[i]));
       }
       else if (i < 180) {
         r.add(createSticker(cube[i]));
       }
       else {
         b.add(createSticker(cube[i]));
       }
     }
   }
   else if (cube.length == 294) {
     u.setLayout(new GridLayout(7, 7));
     d.setLayout(new GridLayout(7, 7));
     r.setLayout(new GridLayout(7, 7));
     l.setLayout(new GridLayout(7, 7));
     f.setLayout(new GridLayout(7, 7));
     b.setLayout(new GridLayout(7, 7));

     for (int i = 0; i < 294; i++) {
       if (i < 49) {
         u.add(createSticker(cube[i]));
       }
       else if (i < 98) {
         f.add(createSticker(cube[i]));
       }
       else if (i < 147) {
         d.add(createSticker(cube[i]));
       }
       else if (i < 196) {
         l.add(createSticker(cube[i]));
       }
       else if (i < 245) {
         r.add(createSticker(cube[i]));
       }
       else {
         b.add(createSticker(cube[i]));
       }
     }

   }

   cubemap.add(ures);
   cubemap.add(u);
   cubemap.add(ures2);
   cubemap.add(ures3);

   cubemap.add(l);
   cubemap.add(f);
   cubemap.add(r);/*     */
   cubemap.add(b);

   cubemap.add(ures4);
   cubemap.add(d);
   cubemap.add(ures5);
   cubemap.add(ures6);

   return cubemap;
 }

 public static JPanel createSticker(int i)
 {
   JPanel ki = new JPanel();
   ki.setBorder(BorderFactory.createLineBorder(Color.black));
   ki.setSize(1, 1);
   if (i == 1) {
     ki.setBackground(Color.white);
   }
   else if (i == 2) {
     ki.setBackground(Color.green);
   }
   else if (i == 3) {
     ki.setBackground(new Color(255, 255, 0));
   }
   else if (i == 4) {
     ki.setBackground(new Color(240, 121, 2));
   }
   else if (i == 5) {
     ki.setBackground(Color.red);
   }
   else {
     ki.setBackground(Color.blue);
   }

   return ki;
 }
}
