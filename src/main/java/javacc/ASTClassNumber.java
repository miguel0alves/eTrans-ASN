/* Generated By:JJTree: Do not edit this line. ASTClassNumber.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public class ASTClassNumber extends SimpleNode {
	int tagNumber = -1;

	public void
	setTagNumber(int x)
	{
		tagNumber = x;
	}

	public int
	getTagNumber()
	{
		return tagNumber;
	}

  public ASTClassNumber(int id) {
    super(id);
  }

  public ASTClassNumber(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e756b84a2733d6b31b40cc29f74500d0 (do not edit this line) */
