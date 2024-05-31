package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 3명 학생 정보 기록 객체 배열 할당
        StudentDTO[] students = new StudentDTO[3];
        // 정보 초기화
        students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        // 정보 출력 (향상된 for문 이용)
        for (StudentDTO s : students) {
            System.out.println(s.information());
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        Scanner sc6 = new Scanner(System.in);
        Scanner sc7 = new Scanner(System.in);

        // 최대 10명 사원 정보 기록할 수 있는 배열 할당
        EmployeeDTO employeeDTO = new EmployeeDTO();
        EmployeeDTO[] employees = new EmployeeDTO[10];
        // 사원들의 정보 입력받기 (while문 사용)
        int count = 0;
        String again = "";
        System.out.println("========== 사원 정보 등록하기 ==========");
        do {
            System.out.print("이름을 입력해주세요 : ");
            String name = sc.nextLine();
            System.out.print("나이를 입력해주세요 : ");
            int age = sc2.nextInt();
            System.out.print("신장을 입력해주세요 : ");
            double height = sc3.nextDouble();
            System.out.print("몸무게를 입력해주세요 : ");
            double weight = sc4.nextDouble();
            System.out.print("급여를 입력해주세요 : ");
            int salary = sc5.nextInt();
            System.out.print("부서를 입력해주세요 : ");
            String dept = sc6.nextLine();
            employees[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;
            System.out.println(count + "번째로 정보가 추가되었습니다.");
            System.out.print("추가하시려면 'y'를, 종료하시려면 'n'을 입력하세요 : ");
            again = sc7.nextLine();
            switch (again) {
                case "y":
                    break;
                case "n":
                    break;
                default:
                    for (; !(again.equals("y") || again.equals("n")); ) {
                        System.out.print("잘못 입력하셨습니다. 다시 입력해주세요 : ");
                        again = sc7.nextLine();
                    }
            }
        } while (!again.equals("n"));

        System.out.println("========== 등록된 사원 정보 조회 ==========");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].information());
        }
    }
}
