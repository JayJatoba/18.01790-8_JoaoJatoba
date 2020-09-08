package maua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestHash {
    public static void main(String[] args) {
        List<Integer> tabKeys = Arrays.asList(new Integer[100000]);
        for (int i=1;i< tabKeys.size();i++){
            tabKeys.set(i, i);
        }
        System.out.println();
        List<List<Integer>> tabHash = new ArrayList<>(1000);
        for (int j=0;j< 1000;j++){
            tabHash.add(new LinkedList<Integer>());
        }

        System.out.println();
        for (int m=1;m< tabKeys.size();m++){
            SList.insereInicio(tabHash.get(hash(m)),tabKeys.get(m));
        }
        for (int i = 0; i < tabHash.size(); i++) {

            System.out.println(tabHash.get(i));
        }

    }

    public static Integer hash(Integer key) {
        return (key % 1000);
    }
}
