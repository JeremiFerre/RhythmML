/*
 * generated by Xtext 2.14.0
 */
package fr.polytech.dsl.rhythm

import fr.polytech.dsl.rhythm.GuardinStandaloneSetupGenerated

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GuardinStandaloneSetup extends GuardinStandaloneSetupGenerated {

	def static void doSetup() {
		new GuardinStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
