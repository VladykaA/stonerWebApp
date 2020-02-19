package com.stoner;


import com.stoner.util.StoneFactory;

import java.util.Locale;
import java.util.ResourceBundle;

public class MainTest {
    public static void main(String[] args) {
        Locale[] supportedLocales = {
                Locale.ENGLISH,
                Locale.forLanguageTag("ua")
        };

        ResourceBundle labels = ResourceBundle.getBundle("LabelsBundle", supportedLocales[0]);

        System.out.println(StoneFactory.getName(labels));



    }



}
