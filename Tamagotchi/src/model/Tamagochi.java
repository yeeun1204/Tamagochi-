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
			System.out.println("LV."+level+"/3으로 만랩되어서 떠나요");
			System.out.println("♪ GOOD BYE ♬");
			System.out.println("     ___            ");
			System.out.println("    /● ●\\          ");	
			System.out.println("   |  ▼  |          ");		
			System.out.println("    \\___/          ");
			
			System.out.println("  \" ___  \"");	
			System.out.println("\"  /● ●\\  \"");
			System.out.println(" \\|  ▼  |/");		
			System.out.println("   \\___/");
			System.exit(1);
		}
		
		if(experience > 5) {
			level ++;
			System.out.println("♥ level UP ♥");
			System.out.println("우리 "+name+" 좀 봐보세요 ~");
			this.experience = 0;
		}else this.experience = experience;
		
	}
	public int getFeelFull() {
		return feelFull;
	}
	public void setFeelFull(int feelFull) {
		if(feelFull > 9) {
			//최대값 10으로 설정 
			this.feelFull = 10;
		}else if(feelFull < 1) {
			System.out.println(getName()+"이 아사했습니다. 주인 될 자격은 없네요 가세요 훠이훠이");
			System.out.println("GAME OVER");
			System.exit(1);
			
		}else if(feelFull < 4) {
			System.out.println("굶어 죽겠어요....포만감 :" + feelFull+"/10");
			//게임 종료 다마고치 아사.. 
			
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
			System.out.println("다른 주인님 찾아 떠나요. 찾지마세요 ㅃ2");
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
			System.out.println("에휴 숨만 쉬어도 돈이 나가네요");
			this.point = 0;
		}
		this.point = point;
		
	}



	
}
