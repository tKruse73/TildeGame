public class Main {
    public static void main(String[] args) {

        int size = 7;

        RowFactory rowFactory = new RowFactory(size);

        Row[] rows = rowFactory.getRows();
        for(Row row: rows){
            row.draw();
        }
    }
}