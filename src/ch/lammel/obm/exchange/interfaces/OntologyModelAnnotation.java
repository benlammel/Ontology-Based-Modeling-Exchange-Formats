package ch.lammel.obm.exchange.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface OntologyModelAnnotation {
	public String uri();
	public boolean uniqueIdentifier() default false;
	public String[] readAccess();
	public String[] writeAccess();
}
