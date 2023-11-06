#include <iostream>
using namespace std;

int main()
{
    int base, power;
    int* pows = new int;

    cout << "Enter base number: ";
    cin >> base;

    cout << "Enter power number: ";
    cin >> power;
    
    power = abs(power);
    *pows = power;

    cout << "power(" << base << ", " << power << ") = ";
    while (*pows > 1)
    {
        cout << base << " * ";
        *pows -= 1;
    };
 
    cout << base;

    return 0;
}

