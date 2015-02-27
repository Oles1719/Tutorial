package Soft;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Oles on 1/26/2015.
 */
public class Service {
    private Formatter inFile;
    private Scanner scanner;
    private StringBuilder stringBuilder = new StringBuilder();
    private ArrayList<Shape>arrayList = new ArrayList<Shape>();
    public void createRectangleAndAddToArrayList(Soft.Rectangle rectangle){
        arrayList.add(rectangle);
    }
    public void createCircleAndAddToArrayList(Soft.Circle circle){
        arrayList.add(circle);
    }
    public void sort(){
        Collections.sort(arrayList, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
               int compare = Double.compare(o1.square(),o2.square());
                return -compare;
            }
        });
    }
    public void output(){
        for (Shape s:arrayList){
            System.out.println(s.square());
        }
    }
    public void outputLasThree(){
        for(int i=arrayList.size()-1;i>arrayList.size()-4;i--){
            System.out.println(arrayList.get(i).square());
        }
    }
    public void writeToFile(){
        try{
            inFile = new Formatter("Oles.txt");
          for (int i=0;i<arrayList.size();i++){
                inFile.format(" %s ", arrayList.get(i).square());
        }
        }
        catch (FileNotFoundException f){
            f.printStackTrace();
        }
        finally {
            inFile.close();
        }
    }
    public void readFromTheFile(){
        try {
            scanner = new Scanner(new File("Oles.txt"));
            while (scanner.hasNextDouble()){
                stringBuilder.append(" \n "+scanner.next());
        }
        }
        catch (FileNotFoundException f){
            f.printStackTrace();
        }
        finally {
            scanner.close();
        }

    }
    public void outputStringBuilder(){
        System.out.println(stringBuilder);
    }
}
