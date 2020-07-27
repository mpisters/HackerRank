if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    student_scores = student_marks[query_name]
    a = "{0:.{1}f}".format(sum(student_scores) / len(student_scores), 2)
    print(a)
