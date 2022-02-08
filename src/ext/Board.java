/*
 * 게시판 만들기 : 중복값 상속으로 전환 
 * notice / gallary / pds
 * title_content
 */

package ext;

public class Board {
	// 캡슐화 = private
	// private 입력 시 Main.java에서 notice뒤에 title과 content 나오지 않음.
	private String title;		// 제목
	private String content;		// 내용
	private String file;
	private String imgFile;
	
	// getter xx setter 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getImgFile() {
		return imgFile;
	}
	public void setImgFile(String imgFile) {
		this.imgFile = imgFile;
	}
	
	
	
	
	
}
