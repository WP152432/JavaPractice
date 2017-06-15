/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 *   |_ ByteStreamTest.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 14.
 * </pre>
 *
 * @author : jysa0
 * @version : 1.0
 */
public class ByteStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static void copyFile(){
		try(InputStream is = new FileInputStream("files/images.jpg");
		OutputStream os = new FileOutputStream("files/image_copy.jpg")){
		
			int result;
			
//			while( (result = is.read())!= -1){
//				os.write(result);
//			}
			
			// 버퍼를 이용해서 읽고 쓰기
			
			byte[] buf = new byte[1024];
			while((result = is.read(buf)) != -1){
				os.write(buf,0,result);
			}
			
		}catch(Exception e){
			e.printStackTrace();;
		}
	}
	
	private static void copyFile2(){
		try(InputStream is = new BufferedInputStream(new FileInputStream("files/images.jpg"));
		OutputStream os = new BufferedOutputStream(new FileOutputStream("files/image_copy.jpg"))){
			
			int result;
			// 버퍼를 이용해서 읽고 쓰기
			
			byte[] buf = new byte[1024];
			while((result = is.read(buf)) != -1){
				os.write(buf,0,result);
			}
			
		}catch(Exception e){
			e.printStackTrace();;
		}
	}
	
	private static void copyFile3(){
		try(Reader reader = new FileReader("files/input.txt");
		Writer writer = new FileWriter("files/output.txt")){
			
			int result;
			// 버퍼를 이용해서 읽고 쓰기
			
			while((result = reader.read()) != -1){
				writer.write(result);
			}
			
		}catch(Exception e){
			e.printStackTrace();;
		}
	}
}
