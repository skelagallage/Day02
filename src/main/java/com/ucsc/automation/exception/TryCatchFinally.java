package com.ucsc.automation.exception;

public class TryCatchFinally {

    public static void main(String[] args) {
        try{
            System.out.println("A");
            if(true)
                throw new RuntimeException("");
            System.out.println("B");
        }catch (Exception ex){
            System.out.println("Exception is called...");
        }finally {
            System.out.println("Finally is called...");
        }
    }
}
