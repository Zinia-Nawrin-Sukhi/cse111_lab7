class mystring3{
  char[]c;
  
  mystring3(String s1){
    c=s1.toCharArray();
  }
  public boolean startswith(String s2){
    
    char[]second;
    boolean j=true;
    
    second=s2.toCharArray();
    if(c.length<second.length){
      j=false;
      
    }
    else if (second.length==0){
      j=true;
      
    }
    else if (c.length>second.length){
      int k=0;
      for(int i=0;i<second.length;i++){
        if( c[i]!=second[i]){
       
          k=-1;
        }
        else k++;
      }
      if(k==second.length)
        j= true;
      else if(k<0)
        j= false;
     
    }
    return j;
  }
}