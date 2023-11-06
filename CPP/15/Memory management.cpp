#include <iostream>

	int main()
	{
		int* ptr{ new int }; // dynamically allocate an integer
		*ptr = 7; // put a value in that memory location	
		std::cout << *ptr;
		delete ptr; // return the memory to the operating system.
		return 0;
	}
