def gcd(a: Int, b: Int): Int =
  if (b == 0) a else gcd(b, a % b)

gcd(0, 2)


//this function is not a tail recursive, because it doesn't executes itself directly
def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n - 1)

def factorialRec(n: Int): Int = {
  def loop(acc: Int, n: Int): Int = {
    if (n == 0) acc
    else loop(acc * n, n - 1)
  }
  loop(1, n)
}

val l = factorialRec(3)
