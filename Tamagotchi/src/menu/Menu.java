package menu;

import java.util.Scanner;

import controller.Controller;
import model.Tamagochi;

public class Menu {
	Scanner sc = new Scanner(System.in);
	Controller c = new Controller();
	
	public Menu() {
		
	}
	
	public void FirstMenu() throws InterruptedException {
	
		System.out.println("+＊*＊( '▽') ＊*＊");
		Thread.sleep(500);
		System.out.println("*  다마고치 키우기  *");
		Thread.sleep(500);
		System.out.println("+＊*＊( '▽') ＊*＊\n");
		Thread.sleep(500);
		System.out.println("1.다마고치 생성 ");
		System.out.println("0.다마고치랑 헤어지기");
		System.out.print("골라주세요 :");
		int select = sc.nextInt();
		
		switch (select) {
		case 1:  c.birth();
				 check();
				 playWithTama();
			break;

		default:System.out.println("안녕~");
			break;
		}

	}

	public void  playWithTama() throws InterruptedException {
		while(true) {
			
			System.out.println("＊*＊+＊*＊+＊*＊+＊*＊+");
			Tamagochi();
			System.out.println(c.getName()+"를 돌봐주세요");
			System.out.println("1.먹이주기 ");
			System.out.println("2.씻겨주기 ");
			System.out.println("3.재우기 ");
			System.out.println("4.산책하기 ");
			System.out.println("5.상태보기 ");
			System.out.println("0.나가기 ");
			System.out.print("::");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				eat();
				break;
			case 2:
				takeShower();
				break;
			case 3 :
				sleep();
				break;
			case 4 :
				takeAWalk();
				break;
			case 5 : 
				check();
				break;
			case 0 : 
				System.out.println("Bye..");
				return;
			default:
				System.out.println("다시 눌러주세요 ");
				break;
			}
			
		}
		
	}

	
	public void check() throws InterruptedException { //상태 알아보는 
		System.out.println(c.check());
	}

	public void takeAWalk() throws InterruptedException {
		System.out.println("운동 좀 할게요~");
		System.out.println("＊*＊＊*＊＊ º");
		c.takeAWalk();
		Thread.sleep(1500);
		System.out.println("            º");
		System.out.println(" 씻고싶네요   º");
	}

	public void sleep() throws InterruptedException {
		c.sleep();
		System.out.println("＊*＊＊*＊＊ º");
		System.out.println("goodNight~ZzZz");
		Thread.sleep(1500);
		System.out.println();
		System.out.println("자고 일어났더니 배고픈데요 쥔님?");
		System.out.println("       º");
		System.out.println("         º");
		
		
	}

	public void takeShower() throws InterruptedException {
		System.out.println("º＊♨♥상쾌하당♥♨＊º");
		System.out.println("주인님은 안씻으세요..?;＊*＊º");
		System.out.println("            º");
		System.out.println("         º");
		c.takeShower();
	}

	public void eat() throws InterruptedException { //레벨 별로 먹을 수 있는 음식 다양해짐 
		c.eat();
		
	}
	//다마고치 레벨별로 커지게 할까?
	public void Tamagochi() throws InterruptedException {
		c.Tamagochi();
		
		
		
	}
	
	
	
}
