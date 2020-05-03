#include <iostream>
#include <string>
#include <ctype.h>
using namespace std;

bool panagram(string str) {
	int counter[26] = {0};

	if (str.length() < 26)
		return false;

	for (int i = 0; i < str.length(); i++)
		counter[tolower(str[i])-'a']++;

	for (int i = 0; i < 26; i++) {
		if (counter[i] == 0)
			return false;
	}

	return true;
}


int main() {
	string str;
	int n;
	cin >> n;
	cin >> str;

	cout << (panagram(str) ? "YES" : "NO") << endl;
	return 0;
}
