package nz.co.aetheric.maven.plugin.slam

import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.PortMojo]].
 */
class PortMojoTest extends SlamMojoTestBase[PortMojo] {

	override val target = "port"

	"The Mojo" should "fail immediately when executed" in {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}