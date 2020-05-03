#include <iostream>
#include <string>
using namespace std;

int main() {
	int n, t;
	string str;
	cin >> n >> t;
	cin >> str;

	while (t--) {
		for (int i = 1; i < str.length(); i++) {
			if (str[i] == 'G' && str[i-1] == 'B') {
				str[i] = 'B';
				str[i-1] = 'G';
				i++;
			}
		}
	}

	cout << str << endl;
	return 0;
}
