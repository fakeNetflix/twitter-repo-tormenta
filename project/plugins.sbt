resolvers += Resolver.url("sbt-plugin-releases included", new URL("https://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

resolvers += "jgit-repo" at "https://download.eclipse.org/jgit/maven"

addSbtPlugin("com.github.gseitz"  % "sbt-release"     % "1.0.0")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"         % "1.0.0")
addSbtPlugin("com.typesafe"       % "sbt-mima-plugin" % "0.1.12")
addSbtPlugin("com.typesafe.sbt"   % "sbt-ghpages"     % "0.5.4")
addSbtPlugin("com.typesafe.sbt"   % "sbt-scalariform" % "1.3.0")
addSbtPlugin("org.scoverage"      % "sbt-scoverage"   % "1.5.0")
addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"    % "1.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"         % "0.2.18")
