package maxwainer.examgui.extension

import javafx.scene.control.TableCell
import javafx.scene.control.TableColumn
import javafx.scene.image.ImageView
import javafx.util.Callback

class ImageCellFactory<S> : Callback<TableColumn<S, ImageView>, TableCell<S, ImageView>> {
  override fun call(_param: TableColumn<S, ImageView>?): TableCell<S, ImageView> {
    val param = _param!!
    val imageView = ImageView()

    return object : TableCell<S, ImageView>() {
      override fun updateItem(item: ImageView?, empty: Boolean) {
        if (item != null) {
          imageView.image = item.image
          imageView.fitHeight = param.width
          imageView.fitWidth = 160.0

          graphic = imageView
        } else {
          graphic = null
        }
      }
    }
  }
}