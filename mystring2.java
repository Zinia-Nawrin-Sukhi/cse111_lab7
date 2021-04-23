class mystring2{
  char[]c;
  mystring2(String input){
    c=input.toCharArray();
  }
  char charAt(int n){
    if(n<0 || n>=c.length){
      System.out.println("invalidindex");
      return (char)0;
    }
    else return (c[n]);
  }
}
    
    
  
