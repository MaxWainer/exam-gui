open module maxwainer.examgui {
  requires javafx.controls;
  requires javafx.fxml;
  requires kotlin.stdlib;
  requires org.hibernate.orm.core;
  requires jakarta.persistence;
  requires kotlin.reflect;
  requires java.desktop;
  requires java.naming;
  requires java.xml;
  requires jakarta.xml.bind;
  requires com.fasterxml.classmate;
  requires org.objectweb.asm;

  //opens maxwainer.examgui to javafx.fxml, javafx.graphics;

  //exports maxwainer.examgui.page.auth to javafx.fxml, javafx.graphics;
}