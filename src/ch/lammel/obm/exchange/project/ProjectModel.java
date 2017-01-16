package ch.lammel.obm.exchange.project;

import java.util.ArrayList;

import ch.lammel.obm.exchange.interfaces.OntologyModelAnnotation;

@OntologyModelAnnotation(uri="obm:Project")
public class ProjectModel {

	@OntologyModelAnnotation(uri="rdfs:label")
	public String projectName;

	@OntologyModelAnnotation(uri="obm:projectHasDescription")
	public String projectDescription;
	
	@OntologyModelAnnotation(uri="obm:projectAccessForUser")
	public ArrayList<String> userHasAccess;
	
	@OntologyModelAnnotation(uri="obm:projectHasCreationDateTime")
	public String creationDateTime;
	
	@OntologyModelAnnotation(uri="obm:projectHasCreator")
	public String projectCreator;

}
