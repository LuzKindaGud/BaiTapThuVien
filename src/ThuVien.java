public class ThuVien implements QuanLySach {
    private int maThuVien;
    private String tenThuVien;
    private Sach[] danhSachSach;
    private int soLuongSach; // Số lượng sách hiện có

    public ThuVien(int maThuVien, String tenThuVien, int max) {
        this.maThuVien = maThuVien;
        this.tenThuVien = tenThuVien;
        this.danhSachSach = new Sach[max]; //max cuốn sách có thể chứa :v
        this.soLuongSach = 0;
    }

    public int getMaThuVien() {
        return maThuVien;
    }

    public void setMaThuVien(int maThuVien) {
        this.maThuVien = maThuVien;
    }

    public String getTenThuVien() {
        return tenThuVien;
    }

    public void setTenThuVien(String tenThuVien) {
        this.tenThuVien = tenThuVien;
    }

    public int getSoLuongSach() {
        return soLuongSach;
    }

    public void setSoLuongSach(int soLuongSach) {
        this.soLuongSach = soLuongSach;
    }

    public Sach[] getDanhSachSach() {
        return danhSachSach;
    }

    public void setDanhSachSach(Sach[] danhSachSach) {
        this.danhSachSach = danhSachSach;
    }

    @Override
    public void themSach(Sach sach) {
        if (soLuongSach < danhSachSach.length) {
            danhSachSach[soLuongSach] = sach;
            soLuongSach++;
        } else {
            System.out.println("Không thể thêm sách, tủ sách đầy quá ông ơi!.");
        }
    }

    @Override
    public void xoaSach(int maSach) {
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getMaSach() == maSach) {
                for (int j = i; j < soLuongSach - 1; j++) {
                    danhSachSach[j] = danhSachSach[j + 1];
                }
                danhSachSach[soLuongSach - 1] = null;
                soLuongSach--;
                return;
            }
        }
        System.out.println("Không tìm thấy sách với ID: " + maSach);
    }

    @Override
    public Sach[] timKiemSach(String tuKhoa) {
        Sach[] ketQua = new Sach[soLuongSach];
        int soLuongKetQua = 0;

        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getTieuDe().contains(tuKhoa) || danhSachSach[i].getTacGia().contains(tuKhoa)) {
                ketQua[soLuongKetQua] = danhSachSach[i];
                soLuongKetQua++;
            }
        }

        Sach[] ketQuaCuoiCung = new Sach[soLuongKetQua];
        System.arraycopy(ketQua, 0, ketQuaCuoiCung, 0, soLuongKetQua);
        return ketQuaCuoiCung;
    }

    @Override
    public void hienThiSach() {
        for (int i = 0; i < soLuongSach; i++) {
            System.out.println(danhSachSach[i]);
        }
    }

    @Override
    public String toString() {
        return "Thư viện[" +
                "Mã Thư Viện:" + maThuVien +
                ", Tên:'" + tenThuVien + '\'' +
                ", Tổng Số Sách:'" + soLuongSach +
                "]";
    }
}