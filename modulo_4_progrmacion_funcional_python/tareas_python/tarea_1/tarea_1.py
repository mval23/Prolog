import time


def es_primo(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True


# Función de orden superior con filter para números primos
def primos_hasta_n(n):
    return list(filter(es_primo, range(2, n + 1)))


# Función con generador yield para números primos
def generador_primos_hasta_n(n):
    for i in range(2, n + 1):
        if es_primo(i):
            yield i


# Fibonacci Simple
def fibonacci_simple(n):
    fib = [0, 1]
    for _ in range(2, n):
        fib.append(fib[-1] + fib[-2])
    return fib


# Fibonacci Recursivo Cola
def fibonacci_recursivo_colas(n, a=0, b=1):
    if n == 0:
        return a
    else:
        return fibonacci_recursivo_colas(n - 1, b, a + b)


# Medición de tiempo para primos_hasta_n
start_time = time.perf_counter()
primos_result = primos_hasta_n(1000)
end_time = time.perf_counter()
primos_filter = end_time - start_time
print('')
print("Medición de tiempo para primos_hasta_n, función de orden superior con filter para números primos")
print("Números primos hasta 1000:", primos_result)
print("Tiempo de ejecución primos_hasta_n:", primos_filter)
print('')

# Medición de tiempo para generador_primos_hasta_n
start_time = time.perf_counter()
generador_primos_result = list(generador_primos_hasta_n(1000))
end_time = time.perf_counter()
primos_yield = end_time - start_time
print("Medición de tiempo para generador_primos_hasta_n, función con generador yield para números primos")
print("Números primos hasta 1000 con generador:", generador_primos_result)
print("Tiempo de ejecución generador_primos_hasta_n:", primos_yield)
print('')

# Mejor timepo de ejecución
tiempos = {"función de orden superior con filter": primos_filter, "función con generador yield": primos_yield}
print("Mejor tiempo de ejecución:", min(tiempos, key=tiempos.get))
print('')

# Medición de tiempo para Fibonacci Simple
start_time = time.perf_counter()
fib_simple_result = fibonacci_simple(50)
end_time = time.perf_counter()
fibbonacci_simple = end_time - start_time
print("Medición de tiempo para Fibonacci Simple")
print("Fibonacci Simple hasta 50:", fib_simple_result)
print("Tiempo de ejecución Fibonacci Simple:", end_time - start_time)
print('')

# Medición de tiempo para Fibonacci Recursivo Colas
start_time = time.perf_counter()
fib_recursivo_colas_result = [fibonacci_recursivo_colas(i) for i in range(50)]
end_time = time.perf_counter()
fibonacci_recursivo_colas = end_time - start_time
print("Medición de tiempo para Fibonacci Recursivo Colas")
print("Fibonacci Recursivo Colas hasta 50:", fib_recursivo_colas_result)
print("Tiempo de ejecución Fibonacci Recursivo Colas:", end_time - start_time)
print('')

# Mejor timepo de ejecución
tiempos = {"Fibonacci Simple": fibbonacci_simple, "Fibonacci Recursivo Colas": fibonacci_recursivo_colas}
print("Mejor tiempo de ejecución:", min(tiempos, key=tiempos.get))
