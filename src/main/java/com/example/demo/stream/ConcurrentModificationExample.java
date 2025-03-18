package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcurrentModificationExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        try {
            list.stream().forEach(e -> {
                if (e == 3) {
                    list.add(6);  // Modifying while streaming
                }
                System.out.println(e);
            });
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
}

