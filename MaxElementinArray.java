Max Element in Array 
Find the maximum element from the given array of integers.



Input Format

﻿The first line of input contains N - the size of the array and the second line contains the elements of the array.



Output Format

Print the maximum element of the given array.



Constraints

1 <= N <= 103

-109 <= ar[i] <= 109



Example

Input

5

-2 -19 8 15 4



Output

15



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
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int max=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
