import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);

    
        Collections.shuffle(list);

    
        list.toArray(array);

        
        for (int value : array) {
            System.out.println(value + " ");
        }
    }
}
