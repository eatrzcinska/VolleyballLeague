package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class BufferedFileReader extends AbstractFileReader {

    @Override
    List<String> read(String path) {

        File file = getFile(path);
        List<String> list = new ArrayList<>();
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String line = bufferedReader.readLine();
            while(line!= null){
                list.add(line);
                line = bufferedReader.readLine();
                //System.out.println(list.get(0));
            }
        } catch (IOException e1) {
            return list;
        }
        return list;
    }
}
