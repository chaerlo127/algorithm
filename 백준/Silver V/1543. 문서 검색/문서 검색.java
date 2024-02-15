import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        String rf = first.replace(second, "");

        System.out.println((first.length() - rf.length()) / second.length());
        
    }
}