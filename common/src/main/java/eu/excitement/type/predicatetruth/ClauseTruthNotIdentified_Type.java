
/* First created by JCasGen Mon Jul 14 22:29:07 IDT 2014 */
package eu.excitement.type.predicatetruth;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

/** 
 * Updated by JCasGen Tue Jul 15 10:01:13 IDT 2014
 * @generated */
public class ClauseTruthNotIdentified_Type extends ClauseTruth_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ClauseTruthNotIdentified_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ClauseTruthNotIdentified_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ClauseTruthNotIdentified(addr, ClauseTruthNotIdentified_Type.this);
  			   ClauseTruthNotIdentified_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ClauseTruthNotIdentified(addr, ClauseTruthNotIdentified_Type.this);
  	  }
    };
  /** @generated */
  // @SuppressWarnings ("hiding")
  public final static int typeIndexID = ClauseTruthNotIdentified.typeIndexID;
  /** @generated 
     @modifiable */
  // @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("eu.excitement.type.predicatetruth.ClauseTruthNotIdentified");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ClauseTruthNotIdentified_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    