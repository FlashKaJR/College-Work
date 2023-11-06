#include <iostream>
#include "Vector3D.h"
using namespace std;

int main() 
{
	char ans;
	while (true)
	{
		float x1 = 0.0f;
		float y1 = 0.0f;
		float z1 = 0.0f;
		float x2 = 0.0f;
		float y2 = 0.0f;
		float z2 = 0.0f;

		
		int choice;

		cout << "\nEnter the coordinates of the first vector (x y z): ";
		cin >> x1;
		cin >> y1;
		cin >> z1;
		cout << "Enter the coordinates of the second vector (x y z): ";
		cin >> x2;
		cin >> y2;
		cin >> z2;
		Vector3D v1 = Vector3D(x1, y1, z1);		
		Vector3D v2 = Vector3D(x2, y2, z2);
		Vector3D result = Vector3D();
		cout << "\nSelect an operation: \n1. v1 + v2\n2. v1 - v2\n3. v1 * v2 (cross product)\nChoice (1/2/3): ";
		cin >> choice;
		switch (choice)
		{
		case 1:
			result = v1 + v2;
			cout << "\nv1 + v2 = (";
			result.printVector3D();
			cout << ")";
			break;
		case 2:
			result = v1 - v2;
			cout << "\nv1 - v2 = (";
			result.printVector3D();
			cout << ")";
			break;
		case 3:
			result = v1 * v2;
			cout << "\nv1 * v2 = (";
			result.printVector3D();
			cout << ")";
			break;
		}
		cout << "\n\nDo you want to perform another operation? (y/n): ";
		cin >> ans;
		if (ans == 'y')
		{
			/*break;*/
		}
		else if (ans == 'n')
		{
			return false;
		}
	}
}