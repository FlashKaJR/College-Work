#include <iostream>
using namespace std;

class Cylinder
{
	const double Pi;
	double Radius;
	double Height;

public:
	Cylinder(double InputRadius, double InputHeight) : Radius(InputRadius), Height(InputHeight), Pi(3.1416) {}

	double GetArea()
	{
		return (2 * Pi*Radius*Height)+(2*Pi*Radius*Radius);
	}

	double GetVolume()
	{
		return Pi * Radius*Radius*Height;
	}
};

int main()
{
	cout << "Enter a radius: ";
	double Radius = 0;
	cin >> Radius;	
	cout << "Enter a height: ";
	double Height = 0;
	cin >> Height;

	Cylinder myCylinder(Radius, Height);

	cout << "Area = " << myCylinder.GetArea() << endl;
	cout << "Volume = " << myCylinder.GetVolume() << endl;
	

	return 0;
}