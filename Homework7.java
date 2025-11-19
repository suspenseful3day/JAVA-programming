class Printer {
    protected String model;
    protected int printedCount;
    protected int availableCount;

    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0;
    }

    public boolean print(){
        return false;
    }
}

class InkjetPrinter extends Printer{

    public InkjetPrinter(String model, int availableCount){
        super(model, availableCount);
    }

    @Override
    public boolean print(){
        if (availableCount <= 0){
            System.out.println(model + ": " + (printedCount) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        }

        availableCount--;
        printedCount++;
        return true;
    }
}

class LaserPrinter extends Printer{
    public LaserPrinter(String model, int availableCount){
        super(model, availableCount);
    }

    @Override
    public boolean print(){
        if (availableCount <= 0){
            System.out.println(model + ": " + (printedCount) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        }

        availableCount--;
        printedCount++;
        return true;
    }
}

public class Homework7{
    public static void main(String[] args){
        InkjetPrinter inkPr = new InkjetPrinter("Brother DCP-T730DW", 7501);
        LaserPrinter lasPr = new LaserPrinter("Canon MFC643Cdw", 1501);

        while (inkPr.print());
        while (lasPr.print());
    }
}

