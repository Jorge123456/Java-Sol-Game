package com.jorge.javasol;
import com.jorge.javasol.Player;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setName("Jorge");
        String[] avatars = {"John", "Jack9b"};
        player1.setAvatars(avatars);
        player1.setContract(true);
        player1.setNumCode(0);
        player1.setIsAdmin(true);
        System.out.println(player1);
    }
}
