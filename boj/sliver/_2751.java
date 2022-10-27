package boj.sliver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _2751 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		// String 과 문자열을 더할 때 새로운 객체를 생성하는 것이 아닌, 기존의 데이터를 더하는 방식
		// 속도가 빠르며, 상대적으로 부하가 적으므로 긴 문자열을 더하는 상황에서 사용
		// StringBuffer: 공통 메소드 동기화 멀티 스레드 환경에서만 <값이 예상치 못하게 변경되는 것을 방지>
		// StringBuilder: 그외의 기능은 StringBuilder가 뛰어남.
		ArrayList<Integer> a = new ArrayList<>();
		int num = scanner.nextInt();
		for(int i = 0; i<num; i++) {
			a.add(scanner.nextInt());
		}
		scanner.close();
		
		Collections.sort(a);
		//Arrays.sort(a)는 quicksort이므로 시간 복잡도가 O(nlogn)이지만 worst case는 O(n^2)이 될 수 있다.
		//Collections는 시간 복잡도가 최대 O(nlogn)이다.
		for(int i = 0; i<num; i++) {
			sb.append(a.get(i)).append("\n");
			// 많은 문자열을 연결하면 중간 문자열 객체가 생성되어 비효율적인 코드가 많이 생성된다.
			// String 객체는 변경이 불가능 한 것과 달리, StringBuffer는 변경이 가능하다.
		}
		System.out.println(sb);
	}
}
