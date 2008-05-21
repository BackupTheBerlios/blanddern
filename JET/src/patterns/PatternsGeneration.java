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
  protected final String TEXT_2 = NL + "\trule(lhspattern(" + NL + "\t" + NL + "\t";
  protected final String TEXT_3 = NL + "\t\tinstance(";
  protected final String TEXT_4 = ", ";
  protected final String TEXT_5 = ")" + NL + "\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_6 = NL + "\t\t\t\t," + NL + "\t\t\t";
  protected final String TEXT_7 = NL + "\t";
  protected final String TEXT_8 = NL + "\t),rhspattern(" + NL + "\t" + NL + "\t";
  protected final String TEXT_9 = NL + "\t\tpattern(" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_10 = NL + "\t\t\tinstance(";
  protected final String TEXT_11 = ", ";
  protected final String TEXT_12 = ")" + NL + "\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_13 = NL + "\t\t\t\t," + NL + "\t\t\t";
  protected final String TEXT_14 = NL + "\t\t";
  protected final String TEXT_15 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_16 = NL + "\t\t\t)," + NL + "\t\t";
  protected final String TEXT_17 = NL + "\t";
  protected final String TEXT_18 = NL + "\t), correspRulesList(" + NL + "\t" + NL + "\t";
  protected final String TEXT_19 = NL + "\t\t";
  protected final String TEXT_20 = NL + "\t" + NL + "\t\tcorrespondanceRule(";
  protected final String TEXT_21 = "," + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_22 = NL + "\t\t\tsetPart(";
  protected final String TEXT_23 = ", ";
  protected final String TEXT_24 = ")," + NL + "\t\t";
  protected final String TEXT_25 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_26 = NL + "\t\tgetPart(proxy(";
  protected final String TEXT_27 = ", ";
  protected final String TEXT_28 = ", ";
  protected final String TEXT_29 = ")," + NL + "\t\t";
  protected final String TEXT_30 = ", ";
  protected final String TEXT_31 = "))" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_32 = NL + "\t\t\t," + NL + "\t\t";
  protected final String TEXT_33 = NL + "\t";
  protected final String TEXT_34 = NL + "\t)).";
  protected final String TEXT_35 = NL + "\t\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Adaptor a = (Adaptor) argument; 
    stringBuffer.append(TEXT_1);
     for(int i=0; i<a.getMatching().size(); i++){ 
    stringBuffer.append(TEXT_2);
     for(int j=0; j<a.getMatching().get(i).getLhs().getComposed().size(); j++){ 
    stringBuffer.append(TEXT_3);
    stringBuffer.append( a.getMatching().get(i).getLhs().getComposed().get(j).getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( a.getMatching().get(i).getLhs().getComposed().get(j).getConcept().getName() );
    stringBuffer.append(TEXT_5);
     if(j<a.getMatching().get(i).getLhs().getComposed().size()-1){ 
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
     } 
    stringBuffer.append(TEXT_8);
     for(int j=0; j<a.getMatching().get(i).getRhs().size(); j++){ 
    stringBuffer.append(TEXT_9);
     for(int k=0; k<a.getMatching().get(i).getRhs().get(j).getComposed().size(); k++){ 
    stringBuffer.append(TEXT_10);
    stringBuffer.append( a.getMatching().get(i).getRhs().get(j).getComposed().get(k).getName() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( a.getMatching().get(i).getRhs().get(j).getComposed().get(k).getConcept().getName() );
    stringBuffer.append(TEXT_12);
     if(k<a.getMatching().get(i).getRhs().get(j).getComposed().size()-1){ 
    stringBuffer.append(TEXT_13);
     } 
    stringBuffer.append(TEXT_14);
     } 
    stringBuffer.append(TEXT_15);
     if(j<a.getMatching().get(i).getRhs().size()-1){ 
    stringBuffer.append(TEXT_16);
     } 
    stringBuffer.append(TEXT_17);
     } 
    stringBuffer.append(TEXT_18);
     for(int j=0; j<a.getMatching().get(i).getCorrespondanceRule().size(); j++){ 
    stringBuffer.append(TEXT_19);
     CorrespondanceRule c = a.getMatching().get(i).getCorrespondanceRule().get(j); 
    stringBuffer.append(TEXT_20);
    stringBuffer.append( c.getFeature().getName() );
    stringBuffer.append(TEXT_21);
     if(c.getProperty().getSetPart() != null){ 
    stringBuffer.append(TEXT_22);
    stringBuffer.append( c.getProperty().getSetPart().getRequest().getExpression() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( c.getProperty().getSetPart().getRequest().getLangage() );
    stringBuffer.append(TEXT_24);
     } 
    stringBuffer.append(TEXT_25);
     Proxy p = c.getProperty().getGetPart().getProxy(); 
    stringBuffer.append(TEXT_26);
    stringBuffer.append( p.getType().getName() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( p.getPackage() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( p.getName() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( c.getProperty().getGetPart().getRequest().getExpression() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( c.getProperty().getGetPart().getRequest().getLangage() );
    stringBuffer.append(TEXT_31);
     if(j < a.getMatching().get(i).getCorrespondanceRule().size()-1){ 
    stringBuffer.append(TEXT_32);
     } 
    stringBuffer.append(TEXT_33);
     } 
    stringBuffer.append(TEXT_34);
     } 
    stringBuffer.append(TEXT_35);
    return stringBuffer.toString();
  }
}
