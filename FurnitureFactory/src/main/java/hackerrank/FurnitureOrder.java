package hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    private static HashMap<Furniture,Integer> newOrder = new HashMap<Furniture, Integer>();;
    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    public  FurnitureOrder() {

    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        if(furnitureCount!=0){
        newOrder.put(type,furnitureCount);
        }
        else{
            newOrder.clear();
        }
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return newOrder;
    }

    public float getTotalOrderCost() {
       float totalCost=0;
       if(!newOrder.isEmpty()){
           for (Map.Entry<Furniture,Integer> furniture : newOrder.entrySet()) {
              totalCost= totalCost +(furniture.getValue()* furniture.getKey().cost());
           }
           return totalCost;
       }
       else{
           return totalCost;
       }
    }

    public int getTypeCount(Furniture type) {
        int typeCount=0;
            if(!newOrder.isEmpty()){
                for (Map.Entry<Furniture,Integer> furniture : newOrder.entrySet()) {
                    if(furniture.getKey().label().equals(type.label()) && furniture.getKey().cost()==type.cost())
                    typeCount= typeCount +(furniture.getValue());
                }
                return typeCount;
            }
            else{
                return typeCount;
            }
    }

    public float getTypeCost(Furniture type) {
        float typeCost=0;
        if(!newOrder.isEmpty()){
            for (Map.Entry<Furniture,Integer> furniture : newOrder.entrySet()) {
                if(furniture.getKey().label().equals(type.label()) && furniture.getKey().cost()==type.cost())
                typeCost= typeCost +(furniture.getKey().cost()*furniture.getValue());
            }
        }
        return typeCost;
    }

    public int getTotalOrderQuantity() {
        int totalOrderQuantity=0;
        if(!newOrder.isEmpty()){
            for (Map.Entry<Furniture,Integer> furniture : newOrder.entrySet()) {
                totalOrderQuantity=totalOrderQuantity+furniture.getValue();
            }
        }
        return totalOrderQuantity;
    }
}