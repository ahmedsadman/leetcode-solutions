#include <iostream>
using namespace std;

int main() {
	int l, b, year; // l = limak b = bob
	cin >> l >> b;

	for (year = 0; ; l *= 3 , b *= 2, year++)
		if (l > b)
			break;

	cout << year << endl;
	return 0;
}