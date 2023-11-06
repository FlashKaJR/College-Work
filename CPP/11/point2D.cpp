#include <iostream>
#include "point2D.h"


Point2D::Point2D(int initialX, int initialY)
{
	_x = initialX;
	_y = initialY;
}
void Point2D::move(char direction) 
{
	switch (direction) 
	{
	case 'a': 
		_x--;
		break;
	case 'd': 
		_x++;
		break;
	case 'w': 
		_y--;
		break;
	case 's': 
		_y++;
		break;
	}
}


