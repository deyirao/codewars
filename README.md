# codewars
A collection of solutions for `Codewars` problems that are solved by myself and reside in files that are located in `./src`.

### Coding Information
* Used programming languages are `Java` and `JavaScript`.
* Code only includes the solution of the task, **not** the task itself.
* The solutions were accepted by the `Codewars` tests.
* No tests were written.

### Example: Solution for `Multiples of 3 or 5`
```Apex
public class MultiplesOfThreeOrFive {
  public int solution(int number) {
    if (number < 0) return 0;
    int sum = 0;
    for (int i = 0; i < number; i++) if (i % 5 == 0 || i % 3 == 0) sum += i;
    return sum;
  }
}
```

~ author Deyi Rao
