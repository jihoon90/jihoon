package String;
/*	
	data ���ڿ��� 1���� ������ �Ͻÿ�.
	1���� �����̶� �ѱ��ڰ� �����ؼ� ������ �����Ҽ��ִ� �����̴�. 
	���ӵȰ����� �տ� ǥ���ϰ� ���ڴ� �ϳ��� ���°��� 1���ھ����̴�. 	
	[��]
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