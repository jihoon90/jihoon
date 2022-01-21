package String;

/*	
data 문자열의 길이를 1압축부터 1씩 증가하면서 data의 길이까지 모든압축을 하려고한다.
전체길이가 압축할려는글자수의 배수이여야지만 압축이 가능하다. 
모든 압축 결과를 출력 
data 절반 길이만큼만 압축이 가능하고 ,
마지막 압축은 data 전체길이는 압축결과가 똑같기때문에 생략해도된다.
[조건]
	단, count 가 1일때는 1을생략한다. 
[예]
	aabb
		1압축 ==> 2a2b ==> true
		2압축 ==> aabb ==> true
		3압축 ==> false
		4압축 ==> aabb ==> 어차피 전체모양이랑 같기때문에 생략			
[예] 
 	aabbbbaa
 		1압축 ==> 2a4b2a
 		2압축 ==> aa2bbaa
 		3압축 ==> false
 		4압축 ==> aabbbbaa
 		5~7  ==> false
 		8압축 ==> aabbbbaa ==> 어차피 전체모양이랑 같기때문에 생략 		
*/
public class ex05 {
public static void main(String[] args) {			
	String data = "aabbbbaa";
}
}
