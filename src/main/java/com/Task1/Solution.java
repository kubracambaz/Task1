package com.Task1;

public class Solution {

    public  int  solution(int A) {
        if (A>0 && A<=100000000) {
            char[] stringToCharArray = String.valueOf(A).toCharArray();

            int firstIndex = 0;
            int lastIndex = stringToCharArray.length - 1;
            StringBuilder newNumber = new StringBuilder();
            for (int i = 1; i <= stringToCharArray.length / 2; i++) {

                if (firstIndex == lastIndex) {
                    newNumber.append(stringToCharArray[firstIndex]);
                } else {
                    newNumber.append(stringToCharArray[firstIndex]).append(stringToCharArray[lastIndex]);
                }
                firstIndex += 1;
                lastIndex -= 1;
            }

            if (stringToCharArray.length % 2 != 0) {
                newNumber.append(stringToCharArray[stringToCharArray.length / 2]);
            }
            return Integer.parseInt(newNumber.toString());
        }else{
            return 0;
        }
    }

    public static void main (String[] args){
        Solution solution = new Solution();
        int oldNumber = 78967;
        int newNumber = solution.solution(oldNumber);
        System.out.println("Eski Sayı: " + oldNumber + "\nYeni sayı: " + newNumber);
    }
}
