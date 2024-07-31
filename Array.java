class Helloworld {
    public static void main(String[] args) {
        int[] numArray = {25, 34, 43 ,200, 24};
        boolean flag=false;
          for(int i=0;i<=4;i++){
              for(int k=0;k<=4;k++){
                  if (numArray[i] < numArray[k]){
                  }else {
                  flag=true;
                  System.out.println(numArray[k]);
                  }
                  if (flag == false) {
                     System.out.println(numArray[k]);  
                      
                  }
              }
          }
      
       
    }
}