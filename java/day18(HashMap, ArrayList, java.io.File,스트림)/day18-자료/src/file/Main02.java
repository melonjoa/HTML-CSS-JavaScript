package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Main02 {

	public static void main(String[] args) {
		// 저장할 파일의 경로
		final String PATH = "./kjh_test.txt";
		
		// 파일에 저장할 내용
		String write_string = "가나다라마바사가가가가가가가abcdefg";

		// 객체나 배열이 선언과 할당에 대한 블록이 서로 분리되어 있을 경우
		// 명시적으로 빈 영역임을 알리기 위하여 null로 초기화
		byte[] buffer = null;
		
		// 특정 인코딩 방식 적용
		try {
			// getBytes() 메서드는 존재하지 않는 인코딩 형식에 대한
			// 지정을 방지하기 위하여 예외처리를 강제적으로 요구한다.
			buffer = write_string.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// finally 블록에서 인식하기 위해서 선언부를 위로 이동시킨다.
		OutputStream out = null;
		
		// 파일 저장 절치 시작
		try {
			// 파일 저장을 위한 FileOutputStream 클래스의 
			// 객체를 생성할 때는 사용할 수 없는 경로에 대한 지정을
			// 방지하기 위하여 예외처리가 강제된다.
			out = new FileOutputStream(PATH);
			// 파일쓰기
			out.write(buffer);
			System.out.println("[INFO] 파일 저장 성공 >> " + PATH);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음 >> " + PATH);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 저장 실패 >> " + PATH);
			e.printStackTrace();
		} catch(Exception e) {  
			System.out.println("[ERROR] 알 수 없는 에러 >> " + PATH);
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}













