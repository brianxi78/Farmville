public class Plot {
    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot(){
        numberOfPlants = (int)(90*Math.random()+10);
        int plantID = (int)(Math.random()*4);
        if(plantID == 0){
            plantName = "empty";
            numberOfPlants = 0;
        } else if (plantID == 1){
            plantName = "Tomato";
        } else if (plantID == 2){
        plantName = "Carrot";
        } else if (plantID == 3){
            plantName = "Tulip";
        }else if (plantID == 4){
            plantName = "Lettuce";
        }else{
            plantName = "empty";
        }
        int waterID = (int)(Math.random()*2);
        if(waterID == 0 && !plantName.equals("empty")){
            needsWater = true;
        }else{
            needsWater=false;
        }
    }
    public void printPlotInfo(){
        System.out.println("*******PLOT INFO*******");
        System.out.println("Plant name: " + plantName);
        System.out.println("Number of plants: " + numberOfPlants);
        System.out.println("Does it need water? " + needsWater);
    }
}
