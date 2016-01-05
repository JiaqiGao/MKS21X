import java.util.Arrays;

public class Sorts{

    static void selection(int[] ary){
    	int min = ary[0];
    	int minSwitch = 0;
    	for (int index=0; index<ary.length-1; index++){
                min = ary[index];
    	    for (int i=index; i<ary.length; i++){
    		if (ary[i]<min){
    		    min=ary[i];
    		    minSwitch = i;
    		}
    	    }
    	    ary[minSwitch]=ary[index];
    	    ary[index]=min;
    	}
    }
    
  static void insertionSort(int[]data) {
  	for (int i = 1; i < data.length; i++) {
  	    int push = 0;
  	    int value = data[i];
  	    for (int j = i-1; j >= 0; j--) {
      		if (value < data[j]) {
      		    push += 1;
      		}
  	    }
  	    int position = i;
  	    for (int k = push; k > 0; k--) {
      		data[position] = data[position-1];
      		position -= 1;
  	    }
  	    data[i-push] = value;
  	 }
  }
    
    public static void main(String[]args){
	    int[] tried = {2,3,4,2,1,7,5,-1,2222};
      int[] tried2 = {2,3,4,2,1,7,5,-1,2222};
      selection(tried);
      insertionSort(tried2);	
      System.out.println(Arrays.toString(tried));
      System.out.println(Arrays.toString(tried2));
    }
}
