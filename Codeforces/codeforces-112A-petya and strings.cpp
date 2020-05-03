#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

string lowercase(string data) {
	transform(data.begin(), data.end(), data.begin(), ::tolower);
	return data;
}

int main() {
	string s1, s2;
	string a = "abcdefghijklmnopqrstuvwxyz";
	int len, i, a1, a2;
	a1 = a2 = 0;
	cin >> s1 >> s2;

	s1 = lowercase(s1);
	s2 = lowercase(s2);
	len = s1.length();

	for (i = 0; i < len; i++) {
		if (s1[i] != s2[i]) {
			a1 = a.find(s1[i], 0);
			a2 = a.find(s2[i], 0);
			if (a1 < a2)
				cout << -1 << endl;
		 	else
				cout << 1 << endl;
			break;
		}
	}
	if (a1 == 0 && a2 == 0) cout << 0 << endl;
	return 0;
}
