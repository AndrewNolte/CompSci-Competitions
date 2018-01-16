
import java.util.*;
import java.io.*;

public class A_Four {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("a_four.dat"));
        ArrayList<Integer> val = new ArrayList<Integer>();
        ArrayList<String> var = new ArrayList<String>();
        int mem = 0;
        while (scan.hasNext()) {
            String cmd = scan.next();
            if (cmd.equals("DEF")) {
                String title = scan.next();
                if (var.indexOf(title) != -1) {
                    var.add(title);
                    val.add(var.indexOf(title), scan.nextInt());
                } else {
                    var.add(title);
                    val.add(scan.nextInt());
                }
            } else if (cmd.equals("STO")) {
                val.set(var.indexOf(scan.next()), mem);
            } else if (cmd.equals("REC")) {
                mem = val.get(var.indexOf(scan.next()));
            } else if (cmd.equals("ADD")) {
                mem += val.get(var.indexOf(scan.next()));
            } else if (cmd.equals("SUB")) {
                mem -= val.get(var.indexOf(scan.next()));
            } else if (cmd.equals("MUL")) {
                mem *= val.get(var.indexOf(scan.next()));
            } else if (cmd.equals("DIV")) {
                mem /= val.get(var.indexOf(scan.next()));
            } else if (cmd.equals("PRN")) {
                System.out.println(val.get(var.indexOf(scan.next())));
            }
            scan.nextLine();
        }
    }
}
