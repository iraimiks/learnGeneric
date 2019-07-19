package teamcalypso;

import javax.lang.model.element.Element;
import java.util.Collections;

public class Sorter<E extends Storage> {
    private E[] element;
    //TODO implement logic for this class to sort items by count descending and type ascending (in case some of items is with the same count)

    public Sorter(E[] data) {

        this.element = data;
    }

    public E[] sort(E[] data) {
       int N = data.length;
       for(int i=0;i<=N;i++){
           int min = i;
           for(int j=i+1;j<N;j++){
               if(less(data[j],data[min])){
                   min=j;
               }
               exch(data,i,min);
           }
       }
       return data;
    }



    private static boolean less(Storage a,Storage b){
        return a.getType().compareTo(b.type)>0;
    }
    private static void exch(Comparable[] a,int i, int j){
        Comparable t = a[i]; a[i]=a[j];a[j]=t;
    }
    public void show(Storage[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }




}
