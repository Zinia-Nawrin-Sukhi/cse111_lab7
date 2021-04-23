class mystring8{
   char[]c;
  
  mystring8(String s1){
    c=s1.toCharArray();
  }
     mystring8(char[]arr){
    c=new char[arr.length];
    for(int j=0;j<arr.length;j++){
      c[j]=arr[j];
    }
  }
  public mystring8 tolowercase(){
    char[]c2=new char[c.length];
    int k=0;
    for(int i=0;i<c.length;i++){
      c2[i]=c[i];
    }
    for(int i=0;i<c.length;i++){
      if(c2[i]>='A' && c2[i]<='Z'){
         k=(int)c2[i]+32;
         c2[i]=(char)k;
      }
    }
    mystring8 p=new mystring8(c2);
    return p;
  }
}