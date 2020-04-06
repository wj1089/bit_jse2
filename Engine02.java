package com.jse.swing;
import java.util.Scanner;
	public class Engine02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade[] grades = new Grade[2];
		while(true) {
			System.out.println("0. 종료 1.성적표입력 2. 성적표출력");
			switch(scanner.nextInt()) {
				case 0: System.out.println("종료");return;
				case 1: System.out.println("성적표");
				for(int i=0;i<2;i++) {
					grades[i]=input(scanner);
				}
				break;
				case 2: System.out.println("성적표 출력");
				for(int i=0;i<2;i++) {
					Grade grade = grades[i];
					System.out.println(String.format("[%s : 총점 %d점, 평균 %d점, 학점 : %s]",
							grades[i].getName(), 
							grades[i].total(), 
							grades[i].average(), 
							grades[i].grade()));
						}
				break;
				
				case 3:
				System.out.println("총점별로 1,2,3등 이름 나열하기");
				System.out.println(score[i]+"점 : "++);
				
				break;
				}
			}
		}	
		public static Grade input(Scanner scanner) {
			
		Grade grade = new Grade();
			System.out.println("이름을 입력해주세여.");
			grade.setName(scanner.next());
			System.out.println("국어점수를 입력해주세여.");
			grade.setKorean(scanner.nextInt());
			System.out.println("영어점수를 입력해주세여.");
			grade.setEnglish(scanner.nextInt());
			System.out.println("수학점수를 입력해주세여.");
			grade.setMath(scanner.nextInt());
			System.out.println("과학점수를 입력해주세여.");
			grade.setScience(scanner.nextInt());
			return grade;
		}
		public static Grade rank() {
			
		}
		
		
		
		
	}