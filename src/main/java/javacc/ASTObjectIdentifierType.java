/* Generated By:JJTree: Do not edit this line. ASTObjectIdentifierType.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTObjectIdentifierType extends SimpleNode {
  public ASTObjectIdentifierType(int id) {
    super(id);
  }

  public ASTObjectIdentifierType(AsnParser p, int id) {
    super(p, id);
  }

	public void
	generateClass(String name)
	{
        generateClass(name,"objectid");
	}

  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=25d03b117c61ffe56c4c97bbd9dffdc0 (do not edit this line) */
