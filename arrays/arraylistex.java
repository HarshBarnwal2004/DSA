import java.util.*;
import java.util.ArrayList;
public class arraylistex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        //input
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
