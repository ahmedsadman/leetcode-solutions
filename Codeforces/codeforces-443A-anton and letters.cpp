#include <iostream>
#include <string>
#include <set>
#include <cstdio>
using namespace std;

int main() {
	char ch;
	set<char> elements; // a set type stores only unique elements

	while (cin >> ch) {
		if (ch != '{' && ch != ',' && ch != '}')
			elements.insert(ch);
	}

	cout << elements.size() << endl;
	return 0;
}