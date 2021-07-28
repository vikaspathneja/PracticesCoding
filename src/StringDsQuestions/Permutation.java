package StringDsQuestions;
// Java program to print all permutations of a
// given string.
public class Permutation
{
	public static void main(String[] args)
	{
		String str = "ABC";
		int n = str.length();
//		Permutation permutation = new Permutation();
//		permutation.permute(str, 0, n-1);
		permuteFun(str, 0, n-1);
		
		
	}

	/**
	* permutation function
	* @param str string to calculate permutation for
	* @param l starting index
	* @param r end index
	*/
	private void permute(String str, int l, int r)
	{
		if (l == r)
			System.out.println(str);
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}

	
	
	public static void permuteFun(String string,int left,int right) {
			if(left==right)
				System.out.println(string);
			else {
				for(int i=left; i<=right; i++) {
					//swap
					//permute
					//swap
					string=swaps(string,left,i);
					permuteFun(string, left+1, right);
					string=swaps(string,left,i);
				}
			}
				
	}
	public static String swaps(String str,int i,int j) {
		char temp[]=str.toCharArray();
		char tempchar=temp[i];
		temp[i]=temp[j];
		temp[j]=tempchar;
		String sss=String.valueOf(temp);
		return sss;
	}
	
	
	public String swap(String str,int i,int j) {
		char temp[]=str.toCharArray();
		char tempchar=temp[i];
		temp[i]=temp[j];
		temp[j]=tempchar;
		String sss=String.valueOf(temp);
		return sss;
	}
	
}

// This code is contributed by Mihir Joshi
