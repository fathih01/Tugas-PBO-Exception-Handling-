public class Barang {
  protected String namaBarang;
    protected double hargaBarang;

    public Barang(String namaBarang, double hargaBarang) 
    {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public String getNamaBarang() 
    {
        return namaBarang;
    }

    public double getHargaBarang() 
    {
        return hargaBarang;
    }
}
