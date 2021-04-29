package main;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {


    public static void createFile(String path,String name) throws IOException {
        File f=new File(path);
        if(!f.exists()){
            f.mkdirs();
        }
        File file=new File(path+File.separator+name);
        file.createNewFile();
    }


    public static  void writeFile(String path,String text){
        try {
            Files.write(Paths.get(path),text.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] readFile(String path) throws IOException{
        return Files.readAllLines(Paths.get(path)).toArray(new String[0]);

    }
}
