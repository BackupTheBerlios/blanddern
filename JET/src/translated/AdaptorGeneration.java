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
  protected final String TEXT_1 = NL + "privileged aspect ";
  protected final String TEXT_2 = "Aspect {";
  protected final String TEXT_3 = NL + "\t";
  protected final String TEXT_4 = NL + "\t\t";
  protected final String TEXT_5 = NL + "\t\t\t";
  protected final String TEXT_6 = NL + "\t\t\t\t";
  protected final String TEXT_7 = NL + "\t\t\t\t\t";
  protected final String TEXT_8 = NL + "\t\t\t\t\t";
  protected final String TEXT_9 = NL + "\t\t\t\t\t" + NL + "\t\t\t\t\t";
  protected final String TEXT_10 = NL + "\t\t\t\t\t";
  protected final String TEXT_11 = NL + "\t\t\t\t\t" + NL + "\t\t\t\t\tprivate ";
  protected final String TEXT_12 = ".";
  protected final String TEXT_13 = " ";
  protected final String TEXT_14 = ".";
  protected final String TEXT_15 = ";" + NL + "\t\t\t\t\t" + NL + "\t\t\t\t\tpointcut getter";
  protected final String TEXT_16 = "(";
  protected final String TEXT_17 = " self) : target(self) && execution(";
  protected final String TEXT_18 = " ";
  protected final String TEXT_19 = ".get";
  protected final String TEXT_20 = "());" + NL + "\t\t\t\t\t";
  protected final String TEXT_21 = NL + "\t\t\t\t\tpointcut setter";
  protected final String TEXT_22 = "(";
  protected final String TEXT_23 = " self, ";
  protected final String TEXT_24 = " newValue) : target(self) && execution(void ";
  protected final String TEXT_25 = ".set";
  protected final String TEXT_26 = "(*)) && args(newValue);" + NL + "\t\t\t\t\t";
  protected final String TEXT_27 = NL + "\t\t\t\t\t" + NL + "\t\t\t\t\t";
  protected final String TEXT_28 = " around (";
  protected final String TEXT_29 = " self) : getter";
  protected final String TEXT_30 = "(self){" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_31 = NL + "\t\t\t\t\t\treturn self.";
  protected final String TEXT_32 = ";" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t" + NL + "\t\t\t\t\t";
  protected final String TEXT_33 = NL + "\t\t\t\t\tvoid around(";
  protected final String TEXT_34 = " self, ";
  protected final String TEXT_35 = " newValue) : setter";
  protected final String TEXT_36 = "(self, newValue){" + NL + "\t\t\t\t\t\tself.";
  protected final String TEXT_37 = ";" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_38 = NL + "\t\t\t";
  protected final String TEXT_39 = NL + "\t";
  protected final String TEXT_40 = NL + "\t" + NL + "\t\t";
  protected final String TEXT_41 = NL + "\t";
  protected final String TEXT_42 = "\t" + NL + "}" + NL + NL;
  protected final String TEXT_43 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     ArgumentsList args = (ArgumentsList) argument; 
     String className = args.getEClass(); 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_2);
     for(int i=0; i<args.getModel().getMatching().size(); i++){ 
    stringBuffer.append(TEXT_3);
     for(int j=0; j<args.getModel().getMatching().get(i).getRhs().size(); j++){ 
    stringBuffer.append(TEXT_4);
     for(int k=0; k<args.getModel().getMatching().get(i).getRhs().get(j).getComposed().size(); k++){ 
    stringBuffer.append(TEXT_5);
     if(args.getModel().getMatching().get(i).getRhs().get(j).getComposed().get(k).getConcept().getName()==className){ 
    stringBuffer.append(TEXT_6);
     for(int l=0;l<args.getModel().getMatching().get(k).getCorrespondanceRule().size();l++){ 
    stringBuffer.append(TEXT_7);
     String methodeName = args.getModel().getMatching().get(k).getCorrespondanceRule().get(l).getFeature().getName(); 
    stringBuffer.append(TEXT_8);
     CorrespondanceRule correspondanceRule = args.getModel().getMatching().get(k).getCorrespondanceRule().get(l); 
    stringBuffer.append(TEXT_9);
     String packageName = correspondanceRule.getProperty().getGetPart().getProxy().getPackage(); 
    stringBuffer.append(TEXT_10);
     String ePackageName = args.getEPackage(); 
    stringBuffer.append(TEXT_11);
     if (packageName!="") { 
    stringBuffer.append(packageName);
    stringBuffer.append(TEXT_12);
     } 
    stringBuffer.append(correspondanceRule.getProperty().getGetPart().getProxy().getType().getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append( args.getEPackage() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( correspondanceRule.getProperty().getGetPart().getProxy().getName() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(l);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(ePackageName);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(correspondanceRule.getFeature().getEType().getInstanceTypeName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append( ePackageName );
    stringBuffer.append(TEXT_19);
    stringBuffer.append(methodeName.replaceFirst(".",(methodeName.charAt(0)+"").toUpperCase()) );
    stringBuffer.append(TEXT_20);
     if(correspondanceRule.getProperty().getSetPart() != null) { 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(l);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ePackageName);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(correspondanceRule.getFeature().getEType().getInstanceTypeName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append( ePackageName );
    stringBuffer.append(TEXT_25);
    stringBuffer.append(methodeName.replaceFirst(".",(methodeName.charAt(0)+"").toUpperCase()));
    stringBuffer.append(TEXT_26);
     } 
    stringBuffer.append(TEXT_27);
    stringBuffer.append(correspondanceRule.getFeature().getEType().getInstanceTypeName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(ePackageName);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(l);
    stringBuffer.append(TEXT_30);
     FeatureFilter filter = new FeatureFilter(correspondanceRule);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(correspondanceRule.getProperty().getGetPart().getRequest().getExpression());
    stringBuffer.append(TEXT_32);
     if(correspondanceRule.getProperty().getSetPart() != null) { 
    stringBuffer.append(TEXT_33);
    stringBuffer.append(ePackageName);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(correspondanceRule.getFeature().getEType().getInstanceTypeName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(l);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(correspondanceRule.getProperty().getSetPart().getRequest().getExpression());
    stringBuffer.append(TEXT_37);
     } 
    stringBuffer.append(TEXT_38);
     } 
    stringBuffer.append(TEXT_39);
     } 
    stringBuffer.append(TEXT_40);
     } 
    stringBuffer.append(TEXT_41);
     } 
     } 
    stringBuffer.append(TEXT_42);
    stringBuffer.append(TEXT_43);
    return stringBuffer.toString();
  }
}
