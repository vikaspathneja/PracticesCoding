package ArraysQs;
import java.util.*; 
import java.io.*;
import java.util.stream.*;

public class ThirdLargestElementWithOrderInArray {
	
	  

	  public static void main (String[] args) {  
		  String[] arr=new String[] {"defga","kads","jladss","jqre","kkkk","llll","aaaa","yyyy"};
		  System.out.println(ThirdGreatest(arr));		  
	  }


	

	  public static String ThirdGreatest(String[] strArr) {
	    // code goes here
	    String element=null;
	    List<String>list=Arrays.stream(strArr).sorted((n1,n2)->n2.length()-n1.length()).collect(Collectors.toList());
	    System.out.println("list="+list.toString());
	    if(list.size()==3){
	    	if(list.get(2).equals(strArr[2])) {
	    		element=strArr[2];
	    		return element;
	    	}else if(list.get(2).length()==list.get(1).length()){
	          element=list.get(1);
	          return element;
	        }else{
	          element=list.get(2);
	          return element;
	        }
	    }
	    if(list.size()>3){
	      if(list.get(2).length()==list.get(3).length()){
	               
	            for(int i=0; i<strArr.length;i++){
	              if(list.get(2).equals(strArr[i])){
	                element=strArr[i];
	                break;
	              }else if(list.get(3).equals(strArr[i])){
	                element=strArr[i];
	                break;
	              }
	          }
	          return element;
	      }else if(list.get(2).length()==list.get(1).length()){
	        
	            for(int i=0; i<strArr.length;i++){
	              if(list.get(2).equals(strArr[i])){
	                element=strArr[i];
	                break;
	              }else if(list.get(1).equals(strArr[i])){
	                element=strArr[i];
	                break;
	              }
	          }
	          return element;
	      }else if(list.get(2).length()==list.get(1).length() && list.get(2).length()==list.get(3).length()){
	               
	            for(int i=0; i<strArr.length;i++){
	              if(list.get(2).equals(strArr[i])){
	                element=strArr[i];
	                break;
	              }else if(list.get(3).equals(strArr[i])){
	                element=strArr[i];
	                break;
	              }else if(list.get(1).equals(strArr[i])){
	                element=strArr[i];
	                break;
	              } 
	          }
	          return element;
	      }else{
	        element=list.get(2);
	        return element;
	      }
	    }
	    return element;
	  }

	    
	    
	
	

}
