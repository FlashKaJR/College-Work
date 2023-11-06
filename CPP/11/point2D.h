#pragma once
// Class to represent a 2D point (position)
class Point2D {
public:
    int _x, _y;

    Point2D(int initialX = 0, int initialY = 0);

    // Update the position based on user input (AWSD keys)
    void move(char direction);
};
