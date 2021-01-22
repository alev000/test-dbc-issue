import play.api.http.DefaultHttpErrorHandler

// Workaround for combining Play 2.8.7 and SBT 1.4.6
// See https://github.com/playframework/playframework/issues/10486
class AppErrorHandler extends DefaultHttpErrorHandler(sourceMapper = None)
