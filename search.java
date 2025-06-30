package Recursion;

import java.util.ArrayList;

public class search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10};
        int target = 6;
        System.out.println(find(arr,6,0));
        System.out.println(find1(arr,1,0));
        findAllIndex(arr,target,0);   
        System.out.println(list);     
    }

    static boolean find1(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find1(arr, target, index+1);
    }


    static int find(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return find(arr, target, index+1);
        }
    }


    static ArrayList<Integer>list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }
}
