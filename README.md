# codewars
A collection of solutions for `Codewars` problems that are solved by myself and reside in files that are located in `./src`.

### Coding Information
* Used programming languages are `Java` and `JavaScript`.
* Code only includes the solution of the task, **not** the task itself.
* The solutions were accepted by the `Codewars` tests.
* No tests were written.

### Example: Solution for `Multiples of 3 or 5`
```Apex
public int solution(int number) {
    return IntStream.range(0, number)
        .filter(n -> (n % 5 == 0 || n % 3 == 0))
        .sum();
}
```

~ author Deyi Rao
