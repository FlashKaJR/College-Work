#pragma once
#include <iostream>
using namespace std;


class Vector3D
{
	//part1
private:
	float _x;
	float _y;
	float _z;

public:
	//part2
	//Vector3D(int _x = 0, int _y = 0, int _z = 0);
	static float obj_count;
	Vector3D(float x, float y, float z);
	~Vector3D();
	float getXPos() const;
	float getYPos() const;
	float getZPos() const;

	void setPos(float x, float y, float z);

	//void printPoint();
	//Vector3D(float x, float y, float z);
	void printVector3D();


	//part3
	friend Vector3D operator-(const Vector3D& v1, const Vector3D& v2);
	friend Vector3D operator*(const Vector3D& v1, const Vector3D& v2);
	friend Vector3D operator+(const Vector3D& v1, const Vector3D& v2);

};

