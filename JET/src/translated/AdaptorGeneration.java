package translated;

import filtering.*;
import adaptor.*;
import launcher.*;
import org.eclipse.emf.ecore.*;
import java.util.*;

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
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "import org.eclipse.emf.common.util.EList;" + NL + "" + NL + "import org.eclipse.emf.ecore.impl.ENotificationImpl;" + NL + "import org.eclipse.emf.common.notify.Notification;" + NL + "import org.eclipse.emf.common.notify.NotificationChain;" + NL + "" + NL + "/**" + NL + " * " + NL + " * @author Jeremie SCHEER & Loic SUTTER" + NL + " *" + NL + " */" + NL + "" + NL + "privileged aspect ";
  protected final String TEXT_3 = "Aspect {";
  protected final String TEXT_4 = NL + "\t";
  protected final String TEXT_5 = NL + "\t" + NL + "\t";
  protected final String TEXT_6 = NL + "\t\t";
  protected final String TEXT_7 = NL + "\t\t" + NL + "\t\t\t";
  protected final String TEXT_8 = NL + "\t\t\t";
  protected final String TEXT_9 = NL + "\t\t\t";
  protected final String TEXT_10 = NL + "\t\t\t";
  protected final String TEXT_11 = NL + "\t\t\t";
  protected final String TEXT_12 = NL + "\t\t\t";
  protected final String TEXT_13 = NL + "\t\t\t\t";
  protected final String TEXT_14 = NL + "\t\t\t\t";
  protected final String TEXT_15 = NL + "\t\t\t\t" + NL + "\t\t\t\t";
  protected final String TEXT_16 = NL + "\t\t\t\t\t";
  protected final String TEXT_17 = NL + "\t\t\t\t\t";
  protected final String TEXT_18 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_19 = NL + "\t\t\t\t\t";
  protected final String TEXT_20 = NL + "\t\t\t\t";
  protected final String TEXT_21 = NL + "\t\t\t";
  protected final String TEXT_22 = NL + "\t\t" + NL + "\t\t\t";
  protected final String TEXT_23 = NL + "\t\t\t\t" + NL + "\t\t\t\t";
  protected final String TEXT_24 = NL + "\t\t\t\t\t";
  protected final String TEXT_25 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_26 = NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_27 = NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_28 = NL + "\t\t\t\t\t\t\t\tpublic ";
  protected final String TEXT_29 = ".";
  protected final String TEXT_30 = " ";
  protected final String TEXT_31 = ".";
  protected final String TEXT_32 = ";" + NL + "\t\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\tpublic void ";
  protected final String TEXT_33 = ".throwNotification(Notification msg){" + NL + "\t\t\t\t\t\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\t\t\t\t\t\teNotify(new ENotificationImpl(this, msg.getEventType(), 0, msg.getOldValue(), msg.getNewValue()));" + NL + "\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_34 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_35 = NL + "\t\t\t\t\t";
  protected final String TEXT_36 = "\t" + NL + "\t\t\t\t\t" + NL + "\t\t\t\t\t";
  protected final String TEXT_37 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_38 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_39 = NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_40 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_41 = "\t" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_42 = "\t\t\t" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_43 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_44 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_45 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_46 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_47 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_48 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_49 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_50 = NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_51 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_52 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_53 = NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_54 = NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\tpointcut getter";
  protected final String TEXT_55 = "(";
  protected final String TEXT_56 = " self) : target(self) && execution(";
  protected final String TEXT_57 = " ";
  protected final String TEXT_58 = ".get";
  protected final String TEXT_59 = "());" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_60 = NL + "\t\t\t\t\t\t\tpointcut setter";
  protected final String TEXT_61 = "(";
  protected final String TEXT_62 = " self, ";
  protected final String TEXT_63 = " newValue) : target(self) && execution(void ";
  protected final String TEXT_64 = ".set";
  protected final String TEXT_65 = "(*)) && args(newValue);" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_66 = NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_67 = " around (";
  protected final String TEXT_68 = " self) : getter";
  protected final String TEXT_69 = "(self){" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_70 = NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_71 = NL + "\t\t\t\t\t\t\tvoid around(";
  protected final String TEXT_72 = " self, ";
  protected final String TEXT_73 = " newValue) : setter";
  protected final String TEXT_74 = "(self, newValue){" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_75 = NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_76 = NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_77 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_78 = "\t\t" + NL + "\t\t\t\t\t";
  protected final String TEXT_79 = NL + "\t\t\t\t\t";
  protected final String TEXT_80 = NL + "\t\t\t\t";
  protected final String TEXT_81 = NL + "\t\t\t";
  protected final String TEXT_82 = NL + "\t\t";
  protected final String TEXT_83 = NL + "\t";
  protected final String TEXT_84 = "\t" + NL + "}" + NL + NL;
  protected final String TEXT_85 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     ArgumentsList args = (ArgumentsList) argument; 
     String className = args.getEClass(); 
     String ePackageName = args.getEPackage(); 
    stringBuffer.append(TEXT_1);
     int numMethod = 0; 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_3);
     for(int i=0; i<args.getModel().getMatching().size(); i++){ 
    stringBuffer.append(TEXT_4);
     boolean alreadyVisited = false; 
    stringBuffer.append(TEXT_5);
     for(int j=0; j<args.getModel().getMatching().get(i).getRhs().size(); j++){ 
    stringBuffer.append(TEXT_6);
     for(int k=0; k<args.getModel().getMatching().get(i).getRhs().get(j).getComposed().size(); k++){ 
    stringBuffer.append(TEXT_7);
     boolean isFirstSuperClass = false; 
    stringBuffer.append(TEXT_8);
     boolean hasSuperClass = false; 
    stringBuffer.append(TEXT_9);
     List superClass = args.getModel().getMatching().get(i).getRhs().get(j).getComposed().get(k).getConcept().getEAllSuperTypes(); 
    stringBuffer.append(TEXT_10);
     Iterator it = superClass.iterator(); 
    stringBuffer.append(TEXT_11);
     boolean isSuperClass = false; 
    stringBuffer.append(TEXT_12);
     while(it.hasNext() && !isSuperClass){ 
    stringBuffer.append(TEXT_13);
     hasSuperClass = true; 
    stringBuffer.append(TEXT_14);
     EClass cl = (EClass)it.next(); 
    stringBuffer.append(TEXT_15);
     if(cl.getName().equalsIgnoreCase(className)){ 
    stringBuffer.append(TEXT_16);
     isSuperClass = true; 
    stringBuffer.append(TEXT_17);
     if(cl.getEAllSuperTypes().size()==0){ 
    stringBuffer.append(TEXT_18);
     isFirstSuperClass = true; 
    stringBuffer.append(TEXT_19);
     } 
    stringBuffer.append(TEXT_20);
     } 
    stringBuffer.append(TEXT_21);
     } 
    stringBuffer.append(TEXT_22);
     if(args.getModel().getMatching().get(i).getRhs().get(j).getComposed().get(k).getConcept().getName().equalsIgnoreCase(className) || isSuperClass){ 
    stringBuffer.append(TEXT_23);
     if(!alreadyVisited){ 
    stringBuffer.append(TEXT_24);
     if(!hasSuperClass || isFirstSuperClass){ 
    stringBuffer.append(TEXT_25);
     for(int z=0; z<args.getModel().getMatching().get(i).getLhs().getComposed().size(); z++){ 
    stringBuffer.append(TEXT_26);
     Instance proxy = args.getModel().getMatching().get(i).getLhs().getComposed().get(z); 
    stringBuffer.append(TEXT_27);
     if(proxy.isIsMain()){ 
    stringBuffer.append(TEXT_28);
    stringBuffer.append(proxy.getConcept().getEPackage().getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(proxy.getConcept().getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(ePackageName);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(proxy.getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(ePackageName);
    stringBuffer.append(TEXT_33);
     } 
    stringBuffer.append(TEXT_34);
     } 
    stringBuffer.append(TEXT_35);
     } 
    stringBuffer.append(TEXT_36);
     for(int l=0;l<args.getModel().getMatching().get(i).getCorrespondanceRule().size();l++){ 
    stringBuffer.append(TEXT_37);
     String methodeName = args.getModel().getMatching().get(i).getCorrespondanceRule().get(l).getFeature().getName(); 
    stringBuffer.append(TEXT_38);
     CorrespondanceRule correspondanceRule = args.getModel().getMatching().get(i).getCorrespondanceRule().get(l); 
    stringBuffer.append(TEXT_39);
     boolean setAble = true; 
    stringBuffer.append(TEXT_40);
     if(correspondanceRule.getFeature().getEContainingClass().getName().equalsIgnoreCase(className)){ 
    stringBuffer.append(TEXT_41);
     String type = ""; 
    stringBuffer.append(TEXT_42);
     if(correspondanceRule.getFeature() instanceof EReference){ 
    stringBuffer.append(TEXT_43);
     if(correspondanceRule.getFeature().getUpperBound()==1){ 
    stringBuffer.append(TEXT_44);
     type = correspondanceRule.getFeature().getEType().getEPackage().getName()+"."+correspondanceRule.getFeature().getEType().getName(); 
    stringBuffer.append(TEXT_45);
     setAble = true; 
    stringBuffer.append(TEXT_46);
     }else{ 
    stringBuffer.append(TEXT_47);
     type = "EList"; 
    stringBuffer.append(TEXT_48);
     setAble = false; 
    stringBuffer.append(TEXT_49);
     } 
    stringBuffer.append(TEXT_50);
     }else{ 
    stringBuffer.append(TEXT_51);
     type = correspondanceRule.getFeature().getEType().getInstanceTypeName(); 
    stringBuffer.append(TEXT_52);
     setAble = true; 
    stringBuffer.append(TEXT_53);
     } 
    stringBuffer.append(TEXT_54);
    stringBuffer.append(numMethod);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(ePackageName);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_57);
    stringBuffer.append( ePackageName );
    stringBuffer.append(TEXT_58);
    stringBuffer.append(methodeName.replaceFirst(".",(methodeName.charAt(0)+"").toUpperCase()) );
    stringBuffer.append(TEXT_59);
     if(correspondanceRule.getProperty().getSetPart() != null && setAble) { 
    stringBuffer.append(TEXT_60);
    stringBuffer.append(numMethod);
    stringBuffer.append(TEXT_61);
    stringBuffer.append(ePackageName);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_63);
    stringBuffer.append( ePackageName );
    stringBuffer.append(TEXT_64);
    stringBuffer.append(methodeName.replaceFirst(".",(methodeName.charAt(0)+"").toUpperCase()));
    stringBuffer.append(TEXT_65);
     } 
    stringBuffer.append(TEXT_66);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(ePackageName);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(numMethod);
    stringBuffer.append(TEXT_69);
    stringBuffer.append(correspondanceRule.getProperty().getGetPart().getRequest().getExpression());
    stringBuffer.append(TEXT_70);
     if(correspondanceRule.getProperty().getSetPart() != null && setAble) { 
    stringBuffer.append(TEXT_71);
    stringBuffer.append(ePackageName);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(numMethod);
    stringBuffer.append(TEXT_74);
    stringBuffer.append(correspondanceRule.getProperty().getSetPart().getRequest().getExpression());
    stringBuffer.append(TEXT_75);
     } 
    stringBuffer.append(TEXT_76);
     numMethod++; 
    stringBuffer.append(TEXT_77);
     } 
    stringBuffer.append(TEXT_78);
     } 
    stringBuffer.append(TEXT_79);
     alreadyVisited = true; 
    stringBuffer.append(TEXT_80);
     } 
    stringBuffer.append(TEXT_81);
     } 
    stringBuffer.append(TEXT_82);
     } 
    stringBuffer.append(TEXT_83);
     } 
     } 
    stringBuffer.append(TEXT_84);
    stringBuffer.append(TEXT_85);
    return stringBuffer.toString();
  }
}
