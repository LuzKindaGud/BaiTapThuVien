import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThuVien thuVien = null;

        while (true) {
            System.out.println("============ MENU ============");
            System.out.println("|1. Tạo thư viện mới         |");
            System.out.println("|2. Thêm sách vào thư viện   |");
            System.out.println("|3. Xóa sách khỏi thư viện   |");
            System.out.println("|4. Tìm kiếm sách            |");
            System.out.println("|5. Hiển thị danh sách sách  |");
            System.out.println("|6. Xuất thông tin thư viện  |");
            System.out.println("|0. Thoát                    |");
            System.out.println("==============================");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã thư viện: ");
                    int maThuVien = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng mới
                    System.out.print("Nhập tên thư viện: ");
                    String tenThuVien = scanner.nextLine();
                    System.out.print("Nhập sức chứa thư viện: ");
                    int sucChua = scanner.nextInt();
                    thuVien = new ThuVien(maThuVien, tenThuVien, sucChua);
                    System.out.println("Thư viện đã được tạo thành công!");
                    break;

                case 2:
                    if (thuVien == null) {
                        System.out.println("Vui lòng tạo thư viện trước!");
                        break;
                    }
                    System.out.print("Nhập mã sách: ");
                    int maSach = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng mới
                    System.out.print("Nhập tiêu đề sách: ");
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhập tác giả sách: ");
                    String tacGia = scanner.nextLine();
                    System.out.print("Nhập thể loại sách: ");
                    String theLoai = scanner.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int namXuatBan = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng mới
                    System.out.print("Nhập trạng thái sách (Đang mượn/Sẵn sàng): ");
                    String trangThai = scanner.nextLine();
                    Sach sach = new Sach(maSach, tieuDe, tacGia, theLoai, namXuatBan, trangThai);
                    thuVien.themSach(sach);
                    System.out.println("Sách đã được thêm vào thư viện!");
                    break;

                case 3:
                    if (thuVien == null) {
                        System.out.println("Vui lòng tạo thư viện trước!");
                        break;
                    }
                    System.out.print("Nhập mã sách cần xóa: ");
                    int maSachXoa = scanner.nextInt();
                    thuVien.xoaSach(maSachXoa);
                    System.out.println("Sách đã được xóa khỏi thư viện!");
                    break;

                case 4:
                    if (thuVien == null) {
                        System.out.println("Vui lòng tạo thư viện trước!");
                        break;
                    }
                    System.out.print("Nhập từ khóa tìm kiếm (tiêu đề hoặc tác giả): ");
                    String tuKhoa = scanner.nextLine();
                    Sach[] ketQuaTimKiem = thuVien.timKiemSach(tuKhoa);
                    if (ketQuaTimKiem.length > 0) {
                        System.out.println("Kết quả tìm kiếm:");
                        for (Sach s : ketQuaTimKiem) {
                            System.out.println(s);
                        }
                    } else {
                        System.out.println("Không tìm thấy sách nào.");
                    }
                    break;

                case 5:
                    if (thuVien == null) {
                        System.out.println("Vui lòng tạo thư viện trước!");
                        break;
                    }
                    System.out.println("Danh sách sách trong thư viện:");
                    thuVien.hienThiSach();
                    break;

                case 6:
                    if (thuVien == null) {
                        System.out.println("Vui lòng tạo thư viện trước!");
                        break;
                    }
                    System.out.println(thuVien);
                    break;


                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
