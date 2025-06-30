import java.util.*;
//  public class elesearch {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows :");
//         int rows = sc.nextInt();
//         System.out.print("Enter number of columns :");
//         int cols = sc.nextInt();
//         System.out.println("Enter matrix elements");
//         int[][] numbers = new int[rows][cols];
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         System.out.print("Enetr the number to be searched :");
//         int x = sc.nextInt();
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 if(numbers[i][j] == x){
//                     System.out.println("x found at location (" + i + "," + j + ")");
//                 }
//             }
//         }
//     }
// }


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input string
        String s = sc.nextLine();
        
        // Calculate and print result
        System.out.println(findMaxDepth(s));
        
        sc.close();
    }
    
    public static int findMaxDepth(String s) {
        int maxDepth = 0;
        int currentDepth = 0;
        
        // Iterate through each character
        for(char c : s.toCharArray()) {
            if(c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if(c == ')') {
                if(currentDepth == 0) {
                    return -1;  // Invalid closing parenthesis
                }
                currentDepth--;
            }
        }
        
        // Check if all parentheses are matched
        return currentDepth == 0 ? maxDepth : -1;
    }
}
