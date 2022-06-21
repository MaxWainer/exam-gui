package maxwainer.examgui.extension

import java.awt.image.BufferedImage

fun BufferedImage.forEach(consumer: (Int, Int) -> Unit) {
  repeat(width) { w ->
    repeat(height) { h ->
      consumer(w, h)
    }
  }
}