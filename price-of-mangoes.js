function mango(quantity, price){
  // for each third mango increment the amount of mangos to be subtracted
  let thirdMangoCount = 0
  
  for (let i = 3; i <= quantity; i++) {
    if (i % 3 == 0) {
      thirdMangoCount++
    }
  }
  
  return (quantity - thirdMangoCount) * price
}
