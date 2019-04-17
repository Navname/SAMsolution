/**
 * Created by макс on 17.03.2019.
 */
public class Task2 {
    public static void task() {
        int[] mas=new int[5];
        for(int i=0;i<mas.length;i++){
            mas[i]=(int)(100*Math.random());
            System.out.println("mas["+i+"]= "+mas[i]);
        }
        int max=0;
        int indexMax=0;
        int min=100;
        int indexMin=0;
        for(int i=0;i<mas.length;i++){
            if(mas[i]<min){
                min=mas[i];
                indexMin=i;
            }
            if(mas[i]>max){
                max=mas[i];
                indexMax=i;
            }
        }
        System.out.println("Min="+min);
        System.out.println("Max="+max);
        System.out.println("indexMin="+indexMin);
        System.out.println("indexMax="+indexMax);

        int sum=0;

        for(int i=indexMin+1;i<indexMax;i++){
            sum+=mas[i];
        }

        if(indexMax<indexMin){
            for(int i=indexMax+1;i<indexMin;i++){
                sum+=mas[i];
            }
        }
        System.out.println("Sum="+sum);
    }
}
