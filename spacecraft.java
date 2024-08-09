public class spacecraft {

    static int x;
    static int y;
    static int z;
    static String HorDir;
    static String VerDir;

    public spacecraft (int i, int j, int k, String hd, String vd) {
        x = i;
        y = j;
        z = k;
        HorDir = hd;
        if(vd == null) VerDir = "NA";
        else VerDir = vd;
    }

    public void processCommand(char[] Commands) {
        for(char command : Commands){
            switch(command){
                case 'f' :
                    moveForward();
                    break;

                case 'b' :
                    moveBackward();
                    break;

                case 'l' :
                    turnLeft();
                    break;

                case 'r' :
                    turnRight();
                    break;

                case 'u' :
                    turnUp();
                    break;

                case 'd' :
                    turnDown();
                    break;
            }
        }
    }

    private void turnDown() {
        VerDir = "D";
    }

    private void turnUp() {
        VerDir = "U";
    }

    private void turnLeft() {
        switch (Direction) {
            case "N":
                Direction = "W";
                break;
            
            case "W":
                Direction = "S";
                break;
            
            case "S":
                Direction = "E";
                break;

            case "E":
                Direction = "N";
                break;
            case "U":
                Direction = ""
        }
    }

    private void turnRight() {
        switch (Direction) {
            case "N":
                Direction = "E";
                break;
            
            case "E":
                Direction = "S";
                break;
            
            case "S":
                Direction = "W";
                break;

            case "W":
                Direction = "N";
                break;
        }
    }

    private static void moveForward() {
        switch (Direction) {
            case "E":
                x = x + 1;
                break;

            case "W":
                x = x - 1;
                break;

            case "N":
                y = y + 1;
                break;
            
            case "S":
                y = y - 1;
                break;
            
            case "U":
                z = z + 1;
                break;
            
            case "D":
                x = x - 1;
                break;
        }
    }
    
    public static void moveBackward(){
        switch (Direction) {
            case "E":
                x = x - 1;
                break;

            case "W":
                x = x + 1;
                break;

            case "N":
                y = y - 1;
                break;
            
            case "S":
                y = y + 1;
                break;
            
            case "U":
                z = z - 1;
                break;
            
            case "D":
                x = x + 1;
                break;
        }
    }








    public int[] getPosition(){
        return (new int[] {x,y,z});
    }

    public String getDirection(){
        return Direction;
    }
}
