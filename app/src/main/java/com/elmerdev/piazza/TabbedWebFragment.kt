package com.elmerdev.piazza

import dev.hotwire.turbo.nav.TurboNavGraphDestination

@TurboNavGraphDestination(uri = "piazza://fragment/web/tab")
class TabbedWebFragment : WebFragment() {}