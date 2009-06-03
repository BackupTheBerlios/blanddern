package translated;

import adaptor.*;
import org.eclipse.emf.ecore.*;

public class PatternFilterGeneration
{
  protected static String nl;
  public static synchronized PatternFilterGeneration create(String lineSeparator)
  {
    nl = lineSeparator;
    PatternFilterGeneration result = new PatternFilterGeneration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package filtering;" + NL + "" + NL + "import org.eclipse.emf.ecore.EObject;" + NL + "import patternsEngine.ItfPatternEngine;" + NL + "" + NL + "/**" + NL + " * " + NL + " * @author Jeremie SCHEER & Loic SUTTER" + NL + " *" + NL + " */" + NL + "" + NL + "public class PatternFilter{" + NL + "\tItfPatternEngine pe;" + NL + "\t" + NL + "\tpublic PatternFilter(ItfPatternEngine pe){" + NL + "\t\tthis.pe = pe;" + NL + "\t}" + NL + "" + NL + "\tpublic EObject[] source2Target(EObject o){" + NL + "\t\tEObject[] res;" + NL + "\t\tRunQuery rq = new RunQuery(pe);" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_2 = NL + "\t\t\tif((res=rq.runPattern";
  protected final String TEXT_3 = "(o))!=null){" + NL + "\t\t\t\treturn res;" + NL + "\t\t\t}" + NL + "\t\t";
  protected final String TEXT_4 = NL + "\t\t" + NL + "\t\treturn null;" + NL + "\t}" + NL + "}" + NL + "\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Adaptor m = (Adaptor) argument; 
    stringBuffer.append(TEXT_1);
     for(int i=0; i<m.getMatching().size(); i++){ 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(i+1);
    stringBuffer.append(TEXT_3);
     } 
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
