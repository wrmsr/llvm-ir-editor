package com.intel.llvm.ireditor.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractLLVM_IRJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage.eINSTANCE);
		return result;
	}

}
