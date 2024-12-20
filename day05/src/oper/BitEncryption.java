package oper;

public class BitEncryption {
	public static void main(String[] args) {
		int originalMsg = 42; //원본 메세지
		int key = 99; //비트마스크
		System.out.println("원본 메세지 : " + originalMsg);
		int encryptedMsg = originalMsg ^ key;//xor 연산을 통한 암호화
		System.out.println("암호화된 메세지 : " + encryptedMsg);
			
		int decryptedMsg = encryptedMsg ^ key;
		System.out.println("복호화된 메세지 :" + decryptedMsg);
	
		//쉬프트 연산자
		System.out.println(10<<1);
		System.out.println("이진수 : " + Integer.toBinaryString(10<<1));
		System.out.println(10>>1);
		System.out.println("이진수 : " + Integer.toBinaryString(10>>1));
	
	}
}
