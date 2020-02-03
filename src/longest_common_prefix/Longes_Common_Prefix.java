package longest_common_prefix;

//문자열 배열 중에서 가장 긴 공통 접두사 문자열을 찾는 함수를 작성.
//공통 접두사가 없으면 빈 문자열 ""을 반환.

public class Longes_Common_Prefix {

	public static String longestCommonPrefix(String[] strs) {
       
		if(strs == null || strs.length == 0)    return "";
		
		String re = strs[0];
		//["flower","flow","flight"]
		int i=1;
		while(i < strs.length) {
			
			while(strs[i].indexOf(re) != 0) {
				re = re.substring(0, re.length()-1);
				
				if(re.isEmpty()) {
					return "";
				}
			}
			i++;
		}
		return re;
		
    }
	
	
	public static void main(String[] args) {
		
		String []strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}

}
