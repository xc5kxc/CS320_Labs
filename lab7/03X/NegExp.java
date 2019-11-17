class NegExp extends Exp {
  private Exp exp;
  NegExp (Exp exp) {this.exp = exp;}


  void emit(Env<Integer> env, int depth) throws Env.UndefinedId
  {
    exp.emit(env, depth +=1);
    System.out.println("NEG");
  }
}

