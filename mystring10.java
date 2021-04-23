class mystring10{
  char[]c;
  mystring10(String input){
    c=input.toCharArray();
  }
  boolean equals(String c1){
    char[] arr=c1.toCharArray();
    boolean k=true;
    if(c.length==arr.length){
      for(int i=0;i<c.length;i++){
        if(c[i]!=arr[i]){
          k=false;
        }
      }
    }
    else if(c.length>arr.length)
      k=false;
    else if(c.length<arr.length)
      k=false;
     return k; 
    
  }
}