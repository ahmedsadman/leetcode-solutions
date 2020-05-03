# Codeforces 282A Bit++
# http://codeforces.com/problemset/problem/282/A

n = raw_input("")
n = int(n)
x = 0

for i in range(n):
	st = raw_input("")
	if (st[0] == "+" or st[1] == "+"):
		x += 1
	elif (st[0] == "-" or st[1] == "-"):
		x -= 1

print x
