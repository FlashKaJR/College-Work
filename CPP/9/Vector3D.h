#include <iostream>


class Vector3D

{
private:
	float m_x;
	float m_y;
	float m_z;
public:
	static float obj_count;
	Vector3D(float x = 0, float y = 0, float z = 0);
	~Vector3D();
	float getXPos() const;
	float getYPos() const;
	float getZPos() const;
	void setPos(float x, float y, float z);
	void printVector3D();

	// a friend function has access to private members
	friend Vector3D operator-(const Vector3D& v1, const Vector3D& v2);
	friend Vector3D operator+(const Vector3D& v1, const Vector3D& v2);
	friend Vector3D operator*(const Vector3D& v1, const Vector3D& v2);

};
//
//
//
//// Need to explicitly provide prototype for operator+ so uses of operator+ in other files know this overload exists
//Vector3D operator+(const Vector3D& v1, const Vector3D& v2);

