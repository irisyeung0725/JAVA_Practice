public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){


        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int remainderValue = kiloBytes%1024;
            int megaByteValue = kiloBytes / 1024;
            System.out.println(kiloBytes + "KB = " + megaByteValue + "MB and " + remainderValue + " KB" );
        }
    }
}
