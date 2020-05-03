// Codeforces 160A - Twins

#include <iostream>
#include <string>
using namespace std;

// sorts an array in descending order
void sort(int a[], int n) {
	int i, j, temp;
	for (i = 0; i < n - 1; i++) {
		for (j = i + 1; j < n; j++) {
			if (a[i] < a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
}

int main() {
	int n, i, limit;
	int total(0), temp(0), result(0);
	cin >> n;
	int coins[n];

	for (i = 0; i < n; i++) {
		cin >> coins[i];
		total += coins[i];
	}

	limit = total / 2 + 1;
	sort(coins, n);
	for (i = 0; i < n; i++) {
		temp += coins[i];
		result++;
		if (temp >= limit)
			break;
	}

	cout << result << endl;
	return 0;
}
