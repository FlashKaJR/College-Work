#include "Player.h"
#include <iostream>
using namespace std;
// Constructor
Player::Player(int playerMaxHP)
{
	_max_hp = playerMaxHP;
	_current_hp = 1;
	cout << "Enter Player name: ";
	cin >> _name;

	std::cout << "Player Name: " << _name;
	std::cout << "	HP: " << _current_hp << " / " << _max_hp;
	std::cout << "	Position (x, y): (" << _position._x << ", " << _position._y << ")\n";
}  

void Player::printInfo() {
	std::cout << "Player Name: " << _name;
	std::cout << "	HP: " << _current_hp << " / " << _max_hp;
	std::cout << "	Position (x, y): (" << _position._x << ", " << _position._y << ")\n";
}

void Player::restoreHP()
{
	if (_current_hp < _max_hp)
	{
		_current_hp++;
	}
}

void Player::startMovement() {
	cout << "Enter a movement (AWSD or 'Q' to quit):\n";
	char input;
	while (true) {
		input = _getch();

		if (input == 'q') {
			cout << "Quitting the game.\n";
			break;
		}

		if (input == 'a' || input == 'w' || input == 's' || input == 'd')
		{
			restoreHP();
			_position.move(input);
			printInfo();
		}
	}
}