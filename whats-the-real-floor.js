const getRealFloor = (n) => {
  return n == 0 ? 0 : n > 13 ? n - 2 : n < 0 ? n : n - 1;
}
