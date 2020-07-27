package practice.Array;

import java.util.Arrays;

public class ArrayCopyWays{

    public static void main(String[] args) {

        // copy using loop
        int [] a = {12,13,14,15,16,17};
        int [] b = new int [a.length];
//        int [] b = a;

//        for (int i=0; i<a.length; i++){
//            b[i]=a[i];
//        }
        a[0]=17;
        b[0]=21;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a).hashCode());
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(b).hashCode());
//----------------------------------------------------------------------------------
        // using Arrays.copyOf()
        int [] a1 = {12,13,14,15,16,17};

        int [] b1 = Arrays.copyOf(a1,a1.length);

        a1[3]=99;
        b1[3]=77;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a1).hashCode());
        System.out.println(Arrays.toString(b1));
        System.out.println(Arrays.toString(b1).hashCode());
//----------------------------------------------------------------------------
        // using clone()

        int [] a2 = {12,13,14,15,16,17};
        int [] b2 = a2.clone();

        a2[1]=71;
        b2[1]=94;
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a2).hashCode());
        System.out.println(Arrays.toString(b2));
        System.out.println(Arrays.toString(b2).hashCode());

//---------------------------------------------------------------------------

        int [] a3 = {12,13,14,15,16,17};
        int [] b3 = new int [a3.length];
        System.arraycopy(a3,0,b3,0,a3.length);

        a3[0]=69;
        b3[0]=44;
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a3).hashCode());
        System.out.println(Arrays.toString(b3));
        System.out.println(Arrays.toString(b3).hashCode());

    }
}
