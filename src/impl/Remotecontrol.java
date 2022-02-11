package impl;

/**
 * 인터페이스 구성은 상수, 추상메소드만 사용가능하다.
 * @author smart00
 *
 */
public interface Remotecontrol {

	public int MAX_VOLUME = 10;
	public final int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
