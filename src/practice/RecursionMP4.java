package practice;

import java.io.File;

public class RecursionMP4 {
    // MUST have a BREAKING(BASE CASE) point :: STOP POINT
//    int countMP4 (Directory dir){
//        if (dir==null) return 0;
//        int count = 0;
//        for (File file: dir){
//            if (file.endsWith(".mp4")){
//                count++;
//            }
//        }
//        for (Directory subdir : dir){
//            count+=countMP4(subdir);
//        }
//        return count;
//    }
    public int fib (int n) {
        if (n<=0){
            return 0;
        }else if (n==1){
            return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
}
