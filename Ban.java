package com.jse.swing;

public class Ban {
	private GradeBean[] grades;
	public Ban() {
		grades = new GradeBean[100];
					//ex. [학생] [반들]
		//추가된가정을 dimension이 올라갔다라고 한다.
		}
		public void setGrades(GradeBean[] grades) {
			this.grades = grades;
		}
		public GradeBean[] getGrades() {
			return grades;
	}
}
