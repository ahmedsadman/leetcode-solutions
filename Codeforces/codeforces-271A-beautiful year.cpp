// Codeforces 271A Beautiful Year

#include <iostream>
using namespace std;

int extract_digit(int &d) {
	int x = d % 10;
	d = d / 10;
	return x;
}

int main() {
	int year;
	cin >> year;
	int x1, x2, x3, x4, temp;

	while(1) {
		year++;
		temp = year;
		x1 = extract_digit(temp); // 2014 -> 4
		x2 = extract_digit(temp); // 2014 -> 1
		x3 = extract_digit(temp); // 2014 -> 0
		x4 = extract_digit(temp); // 2014 -> 2

		if (x1 != x2 && x1 != x3 && x1 != x4 && x2 != x3 && x2 != x4 && x3 != x4 && x4 != x1) {
			cout << year;
			break;
		}
	}

	return 0;
}
