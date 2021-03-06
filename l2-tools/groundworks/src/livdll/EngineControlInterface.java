// 
// * See the file "l2-tools/disclaimers-and-notices.txt" for 
// * information on usage and redistribution of this file, 
// * and for a DISCLAIMER OF ALL WARRANTIES. 
// 

//
// * See the file "l2-tools/disclaimers-and-notices.txt" for 
// * information on usage and redistribution of this file, 
// * and for a DISCLAIMER OF ALL WARRANTIES.
//
/* Generated by Together */

package livdll;

public interface EngineControlInterface {

    public void addEngineListener(EngineListener l);
    
    public void removeEngineListener(EngineListener l);
    
    public void removeAllEngineListeners();
    
    public void startEngine() throws java.io.IOException, L2Exception;
    
    public void stopEngine() throws L2JavaException;
    
    // returns the name of the root component type
    public String loadModel(java.io.File file) throws  Exception;
    
    public void loadParameters(java.io.File file) throws L2JavaException, java.io.IOException;

    public FindCandidates getDiagnosis() throws L2Exception;

    //public void minProgress(String command) throws L2Exception;

    //public void fullProgress(String command) throws L2Exception;

    //public void assign(String monitor) throws L2Exception;
    
    //public void assignMultiple(String monitor) throws L2Exception;
    
    //public void findCandidates(String command) throws L2Exception;

    //public boolean propagate() throws L2Exception;

    public boolean parseCmd (livdll.LivingstoneCommand command) throws L2Exception;

}