abstract class DichVuLuuTru {
    protected String viTri;
    protected double giaCoBan;

    public DichVuLuuTru(String viTri, double giaCoBan) {
        this.viTri = viTri;
        this.giaCoBan = giaCoBan;
    }

    public double tinhThue() {
        switch (viTri.toLowerCase()) {
            case "vung tau":
            case "nha trang":
                return 0.1;

            default:
                return 0.05;
        }
    }

    abstract public double tinhGiaThueCoBan();
}

class KhachSan extends DichVuLuuTru {
    private String tenKS;
    private int soSao;

    public KhachSan(String viTri, double giaCoBan, String tenKS, int soSao) {
        super(viTri, giaCoBan);
        this.tenKS = tenKS;
        this.soSao = soSao;
    }

    public double tinhGiaThueCoBan() {
        return giaCoBan * (soSao < 3 ? 1 : 1.1) * (1 + tinhThue());
    }
}

class Villa extends DichVuLuuTru {
    private String tenVilla;
    private int soPhongNgu;

    public Villa(String viTri, double giaCoBan, String tenVilla, int soPhongNgu) {
        super(viTri, giaCoBan);
        this.tenVilla = tenVilla;
        this.soPhongNgu = soPhongNgu;
    }

    public double tinhGiaThueCoBan() {
        if (soPhongNgu <= 2)
            return giaCoBan + 3000000;
        if (soPhongNgu <= 5)
            return giaCoBan + 3000000 + (soPhongNgu - 2) * 2000000;
        return giaCoBan + 3000000 + (soPhongNgu - 2) * 2000000 + (soPhongNgu - 5) * 1000000;
    }
}