package com.amber.security.base64;

import java.io.IOException;

import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.encoders.Base64Encoder;





public class AmberBase64 {
	
	private static String src ="imooc security base64";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bcBase64();
	}
	
	/*public static void jdkBase64(){
		BASE64Encoder encoder = new BASE64Encoder();
		String encode = encoder.encode(src.getBytes());
		System.out.println("encode:" + encode);
		
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			System.out.println(new String("decode:" + decoder.decodeBuffer(encode)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void commonBase64(){
		byte[] encodeBytes = Base64.encodeBase64(src.getBytes());
		System.out.println("encode:" + new String(encodeBytes));
		
		byte[] decodeBytes = Base64.decodeBase64(encodeBytes);
		System.out.println("decode:" + new String(decodeBytes));
	}*/
	
	public static void bcBase64(){
		byte[] encodeBytes = Base64.encode(src.getBytes());
		System.out.println("encode:" + new String(encodeBytes));
		
		byte[] decodeBytes = Base64.decode(encodeBytes);
		System.out.println("decode:" + new String(decodeBytes));
	}
}
