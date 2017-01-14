
/*
 @author - meghna
 This class reads an array in a Spiral fashion.

*/

public class ArraySpiral {

	public static void main(String[] args) {
		
		int[][] array={
				{1,2,3,4},
				{7,8,9,5},
				{1,2,3,6},
				{7,8,9,7},
				{7,8,9,8}
				
		};
		
		int minRow=0;
		int maxRow=array.length-1; 
		int minColumn=0;
		int maxColumn=array[0].length-1; 
		
		while(minRow<=maxRow && minColumn<=maxColumn){
			
			for(int i=minColumn;i<=maxColumn;i++){
				System.out.println(array[minRow][i]);
			}
			minRow++; 

			if(minRow>maxRow || minColumn>maxColumn) break;
			
			for(int j=minRow;j<=maxRow;j++){
				System.out.println(array[j][maxColumn]);
			}
			maxColumn--; 
			
			for(int k=maxColumn;k>=minColumn;k--){
				System.out.println(array[maxRow][k]);
			}
			maxRow--; 

			if(minRow>maxRow || minColumn>maxColumn) break;
			
			for(int m=maxRow;m>=minRow;m--){
				System.out.println(array[m][minColumn]);
			}
			minColumn++; 
		}
	}

}

