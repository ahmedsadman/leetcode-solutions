// Codeforces 41A - Translation
#include <iostream>
#include <string>
using namespace std;

int main() {
	string s, input;
	bool res = true;;
	cin >> s;
	cin >> input;
	char test[s.length()];
	
	for (int i = s.length(); i > 0; i--)
		test[s.length()-i] = s[i-1];

	for (int i = 0; i < s.length(); i++) {
		if (test[i] != input[i]) {
			res = false;
			break;
		}
	}
	
	cout << (res ? "YES" : "NO") << endl;
	return 0;
}