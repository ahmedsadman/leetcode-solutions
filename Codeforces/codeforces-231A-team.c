// Codeforces 231A - Team
// http://codeforces.com/problemset/problem/231/A

#include <stdio.h>

int decide(int d[], int elements) {
	int i;
	int value = 0;

	for (i = 0; i < elements; i++) {
		if (d[i] == 1) value++;
	}

	if (value >= 2) {
		return 1;
	}
	else {
		return 0;
	}
}

int main(void) {
	int number, i, i2, check;
	int positive = 0;
	int d[3];
	scanf("%d", &number);

	// loops for three inputs
	for (i = 0; i < number; i++) {
		// loops for 3 integer to store in one array
		for (i2 = 0; i2 < 3; i2++) {
			scanf("%d", &d[i2]);
		}
		check = decide(d, 3);
		if (check == 1) positive++;
	}

	printf("%d", positive);
	return 0;
}
