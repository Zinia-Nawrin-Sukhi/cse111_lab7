class mystring11{
  char[]c;
   mystring11(String s1){
    c=s1.toCharArray();
  }
    boolean equalsignorecase(String c1){
    char[] arr=c1.toCharArray();
    char[]arr1=new char[c.length];
    for(int i=0;i<arr.length;i++){
      if(arr[i]>='A' && arr[i]<='Z'){
        int k=0;
        k=(int)arr[i]+32;
        arr[i]=(char)k;
      }
    }
    for(int i=0;i<c.length;i++){
      if(c[i]>='A' && c[i]<='Z'){
        int k=0;
        k=(int)c[i]+32;
        arr1[i]=(char)k;
      }
      else arr1[i]=c[i];
    }
    boolean k=true;
    if(arr1.length==arr.length){
      for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=arr[i]){
          k=false;
        }
      }
    }
    else if(arr1.length>arr.length)
      k=false;
    else if(arr1.length<arr.length)
      k=false;
     return k; 
    
  }
}