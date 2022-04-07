//read twonumbers from a.txt using file input stream and add them and write the sum to same file a.txt using file output stream

import java.io.*;

public class threenum {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line = br.readLine();
        String[] nums = line.split(",");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        FileOutputStream fos = new FileOutputStream("a.txt");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        bw.write(Integer.toString(a));
        bw.newLine();
        bw.write(Integer.toString(b));
        bw.newLine();
        bw.write(Integer.toString(a+b));
        bw.close();
        
    }

}