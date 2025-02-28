module KAKAculatrice_FX_VF {
	requires javafx.controls;
	requires javafx.graphics;
	exports view;
	
	opens application to javafx.graphics, javafx.fxml;
}
