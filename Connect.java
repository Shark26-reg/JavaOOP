package tree;

public class Connect {
    private Human p1;
    private Gender re;
    private Human p2;


    public Connect(Human person, Gender re, Human relative) {
        this.p1 = person;
        this.re = re;
        this.p2 = relative;
    }

    public Human getP1() {
        return p1;
    }

    public Human getP2() {
        return p2;
    }

    public Gender getRe() {
        return re;
    }

   
    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1.getFullName(), re, p2.getFullName());

    }

    @Override
    public int hashCode(){
        StringBuilder hash = new StringBuilder();
        hash.append(this.p1.getFullName().hashCode());
        hash.append(this.p2.getFullName().hashCode());
        hash.append(this.re.hashCode());
        return hash.hashCode();
    }

}
