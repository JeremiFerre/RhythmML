/*
 * generated by Xtext 2.14.0
 */
package fr.polytech.dsl.rhythm.ide

import com.google.inject.Guice
import fr.polytech.dsl.rhythm.GuardinRuntimeModule
import fr.polytech.dsl.rhythm.GuardinStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class GuardinIdeSetup extends GuardinStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new GuardinRuntimeModule, new GuardinIdeModule))
	}
	
}
