pragma solidity ^0.4.0;

contract Person {
    string name;
    string DOB;
    uint age;
    string state;
    
    function Person(string newName, uint newAge, string newState, string birthDate) {
        name = newName;
        age = newAge;
        state = newState;
        DOB = birthDate;
    }
    
    function changeName(string nameChange) {
        name = nameChange;
    }
    
    function hasBirthday() {
        age +=1;
    }
    
    function getName() returns (string) {
        return name;
    }
    
}

contract Voter is Person {
    string party;
    
    
    function Voter(string newName, uint newAge, string newState, string birthDate, string newParty) Person(newName, newAge, newState, birthDate){
        require(newAge >= 18);
        party = newParty;
    }
    
}

contract Candidate is Voter {
    uint index;
    
    function Candidate(string newName, uint newAge, string newState, string birthDate, string newParty, uint thisIndex) Voter(newName, newAge, newState, birthDate, newParty) {
        require(newAge >= 35);
        index = thisIndex;
    }
    
}

contract Election {
    //TODO
}