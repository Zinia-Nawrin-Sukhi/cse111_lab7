class mystring5{
  char[]c;
  
  mystring5(String s1){
    c=s1.toCharArray();
  }
  
  mystring5(char[]arr){
    c=new char[arr.length];
    for(int j=0;j<arr.length;j++){
      c[j]=arr[j];
    }
  }
  public mystring5 replaceFirst(char first,char second){
    int i=0;
    char[] c2=new char[c.length];
    for(i=0;i<c.length;i++){
       c2[i]=c[i];
    }
    for(i=0;i<c.length;i++){
      if(c2[i]==first){
        c2[i]=second;
      }
    }
    mystring5 k=new mystring5(c2);
    return k;
  }
}
    