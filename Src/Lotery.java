import java.util.Arrays;
import java.util.Random;

public class Lotery {
    public static void main(String[] args){
        Integer[] lotoreya = new Integer[]{1,5,8,4,9,0,3};
        Integer[] player = new Integer[]{5,7,1,0,9,2,3};
        Random random = new Random();

        int sum = 0;
        for (int i = 0; i < lotoreya.length; i++) {
            sum = random.nextInt();
        }
        int sum2 = 0;
        for (int j = 0; j < player.length; j++) {
            sum2 = random.nextInt();
        }

        System.out.println(Arrays.toString(lotoreya));
        System.out.println(Arrays.toString(player));

        Arrays.sort(lotoreya);
        Arrays.sort(player);

        System.out.println("Совпадения ");
        while (sum < lotoreya.length && sum2 < player.length ){
            if (sum == sum2){
                System.out.println(sum + " ");
                sum++;
                sum2++;
            } else if (sum < sum2) {
                sum++;
            }else {
                sum2++;
               break;
            }
        }
        System.out.println(Arrays.toString(player));
        System.out.println(Arrays.toString(lotoreya));
        System.out.println(" ");
        System.out.println("Колличество совпадений = 4 ");
}
}