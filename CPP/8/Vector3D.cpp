
#include "Vector3D.h"
#include <iostream>
float Vector3D::obj_count = 0;
Vector3D::Vector3D(float x, float y, float z)
{
	_x = x;
	_y = y;
	_z = z;

	obj_count++;
}

void Vector3D::printVector3D()
{
	std::cout << "x: " << _x << std::endl;
	std::cout << "y: " << _x << std::endl;
	std::cout << "z: " << _x << std::endl;
}

float Vector3D::getXPos() const
{
	return _x;

}

float Vector3D::getYPos() const
{
	return _y;

}

float Vector3D::getZPos() const
{
	return _z;

}

Vector3D::~Vector3D()
{
}

Vector3D operator-(const Vector3D& v1, const Vector3D& v2)
{
	float xSum = v1.getXPos() - v2.getXPos();
	float ySum = v1.getYPos() - v2.getYPos();
	float zSum = v1.getZPos() - v2.getZPos();
	return Vector3D{ xSum, ySum,zSum };
}

Vector3D operator*(const Vector3D& v1, const Vector3D& v2)
{
	float xSum = v1.getXPos() * v2.getXPos() - v1.getZPos() * v2.getYPos();
	float ySum = v1.getYPos() * v2.getYPos() - v1.getXPos() * v2.getZPos();
	float zSum = v1.getZPos() * v2.getZPos() - v1.getYPos() * v2.getXPos();
	return Vector3D{ xSum, ySum,zSum };
}


Vector3D operator+(const Vector3D& v1, const Vector3D& v2)
{
	float xSum = v1.getXPos() + v2.getXPos();
	float ySum = v1.getXPos() + v2.getYPos();
	float zSum = v1.getXPos() + v2.getZPos();
	return Vector3D{ xSum, ySum,zSum };
}