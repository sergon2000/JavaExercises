import java.io.IOException;

public class Processes {

    public static void main(String[] args) throws IOException {
        /*Process process = new ProcessBuilder("cal").start();
        System.out.println(process.pid());
        process.children().forEach(System.out::println);
        process.descendants().forEach(System.out::println);*/
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println(currentProcess.pid());
        currentProcess.children().forEach(System.out::println);
        currentProcess.descendants().forEach(System.out::println);
    }
}
