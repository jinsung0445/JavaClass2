package org.dimigo.oop;

public class Assingment8 {
    public static void main(String[] args) {
        String[] groupName = {"방탄", "2NE1", "걸스데이"};

        String[][]memberName = new String[][]{{"정국", "지민", "뷔", "슈가", "진"},{"CL", "산다라박", "박봄" , "민지"},{"유라", "혜리", "소진", "민아"}};

        for(int i =0; i<groupName.length; i++){
            System.out.print("<< " + groupName[i] + " >>\n");
            for(int j = 0; j<memberName[i].length; j++){
                    System.out.print(memberName[i][j] + "\n");
            }
            System.out.println();
        }

    }
}
