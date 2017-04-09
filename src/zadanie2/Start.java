package zadanie2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Piotrek on 2017-04-09.
 */
public class Start {
    public static void main(String[] args) {
        MyClassGeneric<Integer> gen1= new MyClassGeneric<>(4);
        MyClassGeneric<String> gen2 = new MyClassGeneric<>("HELLO");
        MyClassGeneric<Double> gen3 = new MyClassGeneric<>(5.7);
        MyClassGeneric<Character> gen5 = new MyClassGeneric<>('D');

        List<MyClassGeneric<?>> lista = new ArrayList<>();
        lista.add(gen1);
        lista.add(gen2);
        lista.add(gen3);
        lista.add(gen5);

        System.out.println(lista);
    }





}
