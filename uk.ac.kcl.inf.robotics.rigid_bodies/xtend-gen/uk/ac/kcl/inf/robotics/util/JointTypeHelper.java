package uk.ac.kcl.inf.robotics.util;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import uk.ac.kcl.inf.robotics.rigidBodies.AdditiveJointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointType;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeExpression;
import uk.ac.kcl.inf.robotics.rigidBodies.JointTypeReference;

@SuppressWarnings("all")
public class JointTypeHelper {
  protected static JointTypeExpression _get(final JointTypeExpression exp, final int i) {
    if ((i == 0)) {
      return exp;
    } else {
      return null;
    }
  }
  
  protected static JointTypeExpression _get(final AdditiveJointType exp, final int i) {
    if ((i == 0)) {
      return exp.getLeft();
    } else {
      EList<JointTypeExpression> _right = exp.getRight();
      return _right.get((i - 1));
    }
  }
  
  protected static JointTypeExpression _get(final JointTypeReference exp, final int i) {
    JointType _ref = exp.getRef();
    JointTypeExpression _exp = _ref.getExp();
    return JointTypeHelper.get(_exp, i);
  }
  
  public static JointTypeExpression get(final JointTypeExpression exp, final int i) {
    if (exp instanceof AdditiveJointType) {
      return _get((AdditiveJointType)exp, i);
    } else if (exp instanceof JointTypeReference) {
      return _get((JointTypeReference)exp, i);
    } else if (exp != null) {
      return _get(exp, i);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp, i).toString());
    }
  }
}
