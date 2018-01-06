package LivingstoneCorba;


/**
* LivingstoneCorba/_LivingstoneEventListenerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from LivingstoneCorba.idl
* Thursday, April 20, 2006 4:53:49 PM PDT
*/

public class _LivingstoneEventListenerStub extends org.omg.CORBA.portable.ObjectImpl implements LivingstoneCorba.LivingstoneEventListener
{

  public void start ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("start", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                start (        );
            } finally {
                _releaseReply ($in);
            }
  } // start


  // void setScenarioTrace(ScenarioTrace trace)
  public void reportVariables (LivingstoneCorba.LivingstoneAttributeReport attributes)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("reportVariables", true);
                LivingstoneCorba.LivingstoneAttributeReportHelper.write ($out, attributes);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                reportVariables (attributes        );
            } finally {
                _releaseReply ($in);
            }
  } // reportVariables

  public void newState (float time, int stateID, String transition, LivingstoneCorba.LivingstoneAssignmentReport assignments)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("newState", true);
                $out.write_float (time);
                $out.write_long (stateID);
                $out.write_string (transition);
                LivingstoneCorba.LivingstoneAssignmentReportHelper.write ($out, assignments);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                newState (time, stateID, transition, assignments        );
            } finally {
                _releaseReply ($in);
            }
  } // newState

  public void viewState (float time, int stateID, String transition, LivingstoneCorba.LivingstoneAssignmentReport assignments)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("viewState", true);
                $out.write_float (time);
                $out.write_long (stateID);
                $out.write_string (transition);
                LivingstoneCorba.LivingstoneAssignmentReportHelper.write ($out, assignments);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                viewState (time, stateID, transition, assignments        );
            } finally {
                _releaseReply ($in);
            }
  } // viewState

  public void asynchronousMsg (short state, String msg)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("asynchronousMsg", true);
                $out.write_short (state);
                $out.write_string (msg);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                asynchronousMsg (state, msg        );
            } finally {
                _releaseReply ($in);
            }
  } // asynchronousMsg


  //void mapOver(Object parent, int depth, MapOverClosure arg);
  public void finish ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("finish", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                finish (        );
            } finally {
                _releaseReply ($in);
            }
  } // finish

  public void startReplay ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("startReplay", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                startReplay (        );
            } finally {
                _releaseReply ($in);
            }
  } // startReplay

  public void finishReplay ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("finishReplay", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                finishReplay (        );
            } finally {
                _releaseReply ($in);
            }
  } // finishReplay


  // OUT
  public void gotCandidates (int num)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("gotCandidates", true);
                $out.write_long (num);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                gotCandidates (num        );
            } finally {
                _releaseReply ($in);
            }
  } // gotCandidates


  //	void gotCurrentHistory(History);
  public void gotInstallCandidate (int index)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("gotInstallCandidate", true);
                $out.write_long (index);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                gotInstallCandidate (index        );
            } finally {
                _releaseReply ($in);
            }
  } // gotInstallCandidate

  public void gotAssignment (String monitor)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("gotAssignment", true);
                $out.write_string (monitor);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                gotAssignment (monitor        );
            } finally {
                _releaseReply ($in);
            }
  } // gotAssignment

  public void gotProgress (String command)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("gotProgress", true);
                $out.write_string (command);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                gotProgress (command        );
            } finally {
                _releaseReply ($in);
            }
  } // gotProgress


  // return list of schematic modules, loadable by Stanley
  public String getModules ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getModules", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getModules (        );
            } finally {
                _releaseReply ($in);
            }
  } // getModules


  // load Stanley schematic module for use by metaDot
  public void loadModule (String moduleName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("loadModule", true);
                $out.write_string (moduleName);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                loadModule (moduleName        );
            } finally {
                _releaseReply ($in);
            }
  } // loadModule


  // return list of workspaces, loadable by Stanley
  public String getWorkSpaces ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getWorkSpaces", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getWorkSpaces (        );
            } finally {
                _releaseReply ($in);
            }
  } // getWorkSpaces


  // load Stanley workspace for use by getModules, loadModule
  public void loadWorkSpace (String workspace)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("loadWorkSpace", true);
                $out.write_string (workspace);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                loadWorkSpace (workspace        );
            } finally {
                _releaseReply ($in);
            }
  } // loadWorkSpace


  // Open Stanley to desired instance & dialog
  public void metaDot (String nodeClassType, String instanceName, String dialogType, String modeName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("metaDot", true);
                $out.write_string (nodeClassType);
                $out.write_string (instanceName);
                $out.write_string (dialogType);
                $out.write_string (modeName);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                metaDot (nodeClassType, instanceName, dialogType, modeName        );
            } finally {
                _releaseReply ($in);
            }
  } // metaDot


  // return list of instance names of the requested class type
  public String getInstances (String nodeClassType, String componentInstanceName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getInstances", true);
                $out.write_string (nodeClassType);
                $out.write_string (componentInstanceName);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getInstances (nodeClassType, componentInstanceName        );
            } finally {
                _releaseReply ($in);
            }
  } // getInstances

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:LivingstoneCorba/LivingstoneEventListener:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _LivingstoneEventListenerStub