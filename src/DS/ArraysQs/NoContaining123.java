package DS.ArraysQs;

	import java.util.*;
	import java.lang.*;
	import java.io.*;

	class NoContaining123 {
	    public static void createHashSet(HashSet<Integer> hs){
	        ArrayList<Integer> l = new ArrayList<>();
	        l.add(1);l.add(2);l.add(3);
	        int i = 0;
	        int j = 3;
			int count = 1;
	        // push the elements which have digits as 1, 2, and 3 only
	        while(hs.size()<4200){
	            for(int k= i; k<j; k++){
	                int num = l.get(k);
//	                System.out.println("num="+num);
//	                System.out.println("hs.size()="+hs.size());
	                hs.add(num);
	                l.add(num*10+1);
	                l.add(num*10+2);
	                l.add(num*10+3);
	            }
	           
	            i = j;
	            j = i + (int)Math.pow(3,count);
	            count++;
	        }
	        System.out.println(l);
	    }
		public static void main (String[] args)throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			HashSet<Integer> hs = new HashSet<>();
			createHashSet(hs);
			while(t-- >0){
			    int n = Integer.parseInt(br.readLine());
			    ArrayList<Integer> l = new ArrayList<>();
			    String[ ] s = br.readLine().trim().split(" ");
			    for(int i = 0; i< n; i++){
			        int num = Integer.parseInt(s[i]);
			        if(hs.contains(num)){
			            l.add(num);
			        }
			    }
			    Collections.sort(l);
			    StringBuffer sb = new StringBuffer("");
			    // iterating over the array elements
			    if(l.size() > 0){
			        // check the frequency of element in vector which is filled with preprocessing
			        for(int i: l){
			            sb.append(i + " ");
			        }
			        System.out.println(sb.toString());
			    } else{
			        System.out.println("-1");
			    }
			    
			}
		}
	}
