// Next Round - Codeforces 158A
// http://codeforces.com/problemset/problem/158/A

#include <stdio.h>

int main(void) {
	short int n, k, i, input, qualified = 0;
	scanf("%hi %hi", &n, &k);
	short int arr[n];

	// get the scroes and store it in array "arr"
	for (i = 0; i < n; i++) {
		scanf("%hi", &input);
		arr[i] = input;
	}

	// evaluate the scores and qualify for next rounds
	for (i = 0; i < n; i++) {
		if (arr[i] > 0 && arr[i] >= arr[k-1]) {
			qualified++;
		}
	}

	printf("%hi", qualified);
	return 0;
}
