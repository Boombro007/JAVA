import java.io.File;
public class BasicCommandOfFile {
    public static void main(String []a){
        File f = new File("Example.txt");
        
        System.out.println("Exists: " + f.exists());
        System.out.println("Is file: " + f.isFile());
        System.out.println("Is directory: " + f.isDirectory());
        System.out.println("Readable: " + f.canRead());
        System.out.println("Writable: " + f.canWrite());
        System.out.println("Executable: " + f.canExecute());
        System.out.println("Hidden: " + f.isHidden());
        System.out.println("Size: " + f.length());
        System.out.println("Name: " + f.getName());
        System.out.println("Path: " + f.getAbsolutePath());
        System.out.println("Modified: " + f.lastModified());
    }
}