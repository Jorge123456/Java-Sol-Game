


public class Player {

    int num_code;
    String player_name; 
    boolean admin_priv = false;
    boolean contract = false;
    int num_char;
    String[] avatars = {};

}

private class Admin {

    int token;
    String admin_name;
    boolean admin_priv = true;
    boolean contract = true;
    
}

public class Player_Cont extends as Player{

    contract = true;
    
}

void Player() {

    if (contract_approved) {
        Player_Cont = Player();
    }
}
