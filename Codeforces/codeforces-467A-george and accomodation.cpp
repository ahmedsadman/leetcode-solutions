// Codeforces 467A George and Accomodation
#include <iostream>
using namespace std;

int main() {
	int n;
	int oc(0), cap(0), vac(0);
	int total(0);
	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> oc >> cap;
		vac = cap - oc;
		if (vac >= 2)
			total++;
	}

	cout << total << endl;
	return 0;
}