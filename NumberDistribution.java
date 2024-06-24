Number Distribution 
Print the count of the occurrences of positive integers, negative integers, and zeroes in the given array.



Input Format

The first line of the input contains an integer N - size of the array, second line of input contains an array elements of the array.



Output Format

Print the frequencies of zeroes, positives elements and negative elements.



Constraints

1 <= N <= 104

-103 <= arr[i] <= 103



Example

Input

10

120 0 -9 89 68 -982 91 -54 -12 -139



Output

1 4 5



Explanation



Self Explanatory


import java.io.*;
import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int po=0,ne=0,ze=0;
        for(int i=0;i<n;i++)
        {
            int a=scan.nextInt();
            if(a>0)
            {
                po++;
            }
            else if(a<0)
            {
                ne++;
            }
            else
            {
                ze++;
            }
        }
        System.out.println(ze+" "+po+" "+ne);
    }
}
