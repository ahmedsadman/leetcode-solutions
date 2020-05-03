#include <iostream>
#include <string>
using namespace std;

int main() {
	int n, group(1);
	cin >> n;
	string list[n];

	cin >> list[0]; // takes the first input separately

	for (int i = 1; i < n; i++) {
		cin >> list[i];
		if (list[i] != list[i-1])
			group++;
	}

	cout << group << endl;
	return 0;
}