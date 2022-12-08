public class Row implements Drawable {
    private char[] chars;
    private int currentPos = 0;

    public Row(int xSize){
        chars = new char[xSize];

    }

    public void addChar(char newChar){
        if(currentPos < chars.length){
            chars[currentPos] = newChar;
            currentPos++;
        }
        //todo: else throw exception
    }

    public char[] getChars() {
        return chars;
    }

    @Override
    public void draw() {
        for (int i = 0; i < chars.length; i++){
            System.out.print(chars[i]);
        }
        System.out.print('\n');
    }
}
