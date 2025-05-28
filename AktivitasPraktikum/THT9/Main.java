package THT9;

class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }

    public double hitungHargaTiket() {
        return 100000;
    }

    public double hitungHargaTiket(String kelas) {
        return hitungHargaTiket(); 
    }

    public String getNama() { return nama; }
    public int getJumlahKursi() { return jumlahKursi; }
    public String getTujuan() { return tujuan; }
}

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.10;
    }

    @Override
    public double hitungHargaTiket(String kelas) {
        double base = hitungHargaTiket();
        if (kelas.equalsIgnoreCase("Bisnis")) return base * 1.25;
        return base; 
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.20;
    }

    @Override
    public double hitungHargaTiket(String kelas) {
        double base = hitungHargaTiket();
        if (kelas.equalsIgnoreCase("VIP")) return base * 1.5;
        return base; 
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.5;
    }

    @Override
    public double hitungHargaTiket(String kelas) {
        double base = hitungHargaTiket();
        return base; 
    }
}

public class Main {
    public static void main(String[] args) {
        Transportasi[] daftar = {
            new Bus("Bus", 40, "Bandung"),
            new Kereta("Kereta", 100, "Surabaya"),
            new Pesawat("Pesawat", 150, "Medan")
        };

        for (Transportasi t : daftar) {
            System.out.println(t.getClass().getSimpleName() + " ke " + t.getTujuan() + " - Harga tiket (default): " + t.hitungHargaTiket());
        }

        System.out.println(new Bus("Bus", 40, "Bandung").hitungHargaTiket("Bisnis"));     // 137500
        System.out.println(new Kereta("Kereta", 100, "Surabaya").hitungHargaTiket("VIP")); // 180000
        System.out.println(new Pesawat("Pesawat", 150, "Medan").hitungHargaTiket("Ekonomi")); // 150000
    }
}
