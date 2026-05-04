/* Nama file   : BGenerikPadaClass.java
   Deskripsi   : Mencoba generik pada class
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 28-April-2026 
   Lab         : D1 */

class AAnabul {
    // atribut
    private String nama;

    // method
    AAnabul(String nnew)
    {
        nama = nnew;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return nama;
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

class Kucing extends AAnabul {
    // atribut
    private double bobot;

    // method
    Kucing(String nnew, double bnew)
    {
        super(nnew);
        bobot = bnew;
    }

    public void setBobot(double bnew)
    {
        this.bobot = bnew;
    }

    public double getBobot()
    {
        return bobot;
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

class Anjing extends AAnabul {
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

class Burung extends AAnabul {
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

class Anggora extends Kucing {
    // atribut

    // method
    Anggora(String nnew, double bnew)
    {
        super(nnew, bnew);
    }
}

class KembangTelon extends Kucing {
    // atribut

    // method
    KembangTelon(String nnew, double bnew)
    {
        super(nnew, bnew);
    }
}

class Datum<T> {
    // atribut
    private T isi;

    // method
    public Datum(T isi)
    {
        this.isi = isi;
    }

    public T getIsi()
    {
        return isi;
    }

    public void setIsi(T isibaru)
    {
        this.isi = isibaru;
    }
}

public class BGenerikPadaClass {
    public static void main(String[] args) throws Exception {
        Anggora ag1 = new Anggora("Wolfie", 3.5);
        KembangTelon kt1 = new KembangTelon("Maesh", 4.0);

        Datum<Kucing> d = new Datum<>(ag1);

        System.out.println("tipe yang ada di Datum sekarang : Anggora");
        System.out.println("Suara : " +d.getIsi().Bersuara());
        System.out.println("Gerak : " +d.getIsi().Gerak());

        d.setIsi(kt1);

        System.out.println("tipe yang ada di Datum sekarang : Kembang Telon");
        System.out.println("Suara : " +d.getIsi().Bersuara());
        System.out.println("Gerak : " +d.getIsi().Gerak());
    }
}
