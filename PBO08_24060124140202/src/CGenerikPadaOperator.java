/* Nama file   : CGenerikPadaOperator.java
   Deskripsi   : Mencoba generik pada operator
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 2-Mei-2026 
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

class OperatorGenerik
{
    // atribut

    // method
    public <T> void Tukar(T[] a, T[] b)
    {
        T temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }

    public <T extends Kucing> double Bobot2(T a, T b)
    {
        return a.getBobot() + b.getBobot();
    }
}

public class CGenerikPadaOperator {
    public static void main(String[] args)
    {
        OperatorGenerik op1 = new OperatorGenerik();

        // integer
        Integer[] i1 = {135};
        Integer[] i2 = {999};
        System.out.println("Sebelum : A : " +i1[0]+ " B : " +i2[0]);
        op1.Tukar(i1, i2);
        System.out.println("Sesudah : A : " +i1[0]+ " B : " +i2[0]);
        System.out.println("\n");

        // String
        String[] s1 = {"Maesh"};
        String[] s2 = {"Wolfie"};
        System.out.println("Sebelum : A : " +s1[0]+ " B : " +s2[0]);
        op1.Tukar(s1, s2);
        System.out.println("Sesudah : A : " +s1[0]+ " B : " +s2[0]);
        System.out.println("\n");

        // Anabul
        AAnabul[] d1 = {new AAnabul("Nanang")};
        AAnabul[] d2 = {new AAnabul("Tatang")};
        System.out.println("Sebelum : A : " +d1[0].getNama()+ " B : " +d2[0].getNama());
        op1.Tukar(d1, d2);
        System.out.println("Sesudah : A : " +d1[0].getNama()+ " B : " +d2[0].getNama());
        System.out.println("\n");

        // Bobot2
        Anggora an = new Anggora("Maesh", 4.0);
        KembangTelon kt = new KembangTelon("Wolfie", 3.5);
        System.out.println("Bobot2 Anggora & Anggora : " +op1.Bobot2(an, an));
        System.out.println("Bobot2 Kembang Telon & Kembang Telon : " +op1.Bobot2(kt, kt));
        System.out.println("Bobot2 Anggora & Kembang Telon : " +op1.Bobot2(an, kt));
        System.out.println("\n");
    }
}
