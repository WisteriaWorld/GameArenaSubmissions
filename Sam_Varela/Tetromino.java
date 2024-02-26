public class Tetromino
{
    private double xPos;
    private double yPos;
    private double size = 10;
    private char type;
    private String colour;
    private Rectangle[] rectangles;

    public Tetromino(double x, double y, char type, double size) {
        rectangles = new Rectangle[4];
        switch(type) {
            case 'I': 
                rectangles[0] = new Rectangle(x, y, size, size, "33FFFC");
                rectangles[1] = new Rectangle(x + size, y, size, size, "33FFFC");
                rectangles[2] = new Rectangle(x + size*2, y, size, size, "33FFFC");
                rectangles[3] = new Rectangle(x + size*3, y, size, size, "33FFFC");
            case 'O':
                rectangles[0] = new Rectangle(x, y, size, size, "FFF100");
                rectangles[1] = new Rectangle(x, y + size, size, size, "FFF100");
                rectangles[2] = new Rectangle(x + size, y, size, size, "FFF100");
                rectangles[3] = new Rectangle(x + size, y + size, size, size, "FFF100");
            case 'T':
                rectangles[0] = new Rectangle(x, y, size, size, "9F00FF");
                rectangles[1] = new Rectangle(x + size, y, size, size, "9F00FF");
                rectangles[2] = new Rectangle(x + size*2, y, size, size, "9F00FF");
                rectangles[3] = new Rectangle(x + size, y + size, size, size, "9F00FF");
            case 'S':
                rectangles[0] = new Rectangle(x + size, y, size, size, "00FF3E");
                rectangles[1] = new Rectangle(x + size*2, y, size, size, "00FF3E");
                rectangles[2] = new Rectangle(x, y + size, size, size, "00FF3E");
                rectangles[3] = new Rectangle(x + size, y + size, size, size, "00FF3E");
            case 'Z':
                rectangles[0] = new Rectangle(x, y, size, size, "FF0000");
                rectangles[1] = new Rectangle(x + size, y, size, size, "FF0000");
                rectangles[2] = new Rectangle(x + size, y + size, size, size, "FF0000");
                rectangles[3] = new Rectangle(x + size*2, y + size, size, size, "FF0000");
            case 'J':
                rectangles[0] = new Rectangle(x, y + size, size, size, "FF9A00");
                rectangles[1] = new Rectangle(x + size, y + size, size, size, "FF9A00");
                rectangles[2] = new Rectangle(x + size*2, y + size, size, size, "FF9A00");
                rectangles[3] = new Rectangle(x + size*2, y, size, size, "FF9A00");
            case 'L':
                rectangles[0] = new Rectangle(x, y + size, size, size, "0026FF");
                rectangles[1] = new Rectangle(x + size, y + size, size, size, "0026FF");
                rectangles[2] = new Rectangle(x + size*2, y + size, size, size, "0026FF");
                rectangles[3] = new Rectangle(x, y, size, size, "0026FF");
        }
    }
}