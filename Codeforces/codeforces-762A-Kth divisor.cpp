// Codeforces 762A K-th divisor

#include <iostream>
#include <algorithm>
#include <vector>
#include <math.h>
using namespace std;

#define LL long long
#define pb push_back

int main(void) {
	vector<LL>v;
	LL n, k;
	cin >> n >> k;

	for (int i = 1; i <= sqrt(n); i++) {
		if (n % i == 0) {
			LL d = n / i;
			v.pb(i);
			if (d != i) v.pb(d);
		}
	}
	sort(v.begin(), v.end());

	if (k > v.size()) cout << -1;
	else cout << v[k-1];
	return 0;
}
