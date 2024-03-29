package edu.cnm.deepdive.langton;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SpeedSlider extends Application {

  public void start(Stage stage)
  {

    // create label
    Label label = new Label("Select Speed");
    Label l = new Label(" ");

    // set the color of the text
    l.setTextFill(Color.BLACK);

    // create slider
    Slider slider = new Slider();

    // set the value of property min,
    // max and value
    slider.setMin(1);
    slider.setMax(15);
    slider.setValue(5);

    // enable TickLabels and Tick Marks
    slider.setShowTickLabels(true);
    slider.setShowTickMarks(true);

    slider.setBlockIncrement(1);

    // Adding Listener to value property.
    slider.valueProperty().addListener(
        new ChangeListener<Number>() {

          public void changed(ObservableValue<? extends Number >
              observable, Number oldValue, Number newValue)
          {

            l.setText("value: " + newValue);
          }
        });

    // create a VBox
    VBox root = new VBox();

    root.setPadding(new Insets(20));
    root.setSpacing(10);
    root.getChildren().addAll(label, slider, l);

    stage.setTitle("Speed Slider");

    // create Scene and add to the frame
    Scene scene = new Scene(root, 350, 200);
    stage.setScene(scene);
    stage.show();
  }

  // Main Method
  public static void main(String[] args)
  {

    // Launch Application
    Application.launch(args);
  }
}
