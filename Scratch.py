def duplicate_count(txt):
    count = 0
    hasher = {}
    for i in txt:
        if i not in hasher:
            hasher[i] = 0
        else:
            hasher[i] += 1
            if hasher[i] == 1:
                count += 1
    return count
