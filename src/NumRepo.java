import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumRepo {
    ArrayList<Integer> numArray = new ArrayList<>();
    Random ranNum = new Random();
    ArrayList<Integer> pickedNum = new ArrayList<>();

    public void setNumArray(){
        for(int i = 1 ; i < 46 ; i ++){
            numArray.add(i);
        }
    }

    public void selectNum(){
        for (int i = 0; i < 6; i++) {
        int tmp = ranNum.nextInt(numArray.size());
            pickedNum.add(numArray.get(tmp));
            numArray.remove(tmp);
        }
        Collections.sort(pickedNum);

    }

    public final void run(){
        for (int i = 0 ; i < 5 ; i ++) {
            setNumArray();
            selectNum();
            System.out.println(pickedNum);
            pickedNum.clear();
            numArray.clear();
        }
    }
}
