package models;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javafx.scene.shape.Shape;

public class FileGenerator {
	
	public void saveDraw(List<Shape> shapeCollection, String fileName) {
	    ObjectOutputStream oos;
	    try {
	      oos = new ObjectOutputStream(
	              new BufferedOutputStream(
	                new FileOutputStream(
	                  new File(fileName))));
	        	
	      oos.writeObject(shapeCollection.size());
	      ListIterator<Shape> it = shapeCollection.listIterator();
	      while(it.hasNext()) {
	    	  oos.writeObject(it.next());
	    	  
	      }
	      oos.close();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }  
	        
	}
	
	public List<Shape> loadDraw(String fileName) {
		List<Shape> shapeCollection = new ArrayList<Shape>();
	    ObjectInputStream ois;
	    int shapeNumber;
	    try {
	      ois = new ObjectInputStream(
	              new BufferedInputStream(
	                new FileInputStream(
	                  new File(fileName))));
	            
	      try {
	    	shapeNumber=(int)ois.readObject();
			for(int i=0; i<shapeNumber; i++) {
				shapeCollection.add((Shape)ois.readObject());
			}
	      } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	      }
		
	      ois.close();
	        	
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
		return shapeCollection;     	
	}
	
}
