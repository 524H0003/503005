abstract class CoSoNhaDat {
    String id;
    double dai, rong;

    CoSoNhaDat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    abstract public double giaTri();

    protected double dienTich() {
        return dai * rong;
    }
}

interface PhiKinhDoanh {
    public double phiKinhDoanh();
}

class DatTrong extends CoSoNhaDat {
    DatTrong(double dai, double rong) {
        super(dai, rong);
    }

    @Override
    public double giaTri() {
        return dienTich() * 10000;
    }
}

class NhaO extends CoSoNhaDat {
    private int soLau;

    NhaO(double dai, double rong, int soLau) {
        super(dai, rong);
        this.soLau = soLau;
    }

    @Override
    public double giaTri() {
        return dienTich() * 10000 + soLau * 100000;
    }
}

class KhachSan extends CoSoNhaDat implements PhiKinhDoanh {
    private int soSao;

    KhachSan(double dai, double rong, int soSao) {
        super(dai, rong);
        this.soSao = soSao;
    }

    @Override
    public double giaTri() {
        return 100000 + soSao * 50000;
    }

    @Override
    public double phiKinhDoanh() {
        return rong * 5000;
    }
}

class BietThu extends CoSoNhaDat implements PhiKinhDoanh {
    BietThu(double dai, double rong) {
        super(dai, rong);
    }

    @Override
    public double giaTri() {
        return dienTich() * 400000;
    }

    @Override
    public double phiKinhDoanh() {
        return dienTich() * 1000;
    }
}

