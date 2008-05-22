package patterns;

import adaptor.*;
import org.eclipse.emf.ecore.*;

public class PatternsGeneration
{
  protected static String nl;
  public static synchronized PatternsGeneration create(String lineSeparator)
  {
    nl = lineSeparator;
    PatternsGeneration result = new PatternsGeneration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "\t";
  protected final String TEXT_3 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_4 = "\t" + NL + "\t\tcreate(Node,N1,";
  protected final String TEXT_5 = ",N2)." + NL + "\t";
  protected final String TEXT_6 = NL + NL + NL + "\t\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Adaptor a = (Adaptor) argument; 
    stringBuffer.append(TEXT_1);
     for(int i=0; i<a.getMatching().size(); i++){ 
    stringBuffer.append(TEXT_2);
     for(int j=0; j<a.getMatching().get(i).getLhs().getComposed().size(); j++){ 
    stringBuffer.append(TEXT_3);
     EClass concept = a.getMatching().get(i).getLhs().getComposed().get(j).getConcept(); 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(concept.getName().toLowerCase());
    stringBuffer.append(TEXT_5);
     } 
     } 
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
