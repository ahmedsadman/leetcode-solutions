// Codeforces 546A Soldiers and Bananas
#include <iostream>
using namespace std;

int main() {
	int k(0), w(0);
	long long int n(0);
	int cost(0);
	cin >> k >> n >> w;

	for (int i = 1; i <= w; i++)
		cost += k * i;

	if (cost > n)
		cout << cost - n << endl;
	else 
		cout << 0 << endl;

	return 0;
}