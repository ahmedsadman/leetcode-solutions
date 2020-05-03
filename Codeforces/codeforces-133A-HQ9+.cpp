// Codeforces 133A HQ9+
#include <iostream>
#include <string>
using namespace std;

int main() {
	string data;
	bool result = false;
	cin >> data;
	int len = data.length();
	int i;

	for (i = 0; i < len; i++) {
		if (data[i] == 'Q' || data[i] == 'H' || data[i] == '9') {
			result = true;
			break;
		}
	}

	if (result)
		cout << "YES" << endl;
	else
		cout << "NO" << endl;

	return 0;
}
