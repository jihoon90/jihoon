package String;
/*	
	data 문자열을 1문자 압축을 하시오.
	1문자 압축이란 한글자가 연속해서 나오면 압축할수있는 글자이다. 
	연속된개수를 앞에 표현하고 문자는 하나만 적는것이 1문자압축이다. 	
	[예]
		aabb ==> 2a2b
		abb ==> 1a2b
		abc ==> 1a1b1c
		aba ==> 1a1b1a
	
 */

public class ex01 {
	public static void main(String[] args) {
		int idx = 0;
		int count =0;
		char str;
		String answer = "";
		String data = "abbc";
		for(int i=idx;i<data.length();i++) {
			str=data.charAt(idx);
			for(int j =idx;j<data.length();j++) {
				if(str==data.charAt(j)) {
					count += 1;
				}else {
					idx = j;
					break;
				}
			}
			answer = answer + (count+"")+str;
			count = 0;
		}
		System.out.println(answer);
	}




}