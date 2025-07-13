package p452z9;

/* renamed from: z9.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C7259a implements ca.InterfaceC0939b, ba.InterfaceC0727a, p392wa.InterfaceC6822a.a {

    /* renamed from: Y */
    public final /* synthetic */ p452z9.C7260b f27863Y;

    public /* synthetic */ C7259a(p452z9.C7260b r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>()
            r1.f27863Y = r2
            return
    }

    @Override // p392wa.InterfaceC6822a.a
    /* renamed from: c */
    public void mo25c(p392wa.InterfaceC6823b r8) {
            r7 = this;
            z9.b r0 = r7.f27863Y
            java.util.Objects.requireNonNull(r0)
            aa.c r1 = p011aa.C0047c.f101a
            java.lang.String r2 = "AnalyticsConnector now available."
            r1.m51b(r2)
            java.lang.Object r8 = r8.get()
            s9.a r8 = (p329s9.InterfaceC5997a) r8
            h7.rb r2 = new h7.rb
            r2.<init>(r8)
            z9.c r3 = new z9.c
            r3.<init>()
            java.lang.String r4 = "clx"
            s9.a$a r4 = r8.mo12478a(r4, r3)
            if (r4 != 0) goto L40
            r4 = 3
            java.lang.String r5 = "FirebaseCrashlytics"
            boolean r4 = android.util.Log.isLoggable(r5, r4)
            r6 = 0
            if (r4 == 0) goto L33
            java.lang.String r4 = "Could not register AnalyticsConnectorListener with Crashlytics origin."
            android.util.Log.d(r5, r4, r6)
        L33:
            java.lang.String r4 = "crash"
            s9.a$a r4 = r8.mo12478a(r4, r3)
            if (r4 == 0) goto L40
            java.lang.String r8 = "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."
            android.util.Log.w(r5, r8, r6)
        L40:
            if (r4 == 0) goto L7b
            java.lang.String r8 = "Registered Firebase Analytics listener."
            r1.m51b(r8)
            h7.rb r8 = new h7.rb
            r1 = 14
            r8.<init>(r1)
            ba.c r1 = new ba.c
            r4 = 500(0x1f4, float:7.0E-43)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.<init>(r2, r4, r5)
            monitor-enter(r0)
            java.util.List<ca.a> r2 = r0.f27867d     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L78
        L5e:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L78
            ca.a r4 = (ca.InterfaceC0938a) r4     // Catch: java.lang.Throwable -> L78
            r8.mo2663f(r4)     // Catch: java.lang.Throwable -> L78
            goto L5e
        L6e:
            r3.f27869b = r8     // Catch: java.lang.Throwable -> L78
            r3.f27868a = r1     // Catch: java.lang.Throwable -> L78
            r0.f27866c = r8     // Catch: java.lang.Throwable -> L78
            r0.f27865b = r1     // Catch: java.lang.Throwable -> L78
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            goto L80
        L78:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            throw r8
        L7b:
            java.lang.String r8 = "Could not register Firebase Analytics listener; a listener is already registered."
            r1.m54e(r8)
        L80:
            return
    }

    @Override // ba.InterfaceC0727a
    /* renamed from: e */
    public void mo2333e(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            z9.b r0 = r1.f27863Y
            ba.a r0 = r0.f27865b
            r0.mo2333e(r2, r3)
            return
    }

    @Override // ca.InterfaceC0939b
    /* renamed from: f */
    public void mo2663f(ca.InterfaceC0938a r3) {
            r2 = this;
            z9.b r0 = r2.f27863Y
            monitor-enter(r0)
            ca.b r1 = r0.f27866c     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1 instanceof ca.C0940c     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto Le
            java.util.List<ca.a> r1 = r0.f27867d     // Catch: java.lang.Throwable -> L15
            r1.add(r3)     // Catch: java.lang.Throwable -> L15
        Le:
            ca.b r1 = r0.f27866c     // Catch: java.lang.Throwable -> L15
            r1.mo2663f(r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }
}
