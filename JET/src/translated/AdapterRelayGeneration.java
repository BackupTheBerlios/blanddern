package translated;

import adaptor.*;
import filtering.*;

public class AdapterRelayGeneration
{
  protected static String nl;
  public static synchronized AdapterRelayGeneration create(String lineSeparator)
  {
    nl = lineSeparator;
    AdapterRelayGeneration result = new AdapterRelayGeneration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package utils;" + NL + "" + NL + "import org.eclipse.emf.common.notify.Notification;" + NL + "import org.eclipse.emf.common.notify.Notifier;" + NL + "import org.eclipse.emf.common.notify.impl.AdapterImpl;" + NL + "" + NL + "public class AdapterRelay extends AdapterImpl {" + NL + NL;
  protected final String TEXT_2 = NL + "\t";
  protected final String TEXT_3 = NL + "\t";
  protected final String TEXT_4 = NL + "\t\t";
  protected final String TEXT_5 = NL + "\t\t\t";
  protected final String TEXT_6 = NL + "\t\t\t";
  protected final String TEXT_7 = NL + "\t\t\t";
  protected final String TEXT_8 = NL + NL + "\tprivate ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = ";" + NL + "\t" + NL + "\tpublic AdapterRelay(";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = "){" + NL + "\t\tsuper();" + NL + "\t\tthis.";
  protected final String TEXT_13 = " = ";
  protected final String TEXT_14 = ";" + NL + "\t}" + NL + "\t\t";
  protected final String TEXT_15 = NL + "\t";
  protected final String TEXT_16 = NL + NL + "\tpublic void notifyChanged(Notification msg) {";
  protected final String TEXT_17 = NL + "\t";
  protected final String TEXT_18 = NL + "\t";
  protected final String TEXT_19 = NL + "\t\t";
  protected final String TEXT_20 = NL + "\t\t\t";
  protected final String TEXT_21 = NL + "\t\t\t";
  protected final String TEXT_22 = NL + "\t\t\t";
  protected final String TEXT_23 = NL + "\t\tif(";
  protected final String TEXT_24 = " != null) ";
  protected final String TEXT_25 = ".throwNotification(msg);" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_26 = NL + "\t";
  protected final String TEXT_27 = NL + "\t}" + NL + "\t" + NL + "\tpublic Notifier getOwner() {";
  protected final String TEXT_28 = NL + "\t";
  protected final String TEXT_29 = NL + "\t";
  protected final String TEXT_30 = NL + "\t\t";
  protected final String TEXT_31 = NL + "\t\t\t";
  protected final String TEXT_32 = NL + "\t\t\t";
  protected final String TEXT_33 = NL + "\t\t\t";
  protected final String TEXT_34 = NL + "\t\tif(";
  protected final String TEXT_35 = " != null) return ";
  protected final String TEXT_36 = ";" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_37 = NL + "\t";
  protected final String TEXT_38 = NL + "\t\treturn null;" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    ArgumentsRunQuery args = (ArgumentsRunQuery) argument; 
     String implPath = args.getImplPath();
     Adaptor adapt = args.getModel(); 
    stringBuffer.append(TEXT_1);
     for(int i=0;i<adapt.getMatching().size();i++) { 
    stringBuffer.append(TEXT_2);
    Matching currentMatching = adapt.getMatching().get(i);
    stringBuffer.append(TEXT_3);
     for(int k=0; k<currentMatching.getRhs().size(); k++){ 
    stringBuffer.append(TEXT_4);
     for(int l=0; l<currentMatching.getRhs().get(k).getComposed().size(); l++){ 
    stringBuffer.append(TEXT_5);
     Instance rhsInst = currentMatching.getRhs().get(k).getComposed().get(l); 
    stringBuffer.append(TEXT_6);
     String objectType = implPath+"."+rhsInst.getConcept().getName()+"Impl";
    stringBuffer.append(TEXT_7);
     String objectName = "o"+i+k+l; 
    stringBuffer.append(TEXT_8);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_14);
     } 
    stringBuffer.append(TEXT_15);
     } 
     } 
    stringBuffer.append(TEXT_16);
     for(int i=0;i<adapt.getMatching().size();i++) { 
    stringBuffer.append(TEXT_17);
    Matching currentMatching = adapt.getMatching().get(i);
    stringBuffer.append(TEXT_18);
     for(int k=0; k<currentMatching.getRhs().size(); k++){ 
    stringBuffer.append(TEXT_19);
     for(int l=0; l<currentMatching.getRhs().get(k).getComposed().size(); l++){ 
    stringBuffer.append(TEXT_20);
     Instance rhsInst = currentMatching.getRhs().get(k).getComposed().get(l); 
    stringBuffer.append(TEXT_21);
     String objectType = implPath+"."+rhsInst.getConcept().getName()+"Impl";
    stringBuffer.append(TEXT_22);
     String objectName = "o"+i+k+l; 
    stringBuffer.append(TEXT_23);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_25);
     } 
    stringBuffer.append(TEXT_26);
     } 
     } 
    stringBuffer.append(TEXT_27);
     for(int i=0;i<adapt.getMatching().size();i++) { 
    stringBuffer.append(TEXT_28);
    Matching currentMatching = adapt.getMatching().get(i);
    stringBuffer.append(TEXT_29);
     for(int k=0; k<currentMatching.getRhs().size(); k++){ 
    stringBuffer.append(TEXT_30);
     for(int l=0; l<currentMatching.getRhs().get(k).getComposed().size(); l++){ 
    stringBuffer.append(TEXT_31);
     Instance rhsInst = currentMatching.getRhs().get(k).getComposed().get(l); 
    stringBuffer.append(TEXT_32);
     String objectType = implPath+"."+rhsInst.getConcept().getName()+"Impl";
    stringBuffer.append(TEXT_33);
     String objectName = "o"+i+k+l; 
    stringBuffer.append(TEXT_34);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_36);
     } 
    stringBuffer.append(TEXT_37);
     } 
     } 
    stringBuffer.append(TEXT_38);
    return stringBuffer.toString();
  }
}
