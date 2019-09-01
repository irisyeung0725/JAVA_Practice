public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int remainderValue = kiloBytes%1024;
        int megaByteValue = kiloBytes / 1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kiloBytes + "KB = " + megaByteValue + "MB and " + remainderValue + " KB" );
        }
    }
}
