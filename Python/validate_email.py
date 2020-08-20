import re
total_lines = int(input())
email = []
for i in range(total_lines):
    line = input()
    matches = re.findall(r'[-.\w]+@(?:[\w-]+\.)+[\w-]+', line)
    email += matches
result = ";".join(sorted(list(set(email))))
print(result)
