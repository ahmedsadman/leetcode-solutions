// Codeforces 50A Domino Piling
// http://codeforces.com/problemset/problem/50/A
#include <stdio.h>

int main(void) {
	int m, n, area, max;
	int domino = 2;

	scanf("%d %d", &m, &n);
	area = m * n;
	max = area / domino;
	printf("%d", max);
	return 0;
}