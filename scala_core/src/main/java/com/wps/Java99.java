package com.wps;

public class Java99 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            String flag="\t";
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    flag="\n";
                }
                System.out.print(i+"*"+j+"="+i*j+flag);
            }
        }
    }
}
