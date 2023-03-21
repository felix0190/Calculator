class Calculator {
    protected float nr;
    public Calculator(float nr){
        this.nr = nr;
    }

    public void adunare(float other){
        this.nr += other;

    }

    public void impartire(float other){
        this.nr /= other;
    }

    public float getRezultat(){
        return nr;
    }
}

