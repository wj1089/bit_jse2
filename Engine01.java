package com.jse.swing;

import java.util.Scanner;

public class Engine01 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Grade[] grades = new Grade[2]; 
			//쓰는 이유 배열을 쓰는이유가 똑같은 곳에 저장할때 정보가 날라가는걸 방지
	//		Grade[] score = null; 
			//한번정보를 입력받으면 다시  null상태가 되면서 정보가 사라진다.
			while(true) {
				System.out.println("0.종료   1.성적표입력  2.성적표출력 ");
			switch(scanner.nextInt()) {
			case 0:System.out.println("종료");return;
			case 1:System.out.println("성적표입력");
	//			score = new Grade[3];
				for(int i=0;i<2;i++) {
//					input(grade,scanner);//아규멘트
					grades[i]=input(scanner);
			}
			 break;
			case 2:
				System.out.println("성적표출력");
				for(int i=0;i<2;i++) {
					Grade grade = grades[i];
					System.out.println(String.format("[%s : 총점 %d점, 평균 %d점, 학점 : %s]",
					grade.getName(), grade.total(), grade.average(), grade.grade()));
				}
				break;
		}
	}
	
}
	static Grade input(Scanner scanner){//파라미터
			Grade grade = new Grade();
			System.out.println("학과점수 결과조회");
			System.out.println("이름을 입력해주세요");
				grade.setName(scanner.next());
			System.out.println("과목별 점수를 입력해주세요");
			System.out.println("국어점수");
				grade.setKorean(scanner.nextInt());
			System.out.println("영어점수");
				grade.setEnglish(scanner.nextInt());
			System.out.println("수학점수");
				grade.setMath(scanner.nextInt());
			String credit = grade.level();
			System.out.println();
//			System.out.println(String.format("[%s : 총점 %d점, 평균 %d점, 학점 : %s]"
//					,grade.getName(), grade.total(), grade.average(), grade.grade()));
			return grade;
			
			
	}
}
