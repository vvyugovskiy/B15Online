package replit.$_101_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysZombieAttack1_127_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];

        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int day=0;
        int[] check=new int[]{0,0,0,0,0,0,0,0};
        while(!Arrays.equals(inhabitants,check)){
            System.out.println("Day "+(day++)+" "+ Arrays.toString(inhabitants));
            for(int i=0;i<inhabitants.length;i++){
                if(inhabitants[i]==0){
                    continue;
                }
                else{
                    inhabitants[i]/=2;
                }
            }
        }
        System.out.println("Day "+(day++)+" "+ Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}
