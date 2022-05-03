package Data;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Hangman {
	String notUsed = "abcdefghijklmnopqrstuvwxyz"; // 아직 사용하지 않은 알파벳들
	String[] hiddenString = new String[] { "teacher", "project", "difficult", "need", "rest" };
	String randomword = hiddenString[(int) (Math.random() * hiddenString.length)];
	// hiddenString 배열에 있는 단어중 하나를 가져온다.
	char[] letters = new char[randomword.length()]; // char형으로 문자열 길이만큼 배열 생성
	int life = 7; // 남은 게임 횟수

	Scanner scanner = new Scanner(System.in);

	public Hangman() {			// 게임을 실행할 생성자를 만든다.
		System.out.println("행맨 게임을 시작합니다!!");
		run();					// 생성자 안에 게임 실행이 될 메서드 생성 
	}

	public void run() {
		System.out.print("맞출 단어=> "); 	// 단어 수만큼 '-' 표시 (제일 처음 부분 따로 빼둠)

		for (int i = 0; i < letters.length; i++) {
			letters[i] = '-';
			System.out.print(letters[i]);
		}

		while (life > 0) {
			System.out.println();

			System.out.print("남은 횟수는 " + life + "번 입니다.");

			System.out.println();

			System.out.println("추측 문자 입력: ");

			String input = scanner.nextLine();

			char letter = input.charAt(0); // 입력한 글자중 첫글자만 char타입으로 가져옴.

			if(!Pattern.matches("^[a-z]*$", input)) {	// 추가한 내용 (영어 소문자를 제외한 문자 입력시 다시)
				System.out.print("영어 소문자로만 입력해주세요");
				continue;
			}

			boolean RightAnswer = false;

			for (int i = 0; i < randomword.length(); i++) {
				char ch = randomword.charAt(i); // randomword단어 i번째 문자를 char 타입으로 변환

				if (ch == letter) { // ch에 있는 것과 입력한 것 비교
					letters[i] = ch; // 답이 맞다면 letters에 ch 단어 입력
					RightAnswer = true; // 비교해서 답이 맞다면 true
				}
			}

			if (!RightAnswer) {
				life = life - 1; // 답이 틀렸다면 횟수 -1
			}

			notUsed = notUsed.replace(letter, '.');

			System.out.println("사용하지 않은 문자들: " + notUsed);

			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			boolean GameFinished = true;

			System.out.print("맞출 단어=> ");

			for (int i = 0; i < letters.length; i++) {
				if (letters[i] == '-') {
					GameFinished = false;
				}
				System.out.print(letters[i]);
			}

			if (GameFinished) {
				System.out.println(" 정답을 맞췄습니다!");
				break;
			}
		}

		if (life == 0) {
			System.out.println();
			System.out.println("정답을 맞추지 못했습니다! 정답은 " + randomword + "였습니다.");
		}

		System.out.println("게임을 종료합니다.");
		scanner.close();

	}

}
