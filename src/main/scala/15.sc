"Tail recursion"
def fact(n: Int): BigInt = {
  if (n <= 1) 1
  else fact(n - 1) * n
}

fact(10000) //todo: что здесь не так?