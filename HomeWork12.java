import java.util.*;

abstract class DienGiaDung {
    protected String ma;
    protected String ten;
    protected int giaNhap;
    protected int congSuat;

    public DienGiaDung() {
        this("TB001", "Thiet bi 1", 2000, 120);
    }

    public DienGiaDung(String ma, String ten, int giaNhap, int congSuat) {
        this.ma = ma;
        this.ten = ten;
        this.giaNhap = giaNhap;
        this.congSuat = congSuat;
    }

    abstract public int giaBan();

    @Override
    public String toString() {
        return ma+" - "+ten+" - "+giaNhap+" - "+congSuat+" - "+giaBan();
    }
}

class QuatDien extends DienGiaDung {
    private int soMucTocDo = 3;
    private boolean phunHoiNuoc = true;

    public QuatDien() {
        super("QD1", "Quat dung", 1000, 240);
    }

    public QuatDien(String ma, String ten, int giaNhap, int congSuat, int soMucTocDo, boolean phunHoiNuoc) {
        super(ma, ten, giaNhap, congSuat);
        if ((soMucTocDo >= 2) && (soMucTocDo <= 5))
            this.soMucTocDo = soMucTocDo;
        this.phunHoiNuoc = phunHoiNuoc;
    }

    @Override
    public String toString() {
        return super.toString()+" - "+soMucTocDo+" - "+(phunHoiNuoc ? "Co" : "Khong")+" the phun hoi nuoc";
    }

    public int giaBan() {
        return giaNhap * 2 + (phunHoiNuoc ? 150 : 0);
    }
}

public class HomeWork12 {
    public static void main(String argv[]) {
        ArrayList<DienGiaDung> arr = new ArrayList<>();

        arr.add(new QuatDien());
        arr.add(new QuatDien("dafa", "eqre", 934, 11, 4, false));
        arr.add(new QuatDien("dafa", "eqrelewjbqlrq", 9353434, 11, 5, false));
        arr.add(new QuatDien("ewoiqur", "eqre", 934, 11, 4333, true));
        arr.add(new QuatDien("dafa", "dsapuhweqr", 9344324, 11, 4111, false));

        arr.sort((a, b) -> { return a.giaBan() < b.giaBan() ? 1 : -1; });

        System.out.println(arr.get(0));
    }
}