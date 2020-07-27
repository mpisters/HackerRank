if __name__ == '__main__':
    student_scores = []
    scores = []
    for step in range(int(input())):
        name = input()
        score = float(input())
        student_scores.append([name, score])
        scores.append(score)
    unique_scores = list(sorted(set(scores)))
    lowest_second_score = unique_scores[1]
    sorted_scores = sorted(student_scores, key = lambda x: x[0])
    names = [score[0] for score in sorted_scores if score[1] == lowest_second_score]
    for i in range(len(names)):
        print(names[i])
