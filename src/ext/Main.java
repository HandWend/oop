package ext;

public class Main {

	public static void main(String[] args) {
		// 객체명.속성
		// 타입 변수명 = null;
		
		Notice notice = null;
		
		// 객체 인스턴스화
		// Notice에 ctrl + mlc = Notice.java의 Notice
		notice = new Notice();
		
		// Notice notice = new Notice();와 같다.
		notice.setTitle("첫 번째 공지글입니다.");
		
		// 객체명.필드 or 객체명.메소드()
		System.out.println(notice.getTitle());
		
		
		Board gallery = null;
		gallery = new Board();
		gallery.setTitle("첫 번째 갤러리글입니다.");
		// gallery.setImgFile("그림.png");
		System.out.println(gallery.getTitle());
		System.out.println(gallery.getFile());
	}

}
