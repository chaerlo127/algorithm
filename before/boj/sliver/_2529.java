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
			int a = Integer.parseInt(bf.readLine()); // �ε�ȣ ����
			
			array = new String[a]; // �ε�ȣ
			array = bf.readLine().split(" "); // �ε�ȣ ����
			
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
		if(index == a + 1) {// �ε����� (�ε�ȣ ���� + 1)�� �����ϸ� ���� -> �ε�ȣ�� ���� + 1 = ���� ����
			ans.add(string);
			return;
		}else {
			for(int i = 0; i<10; i++) {// ���� true�� �̹� ����� ����
				if(check[i]) continue;
				// ���� ����� string�� ������ ���ڿ� ��ȣ�� ���Ͽ�  true �� ����, �ƴϸ� �Ѿ. 
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
