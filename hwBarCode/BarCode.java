public class BarCode implements Comparable{
    private String _zip;
    private int _checkDigit;
    public static String[] key = new String[] {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

    public BarCode(String zip) {
        _zip = zip;
        _checkDigit = checkSum();
    }

    public BarCode(BarCode x){
        _zip = x._zip;
        _checkDigit = x.checkSum();
    }

    private int checkSum(){
        int sum = 0;
        for (int i=0; i<5; i++){
            sum+=Integer.parseInt(_zip.substring(i,i+1));
        }
        sum = sum%10;
        return sum;
    }
  
    public String toString(){
        String barcode = _zip + _checkDigit + " |";
        for (int i=0; i<5; i++){
            barcode+=key[Integer.parseInt(_zip.substring(i,i+1))];
        }  
        barcode+= key[_checkDigit] + "|";
        return barcode; 
    }

    public boolean equals(Object other){
        return this == other || (other instanceof BarCode && _zip.equals(((BarCode)other)._zip));
    }


    public int compareTo(Object other){
        return Integer.compare(_checkDigit, ((BarCode)other)._checkDigit);
    }
    
    public static void main(String[]arggs){
        BarCode bc = new BarCode("08451");
        BarCode no = new BarCode(bc);
        System.out.println(no);
        System.out.println(bc.equals(no)); //should return true
    }
    
}




