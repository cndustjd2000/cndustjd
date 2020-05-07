package com.human.ex;

import java.util.Scanner;

class WordEx1 extends Word1{
	//영어 단어 연습
	public void ex1() {
		Scanner scan=new Scanner(System.in);
		String [] word=new String [10];
		
		word[0]="angular";
		word[1]="electrify";
		word[2]="pleasant";
		word[3]="potent";
		word[4]="component";
		word[5]="valuable";
		word[6]="bless";
		word[7]="distance";
		word[8]="explore";
		word[9]="politics";		
				
		for(int i=0;i<word.length;i++) {
			
			System.out.println(word[i]);
			String input1 =scan.nextLine();
			
			if(input1.equals(word[i])) {
				System.out.println("맞습니다.");
				System.out.println("");
				Word1.Count++;
			}else {
				System.out.println("틀렸습니다.");
				System.out.println("");
			}
			
		}
		System.out.println("총 문제 : "+word.length);
	}
}

class WordEx2 extends Word1{
	//문장연습
		public void ex2() {
			Scanner scan=new Scanner(System.in);
			String [] word=new String [10];
			
			word[0]="I can hear my baby crying.";
			word[1]="The dress that her sister made makes her smile.";
			word[2]="I have just finished it.";
			word[3]="She had to eat anything to stay alive.";
			word[4]=" Who can believe it?";
			word[5]="When do we go?";
			word[6]="Where do you come from?";
			word[7]="What will you have?";
			word[8]="Why do I get blamed?";
			word[9]="How are you holding up?";
					
			for(int i=0;i<word.length;i++) {
				
				System.out.println(word[i]);
				String input1 =scan.nextLine();
				
				if(input1.equals(word[i])) {
					System.out.println("맞습니다.");
					System.out.println("");
					Word1.Count++;
				}else {
					System.out.println("틀렸습니다.");
					System.out.println("");
				}
			}
			System.out.println("총 문제 : "+word.length);
		}
}

public class Word1 {	
	public static int Count=0;
	
	//정답 맞춘 횟수
	public void count() {
		System.out.println("정답횟수 : "+Word1.Count);
	}
	
	//메뉴-1
	public void menu1 () {
		WordEx1 word=new WordEx1();
		System.out.println("영어 단어 연습을 선택하셨습니다.");
		System.out.println("영어 단어 연습을 시작합니다.");
		
		long start=System.currentTimeMillis();
		
		word.ex1();//영어 단어 연습
		long end=System.currentTimeMillis();
		System.out.println("걸린 시간 : "+(end-start)/1000.0+"초");
		
		word.count();
		System.out.println("");
	}
	
	//메뉴-2
	public void menu2() {
		WordEx2 word=new WordEx2();
		System.out.println("영어 문장 연습을 선택하셨습니다.");
		System.out.println("영어 문장 연습을 시작합니다.");
		
		long start=System.currentTimeMillis();				
		word.ex2();//영어 문장 연습
		long end=System.currentTimeMillis();
		System.out.println("걸린 시간 : "+(end-start)/1000.0+"초");
		
		word.count();
		System.out.println("");
	}
	
	//메뉴
	public void menu() {
		
		Word1 word=new Word1();		
		
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		
		while(flag) {
			System.out.println("원하는 메뉴를 선택하세요.");
			System.out.println("1.영어 단어 연습  2. 영어 문장 연습  3.종료");
			String input=sc.nextLine();
			
			switch(input) {
			
			case "1":
				word.menu1();
				break;
				
			case "2":
				word.menu2();
				break;
				
			case "3":
				System.out.println("종료를 선택하셨습니다.");
				System.out.println("시스템을 종료합니다.");
				flag=false;
				break;
				
			default:
				System.out.println("잘못된 선택을 하셨습니다.");
				System.out.println("다시 선택해주세요.");
				System.out.println("");				
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Word1 word=new Word1();
		word.menu();
		
		
	}

}
