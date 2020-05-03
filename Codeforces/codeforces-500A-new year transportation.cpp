#include <iostream>
using namespace std;

int main() {
	int n, t, pos(1);
	bool possible = false;

	cin >> n >> t;
	int userin[n];

	for (int i = 1; i < n; i++) 
		cin >> userin[i];

	while (pos < n) {
		pos += userin[pos];
		if (pos == t) {
			possible = true;
			break;
		}
	}

	cout << ((possible) ? "YES" : "NO") << endl;
	return 0;
}