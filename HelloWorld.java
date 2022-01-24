public class HelloWorld {
    public static void main(String[] args) {
        // bu bir yorumdur
        /*
            bu bir yorumdur
         */

        System.out.println("Hello World");

        // degiskenler
        System.out.println("## Degiskenler ##");
        String isim = "Feriha";
        System.out.println(isim);

        int sayi = 13;
        System.out.println(sayi);

        double pi = 3.14;
        System.out.println(pi);

        // aritmetik operatörler
        System.out.println("## Artimetik Operatorler ##");
        int sayi1 = 13;
        int sayi2 = 5;
        int sonuc;
        double dsayi1 = 13.0;
        double dsayi2 = 5.0;
        double doubleSonuc;

        sonuc = sayi1 + sayi2;
        System.out.println(sonuc);

        sonuc = sayi2 - sayi1;
        System.out.println(sonuc);

        sonuc = sayi2 * sayi1;
        System.out.println(sonuc);

        doubleSonuc =  sayi2 / dsayi1;
        System.out.println(doubleSonuc);

        sonuc = sayi1 % sayi2;
        System.out.println(sonuc);

        System.out.println(++sayi1);
        
        System.out.println(--sayi1);

        // atama operatörleri
        System.out.println("## Atama Operatorleri ##");
        sayi1 *= 3;
        System.out.println(sayi1);

        sayi1 -= 150;
        System.out.println(sayi1);

        // karşılaştırma operatörleri
        System.out.println("## Karsilastirma Operatorleri ##");
        sayi1 = 98;
        sayi2 = 98;

        System.out.println(sayi1 == sayi2);
        System.out.println(sayi1 >= sayi2);

        System.out.println(sayi1 != sayi2);

        sayi1 = 2;
        System.out.println(sayi1 > sayi2);
        System.out.println(sayi1 < sayi2);
        System.out.println(sayi1 <= sayi2);

        // mantik operatorleri
        System.out.println("## Mantik Operatorleri ##");
        Boolean x = true;
        Boolean y = false;
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(x);
        System.out.println(!x);
    }
}