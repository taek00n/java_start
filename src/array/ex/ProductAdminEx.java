package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxObject = 10;
        int cntObject = 0;
        String[] names = new String[maxObject];
        int[] prices = new int[maxObject];

        while (true) {
            System.out.print("1. 상품등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            if (menu == 1) {
                if (cntObject >= maxObject) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                } else {
                    System.out.print("상품 이름을 입력하세요: ");
                    names[cntObject] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요: ");
                    prices[cntObject] = scanner.nextInt();
                    cntObject++;
                }
            } else if (menu == 2) {
                if (cntObject == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < cntObject; i++) {
                    System.out.println(names[i] + ": " + prices[i]);
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
                continue;
            }
        }
    }
}
