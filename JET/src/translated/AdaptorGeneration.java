package translated;

import filtering.*;
import adaptor.*;
import launcher.*;
import org.eclipse.emf.ecore.*;

public class AdaptorGeneration
{
  protected static String nl;
  public static synchronized AdaptorGeneration create(String lineSeparator)
  {
    nl = lineSeparator;
    AdaptorGeneration result = new AdaptorGeneration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "privileged aspect TestAspect {" + NL + "\t";
  protected final String TEXT_2 = NL + "\t\t";
  protected final String TEXT_3 = NL + "\t\t";
  protected final String TEXT_4 = NL + "\t\t" + NL + "\t\tprivate package.";
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = ".";
  protected final String TEXT_7 = ";" + NL + "\t\t" + NL + "\t\tpointcut getter";
  protected final String TEXT_8 = "() : call(";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = ".get";
  protected final String TEXT_11 = "());" + NL + "\t\t";
  protected final String TEXT_12 = NL + "\t\tpointcut setter";
  protected final String TEXT_13 = "(";
  protected final String TEXT_14 = " value) : call(void ";
  protected final String TEXT_15 = ".set";
  protected final String TEXT_16 = "(*));" + NL + "\t\t";
  protected final String TEXT_17 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_18 = " around () : getter";
  protected final String TEXT_19 = "(){" + NL + "\t\t\t";
  protected final String TEXT_20 = NL + "\t\t\treturn ";
  protected final String TEXT_21 = ";" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_22 = NL + "\t\tvoid around(";
  protected final String TEXT_23 = " value) : setter";
  protected final String TEXT_24 = "(value){" + NL + "\t\t\t";
  protected final String TEXT_25 = ";" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_26 = NL + "}" + NL + NL;
  protected final String TEXT_27 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     ArgumentsList args = (ArgumentsList) argument; 
     String className = args.getEClass(); 
    stringBuffer.append(TEXT_1);
     for(int i=0;i<args.getModel().getCorrespondanceRule().size();i++){ 
    stringBuffer.append(TEXT_2);
     String methodeName = args.getModel().getCorrespondanceRule().get(i).getFeature().getName(); 
    stringBuffer.append(TEXT_3);
     CorrespondanceRule correspondanceRule = args.getModel().getCorrespondanceRule().get(i); 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(correspondanceRule.getProperty().getGetPart().getProxy().getType().getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append( args.getEClass() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( correspondanceRule.getProperty().getGetPart().getProxy().getName() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(correspondanceRule.getFeature().getEType().getInstanceTypeName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append( className );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(methodeName.replaceFirst(".",(methodeName.charAt(0)+"").toUpperCase()) );
    stringBuffer.append(TEXT_11);
     if(correspondanceRule.getProperty().getSetPart() != null) { 
    stringBuffer.append(TEXT_12);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(correspondanceRule.getFeature().getEType().getInstanceTypeName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append( className );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(methodeName.replaceFirst(".",(methodeName.charAt(0)+"").toUpperCase()));
    stringBuffer.append(TEXT_16);
     } 
    stringBuffer.append(TEXT_17);
    stringBuffer.append(correspondanceRule.getFeature().getEType().getInstanceTypeName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_19);
     FeatureFilter filter = new FeatureFilter(correspondanceRule);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(correspondanceRule.getProperty().getGetPart().getRequest().getExpression());
    stringBuffer.append(TEXT_21);
     if(correspondanceRule.getProperty().getSetPart() != null) { 
    stringBuffer.append(TEXT_22);
    stringBuffer.append(correspondanceRule.getFeature().getEType().getInstanceTypeName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(correspondanceRule.getProperty().getSetPart().getRequest().getExpression());
    stringBuffer.append(TEXT_25);
     } 
     } 
    stringBuffer.append(TEXT_26);
    stringBuffer.append(TEXT_27);
    return stringBuffer.toString();
  }
}
