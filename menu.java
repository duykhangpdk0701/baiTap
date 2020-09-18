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
    System.out.println("  a.cac so tu nhien <= N va tong cua chung");
    System.out.println("  b.cac so tu nhien chan <= N va tong cua chung");
    System.out.println("  c.cac so tu nhien le <= N va tong cua chung");
    System.out.println("  d.cac so tu nhien la so nguyen to <= N va tong cua chung");
    System.out.println("  e.N so nguyen to dau tien");
    System.out.println("8.chuong trinh nhap so tu nhien N, nhap N phan tu cua mang a,xuat ket qua");
    System.out.println("  a.cac phan tu cua mang a va tong cua chung");
    System.out.println("  b.cac phan tu chan cua mang a va tong cua chung");
    System.out.println("  c.cac phan tu le cua mang a va tong cua chung");
    System.out.println("  d.them mot phan tu moi vao mang");
    System.out.println("  e.xoa phan tu thu k cua mang");
    System.out
        .println("  g.nhap 1 so x, kiem tra x co trong mang a hay khong, neu co thi tra ve vi tri cua x trong mang a");
    System.out.println("9.chuong trinh nhap chuoi x va xuat ket qua");
    System.out.println("  -do dai cua s");
    System.out.println("  -xoa bo khoang trang thu cua s");
    System.out.println("  -dem so tu cua s va xuat moi tu nam tren 1 dong");
    System.out.println("  -nhap so tu nhien k, xuat k ky tu ben trai cua s, k ky tu ben phai cua s");
    System.out.println("  -nhap so tu nhien k,n xuat n ky tu cua s ke tu vi tri k");
  }

  static int inputChoice() {
    System.out.print("nhap lua chon cua ban: ");
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    str = str.toLowerCase();
    int n = Integer.parseInt(str);
    return n;
  }

  static int inputNuberN() {
    System.out.print("Nhap N: ");
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

  static int inputN() {
    System.out.println("nhap N: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    return n;
  }

  static void program4() {
    int number = inputN();
    System.out.println((number % 2 == 0) ? (number + " la so chan") : (number + " la so le"));
  }

  static void program5() {
    int number = inputN();
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
    for (int i = 2; i <= limit; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  static void program6() {
    int number = inputN();
    System.out.println((primaryNumber(number)) ? (number + " la so nguyen to") : (number + " khong la so nguyen to"));
  }

  static void soTuNhienBeHonNvaTong(int number) {
    int sum = 0;
    System.out.print("cac so tu nhien be hon hoac bang " + number + ": ");
    for (int i = 1; i <= number; i++) {
      System.out.print("  " + i);
      sum += i;
    }
    System.out.println("\ntong nhung so nho hon hoac bang " + number + " la: " + sum);
  }

  static void soTuNhienChanBeHonNvaTong(int number) {
    int sum = 0;
    System.out.print("cac so tu nhien chan be hon hoac bang " + number + ": ");
    for (int i = 1; i <= number; i++) {
      if (i % 2 == 0) {
        System.out.print("  " + i);
        sum += i;
      }
    }
    System.out.println("\ntong nhung so chan nho hon hoac bang " + number + " la: " + sum);
  }

  static void soTuNhienLeBeHonNvaTong(int number) {
    int sum = 0;
    System.out.print("cac so tu nhien le be hon hoac bang " + number + ": ");
    for (int i = 1; i <= number; i++) {
      if (i % 2 != 0) {
        System.out.print("  " + i);
        sum += i;
      }
    }
    System.out.println("\ntong nhung so le nho hon hoac bang " + number + " la: " + sum);
  }

  static void soNguyenToBeHonNvaTong(int number) {
    int sum = 0;
    System.out.print("cac so nguyen to be hon hoac bang " + number + ": ");
    for (int i = 1; i <= number; i++) {
      if (primaryNumber(i)) {
        System.out.print("  " + i);
        sum += i;
      }
    }
    System.out.println("\ntong nhung so nguyen to nho hon hoac bang " + number + " la: " + sum);
  }

  static void NsonguyenToDauTien(int number) {
    int count = 0;
    int i = 1;
    int sum = 0;
    System.out.print(number + " so nguyen to dau tien la: ");
    while (count < number) {
      if (primaryNumber(i)) {
        System.out.print("  " + i);
        sum += i;
        count++;
      }
      i++;
    }
    System.out.println("\ntong " + number + " so nguyen to la: " + sum);
  }

  static void printOption7() {
    System.out.println("7.chuong trinh nhap so tu nhien,xuat ket qua:");
    System.out.println("  a.cac so tu nhien <= N va tong cua chung");
    System.out.println("  b.cac so tu nhien chan <= N va tong cua chung");
    System.out.println("  c.cac so tu nhien le <= N va tong cua chung");
    System.out.println("  d.cac so tu nhien la so nguyen to <= N va tong cua chung");
    System.out.println("  e.N so nguyen to dau tien");
  }

  static void optionProgram7() {

    String choice;
    int number;
    while (true) {
      System.out.println("nhap lua chon cua ban: ");
      Scanner sc = new Scanner(System.in);
      choice = sc.nextLine().toLowerCase();
      if (choice.charAt(0) >= 97 && choice.charAt(0) <= 102 && choice.length() == 1) {
        break;
      }
    }
    switch (choice) {
      case "a":
        number = inputN();
        soTuNhienBeHonNvaTong(number);
        break;
      case "b":
        number = inputN();
        soTuNhienChanBeHonNvaTong(number);
        break;
      case "c":
        number = inputN();
        soTuNhienLeBeHonNvaTong(number);
        break;
      case "d":
        number = inputN();
        soNguyenToBeHonNvaTong(number);
        break;
      case "e":
        number = inputN();
        NsonguyenToDauTien(number);
        break;
      default:
        break;
    }
  }

  static void program7() {
    printOption7();
    optionProgram7();
  }

  static void inputArr(int arr[], int n) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      System.out.print("arr[" + i + "] = ");
      arr[i] = sc.nextInt();
    }
  }

  static void printArr(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("  " + arr[i]);
    }
    System.out.println();
  }

  static void cacPhanTuArrVaTong(int arr[], int n) {
    int sum = 0;
    System.out.print("cac phan tu cua mang la: ");
    for (int i = 0; i < n; i++) {
      System.out.print("  " + arr[i]);
      sum += arr[i];
    }
    System.out.println();
    System.out.println("Tong cac phan tu trong mang la: " + sum);
  }

  static void cacPhanTuChanArrVaTong(int arr[], int n) {
    int sum = 0;
    System.out.print("cac phan tu chan cua mang la: ");
    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 == 0 && arr[i] != 0) {
        System.out.print("  " + arr[i]);
        sum += arr[i];
      }
    }
    System.out.println();
    System.out.println("Tong cac phan tu chan trong mang la: " + sum);
  }

  static void cacPhanTuLeArrVaTong(int arr[], int n) {
    int sum = 0;
    System.out.print("cac phan tu le cua mang la: ");
    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 != 0 && arr[i] != 0) {
        System.out.print("  " + arr[i]);
        sum += arr[i];
      }
    }
    System.out.println();
    System.out.println("Tong cac phan tu le trong mang la: " + sum);
  }

  static int inputK() {
    System.out.println("nhap vi tri k: ");
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    return k;
  }

  static void themPhanTuVaoMan(int arr[], int n, int k, int num) {
    int[] arr2 = new int[n + 1];
    if (k < 0) {
      k = 0;
    } else if (k > n) {
      k = n;
    }
    for (int i = 0, j = 0; j < n + 1; i++, j++) {
      if (j == k) {
        i--;
        arr2[j] = num;
      } else {
        arr2[j] = arr[i];
      }
    }
    n++;
    System.out.print("mang sau khi them la:");
    printArr(arr2, n);
  }

  static void xoaPhanTuThuK(int arr[], int n, int k) {
    if (k < 0) {
      k = 0;
    } else if (k > n) {
      k = n;
    }

    for (int i = k; i < n - 1; i++) {
      arr[i] = arr[i + 1];
    }
    n--;
    System.out.print("mang sau khi xoa la:");
    printArr(arr, n);
  }

  static void printOption8() {
    System.out.println("8.chuong trinh nhap so tu nhien N, nhap N phan tu cua mang a,xuat ket qua");
    System.out.println("  a.cac phan tu cua mang a va tong cua chung");
    System.out.println("  b.cac phan tu chan cua mang a va tong cua chung");
    System.out.println("  c.cac phan tu le cua mang a va tong cua chung");
    System.out.println("  d.them mot phan tu moi vao mang");
    System.out.println("  e.xoa phan tu thu k cua mang");
  }

  static void optionProgram8() {
    int n;
    Scanner sc = new Scanner(System.in);

    String choice;
    while (true) {
      System.out.println("nhap lua chon cua ban: ");
      choice = sc.nextLine().toLowerCase();
      if (choice.charAt(0) >= 97 && choice.charAt(0) <= 102 && choice.length() == 1) {
        break;
      }
    }

    switch (choice) {
      case "a":
        n = inputN();
        int[] arr = new int[n];
        inputArr(arr, n);
        cacPhanTuArrVaTong(arr, n);
        break;
      case "b":
        n = inputN();
        arr = new int[n];
        inputArr(arr, n);
        cacPhanTuChanArrVaTong(arr, n);
        break;
      case "c":
        n = inputN();
        arr = new int[n];
        inputArr(arr, n);
        cacPhanTuLeArrVaTong(arr, n);
        break;
      case "d":
        n = inputN();
        arr = new int[n];
        inputArr(arr, n);
        int k = inputK();
        System.out.println("nhap phan tu ban muon them: ");
        int num = sc.nextInt();
        themPhanTuVaoMan(arr, n, k, num);
        break;
      case "e":
        n = inputN();
        arr = new int[n];
        inputArr(arr, n);
        k = inputK();
        xoaPhanTuThuK(arr, n, k);
        break;
      default:
        break;
    }
  }

  static void program8() {
    printOption8();
    optionProgram8();
  }

  static void printProgram9() {
    System.out.println("9.chuong trinh nhap chuoi x va xuat ket qua");
    System.out.println("  a.do dai cua s");
    System.out.println("  b.xoa bo khoang trang thu cua s");
    System.out.println("  c.dem so tu cua s va xuat moi tu nam tren 1 dong");
    System.out.println("  d.nhap so tu nhien k, xuat k ky tu ben trai cua s, k ky tu ben phai cua s");
    System.out.println("  e.nhap so tu nhien k,n xuat n ky tu cua s ke tu vi tri k");
  }

  static void program9() {

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
      case 7:
        program7();
        break;
      case 8:
        program8();
        break;
      case 9:
        break;
      default:
        break;
    }
  }

  public static void main(String[] args) {
    printMenu();
    int choice;
    while (true) {
      choice = inputChoice();
      if (choice >= 1 && choice <= 9) {
        break;
      }
    }
    option(choice);

    while (true) {
      System.out.println("ban co muon tiep tuc chuong trinh(y/n) ?");
      Scanner sc = new Scanner(System.in);
      String answer = sc.nextLine().toLowerCase();
      if (answer.charAt(0) == 'n') {
        break;
      }
      if (answer.charAt(0) == 'y') {
        printMenu();
        choice = inputChoice();
        option(choice);
      }
    }
  }
}