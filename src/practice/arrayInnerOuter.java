package practice;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInnerOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner=scan.nextInt();
        int sizeOuter=scan.nextInt();

        int[] inner = new int[scan.nextInt()];
        int[] outer = new int[scan.nextInt()];

        for(int i = 0; i <sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        //WRITE YOUR CODE HERE


        int count =0;
        for (int innerEach : inner){

            for (int outerEach : outer) {

                if( innerEach == outerEach){
                    count++;

                }
            }


        }
        System.out.println (count == sizeOuter);



    }
    }

