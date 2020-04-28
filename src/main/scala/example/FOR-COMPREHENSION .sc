val nums = List(2, 5, 1, 7, 4)
val nums2 =
  nums.map(x => x * 2)

val nums3 =
  for(x <- nums)
    yield x * 2

val nums1 =
  nums.flatMap(x => 1 to x)
    .map(y => y * 2)

val nums4 =
  for(x <- nums; y <- 1 to x)
    yield y * 2

val nums5 =
  nums.flatMap(x => 1 to x)
    .filter(y => y > 3)
    .map(y => y * 2)

val nums6 = for {
  x <- nums
  y <- 1 to x if y > 3
} yield y * 2

val nums7 =
  nums.flatMap(x =>
    (1 to x)
      .withFilter(y => y > 3)
      .map(y => y * 2))

val nums8 = for {
  x <- nums
  y <- 1 to x if y > 3
} yield (x,y * 2)

val nums9 =
  nums.flatMap(x =>
    (1 to x)
      .withFilter(y => y > 3)
      .map(y => (y, y * 2))
      .flatMap { case (y, y2) =>
        nums
          .withFilter(z => z < y)
          .map(z => z + y2 - y)
      })

val nums10 = for {
  x <- nums
  y <- 1 to x if y > 3
  y2 = y * 2
  z <- nums if z < y2
} yield z + y2 - y


