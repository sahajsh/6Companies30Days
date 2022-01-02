//   Problem 4: Run Length Encoding

class GfG
 {
	String encode(String str)
	{
          //Your code here
          String s = str.charAt(0)+"";
          int count =1;
          for(int i =1;i<str.length();i++){
              char curr = str.charAt(i);
              char prev =str.charAt(i-1);
              if(curr == prev){
                  count++;
              }else{
          if(count>=1){
              s += count;
              count = 1;
          }
          s+=curr;
      }
     
  }
  if(count>=1){
      s+=count;
      count = 1; 
  
	}
	return s;
	
 }
 }
