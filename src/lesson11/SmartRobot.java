package lesson11;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class SmartRobot extends Robot {
    public SmartRobot(Cell sign, Field field) {
        super(sign, field);
        setName("SmartRobor");
    }
    static private Reader reader;
    static {
        try {
            reader = new FileReader("smartRobot.txt");
        } catch (IOException e) {

        }
    }

    @Override
    protected int[] positionChoiсe() {
        char[] coordinates = new char[2];
        int[] result = new int[2];
        try{
            if(reader.ready()) {
                reader.read(coordinates);
                reader.skip(1);
                result = new int[]{Integer.parseInt(String.valueOf(coordinates[0]).trim()), Integer.parseInt(String.valueOf(coordinates[1]).trim())};
                System.out.println(Arrays.toString(result));
            }
            else reader.close();

            return result;
        //    br.close();
        } catch(IOException e) {
            return super.positionChoiсe();
        }
    }
}
