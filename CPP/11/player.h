#pragma once
#include <iostream>
#include "point2D.h"
#include <conio.h> // Include for _getch()

// Class to represent a game player
class Player {
private:
    std::string _name;
    int _max_hp;
    int _current_hp;
    Point2D _position;


    // Print player information, including position
    void printInfo();
    // Restore player hp at the end of each turn
    void restoreHP();
public:
    //Class constructor
    Player(int playerMaxHP);

    // Get user input and update player position
    void startMovement();
};

