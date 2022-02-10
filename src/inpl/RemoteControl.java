package inpl;
/**
 * 인터페이스 구성은 상수, 추상메소드만 사용가능하다.
 * @author smart19
 *
 */
public interface RemoteControl {
	
	// 변수, interface에 선언된 상수는 모두 final의 특성을 갖는다.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
