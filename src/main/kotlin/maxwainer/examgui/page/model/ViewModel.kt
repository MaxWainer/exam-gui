package maxwainer.examgui.page.model

import javafx.scene.control.ListCell
import javafx.scene.control.ListView
import javafx.scene.control.TableRow
import javafx.scene.control.TableView
import javafx.util.Callback

interface ViewModel<T : Any>

interface CellViewModel<T : Any> :
  ViewModel<T>,
  Callback<ListView<T>, ListCell<T>>

interface ColumnViewModel<T : Any> :
  ViewModel<T>,
  Callback<TableView<T>, TableRow<T>>