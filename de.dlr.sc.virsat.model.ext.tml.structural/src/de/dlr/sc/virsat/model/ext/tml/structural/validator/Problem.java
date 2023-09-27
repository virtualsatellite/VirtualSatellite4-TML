/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.validator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;

import de.dlr.sc.virsat.build.marker.util.VirSatValidationMarkerHelper;
import de.dlr.sc.virsat.model.dvlm.general.IInstance;
import de.dlr.sc.virsat.model.dvlm.general.IName;
import de.dlr.sc.virsat.project.markers.VirSatProblemMarkerHelper;

/**
 * 
 * @author nepa_ay
 *
 */
public class Problem {

	public enum ProblemKind {
		NONE, 
		GPS, 
		GRAPH, 
		GRAPH_CONFIG,
		GRAPH_RECURSION;
	}

	private int severity = IMarker.SEVERITY_WARNING;
	private ProblemKind kind = ProblemKind.NONE;
	private String message;
	private EObject object;

	/**
	 * Constructor
	 * @param severity Severity of problem
	 * @param message problem message
	 * @param object E-Object.
	 */
	public Problem(int severity, String message, EObject object) {
		this.severity = severity;
		this.message = message;
		this.object = object;
	}
	
	/**
	 * Constructor
	 * @param severity Severity of problem
	 * @param message problem message
	 * @param object E-Object.
	 * @param kind Kind of problem
	 */
	public Problem(int severity, String message, EObject object, ProblemKind kind) {
		this.severity = severity;
		this.message = message;
		this.object = object;
		this.kind = kind;
	}

	/**
	 * Getter
	 * @return Severity
	 */
	public int getSeverity() {
		return severity;
	}

	/**
	 * 
	 * @param severity
	 * @return
	 */
	private String getSeverityString() {
		switch (severity) {
			case 0:
				return "INFO";
			case 1:
				return "WARNING";
			case 2:
				return "ERROR";
			default:
				return "SEVERTITY-" + severity;
		}
	}
	
	/**
	 * Getter
	 * @return Kind
	 */
	public ProblemKind getKind() {
		return kind;
	}
	
	/**
	 * Getter
	 * @return problem message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Getter
	 * @return EObject
	 */
	public EObject getObject() {
		return object;
	}
	
	/**
	 * Getter
	 * @return EObject name
	 */
	public String getObjectName() {
		return getObjectName(this);
	}

	/**
	 * Getter
	 * @return Location of problem
	 */
	public String getLocation() {
		return getLocation(this);
	}
	
	/**
	 * Serialize this problem
	 * @return String representation of problem
	 */
	public String serialize() {
		return serialize(this);
	}
	
	/**
	 * Serialize problem
	 * @param problem problem
	 * @return String representation of problem
	 */
	public static String serialize(Problem problem) {
		return problem.getObjectName() 
				+ ": " + problem.getSeverityString()  
				+ " - " + problem.getMessage();
	}
	
	/**
	 * Get location of problem
	 * @param problem problem obj
	 * @return Location string
	 */
	public static String getLocation(Problem problem) {
		return getFQIName(problem.getObject());
	}
		
	/**
	 * Get full-qualified instance name
	 * @param object Eobject
	 * @return Full-qualified instance name
	 */
	public static String getFQIName(EObject obj) {
		if (obj instanceof IName && obj instanceof IInstance) {
			String name = ((IName) obj).getName();
			String fqiName = ((IInstance) obj).getFullQualifiedInstanceName();
			int pointIdx = fqiName.lastIndexOf(".");
			String namespace = fqiName.substring(0, pointIdx);
			return namespace + "." + name;
		}
		return obj.toString();
	}
	
	/**
	 * Serialize all problems
	 * @param problems List of problem objects
	 * @return String representation of all problems in the list.
	 */
	public static String serializeAll(List<Problem> problems) {
		StringBuilder stringBuilder = new StringBuilder();
		problems.stream().forEach(w -> {
			stringBuilder.append("  ");
			stringBuilder.append(serialize(w));
			if (problems.indexOf(w) != problems.size() - 1) {
				stringBuilder.append("\n");
			}
		});
		return stringBuilder.toString();
	}
	
	/**
	 * Create DVLM validation marker.
	 * @param problems List of problem
	 */
	public static void createDVLMValidationMarker(List<Problem> problems) {
		VirSatValidationMarkerHelper vvmHelper = new VirSatValidationMarkerHelper();
		problems.forEach(problem -> {
			vvmHelper.createDVLMValidationMarker(problem.getSeverity(), 
												 problem.getMessage(), 
												 problem.getObject());
		});
	}
	
	/**
	 * Create DVLM validation marker.
	 * @param problem Problem
	 */
	public static void createDVLMValidationMarker(Problem problem) {
		VirSatValidationMarkerHelper vvmHelper = new VirSatValidationMarkerHelper();
		vvmHelper.createDVLMValidationMarker(problem.getSeverity(), 
											 problem.getMessage(), 
											 problem.getObject());
	}
	
	/**
	 * Filter problems by kind.
	 * @param problems List of problems
	 * @param kind Problem kind
	 * @return Filtered list of problems
	 */
	public static List<Problem> filterProblems(List<Problem> problems, ProblemKind kind) {
		return problems.stream().filter(problem -> problem.getKind() == kind).collect(Collectors.toList());
	}
	
	/**
	 * Filter problems by severity.
	 * @param problems List of problems
	 * @param severity Problem kind
	 * @return Filtered list of problems
	 */
	public static List<Problem> filterProblems(List<Problem> problems, int severity) {
		return problems.stream().filter(problem -> problem.getSeverity() == severity).collect(Collectors.toList());
	}
	
	/**
	 * Filter problems in object.
	 * @param problems List of problems
	 * @param obj Object
	 * @return Filtered list of problems
	 */
	public static List<Problem> filterProblems(List<Problem> problems, Object obj) {
		return problems.stream().filter(problem -> problem.getObject().equals(obj)).collect(Collectors.toList());
	}
	
	/**
	 * Remove duplicate problems
	 * @param problems List of problems
	 */
	public static void removeDuplicateProblems(List<Problem> problems) {
		Set<String> uniqueproblemText = new HashSet<>();
		List<Problem> uniqueproblems = problems.stream().filter(w -> uniqueproblemText.add(serialize(w)))
				.collect(Collectors.toList());
		problems.retainAll(uniqueproblems);
	}

	/**
	 * Get all objects from the problem list.
	 * @param list List of problems
	 * @return List of objects.
	 */
	public static List<EObject> getObjects(List<Problem> list) {
		return list.stream().map(w -> w.getObject()).collect(Collectors.toList());
	}

	/**
	 * Get all problem messages.
	 * @param list List of problems.
	 * @return List of problem messges
	 */
	public static List<String> getproblemMessages(List<Problem> list) {
		return list.stream().map(w -> w.getMessage()).collect(Collectors.toList());
	}
	
	/**
	 * Get all object names.
	 * @param list List of problems
	 * @return List of names.
	 */
	public static List<String> getObjectNames(List<Problem> list) {
		return list.stream().map(w -> getObjectName(w)).collect(Collectors.toList());
	}
	
	/**
	 * Get markers associated with the object
	 * @param obj Object
	 * @return List of markers
	 */
	public static Set<IMarker> getMarkers(EObject obj) {
		VirSatProblemMarkerHelper markerHelper = new VirSatProblemMarkerHelper();
		return markerHelper.getAllMarkersForObjectAndContents(obj);
	}
	
	/**
	 * Get markers with severity associated with the object
	 * @param obj Object
	 * @param severity Severity
	 * @return List of markers
	 */
	public static List<IMarker> getMarkers(EObject obj, int severity) {
		return getMarkers(obj).stream().filter(marker -> {
			return getSeverity(marker).equals(severity);
		}).collect(Collectors.toList());
	}
	
	/**
	 * Get severity from the marker
	 * @param marker Marker
	 * @return Message string
	 */
	public static Integer getSeverity(IMarker marker) {
		Object att = getMarkerAttribute(marker, IMarker.SEVERITY);
		if (att instanceof Integer) {
			return ((Integer) att);
		}
		return -1;
	}
	
	/**
	 * Get message from the marker
	 * @param marker Marker
	 * @return Message string
	 */
	public static String getMessage(IMarker marker) {
		Object att = getMarkerAttribute(marker, IMarker.MESSAGE);
		if (att instanceof String) {
			return ((String) att);
		}
		return "ERROR occured while reading marker message!";
	}
	
	/**
	 * Get marker attribute value
	 * @param marker Marker object
	 * @param attName Attribute name
	 * @return Value object of the attribute
	 */
	private static Object getMarkerAttribute(IMarker marker, String attName) {
		Object att = null;
		try {
			att = marker.getAttribute(attName);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return att;
	}
	
	/**
	 * Get name of object
	 * @param problem problem
	 * @return Name of the object if object is IName, otherwise object to string.
	 * Empty string is returned if object is null.
	 */
	private static String getObjectName(Problem problem) {
		Object obj = problem.getObject();
		if (obj != null) {
			return obj.toString();
		}
		return "NULL OBJECT";
	}

}
