#include <iostream>
#include <algorithm>
using namespace std;

int gcd(int a, int b) {
	int temp;

	if (a == 0 || b == 0)
		return (a==0) ? b : a;

	if (b > a)
		swap(a, b);

	while (a % b != 0) {
		temp = b;
		b = a % b;
		a = temp;
	}

	return b;
}

int main() {
	int a, b, n, turn, counter(1);
	cin >> a >> b >> n;

	while (n > 0) {
		if (counter % 2 == 0) // antisimon's turn
			turn = 0;
		else // simon's turn
			turn = 1;

		n -= (turn == 1) ? gcd(a, n) : gcd(b, n);
		counter++;
	}

	if (turn == 0) // simon lose
		cout << 1 << endl;
	else // antisimon lose
		cout << 0 << endl;

	return 0;
}
