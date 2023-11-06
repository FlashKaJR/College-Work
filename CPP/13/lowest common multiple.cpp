#include <iostream>
using namespace std;
int main()
{
	int num1, num2, gcd, result;
	gcd = 0;
	cout << "First number: ";
	cin >> num1;
	cout << "Second number: ";
	cin >> num2;

	for (int i = 1; i <= num1 && i <= num2; i++)
	{
		if (num1 % i == 0 && num2 % i == 0)
		{
			gcd = i;
		}

	}
	result = (num1 / gcd) * num2;
	cout << "LCM = " << result << endl;
	return 0;
}