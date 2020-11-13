package model;

public class Tamagochi {
	private static String name;
	private int level=0;
	private int point=100;
	private int love=7;
	private int feelFull =7; 
	private int experience=0;
	
	
	
	public Tamagochi() {
		
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		if(level == 3 && experience > 5) {
			System.out.println("LV."+level+"/3���� �����Ǿ ������");
			System.out.println("�� GOOD BYE ��");
			System.out.println("     ___            ");
			System.out.println("    /�� ��\\          ");	
			System.out.println("   |  ��  |          ");		
			System.out.println("    \\___/          ");
			
			System.out.println("  \" ___  \"");	
			System.out.println("\"  /�� ��\\  \"");
			System.out.println(" \\|  ��  |/");		
			System.out.println("   \\___/");
			System.exit(1);
		}
		
		if(experience > 5) {
			level ++;
			System.out.println("�� level UP ��");
			System.out.println("�츮 "+name+" �� �������� ~");
			this.experience = 0;
		}else this.experience = experience;
		
	}
	public int getFeelFull() {
		return feelFull;
	}
	public void setFeelFull(int feelFull) {
		if(feelFull > 9) {
			//�ִ밪 10���� ���� 
			this.feelFull = 10;
		}else if(feelFull < 1) {
			System.out.println(getName()+"�� �ƻ��߽��ϴ�. ���� �� �ڰ��� ���׿� ������ ��������");
			System.out.println("GAME OVER");
			System.exit(1);
			
		}else if(feelFull < 4) {
			System.out.println("���� �װھ��....������ :" + feelFull+"/10");
			//���� ���� �ٸ���ġ �ƻ�.. 
			
		}
		else {
			this.feelFull = feelFull;
		}
	}
	

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		if(love < 1) {
			System.out.println("�ٸ� ���δ� ã�� ������. ã�������� ��2");
			System.out.println("GAME OVER");
			System.exit(1);
		}else if(love > 9) {
			this.love = 10;
		}else this.love = love;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		if(point < 1 ) {
			System.out.println("point$ : 0");
			System.out.println("���� ���� ��� ���� �����׿�");
			this.point = 0;
		}
		this.point = point;
		
	}



	
}
