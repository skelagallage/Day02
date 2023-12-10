package com.ucsc.automation.string;

public class StringDemo {

    public static void main(String[] args) {
        String a = "Rasara Sathmini";
        String b = "Thiuni Siyathma";
        String c = "Thiuni Siyathma";

        /**
         * concatination
         */
//        System.out.println(a + " " + b);
//        String z = String.format("First name is %s and second name is %s", a, b);
//        System.out.println(z);

        /**
         * Comparison
         */

//        System.out.println(a.compareTo(b));
//        System.out.println(b.compareTo(c));

        /**
         * StringBuffer
         */
//        StringBuffer stringBuffer = new StringBuffer("abc");
//        stringBuffer.append("xyz");
//        System.out.println(stringBuffer.toString());

        /**
         * String method
         */

        System.out.println(a.charAt(2));
        System.out.println(a.contains("sar"));
        System.out.println(a.indexOf("a"));
        System.out.println(a.lastIndexOf("a"));
        System.out.println(a.length());
        System.out.println(a.replace("ra", "ri"));

        System.out.println("split ex");
        String[] strArr = a.split(" ");
        for (String str : strArr) {
            System.out.println(str);
        }

        System.out.println();
        System.out.println("Sanath".equals("sanath"));
        System.out.println("Sanath".equalsIgnoreCase("sanath"));

        String[] strArr2 = new String[]{"A", "B", "C", "D", "E"};
        String x = String.join("-", strArr2);
        System.out.println("value of x is : " + x);
    }
}
