#include <iostream>
#include "Vector3D.h"

int main() {

	//part1

	while (true)
	{
	

		float x1,
		float x2;
		float y1;
		float y2;
		float z1;
		float z2;



		//part3
		std::cout << "input the coordinates of your first vector,(x,y,z): " << std::endl;

		std::cin >> x1 >> y1 >> z1;
		//std::cin >> y1;
		//std::cin >> z1;
		std::cout << "input the coordinates of your second vector,(x,y,z): ";
		std::cin >> x2 >> y2 >> z2;

		//std::cin >> x2;
		//std::cin >> y2;
		//std::cin >> z2;

		Vector3D v1(x1, y1, z1);
		Vector3D v2(x2, y2, z2);
		Vector3D results;
		char choice;
		//part4
		cout << "\n choose an operation:\n1.v1+v2\n2.v1 - v2\n3.v1*v2 \nChoice (1,2,3): ";
		cin >> choice;
		//part5
		
		switch (choice)
		{
		case 1:
			results = v1 + v2;
			cout << "\nv1 + v2 = ( ";
			results.printVector3D();
			cout << ")";
			break;
		case 2:
			results = v1 - v2;
			cout << "\nv1 - v2 = ( ";
			results.printVector3D();
			cout << ")";
			break;
		case 3:
			results = v1 * v2;
			cout << "\nv1 * v2 = ( ";
			results.printVector3D();
			cout << ")";
			break;
		case 'q':
			break;
		}
		//part6
		std::cout << "\n\nWould you like to perform another operation??? (yes(y)or no(n)): " << std::endl;
		std::cin >> choice;


		if (choice == 'n' || choice == 'Y')
		{
			break;
		}
	}



}