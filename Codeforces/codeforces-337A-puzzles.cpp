// Codeforces 337A Puzzles
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int n, m, f[1000];
	int min;
	cin >> n >> m;

	for (int i = 0; i < m; i++) 
		cin >> f[i];

	sort(f, f+m);

	/*for (int i = 0; i < m; i++)
		cout << f[i] << endl;*/

	min = f[n-1] - f[0];
	//cout << "f(n-1)= " << f[n-1] << " f(0)= " << f[0] << " min= " << min << endl;

	for (int i = 1; i <= m-n; i++) {
		//cout << "f(i+n-1)= " << f[i+n-1] << " f(i)= " << f[i];
		min = (f[i+n-1] - f[i] < min) ? f[i+n-1] - f[i] : min;
		//cout << " min= " << min << endl;
	}
	cout << min << endl;
	return 0;
}