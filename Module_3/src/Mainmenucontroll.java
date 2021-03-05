import java.util.Scanner;

public class Mainmenucontroll {
    public static void showmenu() {
        sach book = new sach();
        dungCuHocTap tool = new dungCuHocTap();
        doChoiTreEm toy = new doChoiTreEm();
        System.out.println("Hệ thống quản lý sản phẩm");
        System.out.println("1.Thêm sản phẩm");
        System.out.println("2.Thêm đơn hàng");
        System.out.println("3.Hiển thị thông tin  sản phẩm");
        System.out.println("4.Hiển thị danh sách đơn hàng");
        System.out.println("5.Tìm kiếm");
        int luachon;
        Scanner sc = new Scanner(System.in);
        do {
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    int lcthem;
                    System.out.println("1.Thêm sách");
                    System.out.println("2.Thêm đồ dùng học tập");
                    System.out.println("3.Thêm đồ chơi trẻ em");
                    System.out.println("4.Back");
                    lcthem = Integer.parseInt(sc.nextLine());
                    switch (lcthem) {
                        case 1:
                            book.ThemMoiSach();
                            book.Ghi();
                            break;
                        case 2:
                            tool.DoDungHocTap();
                            tool.Ghi();
                            break;
                        case 3:
                            toy.ThemMoiDoChoi();
                            toy.Ghi();
                            break;
                        case 4:
                            showmenu();
                    }
                    break;
                case 2:
                    System.out.println("Thêm đơn hàng");
                    break;
                case 3:
                    int lchienthi;
                    System.out.println("1.Hiển thị sách");
                    System.out.println("2.Hiển thị đồ dùng học tập");
                    System.out.println("3.Hiển thị đồ chơi trẻ em");
                    System.out.println("4.Hiển thị các sản phẩm có trong nhà sách");
                    System.out.println("5.Back");
                    lchienthi = Integer.parseInt(sc.nextLine());
                    switch (lchienthi) {
                        case 1:
                            book.hienThiThongTin();
                            break;
                        case 2:
                            tool.hienThiThongTin();
                            break;
                        case 3:
                            toy.hienThiThongTin();
                            break;
                        case 4:
                            showmenu();
                    }
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách đơn hàng");
                    break;
                case 5:
                    int lctimkiem;
                    System.out.println("1.Tìm kiếm sản phẩm theo mã sản phẩm");
                    System.out.println("2.Tìm kiếm đơn hàng theo mã sản phẩm");
                    lctimkiem = Integer.parseInt(sc.nextLine());
                    break;
            }
        } while (luachon != 0);
    }
    public static void main(String[] args) {
        showmenu();
    }


}
