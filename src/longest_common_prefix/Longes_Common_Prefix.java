package longest_common_prefix;

//���ڿ� �迭 �߿��� ���� �� ���� ���λ� ���ڿ��� ã�� �Լ��� �ۼ�.
//���� ���λ簡 ������ �� ���ڿ� ""�� ��ȯ.

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
