#include <iostream>
#include <new>

int main() {
	std::cout << "How many names you wish to enter? : ";
	int size;
	try {
		std::cin >> size;
		int* a = new int[size];
	}
	catch (std::bad_alloc& exception) {
		std::cout << "The number is too large. Exception: " << exception.what();
	}



	std::string* Name_list = new std::string[size];
	std::cout << "Enter the names " << std::endl;
	for (int i = 0; i < size; i++)
	{
		std::cin >> Name_list[i];
	}
	for (int i = 0; i < size; i++) {
		std::cout << i + 1 << ". " << Name_list[i] << " ";
	}
	std::string* Name_list_new = new std::string[2 * size];
	for (int i = 0; i < size; i++)
	{
		Name_list_new[i] = Name_list[i];
	}
	delete[]Name_list;
	std::cout << std::endl;
	for (int i = 0; i < size; i++) {
		std::cout << i + 1 << ". " << Name_list_new[i] << " ";
	}
	delete[]Name_list_new;
}




