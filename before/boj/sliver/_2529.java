package boj.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _2529 {
	
	// attribute
	static String[] array;
	static boolean[] check;
	static ArrayList<String> ans;
	
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(bf.readLine()); // 부등호 개수
			
			array = new String[a]; // 부등호
			array = bf.readLine().split(" "); // 부등호 저장
			
			check = new boolean[10];
			ans = new ArrayList<String>();
			
			dfs("", 0, a); // index, a
			
			System.out.println(ans.get(ans.size()-1));
			System.out.println(ans.get(0));
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void dfs(String string, int index, int a) {
		if(index == a + 1) {// 인덱스가 (부등호 개수 + 1)을 만족하면 저장 -> 부등호의 개수 + 1 = 숫자 개수
			ans.add(string);
			return;
		}else {
			for(int i = 0; i<10; i++) {// 현재 true면 이미 저장된 숫자
				if(check[i]) continue;
				// 현재 저장된 string의 마지막 숫자와 등호로 비교하여  true 면 저장, 아니면 넘어감. 
				if(index == 0 || compare(string.charAt(string.length()-1)-'0', i, index)) {
					check[i] = true;
					dfs(string+i, index+1, a);
					check[i] = false;
				}
			}
		}
	}
	
	private static boolean compare(int a, int i, int index) {
		if(array[index-1].equals(">")) return a>i;
		else return a<i;
	}
}
