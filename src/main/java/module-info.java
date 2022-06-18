module maxwainer.examgui {
  requires javafx.controls;
  requires javafx.fxml;
  requires kotlin.stdlib;
  requires org.hibernate.orm.core;
  requires jakarta.persistence;

  opens maxwainer.examgui to javafx.fxml;
  exports maxwainer.examgui;
}