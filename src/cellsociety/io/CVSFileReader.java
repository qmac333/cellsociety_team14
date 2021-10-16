package cellsociety.io;

import cellsociety.logic.Grid;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * A class to read CVS files.
 *
 */
public class CVSFileReader {

  public static Grid readFile(String fileName) {

    Grid myGrid;

    try{
      // Create an object of filereader
      // class with CSV file as a parameter.
      FileReader filereader = new FileReader(fileName);

      // create csvReader object passing
      // file reader as a parameter
      CSVReader csvReader = new CSVReader(filereader);
      int i = 0, j = 0;

      String[] nextRecord;
      nextRecord = csvReader.readNext();
      //make a dimensions array to just read the width and height first
      int[] dimensions = new int[2];
      for (String cell : nextRecord) {
        dimensions[i] = Integer.parseInt(cell); i++;
      }
      //set i =0 because we'll be using it to iterate
      i = 0;
      //dimensions[0] is width and dimensions[1] is height
      myGrid = new Grid(dimensions[0], dimensions[1]);
      while ((nextRecord = csvReader.readNext()) != null) {
        for (String cell : nextRecord) {
          myGrid.setCell(i% myGrid.getWidth(), j% myGrid.getHeight(), Integer.parseInt(cell));
          j++;
        }
        i++;
      }
      myGrid.updateGrid();
      return myGrid;
    } catch (Exception e){   //TODO: Add better error handling.
      return null;
    }
  }

}