
public class WebServerExam {

	public static void main(String[] args) {
		//i'm has a camera
		WebServer ws = new WebServer();
		ws.port = 80;
		System.out.printf("현재 웹서버포트는 %d입니다.%n",ws.port);
		//ws.start();
		//ws.stop();
		ws.reStart();
	}

}
