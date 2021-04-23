class mystring12{
  char[]c;
  mystring12(String input){
    c=input.toCharArray();
  }
  int compareto(String s){
    int k=9;
    char[] arr=s.toCharArray();
    if(arr.length==c.length){
      k=0;
      for(int i=0;i<c.length;i++){
        if(arr[i]!=c[i]){
          k=-1;
        }
    }
    }
    else if (arr.length>c.length){
       k=10;
    }
    else if (arr.length<c.length){
      k=-10;
    }
    return k;
  }
      
    }
    
      
    
    
