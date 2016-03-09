/**
 * Created by hemanth on 09/03/2016.
 */
import java.util.Random;
import java.util.Scanner;
public class RandomBubblesort {
    public static void main(String[ ] args)
    {
        // read the maximum number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the maximum a value : ");
        int max = scanner.nextInt();


        int listnum[]= new int[10000];

        // creating random numbers less than 10000
        for (int i=0; i<10000;i++)
        {
            listnum[i] = randInt(max);

        }
        long starttime= System.currentTimeMillis();
        BubbleSort (listnum); // function call here
        long endtime= System.currentTimeMillis();
        System.out.println("Time taken do the bubble sort " +(endtime-starttime));
        /*for printing the values
        for ( int k = 0;  k < 10;  k++ )   //function to print

            System.out.println( listnum[ k ]);*/
    }


    public static int randInt(int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt(max);

        return randomNum;
    }

    public static void BubbleSort( int [ ] num )
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                {
                    temp = num[ j ];                //swap elements
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
    }



}

