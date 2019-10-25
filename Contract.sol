pragma soldity 0.5.11;

Contract Upgrade {

  int serialNumber;
  string type;
  bool active;

}

address public owner;

    constructor() public{
        owner = msg.sender;
    }

  
