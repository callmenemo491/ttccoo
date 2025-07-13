package p249o7;

@android.annotation.TargetApi(14)
/* renamed from: o7.c5 */
/* loaded from: classes.dex */
public final class C4971c5 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: Y */
    public final /* synthetic */ p249o7.C4979d5 f19621Y;

    public /* synthetic */ C4971c5(p249o7.C4979d5 r1) {
            r0 = this;
            r0.f19621Y = r1
            r0.<init>()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
            r8 = this;
            o7.d5 r0 = r8.f19621Y     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            o7.f3 r0 = r0.f5680n     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            java.lang.String r1 = "onActivityCreated"
            r0.m11169c(r1)     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            android.content.Intent r0 = r9.getIntent()     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            if (r0 != 0) goto L21
        L15:
            o7.d5 r0 = r8.f19621Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.m5 r0 = r0.m3178x()
            r0.m11324r(r9, r10)
            return
        L21:
            android.net.Uri r4 = r0.getData()     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            if (r4 == 0) goto L15
            boolean r1 = r4.isHierarchical()     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            if (r1 != 0) goto L2e
            goto L15
        L2e:
            o7.d5 r1 = r8.f19621Y     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            r1.m3158A()     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            java.lang.String r1 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            java.lang.String r1 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L58
            java.lang.String r1 = "https://www.google.com"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            if (r1 != 0) goto L58
            java.lang.String r1 = "android-app://com.google.appcrawler"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            if (r0 == 0) goto L56
            goto L58
        L56:
            r0 = 0
            goto L59
        L58:
            r0 = 1
        L59:
            if (r3 == r0) goto L5e
            java.lang.String r0 = "auto"
            goto L60
        L5e:
            java.lang.String r0 = "gs"
        L60:
            r5 = r0
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            if (r10 != 0) goto L6a
            goto L6b
        L6a:
            r3 = 0
        L6b:
            o7.d5 r0 = r8.f19621Y     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            o7.f4 r0 = r0.mo3160b()     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            j6.g r7 = new j6.g     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            r0.m11176s(r7)     // Catch: java.lang.RuntimeException -> L7e java.lang.Throwable -> L80
            goto L15
        L7e:
            r0 = move-exception
            goto L82
        L80:
            r0 = move-exception
            goto L92
        L82:
            o7.d5 r1 = r8.f19621Y     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L80
            o7.f3 r1 = r1.f5672f     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.m11170d(r2, r0)     // Catch: java.lang.Throwable -> L80
            goto L15
        L92:
            o7.d5 r1 = r8.f19621Y
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            o7.m5 r1 = r1.m3178x()
            r1.m11324r(r9, r10)
            throw r0
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r4) {
            r3 = this;
            o7.d5 r0 = r3.f19621Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.m5 r0 = r0.m3178x()
            java.lang.Object r1 = r0.f19855l
            monitor-enter(r1)
            android.app.Activity r2 = r0.f19850g     // Catch: java.lang.Throwable -> L24
            if (r4 != r2) goto L12
            r2 = 0
            r0.f19850g = r2     // Catch: java.lang.Throwable -> L24
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f r1 = r1.f5716g
            boolean r1 = r1.m11163w()
            if (r1 != 0) goto L1e
            goto L23
        L1e:
            java.util.Map<android.app.Activity, o7.j5> r0 = r0.f19849f
            r0.remove(r4)
        L23:
            return
        L24:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r7) {
            r6 = this;
            o7.d5 r0 = r6.f19621Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.m5 r0 = r0.m3178x()
            java.lang.Object r1 = r0.f19855l
            monitor-enter(r1)
            r2 = 0
            r0.f19854k = r2     // Catch: java.lang.Throwable -> L77
            r2 = 1
            r0.f19851h = r2     // Catch: java.lang.Throwable -> L77
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r3 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f r1 = r1.f5716g
            boolean r1 = r1.m11163w()
            r5 = 0
            if (r1 != 0) goto L3b
            r0.f19846c = r5
            com.google.android.gms.measurement.internal.d r7 = r0.f5736a
            o7.f4 r7 = r7.mo3160b()
            o7.x0 r1 = new o7.x0
            r1.<init>(r0, r3)
            r7.m11176s(r1)
            goto L53
        L3b:
            o7.j5 r7 = r0.m11326t(r7)
            o7.j5 r1 = r0.f19846c
            r0.f19847d = r1
            r0.f19846c = r5
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f4 r1 = r1.mo3160b()
            o7.w4 r5 = new o7.w4
            r5.<init>(r0, r7, r3)
            r1.m11176s(r5)
        L53:
            o7.d5 r7 = r6.f19621Y
            com.google.android.gms.measurement.internal.d r7 = r7.f5736a
            o7.f6 r7 = r7.m3180z()
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.measurement.internal.d r3 = r7.f5736a
            o7.f4 r3 = r3.mo3160b()
            o7.a6 r4 = new o7.a6
            r4.<init>(r7, r0, r2)
            r3.m11176s(r4)
            return
        L77:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            throw r7
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r7) {
            r6 = this;
            o7.d5 r0 = r6.f19621Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f6 r0 = r0.m3180z()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.measurement.internal.d r3 = r0.f5736a
            o7.f4 r3 = r3.mo3160b()
            o7.a6 r4 = new o7.a6
            r5 = 0
            r4.<init>(r0, r1, r5)
            r3.m11176s(r4)
            o7.d5 r0 = r6.f19621Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.m5 r0 = r0.m3178x()
            java.lang.Object r1 = r0.f19855l
            monitor-enter(r1)
            r2 = 1
            r0.f19854k = r2     // Catch: java.lang.Throwable -> La4
            android.app.Activity r3 = r0.f19850g     // Catch: java.lang.Throwable -> La4
            if (r7 == r3) goto L5d
            java.lang.Object r3 = r0.f19855l     // Catch: java.lang.Throwable -> La4
            monitor-enter(r3)     // Catch: java.lang.Throwable -> La4
            r0.f19850g = r7     // Catch: java.lang.Throwable -> L5a
            r0.f19851h = r5     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.measurement.internal.d r3 = r0.f5736a     // Catch: java.lang.Throwable -> La4
            o7.f r3 = r3.f5716g     // Catch: java.lang.Throwable -> La4
            boolean r3 = r3.m11163w()     // Catch: java.lang.Throwable -> La4
            if (r3 == 0) goto L5d
            r3 = 0
            r0.f19852i = r3     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.measurement.internal.d r3 = r0.f5736a     // Catch: java.lang.Throwable -> La4
            o7.f4 r3 = r3.mo3160b()     // Catch: java.lang.Throwable -> La4
            o7.l5 r4 = new o7.l5     // Catch: java.lang.Throwable -> La4
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> La4
            r3.m11176s(r4)     // Catch: java.lang.Throwable -> La4
            goto L5d
        L5a:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5a
            throw r7     // Catch: java.lang.Throwable -> La4
        L5d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f r1 = r1.f5716g
            boolean r1 = r1.m11163w()
            if (r1 != 0) goto L7b
            o7.j5 r7 = r0.f19852i
            r0.f19846c = r7
            com.google.android.gms.measurement.internal.d r7 = r0.f5736a
            o7.f4 r7 = r7.mo3160b()
            o7.l5 r1 = new o7.l5
            r1.<init>(r0, r5)
            r7.m11176s(r1)
            goto La3
        L7b:
            o7.j5 r1 = r0.m11326t(r7)
            r0.m11319m(r7, r1, r5)
            com.google.android.gms.measurement.internal.d r7 = r0.f5736a
            o7.y1 r7 = r7.m3169n()
            com.google.android.gms.measurement.internal.d r0 = r7.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            o7.f4 r2 = r2.mo3160b()
            o7.x0 r3 = new o7.x0
            r3.<init>(r7, r0)
            r2.m11176s(r3)
        La3:
            return
        La4:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            throw r7
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r5, android.os.Bundle r6) {
            r4 = this;
            o7.d5 r0 = r4.f19621Y
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.m5 r0 = r0.m3178x()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f r1 = r1.f5716g
            boolean r1 = r1.m11163w()
            if (r1 != 0) goto L13
            goto L40
        L13:
            if (r6 != 0) goto L16
            goto L40
        L16:
            java.util.Map<android.app.Activity, o7.j5> r0 = r0.f19849f
            java.lang.Object r5 = r0.get(r5)
            o7.j5 r5 = (p249o7.C5027j5) r5
            if (r5 != 0) goto L21
            goto L40
        L21:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            long r1 = r5.f19789c
            java.lang.String r3 = "id"
            r0.putLong(r3, r1)
            java.lang.String r1 = r5.f19787a
            java.lang.String r2 = "name"
            r0.putString(r2, r1)
            java.lang.String r5 = r5.f19788b
            java.lang.String r1 = "referrer_name"
            r0.putString(r1, r5)
            java.lang.String r5 = "com.google.app_measurement.screen_service"
            r6.putBundle(r5, r0)
        L40:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }
}
