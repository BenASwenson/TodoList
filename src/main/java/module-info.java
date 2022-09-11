module com.benswenson.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.benswenson.todolist to javafx.fxml;
    exports com.benswenson.todolist;
}