package Task;

public class BasicTv {
//	2. BasicTv 클래스를 작성하세요
//	필드 :
	boolean power; //TV 전원 상태 (기본값: false)
	int channel; //TV 채널 (기본값: 1)
	String color;// TV의 색상
	int size; // TV의 크기
	int price; // TV의 가격

	
//생성자
	public BasicTv(boolean power, int channel, String color, int size, int price) {
		
		this.power = power;
		this.channel = channel;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
	
//	메서드:
//	void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//	      전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
	void powerOnOff() {
		power = !power;
		System.out.println("전원상태 : " + (power? "켜짐" :"꺼짐"));
	}
//	void channelUp() : 채널을 1씩 증가시키는 메서드
//    채널 최대값 999
	void channelUp() {
		if(power) {
			System.out.println("현재 채널 : " + channel);
			if(channel < 999) {
				channel++;
			}else {
				channel = 1;
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	

//	void channelDown() : 채널을 1씩 감소시키는 메서드
//	      채널 최소값 1
	void channelDown() {
		if(power) {
			System.out.println("현재 채널 : " + channel);
			if(channel > 1 ) {
				channel--;
			}else {
				channel = 999;
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
}
