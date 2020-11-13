package controller;

import java.util.Scanner;

import model.Tamagochi;

public class Controller {
	Scanner sc = new Scanner(System.in);
	Tamagochi go = new Tamagochi();
		
	
	public void birth() { //이름 지어주기,
	    System.out.print("다마고치 이름 지어주세요(수정불가) : ");
	   	String name = sc.next();
	   	go.setName(name);
	   	System.out.println("＊*＊+＊*＊＊*＊+＊*＊＊*＊+＊*＊");
	}

	public String getName() {
		return go.getName();
	}
	//레벨마다 보이는 메뉴가 다르다
	public void eat() throws InterruptedException { //고른 걸로 보내기 포만감 추가 , 포인트 차감 
		//돈없으면 메뉴 안 보여주기 
		if(go.getPoint() < 50) { 
			System.out.println("에휴 돈이 없네 굶어야지 ㅠㅁㅠ");
			Thread.sleep(800);
			return;
		}else { //레벨마다 메뉴 다르게 보여주기 
			System.out.println("`레벨을 늘리면 더 많아요`");
			System.out.println("포인트가 없어도 메뉴가 안 보여요.");
			Thread.sleep(1000);
			System.out.println("1.이유식(-50p)(+1) ");
			System.out.println("2.라면(-50p)(+1)");
			if(go.getLevel()>=1 && go.getPoint()>=80) {
				System.out.println("3.3첩반상(-80p)(+3)");
				if(go.getLevel()>=2&& go.getPoint()>=100) {
					System.out.println("4.돈까스(-100p)(+4)");
					if(go.getLevel()==3&& go.getPoint()>=150)
						System.out.println("5.코스요리(-150p)(+10)");
				}}
			}
			

		System.out.println("6.안 먹어");
		System.out.print("::");
		int select = sc.nextInt();
		
		int fullfeel = 0,point=0;
		//음식별로 포만감,포인트 달라짐 
		if(select==1||select==2) {
			go.setFeelFull(go.getFeelFull()+1); 
			go.setPoint(go.getPoint()-50); 
			fullfeel = 1;
			point = -50;
		}else if(select ==3){
			go.setFeelFull(go.getFeelFull()+3); 
			go.setPoint(go.getPoint()-80);
			fullfeel = 3;
			point = -80;
		
		}else if(select ==4){
			go.setFeelFull(go.getFeelFull()+4);
			go.setPoint(go.getPoint()-100);		
			fullfeel = 4;			
			point = -100;
		
		}else if(select ==5){
			go.setFeelFull(go.getFeelFull()+10); 
			go.setPoint(go.getPoint()-150);	
			fullfeel = 10;
			point = -150;
		}else return;
		
		//밥 먹을때마다 경험치 올려주기 
		go.setExperience(go.getExperience()+1);
		go.setLove(go.getLove()+1);
		
		//음식마다 다른 값들 받아와서 마지막에 출력해주기 
		System.out.println("______________________________________");
		System.out.print("|포만감 +"+fullfeel+"!");
		Thread.sleep(800);
		System.out.print("애정♥ +1!");
		Thread.sleep(800);
		System.out.print("포인트$ "+point+"!");
		Thread.sleep(800);
		System.out.println("경험치  +1! |");
		Thread.sleep(800);
		
		
		//멘트 
		System.out.println("냠냠굿~주인님＊*＊º");
		Thread.sleep(500);
		System.out.println("            º");
		System.out.println("         º");

	}

	public void takeShower() throws InterruptedException {
		go.setExperience(go.getExperience()+1);
		go.setLove(go.getLove()+1);	
		System.out.println("_________________");
		System.out.print("| 경험+1! ");
		Thread.sleep(800);
		System.out.println("애정+1! |");
		Thread.sleep(800);
	}

	public String check() {
		return "=="+go.getName()+"의 상태=="+
			"\nLv."+go.getLevel()+"/3"+
			"\n애정도 ♡:"+go.getLove()+"/10"+
			"\n포만감 :"+go.getFeelFull()+"/10"+
			"\nPOINT : "+go.getPoint()+
			"\n경험치 : "+go.getExperience();
	}

	public void sleep() throws InterruptedException {
		//값 올려주기 
		go.setExperience(go.getExperience()+1);
		go.setFeelFull(go.getFeelFull()-1);
		go.setPoint(go.getPoint()+20);
		go.setLove(go.getLove()-1);
		Thread.sleep(500);
		//정보 알려주기 
		System.out.println("__________________________________");
		System.out.print("| 경험+1!");
		Thread.sleep(800);
		System.out.print(" 포만감-1");
		Thread.sleep(800);
		System.out.print("포인트+20! ");
		Thread.sleep(800);
		System.out.println("애정 -1! |");
		
		
	}

	public void takeAWalk() throws InterruptedException {
		//값 수정하기 
		go.setFeelFull(go.getFeelFull()-1);
		go.setExperience(go.getExperience()+2);
		go.setPoint(go.getPoint()+30);
		go.setLove(go.getLove()+1);
		//정보 알려주기 
		System.out.println("____________________________________");
		System.out.print("| 경험+2!");
		Thread.sleep(800);
		System.out.print(" 포만감-1!");
		Thread.sleep(800);
		System.out.print(" 포인트+30!");
		Thread.sleep(800);
		System.out.println(" 애정+1! |");
		Thread.sleep(500);
		
	}

	//레벨마다 다마고치 크기 키워주기 
	public void Tamagochi() throws InterruptedException {
		if(go.getLevel() == 0) {
			System.out.println("     ___  ");
			Thread.sleep(300);
			System.out.println("    /_ _\\  ");
			Thread.sleep(300);
			System.out.println("   |  ○  | ");	
			Thread.sleep(300);
			System.out.println("    \\___/ ");
			Thread.sleep(300);
		
		}else if(go.getLevel() == 1) {
		
			System.out.println("  \" ___  \"");	
			Thread.sleep(300);
			System.out.println("\"  /= =\\  \"");
			Thread.sleep(300);
			System.out.println(" \\|  ▼  |/");		
			Thread.sleep(300);
			System.out.println("   \\___/");
			Thread.sleep(300);
		}
		else if(go.getLevel() == 2) {
			System.out.println("    ___  ");
			Thread.sleep(300);
			System.out.println(" ♥ /● ●\\ ♥");	
			Thread.sleep(300);
			System.out.println(" \\|  ▼  |/");
			Thread.sleep(300);
			System.out.println("   \\___/");
			Thread.sleep(300);
			System.out.println("    W W");
			Thread.sleep(300);
		
		
		}else if(go.getLevel() == 3) {
			System.out.println("   _■■■  ♪");	
			Thread.sleep(300);
			System.out.println("  ♬  /> <\\  ");		
			Thread.sleep(300);
			System.out.println(" \\|  ▼  |/");		
			Thread.sleep(300);
			System.out.println("   \\___/");
			Thread.sleep(300);
			System.out.println("  ♥_| |_♥");
			Thread.sleep(300);
		}
		
	}

	

}
