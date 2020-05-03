#include <iostream>
#include <string>
using namespace std;

int main() {
	int n, r(1);
	string names[] = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

	cin >> n;

	while (r * 5 < n) {
		n -= r * 5;
		r *= 2;
	}

	cout << names[(n-1) / r] << endl;
	return 0;
}