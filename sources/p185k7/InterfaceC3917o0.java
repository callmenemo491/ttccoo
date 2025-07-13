package p185k7;

/* renamed from: k7.o0 */
/* loaded from: classes.dex */
public interface InterfaceC3917o0 extends android.os.IInterface {
    void beginAdUnitExposure(java.lang.String r1, long r2);

    void clearConditionalUserProperty(java.lang.String r1, java.lang.String r2, android.os.Bundle r3);

    void clearMeasurementEnabled(long r1);

    void endAdUnitExposure(java.lang.String r1, long r2);

    void generateEventId(p185k7.InterfaceC3956r0 r1);

    void getAppInstanceId(p185k7.InterfaceC3956r0 r1);

    void getCachedAppInstanceId(p185k7.InterfaceC3956r0 r1);

    void getConditionalUserProperties(java.lang.String r1, java.lang.String r2, p185k7.InterfaceC3956r0 r3);

    void getCurrentScreenClass(p185k7.InterfaceC3956r0 r1);

    void getCurrentScreenName(p185k7.InterfaceC3956r0 r1);

    void getGmpAppId(p185k7.InterfaceC3956r0 r1);

    void getMaxUserProperties(java.lang.String r1, p185k7.InterfaceC3956r0 r2);

    void getTestFlag(p185k7.InterfaceC3956r0 r1, int r2);

    void getUserProperties(java.lang.String r1, java.lang.String r2, boolean r3, p185k7.InterfaceC3956r0 r4);

    void initForTests(java.util.Map r1);

    void initialize(p408x6.InterfaceC6957a r1, p185k7.C4034x0 r2, long r3);

    void isDataCollectionEnabled(p185k7.InterfaceC3956r0 r1);

    void logEvent(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, boolean r4, boolean r5, long r6);

    void logEventAndBundle(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, p185k7.InterfaceC3956r0 r4, long r5);

    void logHealthData(int r1, java.lang.String r2, p408x6.InterfaceC6957a r3, p408x6.InterfaceC6957a r4, p408x6.InterfaceC6957a r5);

    void onActivityCreated(p408x6.InterfaceC6957a r1, android.os.Bundle r2, long r3);

    void onActivityDestroyed(p408x6.InterfaceC6957a r1, long r2);

    void onActivityPaused(p408x6.InterfaceC6957a r1, long r2);

    void onActivityResumed(p408x6.InterfaceC6957a r1, long r2);

    void onActivitySaveInstanceState(p408x6.InterfaceC6957a r1, p185k7.InterfaceC3956r0 r2, long r3);

    void onActivityStarted(p408x6.InterfaceC6957a r1, long r2);

    void onActivityStopped(p408x6.InterfaceC6957a r1, long r2);

    void performAction(android.os.Bundle r1, p185k7.InterfaceC3956r0 r2, long r3);

    /* renamed from: registerOnMeasurementEventListener */
    void mo3127x37dae114(p185k7.InterfaceC3995u0 r1);

    void resetAnalyticsData(long r1);

    void setConditionalUserProperty(android.os.Bundle r1, long r2);

    void setConsent(android.os.Bundle r1, long r2);

    void setConsentThirdParty(android.os.Bundle r1, long r2);

    void setCurrentScreen(p408x6.InterfaceC6957a r1, java.lang.String r2, java.lang.String r3, long r4);

    void setDataCollectionEnabled(boolean r1);

    void setDefaultEventParameters(android.os.Bundle r1);

    void setEventInterceptor(p185k7.InterfaceC3995u0 r1);

    void setInstanceIdProvider(p185k7.InterfaceC4021w0 r1);

    void setMeasurementEnabled(boolean r1, long r2);

    void setMinimumSessionDuration(long r1);

    void setSessionTimeoutDuration(long r1);

    void setUserId(java.lang.String r1, long r2);

    void setUserProperty(java.lang.String r1, java.lang.String r2, p408x6.InterfaceC6957a r3, boolean r4, long r5);

    /* renamed from: unregisterOnMeasurementEventListener */
    void mo3128x89e2096d(p185k7.InterfaceC3995u0 r1);
}
