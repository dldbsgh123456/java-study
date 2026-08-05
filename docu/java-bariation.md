### 변수
데이터를 한 개 저장하는 메모리 공간의 주소

### 정수
```
- byte(8 bit) : -128 ~ 127
- short(16 bit) : -32768 ~ 32767 but, 사용 빈도가 거의 없음 , c언어 호환 문제도 있고
- int(32 bit) : -21억 4천 ~ 21억 4천  default -> 가장 많이 사용되는 데이터형임
- long(64 bit) : 21억 4천 이상
```
### 실수
```
- float(4 byte) : 소수점 이하 6자리 10.5f
- double(8 byte) : 소수점 이하 15자리 10.5D -> D는 생략 가능 default 라서
```
### 문자
```
char(2 byte) : 문자를 저장
               0~65535 => 유니코드
               각국의 언어 표현이 가능 (ASC => 0~255)
               문자 한개만 저장이 가능
               '' 작은 따옴표를 쓴다   
```
### 논리
```
boolean : 존재여부
          true / false
```
### 참조
```
String : 문자열 여러 개를 한 번에 저장할 수 있는 참조형 데이터
         가장 많이 사용되는 데이터
```
### 변수 선언  
변수 선언 - int kor 
변수 초기값 - kor=100;  
선언과 동시에 초기화 - int kor=100;  
### 식별자
1) 알파벳이나 한글로 시작 but, 대소문자 구분 ex)a,A filename,FileName 다 다른 변수들
2) 숫자 사용이 가능 but, 맨 앞 사용 금지  ex) 1a , 2a 
3) 특수문자 사용 가능 - _ , $ 두 개만 가능 ex) file_name , sum_count
4) 자바에서 사용 중인 단어는 사용 불가 ex) String , int 등등
5) 변수명에 공백이 없어야 함 -> 공백도 문자로 취급이 되어서 그럼

### 데이터형 별로 선언
```java
정수
byte b = 100;
short sh = 10000;
int i = 10000000;
long l = 100000000000000000000;
실수
float f = 10.5L;
double d = 10.555555;
문자
char c = 'a';
char cc = '한';
논리
boolean b = true;
boolean bb = false;
참조
String s = "Java Start";
String ss = "안녕하세요";
