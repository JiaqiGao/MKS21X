public class BarCode{
//implements Comparable{
    private String _zip;
    private int _checkDigit;
    public static String[] key = new String[] {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

    
    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
        _zip = zip;
        _checkDigit = zip.length();
    }

    // postcondition: Creates a copy of a bar code.
    // public BarCode(BarCode x){
        
    // }


    //post: computes and returns the check sum for _zip
    //  private int checkSum(){}

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
        String barcode = _zip + " |";
        for (int i=0; i<5; i++){
            barcode+=key[Integer.parseInt(_zip.substring(i,i+1))];
        }
        barcode+="|";
        return barcode; 
    }
    
    public static void main(String[]arggs){
        BarCode bc = new BarCode("084518");
        System.out.println(bc);
    }


    // public boolean equals(Object other){}
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other){
        return 1;
    }
    // postcondition: compares the zip + checkdigit
}




