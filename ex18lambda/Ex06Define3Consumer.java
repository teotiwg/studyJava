package ex18lambda;

import java.util.function.Consumer;

public class Ex06Define3Consumer {
/*
 Consumer<T> :
 소비자라는 의미로,
 매개변수는 있으나 반환값은 없는 accept()메소드 보유
 즉 매개변수를 소비하는 형태, 리턴값이 없어 단순 출력 결과만 보여줌
 */
	public static void main(String[] args) {
		
		Consumer<String> c1 = (String s) ->{
			System.out.println(s+ "는(은) 가수입니다.");
		};
		c1.accept("케이윌");
		
		Consumer<String> c2 = t -> {
			System.out.println(t + "는(은) 과일입니다.");
		};
		c2.accept("StrawBerry");
	}

}
