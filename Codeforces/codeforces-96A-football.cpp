#include <iostream>
#include <string>
using namespace std;

int main() {
	string input;
	int i, i1;

	cin >> input;
	if (input.length() >= 7) {
		i = input.find("1111111", 0);
		i1 = input.find("0000000", 0);
		// cout << i << endl;
		if (i != string::npos || i1 != string::npos)
			cout << "YES" << endl;
		else
			cout << "NO" << endl;
	}
	else
		cout << "NO" << endl;

	return 0;
}
