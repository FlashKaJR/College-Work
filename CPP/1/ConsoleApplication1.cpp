#include <iostream>
using namespace std;


int main(int argb, char* argd[])
{
	int * pNumber = new int;
	*pNumber = 9;
	cout << "The value at pNumber : " << *pNumber;
	delete pNumber;
}




