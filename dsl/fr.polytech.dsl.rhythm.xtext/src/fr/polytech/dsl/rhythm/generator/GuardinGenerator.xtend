/*
 * generated by Xtext 2.14.0
 */
package fr.polytech.dsl.rhythm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.polytech.dsl.rhythm.GuardinChecker
import fr.polytech.dsl.model.rhythm.Music
import fr.polytech.dsl.model.rhythm.impl.MusicImpl

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GuardinGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		val musicObject = resource.allContents.findFirst[obj|obj.class == typeof(MusicImpl)]
		if (!new GuardinChecker(musicObject as Music).verify) {
			throw new RuntimeException("There are not the right number of notes defined in your structure");
		} else {
			println("Syntax is correct!");
		}
	}
}
