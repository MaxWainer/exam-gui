package maxwainer.examgui.module

import maxwainer.examgui.extension.forEach
import maxwainer.examgui.extension.randomString
import java.awt.Color
import java.awt.Font
import java.awt.Graphics2D
import java.awt.image.BufferedImage
import java.util.concurrent.ThreadLocalRandom

private val BASIC_RANGE = (('a'..'z') + ('A'..'Z') + ('0'..'9')).toCharArray()
fun CaptchaModule(): CaptchaModule = CaptchaModuleImpl()

interface CaptchaModule {

  fun createCaptcha(arr: CharArray = BASIC_RANGE): Captcha

}

data class Captcha(val image: BufferedImage, val requiredValue: String)

private class CaptchaModuleImpl : CaptchaModule {

  companion object {

    private const val BASIC_WIDTH = 160
    private const val BASIC_HEIGHT = 60

    private val RANDOM = ThreadLocalRandom.current()
    private val DEFAULT_FONT = Font("Arial", Font.ITALIC xor Font.BOLD, 25)

    private val randomColor get() = Color(randomPart, randomPart, randomPart)

    private val randomPart get() = RANDOM.nextInt(0, 255)

    private fun Graphics2D.randomRect(width: Int = BASIC_WIDTH, height: Int = BASIC_HEIGHT) {
      repeat(4) {
        drawRect(
          RANDOM.nextInt(RANDOM.nextInt(5, 25), RANDOM.nextInt(26, 65)),
          RANDOM.nextInt(RANDOM.nextInt(5, 25), RANDOM.nextInt(26, 65)),
          width, height
        )

        drawLine(
          RANDOM.nextInt(RANDOM.nextInt(5, 25), RANDOM.nextInt(26, 65)),
          RANDOM.nextInt(RANDOM.nextInt(5, 25), RANDOM.nextInt(26, 65)),
          width, height
        )
      }
    }

  }

  override fun createCaptcha(arr: CharArray): Captcha {
    val image = BufferedImage(BASIC_WIDTH, BASIC_HEIGHT, BufferedImage.OPAQUE)

    image.forEach { x, y ->
      if (RANDOM.nextInt(0, 50) % 2 == 0) {
        image.setRGB(x, y, randomColor.rgb)
      }
    }

    val graphic = image.createGraphics()

    val value = arr.randomString(6)

    graphic.font = DEFAULT_FONT

    graphic.drawString(value, RANDOM.nextInt(25, 55), RANDOM.nextInt(25, 55));

    graphic.randomRect()

    return Captcha(image, value)
  }
}