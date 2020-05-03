#include <iostream>
using namespace std;

int main() {
	int n, key, total(0), i(1);
	cin >> n;
	key = n;

	while (key > 1) {
		total += (key - 1) * i;
		i++;
		key--;
	}

	total += n;
	cout << total << endl;

	return 0;
}