
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class A_One {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println("");

        int i = 0;
        do{
            System.out.print(list.get(i));
            i++;
        }while(i < list.size());
        System.out.println("");

        i = 0;
        while(i < list.size()){
            System.out.print(list.get(i));
            i++;
        }
        System.out.println("");

        for(int j : list){
            System.out.print(j);
        }
        System.out.println("");
    }
}
