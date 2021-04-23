class mystring4{
  char[]c;
  
  mystring4(String s1){
    c=s1.toCharArray();
  }
  public boolean endswith(String s2){
    
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
      int k=0,p=0;
      for(int i=c.length-second.length;i<c.length;i++){
        if( c[i]!=second[p]){
       
          k=-1;
          break;
        }
        else k++;
        ++p;
      }
      if(k==second.length)
        j= true;
      else if(k<0)
        j= false;
     
    }
    return j;
  }
}