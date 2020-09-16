import java.util.Scanner;

/**
 * menu
 */
public class menu {

  static void printMenu() {
    System.out.println("-----------------------menu-----------------------");
    System.out.println("1.chuong trinh nhap 2 so nguyen xuat tong, hieu, tich, thuong");
    System.out
        .println("2.chuong trinh nhap chieu dai chieu rong hinh chu nhat, xuat chu vi, dien tich hinh chu nhat do");
    System.out.println("3.chuong trinh nhap ban kinh hinh tron, xuat chu vi, dien tich cua hinh tron do");
    System.out.println("4.chuong trinh nhap so nguyen N, kiem tra va xuat ket qua N la so chan/le");
    System.out.println("5.chuong trinh nhap so nguyen N, kiem tra va xuat ket qua N la so am/duong/zero");
    System.out.println("6.chuong trinh nhap so tu nhien N,kiem tra va xuat ket qua N la so nguyen to hay khong");
    System.out.println("7.chuong trinh nhap so tu nhien,xuat ket qua:");
    System.out.println("  -cac so tu nhien <=N va tong cua chung");
    System.out.println("  -cac so tu nhien chan <= N va tong cua chung");
    System.out.println("  -cac so tu nhien le <= N va tong cua chung");
    System.out.println("  -cac so tu nhien la so nguyen to <= N va tong cua chung");
    System.out.println("  -N so nguyen to dau tien");
    System.out.println("8.chuong trinh nhap so tu nhien N, nhap N phan tu cua mang a,xuat ket qua");
    System.out.println("  -cac phan tu cua mang a va tong cua chung");
    System.out.println("  -cac phan tu chan cua mang a va tong cua chung");
    System.out.println("  -cac phan tu le cua mang a va tong cua chung");
    System.out.println("  -them mot phan tu moi vao mang");
    System.out.println("  -xoa phan tu thu k cua mang");
    System.out
        .println("  -nhap 1 so x, kiem tra x co trong mang a hay khong, neu co thi tra ve vi tri cua x trong mang a");
    System.out.println("9.chuong trinh nhap chuoi x va xuat ket qua");
    System.out.println("  -do dai cua s");
    System.out.println("  -xoa bo khoang trang thu cua s");
    System.out.println("  -dem so tu cua s va xuat moi tu nam tren 1 dong");
    System.out.println("  -nhap so tu nhien k, xuat k ky tu ben trai cua s, k ky tu ben phai cua s");
    System.out.println("  -nhap so tu nhien k,n xuat n ky tu cua s ke tu vi tri k");
  }

  static int inputChoice() {
    System.out.println("nhap lua chon cua ban hoac nhap 0 de thoai khoi chuong trinh:");
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    str = str.toLowerCase();
    int n = Integer.parseInt(str);
    return n;
  }

  static int inputNuberN() {
    System.out.println("Nhap N:");
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    str = str.toLowerCase();
    int n = Integer.parseInt(str);
    return n;
  }

  static void program1() {
    System.out.println("nhap so nguyen a:");
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    System.out.println("nhap so nguyen b:");
    float b = sc.nextFloat();
    System.out.println("tong cua a va b la: " + (a + b));
    System.out.println("hieu cua a va b la: " + (a - b));
    System.out.println("tich cua a va b la: " + (a * b));
    System.out.println("thuong cua a ba b la: " + (a / b));
  }

  static void program2() {
    System.out.println("nhap chieu dai:");
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    System.out.println("nhap chieu rong");
    float b = sc.nextFloat();
    System.out.println("chu vi hinh chu nhat la: " + ((a + b) * 2));
    System.out.println("dien tich hinh chu nhat la: " + (a * b));
  }

  static void program3() {
    System.out.println("nhap ban kinh hinh tron:");
    Scanner sc = new Scanner(System.in);
    float r = sc.nextFloat();
    System.out.println("chu vi hinh tron la: " + (r * 2 * Math.PI));
    System.out.println("dien tich hinh tron la: " + (Math.pow(r, 2) * Math.PI));
  }

  static float inputN() {
    System.out.println("nhap N: ");
    Scanner sc = new Scanner(System.in);
    float n = sc.nextFloat();
    return n;
  }

  static void program4() {
    float number = inputN();
    System.out.println((number % 2 == 0) ? (number + " la so chan") : (number + " la so le"));
  }

  static void program5() {
    float number = inputN();
    if (number == 0) {
      System.out.println(number + " la zero");
    } else if (number < 0) {
      System.out.println("N la so am");
    } else {
      System.out.println("N la so duong");
    }
  }

  static boolean primaryNumber(float num) {
    double limit = Math.sqrt(num);
    for (int i = 2; i < limit; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  static void program6() {
    float number = inputN();
    System.out.println((primaryNumber(number)) ? (number + " la so nguyen to") : (number + " khong la so nguyen to"));
  }

  static void option(int choice) {
    switch (choice) {
      case 1:
        program1();
        break;
      case 2:
        program2();
        break;
      case 3:
        program3();
        break;
      case 4:
        program4();
        break;
      case 5:
        program5();
        break;
      case 6:
        program6();
        break;
      default:
        break;
    }
  }

  public static void main(String[] args) {
    printMenu();
    int result = inputChoice();
    option(result);
    while (true) {
      System.out.println("ban co muon tiep tuc chuong trinh(y/n)?");
      Scanner sc = new Scanner(System.in);
      String answer = sc.nextLine();
      if (true) {
        break;
      }
      printMenu();
    }
  }
}