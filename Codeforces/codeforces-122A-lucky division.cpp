// Codeforces 122A Lucky division
#include <iostream>
#include <math.h>
using namespace std;

bool lucky(int n) {
	int temp;
	while (n > 0) {
		temp = n % 10;
		if (temp != 4 && temp != 7) {
			return false;
		}
		n = n / 10;
	}
	return true;
}

bool almost_lucky(int n) {
    int i;
	if (lucky(n)) {
		return true;
	}

	for (i = 2; i <= sqrt(n); i++) {
		if (n % i == 0 && (lucky(i) || lucky(n/i))) {
			return true;
		}
	}

	return false;
}

int main() {
	int a;
	cin >> a;

	cout << (almost_lucky(a) ? "YES" : "NO");
	cout << endl;

	return 0;
}
