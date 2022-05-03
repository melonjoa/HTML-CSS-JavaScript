package test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
    //----------- 싱글톤 객체 생성 시작 ----------
    private static FileHelper current = null;

    public static FileHelper getInstance() {
        if (current == null) {
            current = new FileHelper();
        }
        return current;
    }

    public static void freeInstance() {
        current = null;
    }

    private FileHelper() {
        super();
    }
    //----------- 싱글톤 객체 생성 끝 ----------

    /**
     * 주어진 경로에 data 값을 기록하고 저장한다.
     * @param filePath - 저장할 파일 경로
     * @param data - 저장할 내용을 담은 스트림
     * @return boolean - 성공시 true, 실패시 false
     */
    public boolean write(String filePath, byte[] data) {
        boolean result = false;
        /** 파일 저장 절차 시작 */
        // finally 블록에서 인식하기 위해서 선언부를 위로 이동시킨다.
        OutputStream out = null;
        
        try {
        	/*
        	 * 1.소프트웨어 아키텍처 세부 구현 지침과 UI 표준 및 지침을 반영하여ㆍ확인된 UI 설계를 구현할 수 있다.(10)
        	 */
            out = new FileOutputStream(filePath);
            // 파일쓰기
            out.write(data);
            System.out.println("[INFO] 파일 저장 성공 >> " + filePath);
            // 저장에 성공하였으므로, 결과값을 true로 변경
            result = true;
        /*
         * 2.확인된 화면과 폼 흐름 설계에 따라ㆍ사용자 접근성을 고려한 화면과 폼의 흐름 제어를 구현할 수 있다.(5)
         */
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] 지정된 경로를 찾을 수 없음. >> " + filePath);
            e.printStackTrace();
        /*
         * 3.확인된 화면과 폼 흐름 설계에 따라ㆍ사용자 접근성을 고려한 화면과 폼의 흐름 제어를 구현할 수 있다.(5)
         */
        } catch (IOException e) {
            System.out.println("[ERROR] 파일 저장 실패 >> " + filePath);
            e.printStackTrace();
        /*
         * 4.확인된 화면과 폼 흐름 설계에 따라ㆍ사용자 접근성을 고려한 화면과 폼의 흐름 제어를 구현할 수 있다.(5)
         */
        } catch (Exception e) {
            System.out.println("[ERROR] 알 수 없는 에러 >> " + filePath);
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    /**
     * 주어진 경로의 파일을 읽고, 내용을 스트림으로 리턴한다.
     * @param filePath - 읽어야 할 파일의 경로
     * @return 읽혀진 내용
     */
    public byte[] read(String filePath) {
        byte[] data = null;
        
        /** 파일 읽기 */
        InputStream in = null;
        try {
        	/*
        	 * 5.구현된 화면ㆍ폼ㆍ메뉴ㆍ흐름을 테스트할 수 있는 테스트 케이스를 작성하고 단위 테스트를 수행하기 위한 테스트 조건을 명세화할 수 있다.(10)
        	 */
            in = new FileInputStream(filePath);

            // 읽은 내용을 담기 위한 배열은 파일의 용량만큼 사이즈를 할당한다.
            // in.available() --> 열고 있는 파일의 크기
            /*
             * 6.확인된 화면과 폼 흐름 설계에 따라ㆍ감성공학 기법을 고려하여 사용자가 접하는 화면ㆍ폼ㆍ메뉴ㆍ흐름을 구현할 수 있다.(10)
             */
            data = new byte[in.available()];
            // 파일 읽기 - 파라미터로 전달된 배열 안에, 파일의 내용을 담아준다.
            in.read(data);
            System.out.println("[INFO] 파일 읽기 성공 >> " + filePath);
	    /*
	     * 7.확인된 화면과 폼 흐름 설계에 따라ㆍ감성공학 기법을 고려하여 사용자가 접하는 화면ㆍ폼ㆍ메뉴ㆍ흐름을 구현할 수 있다.(5)
	     */
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] 지정된 경로를 찾을 수 없음. >> " + filePath);
            e.printStackTrace();
        /*
	     * 8.확인된 화면과 폼 흐름 설계에 따라ㆍ감성공학 기법을 고려하여 사용자가 접하는 화면ㆍ폼ㆍ메뉴ㆍ흐름을 구현할 수 있다.(5)
	     */
        } catch (IOException e) {
            System.out.println("[ERROR] 파일 읽기 실패 >> " + filePath);
            e.printStackTrace();
        /*
	     * 9.확인된 화면과 폼 흐름 설계에 따라ㆍ감성공학 기법을 고려하여 사용자가 접하는 화면ㆍ폼ㆍ메뉴ㆍ흐름을 구현할 수 있다.(5)
	     */
        } catch (Exception e) {
            System.out.println("[ERROR] 알 수 없는 에러 >> " + filePath);
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } // end try~catch~finally
        
        return data;
    }
    
    /************** 다형성 구현부분 **************/
    /**
     * 파일을 저장한다.
     * @param filePath - 저장할 파일 경로
     * @param content - 저장할 내용
     * @param encType - 인코딩 형식
     * @return boolean - 성공시 true, 실패시 false
     */
    public boolean writeString(String filePath, String content, String encType) {
        boolean result = false;
        byte[] data = null;

        try {
        	/*
    	     * 10.설계된 화면과 폼의 흐름을 확인하고ㆍ제약사항과 화면의 폼 흐름을 구현에 반영하도록 설계를 확인할 수 있다.(10)
    	     */
            data = content.getBytes(encType);
        /*
	     * 11.설계된 화면과 폼의 흐름을 확인하고ㆍ제약사항과 화면의 폼 흐름을 구현에 반영하도록 설계를 확인할 수 있다.(5)
	     */
        } catch (UnsupportedEncodingException e) {
            System.out.println("[ERROR] 인코딩 지정 에러");
            e.printStackTrace();
	    /*
	     * 12.설계된 화면과 폼의 흐름을 확인하고ㆍ제약사항과 화면의 폼 흐름을 구현에 반영하도록 설계를 확인할 수 있다.(5)
	     */
        } catch (Exception e) {
            System.out.println("[ERROR] 알 수 없는 에러 >> " + filePath);
            e.printStackTrace();
        }

        result = this.write(filePath, data);
        return result;
    }
    
    /**
     * 파일의 내용을 문자열로 리턴한다.
     * @param filePath - 읽어야 할 파일의 경로
     * @param encType - 인코딩 형식
     * @return String - 읽은 내용에 대한 문자열
     */
    public String readString(String filePath, String encType) {
        String content = null;

        byte[] data = this.read(filePath);

        // 내용을 문자열로 변환한다.
        try {
        	/*
        	 * 13.구현을 위해 하위 시스템 단위의 내·외부 화면과 폼을 설계를 확인할 수 있다.(10)
        	 */
            content = new String(data, encType);
            content = content.trim();
        /*
    	 * 14.구현을 위해 하위 시스템 단위의 내·외부 화면과 폼을 설계를 확인할 수 있다.(5)
    	 */
        } catch (UnsupportedEncodingException e) {
            System.out.println("[ERROR] 인코딩 지정 에러");
            e.printStackTrace();
        /*
    	 * 15.구현을 위해 하위 시스템 단위의 내·외부 화면과 폼을 설계를 확인할 수 있다.(5)
    	 */
        } catch (Exception e) {
            System.out.println("[ERROR] 알 수 없는 에러 >> " + filePath);
            e.printStackTrace();
        }

        return content;
    }
}
