/**
 * Created by макс on 18.03.2019.
 */
public class Pair<T> {
    private T fio;
    private int year;
    public String[] mas={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    Pair(T fio, int year){
        this.fio = fio;
        this.year = year;
    }

    public int[] convert(String temp){
        String[] tempArr=temp.split("");
        int[] res= new int[tempArr.length];
        for(int i=0;i<tempArr.length;i++){
            for(int j=0;j<26;j++) {
                if (tempArr[i].equals(mas[j])){
                    res[i]=j;//
                }
            }
        }
        System.out.print("Shifr:");
        for (int i=0;i<tempArr.length;i++){
            System.out.print(res[i]+" ");
        }
        return res;
    }

    public String[] disconvert(int[] res){
        String[] arr=new String[res.length];
        for(int i=0;i<res.length;i++){
            for(int j=0;j<26;j++){
                if(res[i]==j)arr[i]=mas[j];
            }
        }
        System.out.print("\ndisShifr:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public T getFio() { return fio; }
    public int getYear() { return year; }
    public void setFio(int year) { this.year = year; }


}
