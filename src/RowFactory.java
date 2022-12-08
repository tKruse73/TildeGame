public class RowFactory {
    private int size;
    public RowFactory(int size) {
        this.size = size;
    }
    private Row createRow(boolean isEven){
        //this our x
        Row row = new Row(size);
        for (int i = 0; i < size; i++) {
            if(isEven){
                if(i % 2 == 0){
                    row.addChar(' ');
                } else {
                    row.addChar('_');
                }
            } else {
                if(i % 2 == 0){
                    row.addChar('|');
                } else {
                    row.addChar(' ');
                }
            }
        }
        return row;
    }
    public Row[] getRows(){
        //this is our y
        Row[] rows = new Row[size];
        for (int i = 0; i < size; i++) {
            if(i % 2 == 0){
                rows[i] = createRow(true);
            } else {
                rows[i] = createRow(false);
            }
        }
        return rows;
    }
}
