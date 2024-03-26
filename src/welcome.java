import java.util.Scanner;

public class welcome {
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;

	public static void main(String[] args) {
		String[][] mBook = new String[NUM_BOOK] [NUM_ITEM];
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String name = input.next();
		
		System.out.print("연락처를 입력하세요: ");
		int phone = input.nextInt(); // 숫자만
		System.out.println("Your phone: " + phone);
		
		
		
		String greeting = "welcome to shopping Mall!";
		String tagline = "Welcome to book Market!";
		
		boolean quit = false;
		
		while(!quit) {
			
			System.out.println("************************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			/*
			System.out.println("************************************************");
			System.out.println("1. 고객 정보 확인하기 \t5. 바구니에 항목 추가하기");
			System.out.println("2. 장바구니 상품 목록 보기\t6. 장바구니에 항목 수량 줄이기");
			System.out.println("3. 장바구니 비우기\t7. 장바구니에 항목 삭제하기");
			System.out.println("4. 영수증 표시하기\t8. 종료");
			System.out.println("************************************************");
			*/
			
			menuIntro();
			
			System.out.println("메뉴 번호를 선택하세요: ");
			int choice = input.nextInt();
			
			if(choice < 1 || choice > 8) {
				System.out.println("1부터 8까지의 숫자를 입력하시오");
			} else {
				switch(choice) {
				case 1:
//					System.out.println("현재 고객 정보: ");
//					System.out.println("이름 " + name + "연락처" + phone);
					menuinfo(name, phone);
					break;
				case 2:
					menucartitemlist();
					break;
				case 3:
					menucartclear();
					break;
				case 4:
					menucartbill();
					break;
				case 5:
					menucartadditem();
					break;
				case 6:
					menucartremoveitemcount();
					break;
				case 7:
					menucartremoveitem();
					break;
				case 8:
					menucartexit();
					quit = true;
					break;
					
				} // switch 끝
			} // else 끝
		} // while 끝
	} //main 끝
	
	/**
	 * 설명: Print menu
	 * 매개변수: 
	 * 반환값:
	 */
	public static void menuIntro() {
		System.out.println("************************************************");
		System.out.println("1. 고객 정보 확인하기 \t5. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기\t6. 장바구니에 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기\t7. 장바구니에 항목 삭제하기");
		System.out.println("4. 영수증 표시하기\t8. 종료");
		System.out.println("************************************************");
		
	
	}
	
	/**
	 * 설명: 고객 정보 출력
	 * 매개변수: 
	 * 	-String  	name 고객 이름
	 * 	-int 		phone	휴대전화번호
	 * 반환값:
	 */
	public static void menuinfo(String name, int phone) {
		System.out.println("현재 고객 정보: ");
		System.out.println("이름 " + name + "연락처" + phone);
	}
	
	/**
	 * 설명: 2번 
	 * 매개변수: 
	 * 반환값:
	 */
	public static void menucartitemlist() {
		System.out.println("2. 장바구니 상품 목록 보기");
	
	}
	public static void menucartclear() {
		System.out.println("3. 장바구니 비우기");

	
	}
	public static void menucartadditem() {
		System.out.println("5. 바구니에 항목 추가하기: ");
	
	}
	public static void menucartremoveitemcount() {
		System.out.println("6. 장바구니에 항목 수량 줄이기: ");
	
	}
	public static void menucartremoveitem() {
		System.out.println("7. 장바구니에 항목 삭제하기: ");
	
	}
	public static void menucartbill() {
		System.out.println("4. 영수증 표시하기");
	
	}
	public static void menucartexit() {
		System.out.println("8. 종료");
	
	}
	
	public static void booklist(String[][] book) {
		
		book[0][0] ="IDSA1234";
		book[0][1] ="쉽게 배우는 웹프로그래밍";
		book[0][2] ="2700";
		book[0][3] ="송미영";
		book[0][4] ="단꼐별로 쇼핑몰을";
		book[0][5] ="IT전문서";
		book[0][6] ="2018/10/08";
		
		book[1][0] ="SOFQF1234";
		book[1][1] ="쉽게 배우는 웹";
		book[1][2] ="3700";
		book[1][3] ="우재남";
		book[1][4] ="단꼐별로 멘토링";
		book[1][5] ="IT전문서";
		book[1][6] ="2022/01/22";
		
		book[2][0] ="IDSA1235";
		book[2][1] ="스크래치";
		book[2][2] ="2200";
		book[2][3] ="고광일";
		book[2][4] ="단꼐별로 컴퓨터";
		book[2][5] ="컴퓨터입문";
		book[2][6] ="2019/10/08";
		
		
	}
	
	
	
	} //welcome 끝
