#include <iostream>
using namespace std;

int main() {
	long long int n, k, total(0), h, t(0);
	cin >> n >> k;
	h = (n % 2 == 0) ? n/2 : n/2+1;
	
	//cout << n << endl;
	if (k <= h)
		cout << 1 + (k - 1) * 2 << endl;
	else {
		if (n % 2 == 0)
			cout << n + (n - k) * -2 << endl;
		else {
			n = (n % 2 == 0) ? n : n-1;
			cout << n + (n - k + 1) * -2 << endl;
		}
	}

	return 0;
}