import java.util.Scanner;

public class ModuleOne {
    public static void main(String[] args) {
        System.out.println("Enter the row and col size : ");
        Scanner ob=new Scanner(System.in);
        int noOfRows=ob.nextInt();
        int noOfCols=ob.nextInt();
        System.out.println("Position of adventurer (row col): ");
        int advRow=ob.nextInt();
        int advCol=ob.nextInt();
        System.out.println("Position of Gold (row col): ");
        int goldRow=ob.nextInt();
        int goldCol=ob.nextInt();

        int minDistance=getMinDistance(advRow,advCol,goldRow,goldCol,noOfRows,noOfCols,0,Integer.MAX_VALUE);
        System.out.println(minDistance);
    }
    static int getMinDistance(int advRow,int advCol,int goldRow,int goldCol,int noOfRows,int noOfCols,int count,int minDistance)
    {
        if(advRow==goldRow && advCol==goldCol)
            return Math.min(minDistance,count);
        if(advCol<goldCol)
            minDistance=getMinDistance(advRow,advCol+1,goldRow,goldCol,noOfRows,noOfCols,count+1,minDistance);
        if(advCol>goldCol)
            minDistance=getMinDistance(advRow,advCol-1,goldRow,goldCol,noOfRows,noOfCols,count+1,minDistance);
        if(advRow<goldRow)
            minDistance=getMinDistance(advRow+1,advCol,goldRow,goldCol,noOfRows,noOfCols,count+1,minDistance);
        if(advRow>goldRow)
            minDistance=getMinDistance(advRow-1,advCol,goldRow,goldCol,noOfRows,noOfCols,count+1,minDistance);
        return minDistance;
    }
}
