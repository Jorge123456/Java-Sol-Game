pragma solidity 0.5.11;

Contract Upgrade {

  int serialNumber;
  string type;
  bool active;
  int duration;
}

//to be implemented after structures are defined 
address public owner;

    constructor() public{
        owner = msg.sender;
    }

  
