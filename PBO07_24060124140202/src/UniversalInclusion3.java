/* Nama file   : UniversalInclusion3.java
   Deskripsi   : Mencoba Polimorfisme Universal Inclusion sederhana
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 22-April-2026 
   Lab         : D1 */

class Anabul {
    // atribut
    String nama;

    // method
    Anabul(String nnew)
    {
        nama = nnew;
    }

    public String Gerak()
    {
        return "Bergerak";
    }

    public String Bersuara()
    {
        return "Burbunyi";
    }
}

class Kucing extends Anabul {
    // atribut

    // method
    Kucing(String nnew)
    {
        super(nnew);
    }

    @Override
    public String Gerak()
    {
        return "melata";
    }

    @Override
    public String Bersuara()
    {
        return "meong";
    }
}

class Anjing extends Anabul {
    // atribut

    // method
    Anjing(String nnew)
    {
        super(nnew);
    }   
    
    @Override
    public String Gerak()
    {
        return "melata";
    }

    @Override
    public String Bersuara()
    {
        return "guk-guk";
    }
}

class Burung extends Anabul {
    // atribut

    // method
    Burung(String nnew)
    {
        super(nnew);
    }

    @Override
    public String Gerak()
    {
        return "terbang";
    }

    @Override
    public String Bersuara()
    {
        return "cuit";
    }
}

public class UniversalInclusion3 {
    public static void main(String[] args)
    {
        Anabul ku1 = new Kucing("Muhammad Sumbul");
        Anabul an1 = new Anjing("Peppy");
        Anabul bu1 = new Burung("Joni");

        // gerak & suara kucing
        System.out.println("Gerak Kucing : " +ku1.Gerak());
        System.out.println("Suara Kucing : " +ku1.Bersuara());
        System.out.println("\n");

        // gerak & suara anjing
        System.out.println("Gerak Anjing : " +an1.Gerak());
        System.out.println("Suara Anjing : " +an1.Bersuara());
        System.out.println("\n");

        // gerak & suara burung
        System.out.println("Gerak Burung : " +bu1.Gerak());
        System.out.println("Suara Burung : " +bu1.Bersuara());
        System.out.println("\n");
    }
}
