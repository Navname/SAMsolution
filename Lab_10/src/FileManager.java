import java.io.*;

/**
 * Created by макс on 25.03.2019.
 */
public class FileManager {
    public String path = "E:\\";
    public String pathForRM = "E:\\SAM solutions\\Examples\\file.txt";
    public String comand = "catW";// Для запуска другой команды нужно изменить значение этой переменной на оддно из кейсовых.

    /*public FileManager(String[] args) {
        this.comand=args[0];
        this.path = args[1];
    }*/

    public void check() {
        switch (comand) {
            case "ls":
                executeLS();
                break;
            case "rm":
                executeRM();
                break;
            case "mkdir":
                executeMKDIR();
                break;
            case "rmdir":
                executeRMDIR();
                break;
            case "cat":
                executeCAT();
                break;
            case "catW":
                executeCATwithWRITING();
                break;
        }
    }

    private void executeCATwithWRITING() {
        try (BufferedWriter in = new BufferedWriter(new FileWriter("E:\\SAM solutions\\Examples\\file.txt"))) {
            String line = "Hello!";
            in.write(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void executeCAT() {
        try (BufferedReader in = new BufferedReader(new FileReader("E:\\SAM solutions\\Examples\\file.txt"))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void executeRMDIR() {
        //udalenie
    }

    private void executeMKDIR() {
        File file = new File("E:\\SAM solutions\\Examples\\new folder2");
        if (!file.exists() && file.isDirectory()) {
            file.mkdir();
            System.out.println("The folder is created successful");
        } else System.out.println("The folder is exist");

    }

    public void executeRM() {
        File file = new File(pathForRM);
        if (file.delete()) {
            System.out.println(pathForRM + "udalen");
        } else System.out.println(pathForRM + "ne naiden");
    }

    public void executeLS() {

        File dir = new File(path);
        String[] paths = dir.list();
        for (String p : paths) {
            System.out.println(p);
        }
    }


}
