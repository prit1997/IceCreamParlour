/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author prit
 */
public class IceCreamViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button chocalateChipBtn;
    @FXML
    private Button easterEggHuntBtn;
    @FXML
    private Button chocalateMousseBtn;
    @FXML
    private Button mangoDeliteBtn;
    @FXML
    private Button strawberryBananaBtn;
    @FXML
    private Button mintChocloateChipBtn;
    @FXML
    private Button pistachoAlmondBtn;
    @FXML
    private Button bunnyRollCakeBtn;
    @FXML
    private Button kitkatCakeBtn;
    @FXML
    private Label output;
    @FXML
    private Label price;
    @FXML
    private Label description;
    @FXML private Label total;
          

    String update = "";
    String priceOfItems = "";
    int totalofItems = 0;
    IceCream chocalateChip, easterEggHunt, chocalateMousse, mangoDelite, strawberryBanana, mintChocloateChip, pistachoAlmond, bunnyRollCake, kitkatCake;
    ArrayList<IceCream> items = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        chocalateChip = new IceCream("CHOCOLATE CHIP", 5, "Vanilla flavoured ice cream with semi-sweet chocolate chips");
        easterEggHunt = new IceCream("EASTER EGG HUNT", 7, "Get a hop on finding all the hidden candy eggs in our field of green white chocolate \n flavoured ice cream with a sweet crème swirl!");
        chocalateMousse = new IceCream("CHOCOLATE MOUSSE", 8, "Rich chocolate mousse flavoured ice cream with chocolate flavoured flakes.");
        mangoDelite = new IceCream("MANGO DELITE", 7, "Comes with the crush of the king of the Fruits and milk");
        strawberryBanana = new IceCream("STRAWBERRY BANANA", 7, "Comes with the fram fresh Strawberries and Banana");
        mintChocloateChip = new IceCream("MINT CHOCOLATE CHIP", 10, "Classic milkshakes are custom blended to order with your favorite flavour of ice cream. \n So why not reward yourself today with an irresistible treat? It doesn’t matter how naughty or nice you’ve been. \n We got something for everyone.");
        pistachoAlmond = new IceCream("PISTACHO ALMOND", 12, "The Combination Pistachio flavoured ice cream with roasted almonds and Partly Skinned Milk");
        bunnyRollCake = new IceCream("BUNNY ROLL CAKE", 20, "Put a hop in your step and a smile on your face with this delicious treat of chocolate cake\n and ice cream, transformed into a perfectly adorable dessert. Available in a selection of colours.");
        kitkatCake = new IceCream("KITKAT CAKE", 22, "Kit Kat Cake is a chocolate frosted chocolate layer cake, surrounded by over 40 Kit Kat bars, \n topped with 2 large bags of M&M's and wrapped with a beautiful ribbon that's tied in a bow. Not only is it completely delicious, it also traveled well.");
    }
    
     private void setDescription(String btnId) {
        description.setText(getIceCream(btnId).getDescription());
    }
     
     
    public IceCream getIceCream(String iceCreamId) {
        if (iceCreamId.equals("chocalateChipBtn")) {
            return chocalateChip;
        }
        if (iceCreamId.equals("easterEggHuntBtn")) {
            return easterEggHunt;
        }
        if (iceCreamId.equals("chocalateMousseBtn")) {
            return chocalateMousse;
        }
        if (iceCreamId.equals("mangoDeliteBtn")) {
            return mangoDelite;
        }
        if (iceCreamId.equals("strawberryBananaBtn")) {
            return strawberryBanana;
        }
        if (iceCreamId.equals("mintChocloateChipBtn")) {
            return mintChocloateChip;
        }
        if (iceCreamId.equals("pistachoAlmondBtn")) {
            return pistachoAlmond;
        }
        if (iceCreamId.equals("bunnyRollCakeBtn")) {
            return bunnyRollCake;
        }
        if (iceCreamId.equals("kitkatCakeBtn")) {
            return kitkatCake;
        }
        return null;
    }

    public void btnPushed(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String btnId = btn.getId();
        items.add(getIceCream(btnId));

        updateList(btnId);
        setDescription(btnId);

    }

    private void updateList(String btnId) {
        update += getIceCream(btnId).getName() + "\n";
        output.setText(update);

        priceOfItems += "$" + getIceCream(btnId).getPrice() + "\n";
        price.setText(priceOfItems);
        
    }
    
   

    

}
