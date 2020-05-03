# Way too long words - CodeForces 71A
# http://codeforces.com/problemset/problem/71/A

words = raw_input("")
words = int(words)
abbr = []

for i in range(words):
	word = raw_input("")
	if len(word) <= 10:
		abbr.append(word)
	else:
		first_letter = word[0]
		last_letter = word[-1]
		middle_length = len(word[1:-1])
		final_abbr = first_letter + repr(middle_length) + last_letter
		abbr.append(final_abbr)

print 
for i in abbr:
	print i