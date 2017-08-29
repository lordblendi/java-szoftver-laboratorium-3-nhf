# Szoftver laboratórium 3 nagyházi

Ezt a nagyházit a Szoftver laboratórium 3 tantárgyhoz készítettem a BME-s tanulmányaim során a 2011/2012/3. félévben.

## Feladat - Rubik-kocka keverő program

A feladatomnak egy Rubik-kocka keveréseket generáló és megjelenítő programot választottam. A program egy collection-ben tárolja el a régi keveréseket, melyek között a previous és a next gombokkal tudunk lépkedni, ha pedig újat akarunk, akkor arra a new gombot használhatjuk. Lehetőségünk  van  továbbá a File menüből kiválasztani, hogy mit szeretnénk csinálni a meglévő keveréseinkkel, miszerint a save-el  szeralizáltan ki tudjuk őket menteni (ez az ember számára nem olvasható), illetve a régi mentést a load-dal visszatölteni, viszont a writetofile metódussal kiírathatjuk a keveréseket egy txt fájlba, amit pedig bármilyen számítógépen megnyithatunk egy jegyzettömbbel. A keverés alatt megjelenik továbbá a bekevert kocka hálója, minden egyes keverésnél változik a lenti kép.


## Dokumentáció

[A pdf dokumentáció megtalálható itt.](https://github.com/lordblendi/java-szoftver-laboratorium-3-nhf/blob/master/docs/dokumentacio.pdf)

## Fordítás és futtatás

``` bash
cd src && javac *.java && java ScrambleMain

```
