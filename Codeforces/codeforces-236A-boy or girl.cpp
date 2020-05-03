// Codeforces 236A Boy or Girl
#include <iostream>
#include <string>
using namespace std;

int CountUnique(string str) {
	int i, x = 0;
	bool counter[200] = {false};

	for (i = 0; i < str.length(); i++) {
		int val = str[i];
		if (counter[val] != true)
			x++;
		counter[val] = true;
	}
	return x;
}

int main() {
	string str;
	cin >> str;
	int x = CountUnique(str);
	if (x % 2 == 0)
		cout << "CHAT WITH HER!" << endl;
	else
		cout << "IGNORE HIM!" << endl;
	return 0;
}
