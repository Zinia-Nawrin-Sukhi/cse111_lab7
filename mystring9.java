class mystring9{
   char[]c;
  
  mystring9(String s1){
    c=s1.toCharArray();
  }
    mystring9(char[]arr){
    c=new char[arr.length];
    for(int j=0;j<arr.length;j++){
      c[j]=arr[j];
    }
  }
  public mystring9 touppercase(){
    char[]c2=new char[c.length];
    int k=0;
    for(int i=0;i<c.length;i++){
      c2[i]=c[i];
    }
    for(int i=0;i<c.length;i++){
      if(c2[i]>='a' && c2[i]<='z'){
         k=(int)c2[i]-32;
         c2[i]=(char)k;
      }
    }
     mystring9 p=new mystring9(c2);
    return p;
  }
}