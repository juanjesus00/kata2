package software.ulpgc.Kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TsvFileCarsLoader implements CarLoader {
    private final File file;


    public TsvFileCarsLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Cars> load() {
        try{
            return load(new FileReader(file));
        }catch (IOException e ){
            return Collections.emptyList();
        }
    }

    private List<Cars> load(FileReader reader) throws IOException{
        return load(new BufferedReader(reader));
    }

    private List<Cars> load(BufferedReader reader) throws IOException{
        return reader.lines().skip(1).map(this::toCars).collect(Collectors.toList());
    }

    private Cars toCars(String s) {
        return toCars(s.split(","));
    }

    private Cars toCars(String[] split) {
        return new Cars(
                split[0],
                Integer.parseInt(split[1]),
                Integer.parseInt(split[2]),
                Integer.parseInt(split[3]),
                split[4],
                split[5],
                split[6],
                split[7]
        );
    }
}
