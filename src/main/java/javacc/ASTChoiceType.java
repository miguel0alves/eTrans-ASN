/* Generated By:JJTree: Do not edit this line. ASTChoiceType.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTChoiceType extends SimpleNode {
  public ASTChoiceType(int id) {
    super(id);
  }

  public ASTChoiceType(AsnParser p, int id) {
    super(p, id);
  }

    /**
     * Creates the source file for the named class, extending the Choice
     * class.
     *<p>
     * This method must read through the elements of the choice and
     * create attributes in the class being generated for each. It must also
     * create a setUpElements method that sets all the tagging information.
     *
     */
	public void
	generateClass(String name)
	{
        generateClass( name, "choice" );
	}

  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c21c1f504b2a4ee2f58d9265e8ae4622 (do not edit this line) */