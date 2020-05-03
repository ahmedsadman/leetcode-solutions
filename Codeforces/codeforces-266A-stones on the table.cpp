// Codeforces 266A Stones on the table
#include <iostream>
#include <string>
using namespace std;

int main() {
	string s;
	char temp;
	int n, i, total = 0;
	cin >> n;
	cin >> s;

	i = 0;
	temp = '0';

	while (i < n) {
		if (s[i] == temp)
			total++;
        temp = s[i];
		i++;
	}
	cout << total << endl;

	return 0;
}
