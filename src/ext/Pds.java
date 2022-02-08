/*
 * 게시판 만들기
 * notice / gallary / pds
 * title_content
 */

package ext;

public class Pds extends Board {
	// 캡슐화 = private
	// private 입력 시 Main.java에서 notice뒤에 title과 content 나오지 않음.

	private String attachFile;		// 그림파일
		
	// getter xx setter 

	public String getAttachFile() {
		return attachFile;
	}
	public void setAttachFile(String attachFile) {
		this.attachFile = attachFile;
	}
	
	
	
}
