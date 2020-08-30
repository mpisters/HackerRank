import re
total = int(input())
for i in range(total):
    line = input()
    if re.match(r'((1?[0-9][0-9]?|2[0-5][0-5]?)\.){3}(?:1?[0-9][0-9]?|2[0-5][0-5]?)$', line):
        print('IPv4')
    elif re.match(r'^(?:[0-9a-f]{0,4}:){7}[0-9a-f]{0,4}$', line):
        print('IPv6')
    else:
        print('Neither')
