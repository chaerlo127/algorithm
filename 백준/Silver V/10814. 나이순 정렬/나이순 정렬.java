import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] persons = new String[n][2];
        for (int i = 0; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            persons[i][0] = st.nextToken();
            persons[i][1] = st.nextToken();
        }

        Arrays.sort(persons, (o1, o2) -> Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]));

        for(int i = 0; i < persons.length; i++){
            System.out.println(persons[i][0] + " " + persons[i][1]);
        }
    }
}