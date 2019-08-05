def fizzBuzz(n: int):
    arr = []
    for i in range(n):
        if i % 3 == 0 and i % 5 == 0 and i != 0:
            arr.append("FizzBuzz")
        elif i % 3 == 0:
            arr.append("Fizz")
        elif i % 5 == 0:
            arr.append("buzz")
        else:
            arr.append(i)
    return arr


print(fizzBuzz(15))
