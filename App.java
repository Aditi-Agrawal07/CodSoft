package _03Task.src;

import java.sql.SQLException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class App extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {
        // vetical box for scene 1
        VBox All_button = new VBox(20.34);

        // vetical box for scene 2
        VBox labels = new VBox(20.34);

        // vertical box for scene 3
        VBox labels1 = new VBox(20.34);

        // vertical box for scene 3
        VBox labels2 = new VBox(20.34);

        // alignment for all of box
        All_button.setAlignment(Pos.CENTER);
        labels.setAlignment(Pos.CENTER);
        labels1.setAlignment(Pos.CENTER);
      labels2.setAlignment(Pos.CENTER);

        // All the buttons for scene 1
        Scene scene1 = new Scene(All_button, 600, 400);

        // All the labels for adding student for scene 2
        Scene scene2 = new Scene(labels, 600, 400);

        // All the labels for removing student for scene 3
        Scene scene3 = new Scene(labels1, 600, 400);

        // All the labels for searching student for scene 4
        Scene scene4 = new Scene(labels2, 600, 400);

        // name label for scene 2
        Label lable1 = new Label("Name");
        lable1.setLayoutX(186);
        lable1.setLayoutY(40);

  //  name field for scene 2
         final TextField name1 = new TextField();
        name1.setLayoutX(186);
        name1.setLayoutY(65);
        name1.setPrefWidth(20);
        name1.setMaxWidth(234.4);
        name1.setMaxHeight(34.4);

   // Roll no label for scene 2
        Label lable2 = new Label("Roll no");
        lable2.setLayoutX(186);
        lable2.setLayoutY(116);

        // roll no field for scene 2
        final TextField Roll_no2 = new TextField();
        Roll_no2.setLayoutX(186);
        Roll_no2.setLayoutY(143);
        Roll_no2.setMaxWidth(234.4);
        Roll_no2.setMaxHeight(34.4);

        // grade label for scene 2
        Label lable3 = new Label("Grade");
        lable3.setLayoutX(186);
        lable3.setLayoutY(204);

        // grade field for scene 2
        final TextField grade3 = new TextField();
        grade3.setLayoutX(186);
        grade3.setLayoutY(234);
        grade3.setMaxWidth(234.4);
        grade3.setMaxHeight(34.4);


     // name label for scene 3
        Label label4 = new Label("Name");
        label4.setLayoutX(186);
        label4.setLayoutY(40);

        // name field for scene 3
        TextField name4 = new TextField();
        name4.setLayoutX(186);
        name4.setLayoutY(65);
        name4.setPrefWidth(20);
        name4.setMaxWidth(234.4);
        name4.setMaxHeight(34.4);

        // Roll no label for scene 3
        Label label5 = new Label("Roll no");
        label5.setLayoutX(186);
        label5.setLayoutY(116);

        // Roll no field for scene 3
        TextField Roll_no5 = new TextField();
        Roll_no5.setLayoutX(186);
        Roll_no5.setLayoutY(143);
        Roll_no5.setMaxWidth(234.4);
        Roll_no5.setMaxHeight(34.4);

        // grade label for scene 3 
        Label label6 = new Label("Grade");
        label6.setLayoutX(186);
        label6.setLayoutY(204);

        // grade field for scene 3
        TextField grade6 = new TextField();
        grade6.setLayoutX(186);
        grade6.setLayoutY(234);
        grade6.setMaxWidth(234.4);
        grade6.setMaxHeight(34.4);

        // name label for scene 4
        Label label7 = new Label("Name");
        label7.setLayoutX(186);
        label7.setLayoutY(40);

        //  name field for scene 4
        TextField name7 = new TextField();
        name7.setLayoutX(186);
        name7.setLayoutY(65);
         name7.setPrefWidth(20);
        name7.setMaxWidth(234.4);
        name7.setMaxHeight(34.4);

        // Roll no label for scene 4
        Label label8 = new Label("Roll no");
        label8.setLayoutX(186);
        label8.setLayoutY(116);

        // roll no field for scene 4
        TextField Roll_no8 = new TextField();
        Roll_no8.setLayoutX(186);
        Roll_no8.setLayoutY(143);
        Roll_no8.setMaxWidth(234.4);
        Roll_no8.setMaxHeight(34.4);

        // grade label for scene 4
        Label label9 = new Label("Grade");
        label9.setLayoutX(186);
        label9.setLayoutY(204);
        
        // grade field for scene 4
        TextField grade9 = new TextField();
        grade9.setLayoutX(186);
        grade9.setLayoutY(234);
        grade9.setMaxWidth(234.4);
        grade9.setMaxHeight(34.4);

        Text text = new Text(" ");

        Button Add = new Button("Add");
        Add.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
                String full_name = name1.getText();
                    String roll_no = Roll_no2.getText();
                        String grade = grade3.getText();
			    // Retrieving data
                Daoclass test = new Daoclass();
			   try {
                test.insertRecord(full_name,roll_no,grade);
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
			}
		});

       Button remove = new Button("Remove");
       remove.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			    // Retrieving data
			   
			    String fullName = name1.getText();
		        String emailId = Roll_no2.getText();
		        String password = grade3.getText();

		       remove_data jdbcDao = new remove_data();
		        try {
					jdbcDao.deleteRecord(fullName, emailId, password);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 }
		});


      Button search = new Button("Search");
//        search.setOnAction(new EventHandler<ActionEvent>() {
//			public void handle(ActionEvent e) {
//			    // Retrieving data
//			    String student_name = name7.getText();
//			    String number = Roll_no8.getText();
//			    String grade1 = grade9.getText();
//			
//		});

        Button Add_student = new Button("ADD STUDENT");
        Add_student.setOnAction(e -> primaryStage.setScene(scene2));

        Button remove_student = new Button("REMOVE STUDENT");
        remove_student.setOnAction(e -> primaryStage.setScene(scene3));

        Button search_student = new Button("SEARCH STUDENT");
         search_student.setOnAction(e -> primaryStage.setScene(scene4));

        Button display = new Button("DISPLAY STUDENT");
//        display.setOnAction(new EventHandler<ActionEvent>() {
//
//            public void handle(ActionEvent arg3) {
//                // TODO Auto-generated method stub
//                App.display();
//            }
//        });
        Button exit = new Button(" EXIT ");
        exit.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent arg4) {
                // TODO Auto-generated method stub
                System.out.println("remove");
            }
        });

        All_button.getChildren().addAll(Add_student, remove_student, search_student, display, exit);

        labels.getChildren().addAll(lable1, name1, lable2, Roll_no2, lable3, grade3, Add, text);

        labels1.getChildren().addAll(label4, name4, label5, Roll_no5, label6, grade6, remove, text);

        labels2.getChildren().addAll(label7, name7, label8, Roll_no8, label9, grade9, search, text);

        primaryStage.setTitle("First JavaFX Application");
        primaryStage.setScene(scene1);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}


