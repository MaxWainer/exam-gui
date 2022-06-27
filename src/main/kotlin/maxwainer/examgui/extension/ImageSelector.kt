package maxwainer.examgui.extension

import javafx.scene.control.Button
import javafx.stage.FileChooser
import maxwainer.examgui.extension.javafx.errorAlert
import java.awt.image.BufferedImage
import javax.imageio.ImageIO

class ImageSelector(var image: BufferedImage?, private val imageButton: Button) {

  private val fileChooser = FileChooser()

  fun init() {
    fileChooser.title = "Select an image"
    fileChooser
      .extensionFilters
      .add(FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"))
  }

  fun onSelectPictureClick() {
    val file = fileChooser.showOpenDialog(null) ?: return

    // check is file is png or jpg
    if (file.name.endsWith(".png") || file.name.endsWith(".jpg")) {

      val preImage = ImageIO.read(file)

      if (preImage == null) {
        errorAlert("Opening image", "Invalid format")
        return
      }

      image = preImage
      imageButton.text = file.name
    } else {
      errorAlert("Creating", "File is not image")
    }
  }

}