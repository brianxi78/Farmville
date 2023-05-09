import java.util.ArrayList;

public class MyFarm {
    ArrayList<Plot> row;
    public static void main(String[] args) {
        MyFarm ToddsFarm = new MyFarm();
    }
    public MyFarm(){
        row = new ArrayList<>();
        for(int x=0; x < 10;x++){
            row.add(new Plot());
        }
//        totalPlants();
//        printPlantNames();
//        printRowInfo();
//        addLettuce();
//        addTulip();
//        tomatoLocations();
//        totalCarrots();
//        averageNumberOfPlants();
//        numberOfCarrotPlots();
//        numberOfEmptyPlots();
//        everyOtherNeedsWater();
//        greaterThan10();
//        plantWithMaxNumber();
//        plantWithMinNumber();
//        plantWithMaxNumberNeedsWater();
//        greatestDifferenceNumberBetweenAnyPlants();
//        numberOfCarrotPlotsNextToLettuce();
//        removeFirstCarrot();
//        removeAllEmpty();
//        greatestDifferenceOfPlantNumbers();
    }
    public void totalPlants() {
        int total = 0;
        System.out.println("********TOTAL NUMBER OF PLANTS*******");
        for (int x=0;x<row.size();x++){
            total = total + row.get(x).numberOfPlants;
        }
        System.out.println("Total Amount of Plants: " + total);
    }
    public void printPlantNames(){
        System.out.println();
        System.out.println("*******PLANT NAMES*******");
        for(int x=0;x<row.size();x++){
            System.out.print(x + ": " + row.get(x).plantName + " ");
        }
    }
    public void printRowInfo() {
        System.out.println();
        System.out.println("*******ROW INFO*******");
        for (int i=0; i<row.size(); i++){
            row.get(i).printPlotInfo();
        }
    }
    public void addLettuce(){
        System.out.println("********ADD LETTUCE*******");
        printPlantNames();
        row.add(new Plot());
        row.get(row.size() - 1).plantName = "Lettuce";
        row.get(row.size() - 1).numberOfPlants = 42;
        row.get(row.size() - 1).needsWater = true;
        System.out.println();
        printPlantNames();
    }
    public void addTulip(){
        System.out.println("********ADD TULIP*******");
        printPlantNames();
        row.get(3).plantName = "Tulip";
        row.get(3).numberOfPlants = 70;
        row.get(3).needsWater = false;
        System.out.println();
        printPlantNames();
    }
    public void tomatoLocations() {
        System.out.println("*******TOMATO LOCATIONS*******");
        printPlantNames();
        System.out.println();
        System.out.print("There are tomatoes at: ");
        for (int x = 0; x < row.size(); x++) {
            if (row.get(x).plantName.equals("Tomato")) {
                System.out.print(x + " ");
            }
        }
    }
    public void totalCarrots(){
        int total = 0;
        System.out.println("*******CARROT AMOUNT*******");
        for (int x = 0; x < row.size(); x++) {
            if (row.get(x).plantName.equals("Carrot")) {
                total = total + row.get(x).numberOfPlants;
            }
        }
        System.out.println("There are " + total + " carrots.");
    }
    public void averageNumberOfPlants(){
        int total = 0;
        System.out.println("*******AVERAGE NUMBER OF PLANTS*******");
        for (int x = 0; x < row.size(); x++) {
            total = total + row.get(x).numberOfPlants;
        }
        System.out.println("The average number of plants is " + total/row.size() + ".");
    }
    public void numberOfCarrotPlots() {
        int totalPlots = 0;
        printPlantNames();
        System.out.println("********NUMBER OF CARROT PLOTS*******");
        for (int x = 0; x < row.size(); x++) {
            if (row.get(x).plantName.equals("Carrot")) {
                totalPlots = totalPlots + 1;
            }
        }
        if(totalPlots == 1){
            System.out.println("There is 1 carrot plot.");
        }else if(totalPlots == 0){
            System.out.println("There are no carrot plots.");
        }else{
            System.out.println("There are " + totalPlots + " carrot plots.");
        }
    }
    public void numberOfEmptyPlots() {
        int totalPlots = 0;
        printPlantNames();
        System.out.println();
        System.out.println("********NUMBER OF EMPTY PLOTS*******");
        for (int x = 0; x < row.size(); x++) {
            if (row.get(x).plantName.equals("empty")) {
                totalPlots = totalPlots + 1;
            }
        }
        if(totalPlots == 1){
            System.out.println("There is 1 empty plot.");
        }else if(totalPlots == 0){
            System.out.println("There are no empty plots.");
        }else{
            System.out.println("There are " + totalPlots + " empty plots.");
        }
    }
    public void everyOtherNeedsWater(){
        for(int x = 0; x< row.size(); x+=2){
            row.get(x).needsWater = false;
        }
        for(int x = 1; x< row.size(); x+=2){
            row.get(x).needsWater = true;
        }
        printRowInfo();
    }
    public void greaterThan10() {
        int total = 0;
        for(int x=0; x<row.size();x++){
            if(row.get(x).numberOfPlants>10){
                total = total +1;
            }
        }
        printRowInfo();
        System.out.println("*******GREATER THAN 10 PLANTS*******");
        System.out.println("There are " + total + " plots with more than 10 plants.");
    }
    public void plantWithMaxNumber() {
        int carrotMax = 0;
        int tulipMax = 0;
        int tomatoMax = 0;
        int lettuceMax = 0;
        for(int x = 0; x<row.size(); x++){
            if(row.get(x).plantName.equals("Carrot")){
                carrotMax = carrotMax + row.get(x).numberOfPlants;
            }else if(row.get(x).plantName.equals("Tulip")){
                tulipMax = tulipMax + row.get(x).numberOfPlants;
            }else if(row.get(x).plantName.equals("Lettuce")){
                lettuceMax = lettuceMax + row.get(x).numberOfPlants;
            }else if(row.get(x).plantName.equals("Tomato")){
                tomatoMax = tomatoMax + row.get(x).numberOfPlants;
            }
        }
        int currentMax = 0;
        String maxPlantType;
        if(carrotMax>tomatoMax){
            currentMax = carrotMax;
            maxPlantType = "Carrot";
        }else{
            currentMax = tomatoMax;
            maxPlantType = "Tomato";
        }
        if(tulipMax > currentMax){
            currentMax = tulipMax;
            maxPlantType = "Tulip";
        }
        if(lettuceMax > currentMax){
            currentMax = lettuceMax;
            maxPlantType = "Lettuce";
        }
        System.out.println("*******MAX NUMBER*******");
        System.out.println("The plant type with the most plants is " + maxPlantType + "s with " + currentMax + " plants.");
    }
    public void plantWithMinNumber() {
        int carrotMin = 0;
        int tulipMin = 0;
        int tomatoMin = 0;
        int lettuceMin = 0;
        for(int x = 0; x<row.size(); x++){
            if(row.get(x).plantName.equals("Carrot")){
                carrotMin = carrotMin + row.get(x).numberOfPlants;
            }
            if(row.get(x).plantName.equals("Tulip")){
                tulipMin = tulipMin + row.get(x).numberOfPlants;
            }
            if(row.get(x).plantName.equals("Lettuce")){
                lettuceMin = lettuceMin + row.get(x).numberOfPlants;
            }
            if(row.get(x).plantName.equals("Tomato")){
                tomatoMin = tomatoMin + row.get(x).numberOfPlants;
            }
        }

        int currentMin = 0;
        String minPlantType = null;
        if(carrotMin>0 && carrotMin<tomatoMin){
            currentMin = carrotMin;
            minPlantType = "Carrot";
        }else if(tomatoMin>0){
            currentMin = tomatoMin;
            minPlantType = "Tomato";
        }
        if(tulipMin>0 && tulipMin < currentMin){
            currentMin = tulipMin;
            minPlantType = "Tulip";
        }
        if(lettuceMin > 0 && lettuceMin < currentMin){
            currentMin = lettuceMin;
            minPlantType = "Lettuce";
        }
        System.out.println("*******MIN NUMBER*******");
        System.out.println("The plant type with the most plants is " + minPlantType + "s with " + currentMin + " plants.");
    }
    public void plantWithMaxNumberNeedsWater(){
        int carrotMax = 0;
        int tulipMax = 0;
        int tomatoMax = 0;
        int lettuceMax = 0;
        for(int x = 0; x<row.size(); x++){
            if(row.get(x).plantName.equals("Carrot")){
                if(row.get(x).needsWater == true){
                    carrotMax = carrotMax + row.get(x).numberOfPlants;
                }
            }
            if(row.get(x).plantName.equals("Tulip")){
                if(row.get(x).needsWater == true){
                    tulipMax = tulipMax + row.get(x).numberOfPlants;
                }
            }
            if(row.get(x).plantName.equals("Lettuce")){
                if(row.get(x).needsWater == true){
                    lettuceMax = lettuceMax + row.get(x).numberOfPlants;
                }
            }
            if(row.get(x).plantName.equals("Tomato")){
                if(row.get(x).needsWater == true){
                    tomatoMax = tomatoMax + row.get(x).numberOfPlants;
                }
            }
        }
        int currentMax = 0;
        String maxPlantType;
        if(carrotMax>tomatoMax){
            currentMax = carrotMax;
            maxPlantType = "Carrot";
        }else{
            currentMax = tomatoMax;
            maxPlantType = "Tomato";
        }
        if(tulipMax > currentMax){
            currentMax = tulipMax;
            maxPlantType = "Tulip";
        }
        if(lettuceMax > currentMax){
            currentMax = lettuceMax;
            maxPlantType = "Lettuce";
        }
        System.out.println("*******MAX NUMBER NEEDING WATER*******");
        System.out.println("The plant type with the most plants that needs water is " + maxPlantType + "s with " + currentMax + " plants.");
    }
    public void greatestDifferenceNumberBetweenAnyPlants() {
        int currentMax = 0;
        String maxName = null;
        int currentMin = 100;
        String minName = null;
        for(int x = 0; x<row.size(); x++){
            if(row.get(x).numberOfPlants > currentMax){
                currentMax = row.get(x).numberOfPlants;
                maxName = row.get(x).plantName;
            }
            if(row.get(x).numberOfPlants < currentMin && row.get(x).numberOfPlants>0){
                    currentMin = row.get(x).numberOfPlants;
                    minName = row.get(x).plantName;
            }
        }
        System.out.println("*******GREATEST DIFFERENCE BETWEEN ANY PLANTS********");
        System.out.println("The greatest difference is between " + maxName + " and " + minName + " with a difference of " + (currentMax-currentMin) + ".");
    }
    public void numberOfCarrotPlotsNextToLettuce() {
        int plotNumber = 0;
        for(int x=0; x<row.size(); x++){
            if(row.get(x).plantName.equals("Lettuce")){
                if(row.get(x+1).plantName.equals("Carrot")){
                    plotNumber = plotNumber +1;
                }
                if(x!=0){
                    if(row.get(x-1).plantName.equals("Lettuce")){
                        plotNumber = plotNumber + 1;
                    }
                }
            }
        }
        printPlantNames();
        System.out.println("********CARROT PLOTS NEXT TO LETTUCE PLOTS********");
        System.out.println("There are " + plotNumber + " lettuce plots bordering carrot plots.");
    }
    public void removeFirstCarrot() {
        printPlantNames();
        boolean firstCarrot = false;
        for(int x = 0; x<row.size(); x++){
            if(row.get(x).plantName.equals("Carrot") && firstCarrot == false){
                row.remove(x);
                firstCarrot = true;
            }
        }
        printPlantNames();
    }
    public void removeAllEmpty() {
        printPlantNames();
        for(int x=0; x<row.size();x++){
            if(row.get(x).plantName.equals("empty")){
                row.remove(x);
                x = x-1;
            }
        }
        printPlantNames();
    }
    public void greatestDifferenceOfPlantNumbers() {
        int maxTomato = 0;
        int minTomato = 100;
        int maxLettuce = 0;
        int minLettuce = 100;
        int maxTulip = 0;
        int minTulip = 100;
        int maxCarrot = 0;
        int minCarrot = 100;
        for(int x =0; x<row.size(); x++){
            if(row.get(x).plantName.equals("Tomato")){
                if(row.get(x).numberOfPlants > maxTomato){
                    maxTomato = row.get(x).numberOfPlants;
                }
                if(row.get(x).numberOfPlants < minTomato){
                    minTomato = row.get(x).numberOfPlants;
                }
            }
            if(row.get(x).plantName.equals("Lettuce")){
                if(row.get(x).numberOfPlants > maxLettuce){
                    maxLettuce = row.get(x).numberOfPlants;
                }
                if(row.get(x).numberOfPlants < minLettuce){
                    minLettuce = row.get(x).numberOfPlants;
                }
            }
            if(row.get(x).plantName.equals("Tulip")){
                if(row.get(x).numberOfPlants > maxTulip){
                    maxTulip = row.get(x).numberOfPlants;
                }
                if(row.get(x).numberOfPlants < minTulip){
                    minTulip = row.get(x).numberOfPlants;
                }
            }
            if(row.get(x).plantName.equals("Carrot")) {
                if (row.get(x).numberOfPlants > maxCarrot) {
                    maxCarrot = row.get(x).numberOfPlants;
                }
                if (row.get(x).numberOfPlants < minCarrot) {
                    minCarrot = row.get(x).numberOfPlants;
                }
            }
        }
        System.out.println("*******GREATEST DIFFERENCES*******");
        if(maxTomato == 0 || minTomato == 100){
            System.out.println("There are no tomato plots in this row.");
        }else if(maxTomato == minTomato){
            System.out.println("There is only 1 tomato plot.");
        }else{
            System.out.println("The greatest difference between different tomato plots is: " + (maxTomato - minTomato) +".");
        }
        if(maxLettuce == 0 || minLettuce == 100){
            System.out.println("There are no lettuce plots in this row.");
        }else if(maxLettuce == minLettuce){
            System.out.println("There is only 1 lettuce plot.");
        }else{
            System.out.println("The greatest difference between different lettuce plots is: " + (maxLettuce - minLettuce) +".");
        }
        if(maxTulip == 0 || minTulip == 100){
            System.out.println("There are no tulip plots in this row.");
        }else if(maxTulip == minTulip){
            System.out.println("There is only 1 tulip plot.");
        }else{
            System.out.println("The greatest difference between different tulip plots is: " + (maxTulip - minTulip) +".");
        }
        if(maxCarrot == 0 || minCarrot == 100){
            System.out.println("There are no carrot plots in this row.");
        }else if(maxCarrot == minCarrot){
            System.out.println("There is only 1 carrot plot.");
        }else{
            System.out.println("The greatest difference between different carrot plots is: " + (maxCarrot - minCarrot) +".");;
        }
    }
}
