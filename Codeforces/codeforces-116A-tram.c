// Codeforces 116A Tram
#include <stdio.h>

int main(void) {
    int i;
    int total = 0, rem = 0, stop, current = 0;
    int in_before = 0, in = 0, out = 0, out_before = 0;
    scanf("%d", &stop);

    i = 0;
    while (i < stop) {
        if (stop == 0)
            break;
        scanf("%d %d", &out, &in);
        rem = (in_before - out) + rem;
        current = rem + in;

        if (current > total)
            total = current;
        in_before = in;
        // printf("rem: %d, current: %d\n", rem, current);
        i++;
    }
    printf("%d", total);
    return 0;
}
