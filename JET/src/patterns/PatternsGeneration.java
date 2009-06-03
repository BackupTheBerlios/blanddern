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
  protected final String TEXT_3 = NL + "\t" + NL + "\t";
  protected final String TEXT_4 = NL + "\t\t";
  protected final String TEXT_5 = NL + "\t\tcreate(Var";
  protected final String TEXT_6 = ",";
  protected final String TEXT_7 = ",N1)." + NL + "\t";
  protected final String TEXT_8 = NL + NL + NL + "\t\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Matching m = (Matching) argument; 
    stringBuffer.append(TEXT_1);
     for(int i=0; i<m.getLhs().getComposed().size(); i++){ 
    stringBuffer.append(TEXT_2);
     Instance inst = m.getLhs().getComposed().get(i); 
    stringBuffer.append(TEXT_3);
     if(inst.isIsMain()){ 
    stringBuffer.append(TEXT_4);
     EClass concept = inst.getConcept(); 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(inst.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(concept.getName().toLowerCase());
    stringBuffer.append(TEXT_7);
     } 
     } 
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
