
protected class Player {

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
    boolean contract_a = true;
    
}

public class Player_Cont extends Player {

   boolean contract_p = true;
    
}

protected class Mob {
    
    int att_stats;
    int def_stats;
    int spe_stats;
    String Special;
    boolean kill;
    double Health;
    
}
    
public class Mobbie extends Mob {
    
    int level;
    String environment; 
}

/* For implementing Solidity/Blockchain implementation
void Player() {

    if (contract_approved) {
        Player_Cont = Player();
    }
}*/
