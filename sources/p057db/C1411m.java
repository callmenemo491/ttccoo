package p057db;

/* renamed from: db.m */
/* loaded from: classes.dex */
public class C1411m implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: Y */
    public final java.util.Set<android.content.Intent> f7072Y;

    public C1411m() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.f7072Y = r0
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r6, android.os.Bundle r7) {
            r5 = this;
            android.content.Intent r6 = r6.getIntent()
            if (r6 == 0) goto L9f
            java.util.Set<android.content.Intent> r7 = r5.f7072Y
            boolean r7 = r7.add(r6)
            if (r7 != 0) goto L10
            goto L9f
        L10:
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto L9f
            java.lang.String r7 = "gcm.n.analytics_data"
            android.os.Bundle r6 = r6.getBundle(r7)
            java.lang.String r7 = "1"
            if (r6 != 0) goto L22
            r0 = 0
            goto L2c
        L22:
            java.lang.String r0 = "google.c.a.e"
            java.lang.String r0 = r6.getString(r0)
            boolean r0 = r7.equals(r0)
        L2c:
            if (r0 == 0) goto L9f
            if (r6 != 0) goto L31
            goto L9a
        L31:
            java.lang.String r0 = "google.c.a.tc"
            java.lang.String r0 = r6.getString(r0)
            boolean r7 = r7.equals(r0)
            r0 = 3
            java.lang.String r1 = "FirebaseMessaging"
            if (r7 == 0) goto L8f
            o9.d r7 = p251o9.C5180d.m11494c()
            java.lang.Class<s9.a> r2 = p329s9.InterfaceC5997a.class
            r7.m11497a()
            y9.i r7 = r7.f20315d
            java.lang.Object r7 = r7.mo14246a(r2)
            s9.a r7 = (p329s9.InterfaceC5997a) r7
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L5c
            java.lang.String r0 = "Received event with track-conversion=true. Setting user property and reengagement event"
            android.util.Log.d(r1, r0)
        L5c:
            if (r7 == 0) goto L89
            java.lang.String r0 = "google.c.a.c_id"
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "fcm"
            java.lang.String r2 = "_ln"
            r7.mo12482e(r1, r2, r0)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "source"
            java.lang.String r4 = "Firebase"
            r2.putString(r3, r4)
            java.lang.String r3 = "medium"
            java.lang.String r4 = "notification"
            r2.putString(r3, r4)
            java.lang.String r3 = "campaign"
            r2.putString(r3, r0)
            java.lang.String r0 = "_cmp"
            r7.mo12483f(r1, r0, r2)
            goto L9a
        L89:
            java.lang.String r7 = "Unable to set user property for conversion tracking:  analytics library is missing"
            android.util.Log.w(r1, r7)
            goto L9a
        L8f:
            boolean r7 = android.util.Log.isLoggable(r1, r0)
            if (r7 == 0) goto L9a
            java.lang.String r7 = "Received event with track-conversion=false. Do not set user property"
            android.util.Log.d(r1, r7)
        L9a:
            java.lang.String r7 = "_no"
            p057db.C1420u.m3944b(r7, r6)
        L9f:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            boolean r0 = r2.isFinishing()
            if (r0 == 0) goto Lf
            java.util.Set<android.content.Intent> r0 = r1.f7072Y
            android.content.Intent r2 = r2.getIntent()
            r0.remove(r2)
        Lf:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }
}
