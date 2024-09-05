public class PlayInstrument {
    public static void main(String[] args) {
        Instrument a = new Instrument();   
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 950.9);
        a.setType("Guitar");
        a.setPrice(401.5);

        //Gunakan if-else untuk menentukan Instrument yg paling mahal dan paling murah

        if(a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println(" Instrument termahal adalah Guitar " );
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println(" Instrumen Termahal adalah Piano " );
        } else if (c.getPrice() > b.getPrice() && c.getPrice() > a.getPrice()) {
            System.out.println(" Instrument Termahal adalah Violin " );
        
        }
        if(a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println(" Instrument Termurah adalah Guitar " );
        } else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println(" Instrumen Termurah adalah Piano " );
        } else if (c.getPrice() < b.getPrice() && c.getPrice() < a.getPrice()) {
            System.out.println(" Instrument Termurah  adalah Violin " );
        
        }
        
        a.print();
        b.print();
        c.print();

    }
}
