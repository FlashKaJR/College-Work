#include<iostream>
#include "Point2D.h"

int main(){
    Point2D pointA (5,5);
    Point2D pointB {3,2};

    Point2D pointC;
    
    std::cout << "Point A + Point B = ";
    pointC = pointA + pointB;
    std::cout << "X: " << pointC.getXPos();
    std::cout << ", Y: " << pointC.getYPos() << std::endl;

    std::cout << "Point A - Point B = ";
    pointC = pointA - pointB;
    std::cout << "X: " << pointC.getXPos();
    std::cout << ", Y: " << pointC.getYPos()<< std::endl;
}