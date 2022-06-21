module com.xiaobin.tools {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.xiaobin.tools to javafx.fxml;
    exports com.xiaobin.tools;
}