#include <iostream>
#include <string>
using namespace std;

int main() {
	string str1, str2;
	int a, b;
	cin >> str1 >> str2;
	string result = "";

	for (int i = 0; i < str1.length(); i++) {
		a = str1[i] - '0';
		b = str2[i] - '0';
		result += (a - b == 0) ? '0' : '1';
	}

	cout << result << endl;
	return 0;
}