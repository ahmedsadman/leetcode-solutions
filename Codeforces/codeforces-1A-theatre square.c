// Theatre Square - Codeforces.com 1/A
// http://codeforces.com/problemset/problem/1/A

#include <stdio.h>

int main(void) {
	long long n;
	long long m;
	long long a;
	long long row;
	long long column;
	scanf("%I64d %I64d %I64d", &n, &m, &a);

	row = n / a;
	if (n % a != 0)  row++;
	column = m / a;
	if (m % a != 0) column++;
	printf("%I64d", row * column);
	return 0;
}
