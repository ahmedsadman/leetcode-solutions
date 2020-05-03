#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int n;
	cin >> n;
	int cube[n];

	for (int i = 0; i < n; i++)
		cin >> cube[i];

	sort(cube, cube+n);

	for (int i = 0; i < n; i++)
		cout << cube[i] << " ";
	cout << endl;

	return 0;
}
