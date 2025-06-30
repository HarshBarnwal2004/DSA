import java.util.*;
// public class Input {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         int[] arr = new int[5];
//         // arr[0] = 23;
//         // arr[1] = 45;
//         // arr[2] = 21;
//         // arr[3] = 233;
//         // arr[4] = 543;
//         // System.out.println(arr[3]);

//         // input using loops
//          for(int i=0;i<arr.length;i++){
//              arr[i] = in.nextInt();
//          }


//                 System.out.println(Arrays.toString(arr));

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//        }

    //     for(int num : arr) { // for every element in array, print the element
    //         System.out.print(num + " "); //  here num represents element of the array
    //    }

      //  System.out.println(arr[5]); // index out of bound error


        // array of objects
//         String[] str = new String[4];
//         for (int i = 0; i < str.length; i++) {
//             str[i] = in.next();
//         }

//         System.out.println(Arrays.toString(str));

//         // modify
//         str[1] = "kunal";

//         System.out.println(Arrays.toString(str));

//      }
//  }


public class MaxAverageVisit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of visits
        int K = sc.nextInt(); // Window size
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.printf("%.2f\n", findMaxAverage(arr, K));
        sc.close();
    }

    public static double findMaxAverage(int[] arr, int K) {
        int sum = 0;
        
        // Compute the sum of first K elements
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        
        int maxSum = sum;
        
        // Sliding window technique
        for (int i = K; i < arr.length; i++) {
            sum += arr[i] - arr[i - K];
            maxSum = Math.max(maxSum, sum);
        }
        
        return (double) maxSum / K;
    }
}
