//hw02 - Arithmetic
//Maximilian Hasselbusch
//8 September 2014
//Due: 9 September 2014, 11:00 pm
//CSE2, section 112

//define a class
public class Arithmetic{
    
//add a main method
    public static void main(String [] args) {

//declare variables of inputs
    //number of socks
    int nSocks=3;
    //Cost per pair of socks
    //('$') is part of the variable name
    double sockCost$=2.58;
    
    //number of drinking glasses
    int nGlasses=6;
    //cost per glass
    double glassCost$=2.29;
    
    //number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    
    //PA sales tax
    double taxPercent=.06;
 
 //declare variables of totals
    //total cost for socks (+tax)
    double totalSockCost$;
    double sockTax$;
    double totalSockCostTax$;
    //total cost for glasses (+tax)
    double totalGlassCost$;
    double glassTax$;
    double totalGlassCostTax$;
    //total cost for envelopes (+tax)
    double totalEnvelopeCost$;
    double envelopeTax$;
    double totalEnvelopeCostTax$;
    
//adjusting variable for rounding
    int adj1=1;
    
//calculate totals for each item
    //total for socks
    totalSockCost$=(nSocks*sockCost$);
    //socks sales tax
    sockTax$=(totalSockCost$*taxPercent);
    //cost with sales tax
    totalSockCostTax$=(sockTax$+totalSockCost$);
    //rounding
    double totalSockCostRound$=(totalSockCost$*adj1);
    double totalSockCostTaxRound$=((totalSockCostTax$*adj1)*100)/100.0;
    
    //total for drinking glasses
    totalGlassCost$=(nGlasses*glassCost$);
    //drinking glasses tax
    glassTax$=(totalGlassCost$*taxPercent);
    //cost with sales tax
    totalGlassCostTax$=(glassTax$+totalGlassCost$);
    //rounding
    double totalGlassCostRound$=(totalGlassCost$);
    double totalGlassCostTaxRound$=((totalGlassCostTax$*adj1)/100)*100.0;
    
    //total for envelopes
    totalEnvelopeCost$=(nEnvelopes*envelopeCost$);
    //envelope tax
    envelopeTax$=(totalEnvelopeCost$*taxPercent);
    //cost with sales tax
    totalEnvelopeCostTax$=(envelopeTax$+totalEnvelopeCost$);
    //rounding
    double totalEnvelopeCostRound$=(totalEnvelopeCost$*adj1);
    double totalEnvelopeCostTaxRound$=(totalEnvelopeCostTax$*adj1)*100/100.0;
    
    //total cost w/o sales tax
    double costNoTax$=totalSockCostRound$+totalGlassCostRound$+totalEnvelopeCostRound$;
    
    //total sales tax
    double totalSalesTax$=sockTax$+glassTax$+envelopeTax$;
    
    //total cost w/ sales tax
    double finalCost$=totalSockCostTaxRound$+totalGlassCostTaxRound$+totalEnvelopeCostTaxRound$;
    
//Print results
    System.out.println ("Item being purchased: Socks"); 
    System.out.println ("Socks total cost w/o tax: " +totalSockCostRound$); 
    System.out.println ("Tax on socks: " +sockTax$);
    System.out.println ("Socks total cost w/ tax: " +totalSockCostTaxRound$);
    System.out.println ("--------------------------------------------");
    System.out.println ("Item being purchased: Drinking Glasses");
    System.out.println ("Glasses total cost w/o tax: " +totalGlassCostRound$);
    System.out.println ("Tax on drinking glasses: " +glassTax$);
    System.out.println ("Glasses total cost w/ tax: " +totalGlassCostTaxRound$);
    System.out.println ("--------------------------------------------");
    System.out.println ("Item being purchased: Box of Envelopes");
    System.out.println ("Envelope total cost w/o tax: " +totalEnvelopeCostRound$);
    System.out.println ("Tax on box of envelopes: " +envelopeTax$);
    System.out.println ("Envelope total cost w/ tax: " +totalEnvelopeCostTaxRound$);
    System.out.println ("--------------------------------------------");
    System.out.println ("Total cost of purchase w/o sales tax: " +costNoTax$);
    System.out.println ("Total sales tax on purchase: " +totalSalesTax$);
    System.out.println ("Total cost of purchase w/ sales tax: " +finalCost$);
    }
}