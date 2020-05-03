// Codeforces 136A Presents
#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	int in[n];
	int res[n];

	for (int i = 0; i < n; i++) {
		cin >> in[i];
		res[in[i]-1] = i+1;
	}

	for (int i = 0; i < n; i++)
		cout << res[i] << " ";
	return 0;
}