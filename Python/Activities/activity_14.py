def fibonacci(n):
    if n>=0:
        a, b = 1, 1
        yield a
        yield b
        for i in range(n):
            a, b = b, a + b
            yield b
            

print(list(fibonacci(10)))
