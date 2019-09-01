public class FlourPacker {

    public static boolean canPack(int big, int small, int goal){

        if (big < 0 || small <0 || goal < 0) {
            return false;
        }
        else if (big * 5 < goal){
            if (goal -(big * 5) <= small){
                return true;
            }else if (small >= goal){
                return true;
            }else {
                return false;
            }
        }else if (big * 5 > goal){
            if (goal % 5 <= small){
                return true;
            }else if (small >= goal){
                return true;
            }else {
                return false;
            }
        }else if (5 * big == goal){
            return true;
        }
        return false;
    }


}
