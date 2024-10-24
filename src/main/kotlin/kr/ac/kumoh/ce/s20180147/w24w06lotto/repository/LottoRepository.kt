package kr.ac.kumoh.ce.s20180147.w24w06lotto.repository

import kr.ac.kumoh.ce.s20180147.w24w06lotto.model.LottoNumber

interface LottoRepository {
  fun save(lottoNumber: LottoNumber): LottoNumber
  fun find(): LottoNumber?
}