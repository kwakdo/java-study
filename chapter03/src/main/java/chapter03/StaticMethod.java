package chapter03;

public class StaticMethod {
	int n;
	static int m;

	void f1() {
		// instance 메소드에서는 instance 변수에 접근 가능
		System.out.println(n);
	}

	void f2() {
		System.out.println(StaticMethod.m);
		// System.out.println(m);
		// 같은 클래스에서는 클래스(static) 변수 접근에서는 클래스 이름 생략 가능
	}

	void f3() {
		f2();
	}

	void f4() {
		// 같은 클래스에서는 클래스(static) 변수 접근에서는 클래스 이름 생략 가능
		s1();
	}

	static void s1() {
		// 오류: static method에서는 인스턴스 변수에 접근 불가능
		// System.out.println(n);
	}
	
	static void s2() {
		System.out.println(StaticMethod.m);
		// 같은 클래스에서는 클래스(static) 변수 접근에서는 클래스 이름 생략 가능
		System.out.println(m);
	}
	
	static void s3() {
		// 오류: static method에서는 인스턴스 메소드에 접근 불가능
		// f1();		
	}
	static void s4() {
		StaticMethod.s1();
		// 같은 클래스에서는 클래스(static) 변수 접근에서는 클래스 이름 생략 가능
		s1();
	}
}
