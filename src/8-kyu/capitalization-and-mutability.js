function capitalizeWord(word) {
  let res = word.charAt(0).toUpperCase()
  
  for (let i = 1; i < word.length; i++) {
    res += word.charAt(i)
  }
  
  return res
}