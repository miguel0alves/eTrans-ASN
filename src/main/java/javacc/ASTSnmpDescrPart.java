/* Generated By:JJTree: Do not edit this line. ASTSnmpDescrPart.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTSnmpDescrPart extends SimpleNode {
  public ASTSnmpDescrPart(int id) {
    super(id);
  }

  public ASTSnmpDescrPart(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d45381e9f264cb9a7f742ce7850c406c (do not edit this line) */
