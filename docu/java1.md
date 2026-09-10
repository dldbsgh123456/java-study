

## 1. 변수 선언 및 사칙연산

```java
public class 변수 {
	public static void main(String[] args) {

		// 사과/배 개수 합계
		int 사과 = 3;
		int 배 = 2;
		System.out.println("사과:" + 사과);
		System.out.println("배:" + 배);
		System.out.println("과일 총 갯수 :" + (사과 + 배));

		// 사과/배 총 가격
		int aPrice = 1000;
		int pPrice = 2000;
		int total = aPrice * 사과 + pPrice * 배;
		System.out.println("총가격:" + total);

		// 나눗셈(실수 결과)
		int 사과2 = 10;
		System.out.println(사과2 / 3.0);
	}
}
```

---

## 2. Scanner를 이용한 입력 처리

```java
import java.util.Scanner;

public class 변수_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("국어 영어 수학 입력:");
		int 국어 = scan.nextInt();
		int 영어 = scan.nextInt();
		int 수학 = scan.nextInt();

		System.out.println("총점:" + (국어 + 영어 + 수학));
		System.out.printf("평균:%.2f", (국어 + 영어 + 수학) / 3.0);
	}
}
```

---

## 3. 정수/실수 데이터형 범위와 형변환

```java
public class 변수_03 {
	public static void main(String[] args) {
		byte b1 = Byte.MIN_VALUE;
		byte b2 = Byte.MAX_VALUE;
		System.out.println("byte는 범위:" + b1 + "~" + b2);

		long l1 = Long.MIN_VALUE;
		long l2 = Long.MAX_VALUE;
		System.out.println("long는 범위:" + l1 + "~" + l2);

		short s1 = Short.MIN_VALUE;
		short s2 = Short.MAX_VALUE;
		System.out.println("short는 범위:" + s1 + "~" + s2);

		int i1 = Integer.MIN_VALUE;
		int i2 = Integer.MAX_VALUE;
		System.out.println("int는 범위:" + i1 + "~" + i2);

		double d = 10.5f;
		float f = (float) 10.5;

		byte b = (byte) 340; // 범위 초과 → 값 손실 예시
	}
}
```

---

## 4. 변수 선언 실습 (칼로리/장바구니 계산)

```java
public class 변수_05 {
	public static void main(String[] args) {

		// 총 칼로리 계산
		int 샌드위치 = 250;
		int 사과 = 100;
		int 쥬스 = 150;
		System.out.println("총 칼로리:" + (샌드위치 + (사과 * 2) + 쥬스) + "kcal");

		// 개인 정보 + 장바구니 총합
		String name = "홍길동";
		String sex = "남자";
		double height = 180.5;
		boolean iscard = false;
		int 나이 = 20;
		int 우유 = 1200;
		int 빵 = 1500;
		int 계란 = 200;
		int 장바구니 = 우유 * 2 + 빵 * 3 + 계란 * 10;

		System.out.println("이름:" + name);
		System.out.println("성별:" + sex);
		System.out.println("키:" + height);
		System.out.println("카드 존재여부:" + iscard);
		System.out.println("장바구니의 총합:" + 장바구니);
	}
}
```

---

## 5. String 결합 / 변수 값 교환(swap)

```java
public class 변수_06 {
	public static void main(String[] args) {
		// Call By Value 방식의 값 교환
		int a = 10;
		int b = 20;

		int temp = a; // temp = 10
		a = b;        // a = 20
		b = a;        // b = 20  (주의: 원래 값 보존하려면 b = temp 로 수정 필요)

		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
```

---

## 6. 랜덤 값 생성 (Math.random / Random 클래스)

```java
import java.util.Random;

public class 변수_정리 {
	public static void main(String[] args) {

		// 방법 1: Math.random() 사용
		// int kor = (int)(Math.random() * 101);
		// int eng = (int)(Math.random() * 101);
		// int math = (int)(Math.random() * 101);

		// 방법 2: Random 클래스 사용
		Random r = new Random();
		int kor = r.nextInt(101);
		int eng = r.nextInt(101);
		int math = r.nextInt(101);

		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + math);
	}
}
```

---

## 7. printf 서식 출력

```java
public class 변수_정리1 {
	public static void main(String[] args) {
		System.out.printf("%-3d%-3d%-3d\n", 90, 90, 90);
		System.out.println(10 / 3.0);
		System.out.printf("%.2f\n", 10 / 3.0);
	}
}
```
