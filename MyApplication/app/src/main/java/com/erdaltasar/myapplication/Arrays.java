package com.erdaltasar.myapplication;

import java.util.HashMap;

public class Arrays {

    public static void main(String[] args) {

        String[] myStringArrays = new String[3];

        myStringArrays[0] = "Erdem";
        myStringArrays[1] = "Ferdi";
        myStringArrays[2] = "Kadioglu";

        int i;

        for (i = 0;i<3;i++){

            System.out.println(myStringArrays[i]);
        }

        // Hash map

        HashMap<String,String> myHashMap = new HashMap<String,String>();

        myHashMap.put("name","Erdal");
        myHashMap.put("lastName","Tasar");

        System.out.println(myHashMap.get("name")+" "+myHashMap.get("lastName"));

    }
}
