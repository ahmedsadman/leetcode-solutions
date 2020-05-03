#include <iostream>
using namespace std;

int main() {
	int x, ex;
	cin >> x;

	if (x <= 5) {
		cout << 1 << endl;
		return 0;
	} else {
		ex = (x % 5 == 0) ? 0 : 1;
		cout << ex + x / 5 << endl;
	}

	return 0;
}