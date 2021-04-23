class mystring7{
   char[]c;
  
  mystring7(String s1){
    c=s1.toCharArray();
  }
     mystring7(char[]arr){
    c=new char[arr.length];
    for(int j=0;j<arr.length;j++){
      c[j]=arr[j];
    }
  }
  mystring7(){
  }
  public mystring7 replacelast(char first,char second){
    mystring7 obj=new mystring7();
    int i=0;
    obj.c=new char[c.length];
    for(i=0;i<c.length;i++){
       obj.c[i]=c[i];
    }
    for(i=c.length-1;i>=0;i--){
      if(obj.c[i]==first){
        obj.c[i]=second;
        break;
      }
    }
    return obj;
  }
}
 