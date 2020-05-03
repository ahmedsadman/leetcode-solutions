#include <iostream>
using namespace std;

int main() {
	int m, n, counter(0);
	cin >> m >> n;

	while (m * n > 0) {
		m--; n--;
		//cout << temp << endl;
		counter++;
	}

	//cout << counter << endl;
	
	if (counter % 2 == 0)
		cout << "Malvika" << endl;
	else
		cout << "Akshat" << endl;
	
	return 0;
}