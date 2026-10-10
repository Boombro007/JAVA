package File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferReaderInpout {
    public static void main(String[] args) {
        System.out.println("Enter Name : ");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            int p = Integer.parseInt(s);
            System.out.println("Name : " + s);
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }
}
