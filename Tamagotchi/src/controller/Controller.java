package controller;

import java.util.Scanner;

import model.Tamagochi;

public class Controller {
	Scanner sc = new Scanner(System.in);
	Tamagochi go = new Tamagochi();
		
	
	public void birth() { //�̸� �����ֱ�,
	    System.out.print("�ٸ���ġ �̸� �����ּ���(�����Ұ�) : ");
	   	String name = sc.next();
	   	go.setName(name);
	   	System.out.println("��*��+��*����*��+��*����*��+��*��");
	}

	public String getName() {
		return go.getName();
	}
	//�������� ���̴� �޴��� �ٸ���
	public void eat() throws InterruptedException { //�� �ɷ� ������ ������ �߰� , ����Ʈ ���� 
		//�������� �޴� �� �����ֱ� 
		if(go.getPoint() < 50) { 
			System.out.println("���� ���� ���� ������� �Ф���");
			Thread.sleep(800);
			return;
		}else { //�������� �޴� �ٸ��� �����ֱ� 
			System.out.println("`������ �ø��� �� ���ƿ�`");
			System.out.println("����Ʈ�� ��� �޴��� �� ������.");
			Thread.sleep(1000);
			System.out.println("1.������(-50p)(+1) ");
			System.out.println("2.���(-50p)(+1)");
			if(go.getLevel()>=1 && go.getPoint()>=80) {
				System.out.println("3.3ø�ݻ�(-80p)(+3)");
				if(go.getLevel()>=2&& go.getPoint()>=100) {
					System.out.println("4.���(-100p)(+4)");
					if(go.getLevel()==3&& go.getPoint()>=150)
						System.out.println("5.�ڽ��丮(-150p)(+10)");
				}}
			}
			

		System.out.println("6.�� �Ծ�");
		System.out.print("::");
		int select = sc.nextInt();
		
		int fullfeel = 0,point=0;
		//���ĺ��� ������,����Ʈ �޶��� 
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
		
		//�� ���������� ����ġ �÷��ֱ� 
		go.setExperience(go.getExperience()+1);
		go.setLove(go.getLove()+1);
		
		//���ĸ��� �ٸ� ���� �޾ƿͼ� �������� ������ֱ� 
		System.out.println("______________________________________");
		System.out.print("|������ +"+fullfeel+"!");
		Thread.sleep(800);
		System.out.print("������ +1!");
		Thread.sleep(800);
		System.out.print("����Ʈ$ "+point+"!");
		Thread.sleep(800);
		System.out.println("����ġ  +1! |");
		Thread.sleep(800);
		
		
		//��Ʈ 
		System.out.println("�ȳȱ�~���δԣ�*����");
		Thread.sleep(500);
		System.out.println("            ��");
		System.out.println("         ��");

	}

	public void takeShower() throws InterruptedException {
		go.setExperience(go.getExperience()+1);
		go.setLove(go.getLove()+1);	
		System.out.println("_________________");
		System.out.print("| ����+1! ");
		Thread.sleep(800);
		System.out.println("����+1! |");
		Thread.sleep(800);
	}

	public String check() {
		return "=="+go.getName()+"�� ����=="+
			"\nLv."+go.getLevel()+"/3"+
			"\n������ ��:"+go.getLove()+"/10"+
			"\n������ :"+go.getFeelFull()+"/10"+
			"\nPOINT : "+go.getPoint()+
			"\n����ġ : "+go.getExperience();
	}

	public void sleep() throws InterruptedException {
		//�� �÷��ֱ� 
		go.setExperience(go.getExperience()+1);
		go.setFeelFull(go.getFeelFull()-1);
		go.setPoint(go.getPoint()+20);
		go.setLove(go.getLove()-1);
		Thread.sleep(500);
		//���� �˷��ֱ� 
		System.out.println("__________________________________");
		System.out.print("| ����+1!");
		Thread.sleep(800);
		System.out.print(" ������-1");
		Thread.sleep(800);
		System.out.print("����Ʈ+20! ");
		Thread.sleep(800);
		System.out.println("���� -1! |");
		
		
	}

	public void takeAWalk() throws InterruptedException {
		//�� �����ϱ� 
		go.setFeelFull(go.getFeelFull()-1);
		go.setExperience(go.getExperience()+2);
		go.setPoint(go.getPoint()+30);
		go.setLove(go.getLove()+1);
		//���� �˷��ֱ� 
		System.out.println("____________________________________");
		System.out.print("| ����+2!");
		Thread.sleep(800);
		System.out.print(" ������-1!");
		Thread.sleep(800);
		System.out.print(" ����Ʈ+30!");
		Thread.sleep(800);
		System.out.println(" ����+1! |");
		Thread.sleep(500);
		
	}

	//�������� �ٸ���ġ ũ�� Ű���ֱ� 
	public void Tamagochi() throws InterruptedException {
		if(go.getLevel() == 0) {
			System.out.println("     ___  ");
			Thread.sleep(300);
			System.out.println("    /_ _\\  ");
			Thread.sleep(300);
			System.out.println("   |  ��  | ");	
			Thread.sleep(300);
			System.out.println("    \\___/ ");
			Thread.sleep(300);
		
		}else if(go.getLevel() == 1) {
		
			System.out.println("  \" ___  \"");	
			Thread.sleep(300);
			System.out.println("\"  /= =\\  \"");
			Thread.sleep(300);
			System.out.println(" \\|  ��  |/");		
			Thread.sleep(300);
			System.out.println("   \\___/");
			Thread.sleep(300);
		}
		else if(go.getLevel() == 2) {
			System.out.println("    ___  ");
			Thread.sleep(300);
			System.out.println(" �� /�� ��\\ ��");	
			Thread.sleep(300);
			System.out.println(" \\|  ��  |/");
			Thread.sleep(300);
			System.out.println("   \\___/");
			Thread.sleep(300);
			System.out.println("    W W");
			Thread.sleep(300);
		
		
		}else if(go.getLevel() == 3) {
			System.out.println("   _����  ��");	
			Thread.sleep(300);
			System.out.println("  ��  /> <\\  ");		
			Thread.sleep(300);
			System.out.println(" \\|  ��  |/");		
			Thread.sleep(300);
			System.out.println("   \\___/");
			Thread.sleep(300);
			System.out.println("  ��_| |_��");
			Thread.sleep(300);
		}
		
	}

	

}
