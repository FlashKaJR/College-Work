#include <iostream>

class Point3D
{
private:
	float m_x;
	float m_y;
	float m_z;
public:
	static float obj_count;
	Point3D(float x = 0, float y = 0, float z = 0);
	~Point3D();
	float getXPos() const;
	float getYPos() const;
	float getZPos() const;
	void setPos(float x, float y, float z);
	void printPoint();

	// a friend function has access to private members
	friend Point3D operator-(const Point3D& p1, const Point3D& p2);

};



// Need to explicitly provide prototype for operator+ so uses of operator+ in other files know this overload exists
Point3D operator+(const Point3D& p1, const Point3D& p2);

