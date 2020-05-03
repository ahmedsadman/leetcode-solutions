// Codeforces 69A young physicist
#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	int x1, y1, z1;
	int x(0), y(0), z(0);
	int eq = 1;

	for (int i = 0; i < n; i++) {
		cin >> x1 >> y1 >> z1;
		x += x1;
		y += y1;
		z += z1;
	}

	/*for (int i = 0; i < n-1; i++) {
		for (int j = 1; j < n; j++) {
			if (x[i] - x[j] != 0 || y[i] - y[j] != 0 || z[i] - z[j] != 0) {
				eq = 0;
				break;
			}
		}
	}*/

	if (x == 0 && y == 0 && z == 0)
		cout << "YES" << endl;
	else
		cout << "NO" << endl;

	return 0;
}