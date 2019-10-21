class SubExp extends Exp {
  private Exp left;
  private Exp right;
  SubExp (Exp left, Exp right) {this.left = left; this.right = right;}

  int eval() {
    return left.eval() - right.eval();
  }
  void emit(){
    left.emit();
    right.emit();

    out.println("NEG");
    out.println("ADD");
  
  }
}
