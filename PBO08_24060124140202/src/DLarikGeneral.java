/* Nama file   : DLarikGeneral.java
   Deskripsi   : Mencoba generik pada larik
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 3-Mei-2026 
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

class Data<T>
{
    // atribut
    private T[] ruang;
    private int banyak;

    // method
    Data()
    {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int pos, T obj)
    {
        ruang[pos - 1] = obj;
        if(pos > banyak)
        {
            banyak = pos;
        }
    }

    public T getIsi(int pos)
    {
        return ruang[pos - 1];
    }

    public int getSize()
    {
        return banyak;
    }
}

public class DLarikGeneral
{
    public static void main(String[] args)
    {
        Data<AAnabul> dat = new Data<>();

        // setIsi
        dat.setIsi(1, new Anjing("Baxter"));
        dat.setIsi(2, new Kucing("Maesh", 3.5));
        dat.setIsi(3, new Anggora("Wolfie", 2.8));
        dat.setIsi(4, new KembangTelon("Toni", 4.0));
        dat.setIsi(5, new Burung("Jono"));

        // getIsi
        System.out.println("getIsi[1] : " +dat.getIsi(1).getNama()+ " - " +dat.getIsi(1).Bersuara());
        System.out.println("getIsi[2] : " +dat.getIsi(2).getNama()+ " - " +dat.getIsi(2).Bersuara());
        System.out.println("getIsi[3] : " +dat.getIsi(3).getNama()+ " - " +dat.getIsi(3).Bersuara());
        System.out.println("getIsi[4] : " +dat.getIsi(4).getNama()+ " - " +dat.getIsi(4).Bersuara());
        System.out.println("getIsi[5] : " +dat.getIsi(5).getNama()+ " - " +dat.getIsi(5).Bersuara());

        // getSize
        System.out.println("getSize : " +dat.getSize());
    }
}
