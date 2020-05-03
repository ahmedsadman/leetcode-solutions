#include <iostream>
using namespace std;

int main() {
	int n, m, total, temp;
	cin >> n >> m;
	total = n + (n / m);
	temp = total;

	for (int i = n+1; i <= temp; i++) {
		if (i % m == 0) {
			total++;
			temp++;
			//cout << "i: " << i << " total: " << total << " temp: " << temp << endl;
		}
	}

	cout << total << endl;

	return 0;
}