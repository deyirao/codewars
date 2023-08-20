function isPalindrome(x) {
  
  for (let i = 0; i < x.length / 2; i++) {
    if (x.toLowerCase().charAt(i) != x.toLowerCase().charAt(x.length - 1 - i)) {
      return false
    }
  }
  
  return true
}
