package com.practice.controller;

import java.util.Scanner;

public class ArrayPractice {

    //Practice1
    public void practice1() {
        int[] ary = new int[10];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = i + 1;
            System.out.print(" " + ary[i]);
        }
    }

    //Practice2
    public void practice2() {
        int[] ary = new int[10];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = i + 1;
        }
        for (int i = ary.length - 1; i >= 0; i--) {
            System.out.print(ary[i] + " ");
        }
    }

    //Practice3
    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수:");
        int num = sc.nextInt();

        int[] ary = new int[num];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = i + 1;
            System.out.print(" " + ary[i]);
        }
    }

    //Practice4
    public void practice4() {
        String[] ary = {"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(ary[1]);
    }

    //Practice5
    public void practice5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열:");
        String str = sc.nextLine();

        char cc = sc.next().charAt(0);
        System.out.print("문자:");
        char[] ch = new char[str.length()];
        int sum = 0;

        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
            if (ch[i] == cc) {
                sum++;
            }
        }
        System.out.println(cc + "의 개수:" + sum);
    }

    //Practice6
    public void practice6() {
        Scanner sc = new Scanner(System.in);
        String str[] = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        System.out.print("0~6 사이 숫자 입력:");
        int num = sc.nextInt();
        if (num >= 0 && num <= 6) {
            System.out.println(str[num]);
        } else System.out.println("잘못 입력하였습니다.");
    }

    //Practice7
    public void practice7() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수:");
        int num = sc.nextInt();
        int[] ary = new int[num];
        int sum = 0;

        for (int i = 0; i < ary.length; i++) {
            System.out.print("배열" + i + "번째 인덱스에 넣을 값:");
            ary[i] = sc.nextInt();
            sum += ary[i];
        }

        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println("총 합:" + sum);
    }

    //Practice8
    public void practice8() {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("정수: ");
            num = sc.nextInt();

            if (num >= 3 && num % 2 == 1) {
                break;
            }
            System.out.println("다시 입력하세요");
        }

        int[] ary = new int[num];

        for (int i = 0; i < num; i++) {
            if (i <= num / 2) {
                ary[i] = i + 1;
            } else {
                ary[i] = num - i;
            }
        }


        for (int i = 0; i < num; i++) {
            System.out.print(ary[i]);
            if (i != num - 1) {
                System.out.print(",");
            }
        }
    }


    //Practice9
    public void practice9() {
        Scanner sc = new Scanner(System.in);
        String str[] = {"양념", "불닭", "간장", "후라이드"};
        boolean a = false;

        System.out.print("치킨 이름을 입력하세요:");
        String st = sc.nextLine();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(st)) {
                a = true;
                break;
            }
        }
        if (a) {
            System.out.println(st + " 배달 가능");
        } else System.out.println(st + " 은 없는 메뉴입니다.");
    }

    //Practice10
    public void practice10() {
        Scanner sc = new Scanner(System.in);

        int[] ary = new int[10];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = (int) (Math.random() * ary.length);
            System.out.print(" " + ary[i]);
        }
    }


    //Practice11
    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호(-포함): ");
        String bornNum = sc.next();
        char copy[] = new char[bornNum.length()];

        for (int i = 0; i < bornNum.length(); i++) {
            copy[i] = bornNum.charAt(i);
        }
        for (int i = 8; i < copy.length; i++) { //인덱스는 0부터 시작이므로 7번째부터 *로 변경
            copy[i] = '*';
        }
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]);
        }

    }
}
