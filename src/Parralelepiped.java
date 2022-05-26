public class Parralelepiped {
    int dlina;
    int shirina;
    int vysota ;
    Parralelepiped(){

    }


    public int getDlina() {
        return dlina;
    }

    public void setDlina(int dlina) {
        this.dlina = dlina;
    }

    public int getShirina() {
        return shirina;
    }

    public void setShirina(int shirina) {
        this.shirina = shirina;
    }

    public int getVysota() {
        return vysota;
    }

    public void setVysota(int vysota) {
        this.vysota = vysota;
    }

    public void perimetr(){

        System.out.println(2*(this.dlina+this.shirina+this.vysota));
    }
}
