// Codeforces 58A Chat Room

#include <iostream>
#include <string>
using namespace std;

int main() {
	char a[] = {'h', 'e', 'l', 'l', 'o'};
	int i, index = 0;
	string str;
	cin >> str;

	for (i = 0; i < str.length(); i++) {
		if (str[i] == a[index])
			index++;
	}

	cout << (index == 5 ? "YES" : "NO") << endl;
	return 0;
}
