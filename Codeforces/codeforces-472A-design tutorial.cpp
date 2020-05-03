#include <iostream>
using namespace std;

int notPrime(int x) {
	int nprime(0);

	for (int i = 2; i * i <= x; i++) {
		if (x % i == 0) {
			nprime = 1;
			break;
		}
	}

	return nprime;
}

int main() {
	int n, x(0), y(0);
	cin >> n;

	if (n % 2 == 0 && notPrime(n/2)) {
		x = y = n / 2;
	} else {
		x = (n/10) * 10; // x > y
		y = n - x;

		while (notPrime(x) == 0 || notPrime(y) == 0) {
			x--;
			y++;
		}
	}

	cout << x << " " << y << endl;
	return 0;
}	