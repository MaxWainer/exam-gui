package maxwainer.examgui.page.model

import javafx.beans.property.ReadOnlyObjectWrapper
import javafx.beans.value.ObservableValue
import javafx.scene.control.TableColumn
import javafx.util.Callback

typealias PrimitiveMapper<F, T> = (F) -> T

/**
 * @param <B> Base type of the table row
 * @param <T> Type of row's view model
 * @param <P> Type of row's property (Should be primitive type)
 * */
abstract class MethodVisitingCellValueFactory<T : Any, R : Any>
  (private val primitiveMapper: PrimitiveMapper<T, R>) :
  Callback<TableColumn.CellDataFeatures<T, R>, ObservableValue<R>> {

  override fun call(param: TableColumn.CellDataFeatures<T, R>?): ObservableValue<R> = ReadOnlyObjectWrapper(
    primitiveMapper(param!!.value)
  )
}