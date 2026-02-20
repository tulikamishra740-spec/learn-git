import java.io.*;

class BufferedRead {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("info.txt"));
        String line;
        while ((line = br.readLine())!= null) {
            System.out.println(line);
        }
        br.close();

    }
}