import ReleaseTransformations._

crossPaths := false

organization := "com.thesamet.test"

name := "test-protos"

releasePublishArtifactsAction := PgpKeys.publishSigned.value
