#include <iostream>
#include <vector>
#include <stdio.h>    
#include <stdlib.h>     
#include <time.h> 
#include <conio.h>

// (todo) create a new structure---------------------------------------------------------
struct item{       //struct item
    std::string rarity;
    int value;
};


// Use this function to simulate rolling a six-sided dice and return the result as an integer.
int rollDice() {
    /* initialize random seed:*/
    srand(time(NULL));
    return rand() % 6 + 1;
}

/*
By using a reference (std::vector<item>&inv), you are providing the function
 with a direct reference to the original vector in memory.
 This means that any changes made to the vector within the function are directly
 applied to the original vector in the main() function.
 Without the reference, you would be working with a copy of the vector, and changes would be isolated within the function.
 */

void addToInventory(std::vector<item>& inv, int itemRarity) {
    item newItem;
    switch (itemRarity)
    {
    case 3:
        newItem.rarity = "rare";
        newItem.value = 100;
        break;

    case 6:
        newItem.rarity = "legendary";
        newItem.value = 1000;
        break;

    default:
        newItem.rarity = "common";
        newItem.value = 10;
        break;
    }
    inv.push_back(newItem);
    // (todo) add new item using push_back()-------------------------------------------------------
}


/*
    Here you can use std::vector<item> inv because this function is only reading values in the vector.
    Then, a copy of the vector is enough for this operation
*/
void printInventory(std::vector<item> inv) {
    int total;
    for (auto i : inv) {
        total = inv.size();
        
    }
    std::cout << "                                                           Total: " << total;
    // (todo) for loop to print elements----------------------------------------------------------------
}

int main() {
    // create vector that will store items
    std::vector<item> inventory;

    //push items to vector
    for (int i = 1; i <= 3; i++) // add elements to vector
        addToInventory(inventory, i);

    char guess;
    while (true)
    {
        // ask user for L or H
        std::cout << "\n\nEnter your guess ('h' or 'l') or enter any key to exit: ";
        // Take input using cin
        std::cin >> guess;
        if (guess == 'h' || guess == 'l')
        {
            int diceNumber = rollDice();
            std::cout << "\n\nYou rolled: " << diceNumber;

            if ((diceNumber <= 3 && guess == 'l') || (diceNumber > 3 && guess == 'h'))
            {
                std::cout << " - A new item has been added to your inventory\n\n" << std::endl;
                addToInventory(inventory, diceNumber);
            }
            else {
                std::cout << " - You lost one item in your inventory\n\n" << std::endl;
                inventory.pop_back(); // remove one item in inventory

                // check if inventory is empty
                if (inventory.empty())
                {
                    std::cout << "GAME OVER";
                    break;
                }
            }
        }
        else {
            break;
        }

        // print items in inventory  
        printInventory(inventory);

        std::cout << "\nPress any key to continue" << std::endl;
        //getch();
    }
}