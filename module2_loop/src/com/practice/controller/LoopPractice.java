package com.practice.controller;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopPractice {

    //Practice1
    public void practice1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num>=1){
            for (int i = 1; i <= num; i++) {
                System.out.print(i+" ");
            }
        }else{
            System.out.println("잘못 입력하였습니다.");
        }
    }


    //Practice2
    public void practice2() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1이상의 숫자를 입력하세요.");
            int num = sc.nextInt();
            if (num>0) {
                for (int i = 1; i <= num; i++) {
                    System.out.print(i + " ");
                }
                break;
            }else{
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }
        }
    }

    //Practice3
    public void practice3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("1이상의 숫자를 입력해주세요");
        int num = sc.nextInt();
        if (num>0) {
            for (int i = num; i>=1; i--) {
                System.out.print(i+" ");}
        }else System.out.println("잘못 입력하였습니다.");
    }

    //Practice4
    public void practice4() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1이상의 숫자를 입력해주세요");
            int num = sc.nextInt();
            if (num > 0) {
                for (int i = num; i >= 1; i--) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.println("잘못 입력하였습니다.");
                continue;
            }
        }
    }

    //Practice5
    public void practice5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요:");
        int sum = 0;
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i<num) {
                System.out.print(i + "+");
                sum += i;
            }
            else {
                System.out.print(i + "=");
                sum += i;
            }
        }
        System.out.println(sum);
    }

    //Practice6//서정림
    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자:");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자:");
        int num2 = sc.nextInt();


        if (num1<0|num2<0){
            System.out.println("1 이상의 숫자만을 입력해주세요.");
        }

        if (num1>num2) {
            int i = num1;
            num1 = num2;
            num2 = i;
        }

        for (int j = num1;j<=num2;j++) {
            System.out.print(j+" ");
        }
    }

    //Practice7
    public void practice7() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("첫 번째 숫자: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자: ");
            int num2 = sc.nextInt();

            if (num1 > 0 && num2 > 0) {

                if (num1 > num2) {
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }

                for (int j = num1; j <= num2; j++) {
                    System.out.print(j + " ");
                }

                break;

            } else {
                System.out.println("1 이상의 숫자만을 입력해주세요.");
            }
        }
    }

    //Practice8
    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자:");
        int num = sc.nextInt();
        System.out.println("====="+num +"단====");

        for (int i = 1; i <10; i++) {
            int j = num*i;
            System.out.println(num+"*"+i+"="+j);
        }
    }

    //Practice9
    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자:");
        int num = sc.nextInt();

        if (num >= 2 && num < 10) {
            while (num < 10) {
                System.out.println("====" + num + "단====");
                for (int i = 1; i < 10; i++) {
                    int num1 = num * i;
                    System.out.println(num + "*" + i + "=" + num1);
                }
                num++;
            }
        }else System.out.println("2~9 사이의 숫자만 입력해주세요.");
    }

    //Practice10
    public void practice10() {

        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {

            System.out.print("숫자: ");
            num = sc.nextInt();

            if (num >= 2 && num <= 9) {
                break;  // 정상 입력 → 반복 종료
            }

            System.out.println("2~9사이의 숫자를 입력해주세요.");
        }

        while (num <= 9) {

            System.out.println("==== " + num + "단 ====");

            for (int i = 1; i <= 9; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }

            num++;
        }
    }

    //Practice11
    private void practice11() {

        System.out.println("//입력");

        Scanner sc = new Scanner(System.in);
        System.out.println("시작 숫자: ");
        int num1 = sc.nextInt();

        System.out.println("공차: ");
        int num2 = sc.nextInt();

        System.out.println("//출력");

        int num = num1;
        for (int i = 0; i < 10; i++) {
            System.out.println(num);
            num = num + num2;

        }
    }

    //Practice12
    public void practice12() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("연산자(+, -, *, /, %) : ");
            String op = sc.nextLine();

            if (op.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !op.equals("%")) {
                System.out.println("없는 연산자입니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("정수1 : ");
            int num1 = sc.nextInt();

            System.out.print("정수2 : ");
            int num2 = sc.nextInt();
            sc.nextLine();

            if (op.equals("/") && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                continue;
            }

            int result = 0;

            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "%":
                    result = num1 % num2;
                    break;
            }

            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }
    }

    //Practice13
    public void practice13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열:");
        String str = sc.nextLine();
        System.out.print("찾고자하는 문자:");
        String str1 = sc.nextLine();

        int sum =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==str1.charAt(0)){
                sum++;
            }
        }
        System.out.print("포함된 갯수:"+sum);
    }


    //Practice14
    public void practice14() {
        int i = 1;
        int sum = 0;
        while (sum < 10000) {
            sum+=70;
            System.out.println(i+"회 모금액:" +sum+"원");
            i++;
        }
        System.out.println("총 모금 횟수:"+i+"회");
    }
}
