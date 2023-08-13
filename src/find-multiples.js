function findMultiples(integer, limit) {
  result = []
  
  for (let i = integer; i <= limit; i += integer) {
    result.push(i)
  }
  
  return result
}
