package com.jse.swing;

public class Group {
	
	private MemberBean[] members;
	//이런식으로 no!
	//private Member[] members = new Member[10]; 필드를 초기화(=)하면 안된다!!
	
	public Group() {
		members = new MemberBean[10];
	}
	
	
	
	
}
