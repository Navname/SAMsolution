/**
 * Created by макс on 17.03.2019.
 */
public class Task1 {
    public static void task(){
        int[] mas=new int[100];
        int i=0;
        int count=13;

        while(i<100)
        {
            if(count%13==0 || count%17==0){
                mas[i]=count;
                System.out.println("Mas ["+i+"] = "+mas[i]);
                i++;
            }
            count++;
        }

    }
}
