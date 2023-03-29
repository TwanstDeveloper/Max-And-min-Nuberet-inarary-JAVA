package javaapplication5;

public class JavaApplication5 {

  
    public static void main(String[] args) {
    //Max Number In Array
    int[] array={1,2,3,55,5,7,};
    int max=array[0];

    for(int i=0;i<array.length;i++){
    if(array[i]>max){
    max=array[i];
     }
        } 
    System.out.println("Max Number Equal= "+max);
    
    
    //Min Number In Array
    int[] array2={1,2,3,55,5,7,};
    int min=array2[0];

    for(int i=0;i<array2.length;i++){
    if(array2[i]<min){
    min=array[i];
     }
        } 
    System.out.println("Min Number Equal= "+min);
    }
}
    

