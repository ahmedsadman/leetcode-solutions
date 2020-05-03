// Codeforces Taxi 158B

#include <stdio.h>

int main(void) {
	long int temp, total, i, n;
	scanf("%ld", &n);
	long int g[n], count1, count2, count3;
	total = 0;
	temp = 0;
	count1 = count2 = count3 = 0;

	for (i = 0; i < n; i++)
		scanf("%ld", &g[i]);

    for (i = 0; i < n; i++) {
        if (n == 1) {
            total++;
            break;
        }
        if (g[i] == 1) count1++;
        else if (g[i] == 2) count2++;
        else if (g[i] == 3) {
            count3++;
            total++;
        }
        else {
            total++;
        }
    }

	count2 = count2 * 2;
	total += count2 / 4;
	long left = count2 % 4;
	if (count3 >= count1)
        count1 = 0;
    else {
        count1 = count1 - count3;
    }

    temp = left + count1;
    while (temp > 0) {
        total++;
        temp = temp - 4;
    }

	printf("%ld", total);

	return 0;
}
