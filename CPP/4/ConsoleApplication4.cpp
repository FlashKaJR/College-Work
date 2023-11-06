#include <iostream>
#include <vector>
#include <algorithm> 
#include <random>
#include <chrono>
#include <string>
using namespace std;


// global vectors that hold all of the 13 Ranks and 4 suits available in a deck
std::string Ranks[] = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
std::string Suits[] = { "Spades", "Hearts", "Diamonds", "Clubs" };

// create a new struct to represent each card
struct card {
    // Suit
    string suit;
    // Rank
    string rank;
};

std::vector<card> shuffleDeck() {
    /*
    - Decks have 52 cards
    - 13 cards for each rank
    - 4 suits
    */
    int n_rank = 13;
    int n_suits = 4;

    std::vector<card> deck;// initialise empty vector to hold cards

    // add cards to deck 
    for (size_t s = 0; s < n_suits; s++)
    {
        for (size_t r = 0; r < n_rank; r++)
        {
            // create a new card
            card newCard;
            // assign a rank to new card
            newCard.rank = Ranks[r];
            // assign a suit to new card
            newCard.suit = Suits[s];

            // push new card to deck
            deck.push_back(newCard);

        }
    }

    // using a time-based seed to shuffle:
    unsigned seed = std::chrono::system_clock::now().time_since_epoch().count(); // seed will change each time the app runs
    std::shuffle(std::begin(deck), std::end(deck), std::default_random_engine(seed)); // shuffle cards in deck


    return deck;
}

card dealCard(std::vector<card>& deck, std::vector<card>& playerHand) {

    card hit;
    // add new card to player's hand
    playerHand.push_back(deck.back());

    // remove last card from deck
    
        deck.pop_back();
    

    return hit;
}


void printDeck(const std::vector<card>& deck) {
    // ranged loop to print each card
    for (auto i : deck) {
        cout << i.rank << " " << i.suit << ", ";
    }
}




int main() {

    char guess;

    // new deck with all cards
    std::vector<card> deck = shuffleDeck();

    std::vector<card> playerHand; // player's deck (empty vector)

    while (true)
    {
        std::cout << "\n\nPress 'h' to get a card or 's' to stop: ";
        // Take input using cin
        std::cin >> guess;
        if (guess == 'h')
        {
            if (deck.empty())
            {
                std::cout << "\n\nNo more cards in the deck\n\n";
                break;
            }

            card newCard = dealCard(deck, playerHand); // get a card from deck

            std::cout << "Cards you have: " << 52 - deck.size() << "\n";
            printDeck(playerHand);

            // check if deck is empty
            
        }
        else if (guess == 's') {
            break;
        }
    }
}