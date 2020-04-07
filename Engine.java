package com.jse.swing;

import java.util.Scanner;

import com.jse.app.Member;


public class Engine {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GradeBean grade = null;
		
	while(true) {
		System.out.println("0.종료   "+ "1.회원가입   " +  "2.로그인   "  + "3.학과점수  ");
//		int flag =sc.nextInt();
		switch(sc.nextInt()) {
		case 0:System.out.println("종료"); return;
		case 1:System.out.println("회원가입을 시작합니다.");
			   System.out.println("아이디입력");
			   String userid = sc.next();
			   break;
//		case 2:System.out.println("반갑습니다!! 회원가입을 실시합니다.");
//			   System.out.println("아이디를 입력해주세요.");
//			   String userid = sc.next();
			   
		case 3: grade = new GradeBean();
				System.out.println("학과점수 결과조회");
				System.out.println("이름을 입력해주세요");
					grade.setName(sc.next());
				System.out.println("과목별 점수를 입력해주세요");
				System.out.println("국어점수");
					grade.setKorean(sc.nextInt());
				System.out.println("영어점수");
					grade.setEnglish(sc.nextInt());
				System.out.println("수학점수");
					grade.setMath(sc.nextInt());
//				int total = grade.total();
//				int average = grade.average();
				String credit = grade.level();
				System.out.println();
				System.out.println(String.format("[%s : 총점 %d점, 평균 %d점, 학점 : %s]"
						,grade.getName(), grade.total(), grade.average(), grade.grade()));
				
				
				
				
				break;
			
			}
		
		}

	}
}
