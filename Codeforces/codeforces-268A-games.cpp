#include <iostream>
using namespace std;

int main() {
	int n, total(0);
	cin >> n;
	int u[n][2];

	for (int i = 0; i < n; i++)
		for (int j = 0; j < 2; j++)
			cin >> u[i][j];

	for (int i = 0; i < n; i++)
		for (int j = 0; j < n; j++)
			if (u[i][1] == u[j][0]) {
				if (i != j) {
					/*if (u[i][1] == u[j][0])
						cout << "u[" << i << "][1] = " << u[i][1] << "\tu[" << j << "][0] = " << u[j][0] << endl;
					else
						cout << "u[" << i << "][1] = " << u[i][1] << "\tu[" << j << "][1] = " << u[j][1] << endl;*/
					total++;
				}
				
			}

	cout << total << endl;
	return 0;
}