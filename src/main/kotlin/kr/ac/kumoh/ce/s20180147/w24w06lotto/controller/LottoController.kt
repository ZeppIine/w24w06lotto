package kr.ac.kumoh.ce.s20180147.w24w06lotto.controller

import kr.ac.kumoh.ce.s20180147.w24w06lotto.service.LottoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LottoController(val service: LottoService) {
  @GetMapping("/lotto/numbers")
  fun generateNumbers(model: Model): String {
    val lottoNumber = service.getLuckyNumbers()
    model.addAttribute("numbers", lottoNumber.numbers)
    return "lotto"
  }
}