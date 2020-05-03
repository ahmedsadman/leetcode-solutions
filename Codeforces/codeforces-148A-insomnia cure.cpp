// Codeforces 148A Insomnia Cure

#include <iostream>
using namespace std;

int main() {
	int k, l, m, n, d;
	int damaged;

	cin >> k >> l >> m >> n >> d;
	damaged = d;

	for (int i = 1; i <= d; i++)
		if (i % k != 0 && i % l != 0 && i % m != 0 && i % n != 0)
			damaged--;

	cout << damaged << endl;
	return 0;
}
