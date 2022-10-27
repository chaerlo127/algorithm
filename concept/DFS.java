package concept;

import java.util.Vector;

// depth - first search
public class DFS {
	static Vector<Boolean> visited;
	static Vector<Vector<Integer>> graph;
	
	private static void dfs(int index) {
		visited.set(index, true);
		System.out.println(index+1 + " �湮");
		
		// graph ����� �ڽĸ�ŭ �̵��ϸ鼭 Ȯ��
		for(int i = 0; i<graph.get(index).size(); i++) {
			// ���� ����� �ڽ��� �湮�ߴ��� Ȯ��
			// �湮�� ���� �ʾҴٸ� �� ������ �̵�
			if(!visited.get(graph.get(index).get(i))) dfs(graph.get(index).get(i));
		}
	}

	// visited�� graph�� �����ŭ initialize
	private static void initialVisited() {
		for (int i = 0; i < graph.size(); i++) {
            visited.add(false);
        }
	}
	
	public static void main(String[] args) {
		graph = new Vector<>();
		visited = new Vector<>();
		
		for(int i =0; i<8; i++) {
			graph.add(new Vector<>());
		}
		
		graph.get(0).add(1);
		graph.get(0).add(5);
		
		graph.get(1).add(0);
		graph.get(1).add(2);
		graph.get(1).add(3);

		graph.get(2).add(1);

		graph.get(3).add(4);
		graph.get(3).add(5);
		graph.get(3).add(6);

		graph.get(4).add(3);
		graph.get(4).add(6);
		graph.get(4).add(7);

		graph.get(5).add(0);
		graph.get(5).add(3);

		graph.get(6).add(3);
		graph.get(6).add(4);

		graph.get(7).add(4);
		
		initialVisited();
		dfs(0);
	}

}
