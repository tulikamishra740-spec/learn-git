import java.io.*;

class BufferedWrite {
    public static void main (String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"));
        bw.write("Name-----");
        bw.newLine();
        bw.write("Age-----");
        bw.newLine();
        bw.write("Rollno-----");
        bw.newLine();
        bw.write("Address-----");
        bw.newLine();
        bw.close();

    }
}