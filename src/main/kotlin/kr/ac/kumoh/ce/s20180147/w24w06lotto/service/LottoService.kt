package kr.ac.kumoh.ce.s20180147.w24w06lotto.service

import kr.ac.kumoh.ce.s20180147.w24w06lotto.model.LottoNumber
import kr.ac.kumoh.ce.s20180147.w24w06lotto.repository.LottoRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class LottoService(val lottoRepository: LottoRepository) {
  fun getLuckyNumbers(): LottoNumber {
    var numbers = mutableSetOf<Int>()

    while (numbers.size < 6) {
      numbers.add(Random.nextInt(1, 46))
    }

    val lottoNumber = LottoNumber(numbers.toSortedSet().toIntArray())

    return lottoRepository.save(lottoNumber)
  }
}