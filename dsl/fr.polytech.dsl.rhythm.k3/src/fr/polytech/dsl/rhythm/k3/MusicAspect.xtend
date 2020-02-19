package fr.polytech.dsl.rhythm.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.polytech.dsl.model.rhythm.Music

/*
 * 
 * Simple Ecore extension allowing to annotate all classes of an ecore model by adding 
 * an annotation containing the list of all super classes (flat)  
 */
 
 @Aspect(className=Music)
 class MusicAspect {
 	
 	@Main
 	def void main() {
 		MappingUtils.runMusic(_self)
 	}
 }