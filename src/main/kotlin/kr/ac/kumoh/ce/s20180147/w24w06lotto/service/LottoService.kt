package kr.ac.kumoh.ce.s20180147.w24w06lotto.service

import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class LottoService {
  fun getLuckyNumbers(): IntArray {
    var numbers = mutableSetOf<Int>()

    while (numbers.size < 6) {
      numbers.add(Random.nextInt(1, 46))
    }

    return numbers.toSortedSet().toIntArray()
  }
}