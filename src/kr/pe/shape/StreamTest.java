package kr.pe.shape;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		
		
		String a = br.readLine();		
		System.err.println(a);
		
		
		        
		        
        */
		
		/*
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("d:/test/java/out.txt");
        
        input.read(b);
        System.out.println(new String(b));  // byte 배열을 문자열로 변경하여 출력
        input.close();		
        */
        
        
        ArrayList<String> ar = new ArrayList<>(Arrays.asList("1221", "1324", "3243"));
        
        System.out.println(ar.get(0));
        System.out.println(ar.contains("1221"));
        
	}

}
