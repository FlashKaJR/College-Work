#include "Point3D.h"

int Point3D::obj_count = 0; // Definition of static variable outside the class

Point3D::Point3D(float x, float y, float z)
{
	m_x = x;
	m_y = y;
	m_z = z;

	obj_count++;
}

int Point3D::getXPos() const {
	return m_x;
}

int Point3D::getYPos() const {
	return m_y;
}

int Point3D::getZPos() const {
	return m_z;
}

void Point3D::setPos(float x, float y, float z) {
	m_x = x;
	m_y = y;
	m_z = z;
}

void Point3D::printPoint() {
	std::cout << "X: " << m_x;
	std::cout << "\nY: " << m_y;
	std::cout << "\nZ: " << m_z;
}

Point3D::~Point3D()
{
}

// note: this function is not a member function function!
Point3D operator+(const Point3D& p1, const Point3D& p2, const Point3D& p3)
{
	int xSum = p1.getXPos() + p2.getXPos() + p3.getXPos();
	int ySum = p1.getYPos() + p2.getYPos() + p3.getYPos();
	int zSum = p1.getZPos() + p2.getZPos() + p3.getZPos();
	return Point3D{ xSum, ySum, zSum};
}

// note: this function is not a member function function!
Point3D operator-(const Point3D& p1, const Point3D& p2, const Point3D& p3)
{
	int xSum = p1.m_x - p2.m_x;
	int ySum = p1.m_y - p2.m_y;
	int ySum = p1.m_z - p2.m_z;
	return Point3D{ xSum, ySum, zSum };
}

