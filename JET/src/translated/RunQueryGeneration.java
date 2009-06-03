package translated;

import launcher.*;
import adaptor.*;
import filtering.*;
import java.util.*;

public class RunQueryGeneration
{
  protected static String nl;
  public static synchronized RunQueryGeneration create(String lineSeparator)
  {
    nl = lineSeparator;
    RunQueryGeneration result = new RunQueryGeneration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package filtering;" + NL + "" + NL + "import org.eclipse.emf.ecore.EObject;" + NL + "import org.eclipse.emf.common.util.EList;" + NL + "import org.eclipse.emf.ecore.EAttribute;" + NL + "import java.util.*;" + NL + "import java.io.*;" + NL + "import patternsEngine.*;" + NL + "import interpretor.*;" + NL + "import utils.AdapterRelay;" + NL + "" + NL + "/**" + NL + " * " + NL + " * @author Jeremie SCHEER & Loic SUTTER" + NL + " *" + NL + " */" + NL + "" + NL + "class RunQuery {" + NL + "" + NL + "private ItfPatternEngine pe;" + NL + "" + NL + "public RunQuery(ItfPatternEngine pe){" + NL + " this.pe = pe;" + NL + "}" + NL;
  protected final String TEXT_2 = NL + NL + "\tpublic EObject [] runPattern";
  protected final String TEXT_3 = "(EObject eo) {" + NL + "\t\tString prologFileName = \"prologFiles/rp";
  protected final String TEXT_4 = ".pl\";" + NL + "\t\tFile prologFile = new File(prologFileName);" + NL + "\t\tSet<Map> prologResult = pe.executesProlog(prologFile);" + NL + "\t\t";
  protected final String TEXT_5 = NL + "\t\t";
  protected final String TEXT_6 = NL + "\t\tboolean isLhsPattern = false;" + NL + "\t\tEObject[] res = null;" + NL + "\t\t" + NL + "\t\t\t";
  protected final String TEXT_7 = NL + "\t\t\t\t";
  protected final String TEXT_8 = NL + "\t\t\t\t\tif(eo.eClass().getName().equalsIgnoreCase(\"";
  protected final String TEXT_9 = "\")){" + NL + "\t\t\t\t\t\tisLhsPattern = true;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t";
  protected final String TEXT_10 = NL + "\t\t\t";
  protected final String TEXT_11 = NL + "\t\t" + NL + "\t\tif(isLhsPattern==true) {" + NL + "\t\t\tboolean isMapped = false;" + NL + "\t\t\tMap correctMap = null;" + NL + "\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_12 = NL + "\t\t\t";
  protected final String TEXT_13 = NL + "\t\t\t";
  protected final String TEXT_14 = NL + "\t\t\t\t";
  protected final String TEXT_15 = NL + "\t\t\t\t\t";
  protected final String TEXT_16 = NL + "\t\t\t\t";
  protected final String TEXT_17 = NL + "\t\t\t\t";
  protected final String TEXT_18 = NL + "\t\t\t";
  protected final String TEXT_19 = NL + "\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_20 = NL + "\t\t\t\treturn null;" + NL + "\t\t\t";
  protected final String TEXT_21 = NL + "\t\t\t" + NL + "\t\t\t\tIterator it = prologResult.iterator();" + NL + "\t\t\t\twhile(it.hasNext()){" + NL + "\t\t\t\t\tMap tmp = (Map)it.next();" + NL + "\t" + NL + "\t\t\t\t\tif(tmp.get(\"Var";
  protected final String TEXT_22 = "\")==eo){" + NL + "\t\t\t\t\t\tif(isMapped){" + NL + "\t\t\t\t\t\t\tSystem.err.println(\"There can be only one map matching the EObject parameter\");" + NL + "\t\t\t\t\t\t\tSystem.exit(-1);" + NL + "\t\t\t\t\t\t}else{" + NL + "\t\t\t\t\t\t\tcorrectMap = tmp;" + NL + "\t\t\t\t\t\t\tisMapped = true;" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t\t" + NL + "\t\t\t\tif(correctMap==null){" + NL + "\t\t\t\t\treturn null;" + NL + "\t\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t\t";
  protected final String TEXT_23 = " objectInstanced = ";
  protected final String TEXT_24 = ".eINSTANCE;" + NL + "\t\t\t\t boolean instanced = false;" + NL + "\t\t\t\t" + NL + "\t\t\t\tInterpretor interpret = new Interpretor();" + NL + "\t\t\t\t";
  protected final String TEXT_25 = NL + "\t\t\t\t\t";
  protected final String TEXT_26 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_27 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_28 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_29 = NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t interpret.addVar(\"";
  protected final String TEXT_30 = "\", ";
  protected final String TEXT_31 = "correctMap.get(\"Var";
  protected final String TEXT_32 = "\"));" + NL + "\t\t\t\t\t";
  protected final String TEXT_33 = NL + "\t\t\t\t";
  protected final String TEXT_34 = NL + "\t\t\t\t" + NL + "\t\t\t\t" + NL + "\t\t\t\t";
  protected final String TEXT_35 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_36 = NL + "\t\t\t\t\t\t\tinstanced = true;" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_37 = NL + "\t\t\t\t\t\t\t\t if(interpret.getInterpretorResult(\"";
  protected final String TEXT_38 = "\", \"";
  protected final String TEXT_39 = "\").getResult().toString().equalsIgnoreCase(\"true\")){" + NL + "\t\t\t\t\t\t\t\t\tinstanced = true;" + NL + "\t\t\t\t\t\t\t\t }" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_40 = NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\tif(instanced){" + NL + "\t\t\t\t\t\t\tres = new EObject[";
  protected final String TEXT_41 = "];" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_42 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_43 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_44 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_45 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_46 = NL + "\t\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_47 = " ";
  protected final String TEXT_48 = " = (";
  protected final String TEXT_49 = ")objectInstanced.";
  protected final String TEXT_50 = ";" + NL + "\t\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_51 = NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_52 = NL + "\t\t\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_53 = NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_54 = NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_55 = ".";
  protected final String TEXT_56 = " = ";
  protected final String TEXT_57 = "correctMap.get(\"Var";
  protected final String TEXT_58 = "\");" + NL + "\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_59 = ".";
  protected final String TEXT_60 = ".eAdapters().add(new AdapterRelay(";
  protected final String TEXT_61 = "));" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_62 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_63 = NL + "\t\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\tres[";
  protected final String TEXT_64 = "]=";
  protected final String TEXT_65 = ";" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_66 = NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\tSystem.out.println(\"Proxies initialized\");" + NL + "\t\t\t\t\t\t\treturn res;" + NL + "\t\t\t\t\t\t }" + NL + "\t\t\t\t";
  protected final String TEXT_67 = NL + "\t\t\t\treturn null;" + NL + "\t\t\t";
  protected final String TEXT_68 = NL + "\t\t}else{" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_69 = NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    ArgumentsRunQuery args = (ArgumentsRunQuery) argument; 
     Adaptor adapt = args.getModel(); 
     String packFactoryName = args.getFactoryPath();
     String implPath = args.getImplPath();
    stringBuffer.append(TEXT_1);
     for(int i=0;i<adapt.getMatching().size();i++) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(i+1);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(i+1);
    stringBuffer.append(TEXT_4);
    Matching currentMatching = adapt.getMatching().get(i);
    stringBuffer.append(TEXT_5);
    LhsPattern lhsPattern = currentMatching.getLhs();
    stringBuffer.append(TEXT_6);
     for(int j=0; j<lhsPattern.getComposed().size(); j++){ 
    stringBuffer.append(TEXT_7);
     if(lhsPattern.getComposed().get(j).isIsMain()){ 
    stringBuffer.append(TEXT_8);
    stringBuffer.append(lhsPattern.getComposed().get(j).getConcept().getName());
    stringBuffer.append(TEXT_9);
     } 
    stringBuffer.append(TEXT_10);
     } 
    stringBuffer.append(TEXT_11);
     int firstMain = -1; 
    stringBuffer.append(TEXT_12);
     int a=0; 
    stringBuffer.append(TEXT_13);
     while(firstMain==-1 &&  a<currentMatching.getLhs().getComposed().size()){ 
    stringBuffer.append(TEXT_14);
     if(currentMatching.getLhs().getComposed().get(a).isIsMain()){ 
    stringBuffer.append(TEXT_15);
     firstMain = a; 
    stringBuffer.append(TEXT_16);
     } 
    stringBuffer.append(TEXT_17);
     a++; 
    stringBuffer.append(TEXT_18);
     } 
    stringBuffer.append(TEXT_19);
     if(firstMain==-1){ 
    stringBuffer.append(TEXT_20);
     }else{ 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(currentMatching.getLhs().getComposed().get(firstMain).getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(packFactoryName);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(packFactoryName);
    stringBuffer.append(TEXT_24);
     for(int w=0; w<currentMatching.getLhs().getComposed().size(); w++){ 
    stringBuffer.append(TEXT_25);
     if(currentMatching.getLhs().getComposed().get(w).isIsMain()){ 
    stringBuffer.append(TEXT_26);
     Instance lhsInstInterpret = currentMatching.getLhs().getComposed().get(w); 
    stringBuffer.append(TEXT_27);
     String castForInterpret = "("+lhsInstInterpret.getConcept().getEPackage().getName()+"."+lhsInstInterpret.getConcept().getName()+")";
    stringBuffer.append(TEXT_28);
     String lhsName = currentMatching.getLhs().getComposed().get(w).getName(); 
    stringBuffer.append(TEXT_29);
    stringBuffer.append(lhsName);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(castForInterpret);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(lhsName);
    stringBuffer.append(TEXT_32);
     } 
    stringBuffer.append(TEXT_33);
     } 
    stringBuffer.append(TEXT_34);
     for(int k=0; k<currentMatching.getRhs().size(); k++){ 
    stringBuffer.append(TEXT_35);
     if(currentMatching.getRhs().get(k).getQuery()==null){ 
    stringBuffer.append(TEXT_36);
     }else{ 
    stringBuffer.append(TEXT_37);
    stringBuffer.append(currentMatching.getRhs().get(k).getQuery().getRequest().getLangage().toString().toLowerCase());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(currentMatching.getRhs().get(k).getQuery().getRequest().getExpression());
    stringBuffer.append(TEXT_39);
     } 
    stringBuffer.append(TEXT_40);
    stringBuffer.append(currentMatching.getRhs().get(k).getComposed().size());
    stringBuffer.append(TEXT_41);
     for(int l=0; l<currentMatching.getRhs().get(k).getComposed().size(); l++){ 
    stringBuffer.append(TEXT_42);
     Instance rhsInst = currentMatching.getRhs().get(k).getComposed().get(l); 
    stringBuffer.append(TEXT_43);
     String objectType = implPath+"."+rhsInst.getConcept().getName()+"Impl";
    stringBuffer.append(TEXT_44);
     String objectName = "o"+l; 
    stringBuffer.append(TEXT_45);
     String createMethodName = "create"+rhsInst.getConcept().getName()+"()";
    stringBuffer.append(TEXT_46);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(createMethodName);
    stringBuffer.append(TEXT_50);
     for(int z=0; z<currentMatching.getLhs().getComposed().size(); z++){ 
    stringBuffer.append(TEXT_51);
     Instance lhsInst = currentMatching.getLhs().getComposed().get(z); 
    stringBuffer.append(TEXT_52);
     if(lhsInst.isIsMain()){ 
    stringBuffer.append(TEXT_53);
     String castPrologResult = "("+lhsInst.getConcept().getEPackage().getName()+"."+lhsInst.getConcept().getName()+")";
    stringBuffer.append(TEXT_54);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(lhsInst.getName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(castPrologResult);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(lhsInst.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(lhsInst.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_61);
     } 
    stringBuffer.append(TEXT_62);
     } 
    stringBuffer.append(TEXT_63);
    stringBuffer.append(l);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(objectName);
    stringBuffer.append(TEXT_65);
     } 
    stringBuffer.append(TEXT_66);
     } 
    stringBuffer.append(TEXT_67);
     } 
    stringBuffer.append(TEXT_68);
     } 
    stringBuffer.append(TEXT_69);
    return stringBuffer.toString();
  }
}
