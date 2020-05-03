// Watermelon - Codeforces.com 4/A
// http://codeforces.com/problemset/problem/4/A

#include <stdio.h>

int main(void) {
	int weight;
	scanf("%d", &weight);

	if (weight % 2 == 0 && weight > 2) {
		printf("YES");
	} else {
		printf("NO");
	}
	return 0;
}
