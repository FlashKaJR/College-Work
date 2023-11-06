#include "Vector3D.h"
using namespace std;

float Vector3D::obj_count = 0; // Definition of static variable outside the class

Vector3D::Vector3D(float x, float y, float z)
{
	m_x = x;
	m_y = y;
	m_z = z;

	obj_count++;
}

float Vector3D::getXPos() const {
	return m_x;
}

float Vector3D::getYPos() const {
	return m_y;
}

float Vector3D::getZPos() const {
	return m_z;
}

void Vector3D::setPos(float x, float y, float z) {
	m_x = x;
	m_y = y;
	m_z = z;
}

void Vector3D::printVector3D() {
	cout << m_x << ", ";
	cout << m_y << ", ";
	cout << m_z;
}

Vector3D::~Vector3D()
{
}

// note: this function is not a member function function!
Vector3D operator+(const Vector3D& v1, const Vector3D& v2)
{
	float xSum = v1.getXPos() + v2.getXPos();
	float ySum = v1.getYPos() + v2.getYPos();
	float zSum = v1.getZPos() + v2.getZPos();
	return Vector3D{ xSum, ySum, zSum};
}

// note: this function is not a member function function!
Vector3D operator-(const Vector3D& v1, const Vector3D& v2)
{
	float xSum = v1.m_x - v2.m_x;
	float ySum = v1.m_y - v2.m_y;
	float zSum = v1.m_z - v2.m_z;
	return Vector3D{ xSum, ySum, zSum };
}

// note: this function is not a member function function!
Vector3D operator*(const Vector3D& v1, const Vector3D& v2)
{
	float xSum = (v1.m_y * v2.m_z) - (v1.m_z * v2.m_y);
	float ySum = (v1.m_z * v2.m_x) - (v1.m_x * v2.m_z);
	float zSum = (v1.m_x * v2.m_y) - (v1.m_y * v2.m_x);
	return Vector3D{ xSum, ySum, zSum };
}

