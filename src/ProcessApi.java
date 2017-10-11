public class ProcessApi {

    public static void main(String[] args){
        ProcessHandle processHandle = ProcessHandle.current();

        System.out.println("Process ID: " + processHandle.pid());

    }
}
