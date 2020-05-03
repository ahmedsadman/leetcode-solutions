// Codeforces 110A Nearly Lucky Number
#include <iostream>
using namespace std;

int main() {
	long long int n;
	int total(0), digit;
	cin >> n;

	while (n > 0) {
		digit = n % 10;
		if (digit == 4 || digit == 7) {
			total++;
			if (total > 7)
				break;
		}
		n = n / 10;
	}

	if (total == 4 || total == 7)
		cout << "YES" << endl;
	else
		cout << "NO" << endl;

	return 0;
}
