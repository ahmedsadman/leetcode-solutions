#include <iostream>
using namespace std;

int main() {
	int n, odd(0), even(0), diff, index_even, index_odd;
	cin >> n;
	int list[n];

	for (int i = 0; i < n; i++) {
		cin >> list[i];
		if (list[i] % 2 == 0) {
			even++;
			index_even = i+1;
		}
		else {
			odd++;
			index_odd = i+1;
		}
	}

	cout << (even > odd ? index_odd : index_even) << endl;
	return 0;
}