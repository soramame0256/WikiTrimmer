import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("wiki.txt");
        File out = new File("wikiTrimmed.txt");
        FileInputStream fis = new FileInputStream(f);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, StandardCharsets.UTF_8));
        FileOutputStream fos = new FileOutputStream(out);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, StandardCharsets.UTF_8));
        String line;
        final String tagPtn = "^<[^>]*>$";
        final String empty = "^\n";
        long processed = 0;
        while ((line = br.readLine()) != null) {
            line = line.replaceAll(tagPtn, "");
            line = line.replaceAll(empty, "");
            bw.write(line);
            processed++;
            if (processed % 100000 == 0) System.out.println(processed + " lines processed.");
        }
        System.out.println("done.");
        bw.flush();
        bw.close();
        br.close();

    }
}