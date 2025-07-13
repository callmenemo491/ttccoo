package p249o7;

/* renamed from: o7.j4 */
/* loaded from: classes.dex */
public final class CallableC5026j4 implements java.util.concurrent.Callable<java.util.List<p249o7.C5092r6>> {

    /* renamed from: a */
    public final /* synthetic */ int f19784a;

    /* renamed from: b */
    public final java.lang.Object f19785b;

    /* renamed from: c */
    public final java.lang.Object f19786c;

    public CallableC5026j4(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            r0 = 2
            r1.f19784a = r0
            r1.<init>()
            r1.f19785b = r2
            r1.f19786c = r3
            return
    }

    public CallableC5026j4(p249o7.BinderC5042l4 r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.f19784a = r0
            r1.f19786c = r2
            r1.f19785b = r3
            r1.<init>()
            return
    }

    public CallableC5026j4(p249o7.C5052m6 r2, p249o7.C5116u6 r3) {
            r1 = this;
            r0 = 1
            r1.f19784a = r0
            r1.f19786c = r2
            r1.f19785b = r3
            r1.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public java.util.List<p249o7.C5092r6> call() {
            r10 = this;
            int r0 = r10.f19784a
            r1 = 0
            switch(r0) {
                case 0: goto L52;
                case 1: goto L7;
                default: goto L6;
            }
        L6:
            goto L6f
        L7:
            java.lang.Object r0 = r10.f19786c
            o7.m6 r0 = (p249o7.C5052m6) r0
            java.lang.Object r2 = r10.f19785b
            o7.u6 r2 = (p249o7.C5116u6) r2
            java.lang.String r2 = r2.f20031Y
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)
            o7.g r0 = r0.m11341L(r2)
            boolean r0 = r0.m11190g()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r10.f19785b
            o7.u6 r0 = (p249o7.C5116u6) r0
            java.lang.String r0 = r0.f20052t0
            o7.g r0 = p249o7.C4997g.m11182b(r0)
            boolean r0 = r0.m11190g()
            if (r0 != 0) goto L31
            goto L42
        L31:
            java.lang.Object r0 = r10.f19786c
            o7.m6 r0 = (p249o7.C5052m6) r0
            java.lang.Object r1 = r10.f19785b
            o7.u6 r1 = (p249o7.C5116u6) r1
            o7.h4 r0 = r0.m11339J(r1)
            java.lang.String r1 = r0.m11214N()
            goto L51
        L42:
            java.lang.Object r0 = r10.f19786c
            o7.m6 r0 = (p249o7.C5052m6) r0
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r2 = "Analytics storage consent denied. Returning null app instance id"
            r0.m11169c(r2)
        L51:
            return r1
        L52:
            java.lang.Object r0 = r10.f19786c
            o7.l4 r0 = (p249o7.BinderC5042l4) r0
            o7.m6 r0 = r0.f19823a
            r0.m11347a()
            java.lang.Object r0 = r10.f19786c
            o7.l4 r0 = (p249o7.BinderC5042l4) r0
            o7.m6 r0 = r0.f19823a
            o7.j r0 = r0.f19862c
            p249o7.C5052m6.m11327I(r0)
            java.lang.Object r1 = r10.f19785b
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r0 = r0.m11265P(r1)
            return r0
        L6f:
            java.lang.Object r0 = r10.f19785b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r10.f19786c
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r3 = p057db.C1409l.f7068b
            db.a0 r3 = p057db.C1388a0.m3906a()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "FirebaseMessaging"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            if (r4 == 0) goto L90
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r6 = "Starting service"
            android.util.Log.d(r4, r6)
        L90:
            java.util.Queue<android.content.Intent> r4 = r3.f7000d
            r4.offer(r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "com.google.firebase.MESSAGING_EVENT"
            r2.<init>(r4)
            java.lang.String r4 = r0.getPackageName()
            r2.setPackage(r4)
            monitor-enter(r3)
            java.lang.String r4 = r3.f6997a     // Catch: java.lang.Throwable -> L1b5
            if (r4 == 0) goto Lab
            r1 = r4
            goto L134
        Lab:
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L1b5
            r6 = 0
            android.content.pm.ResolveInfo r4 = r4.resolveService(r2, r6)     // Catch: java.lang.Throwable -> L1b5
            if (r4 == 0) goto L12d
            android.content.pm.ServiceInfo r4 = r4.serviceInfo     // Catch: java.lang.Throwable -> L1b5
            if (r4 != 0) goto Lbc
            goto L12d
        Lbc:
            java.lang.String r6 = r0.getPackageName()     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r7 = r4.packageName     // Catch: java.lang.Throwable -> L1b5
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L1b5
            if (r6 == 0) goto Lfa
            java.lang.String r6 = r4.name     // Catch: java.lang.Throwable -> L1b5
            if (r6 != 0) goto Lcd
            goto Lfa
        Lcd:
            java.lang.String r1 = "."
            boolean r1 = r6.startsWith(r1)     // Catch: java.lang.Throwable -> L1b5
            if (r1 == 0) goto Lf5
            java.lang.String r1 = r0.getPackageName()     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r4 = r4.name     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L1b5
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L1b5
            if (r6 == 0) goto Lee
            java.lang.String r1 = r1.concat(r4)     // Catch: java.lang.Throwable -> L1b5
            goto Lf7
        Lee:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L1b5
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1b5
            r1 = r4
            goto Lf7
        Lf5:
            java.lang.String r1 = r4.name     // Catch: java.lang.Throwable -> L1b5
        Lf7:
            r3.f6997a = r1     // Catch: java.lang.Throwable -> L1b5
            goto L134
        Lfa:
            java.lang.String r6 = r4.packageName     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r4 = r4.name     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L1b5
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L1b5
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L1b5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b5
            int r7 = r7 + 94
            int r7 = r7 + r8
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r7 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r9.append(r7)     // Catch: java.lang.Throwable -> L1b5
            r9.append(r6)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r6 = "/"
            r9.append(r6)     // Catch: java.lang.Throwable -> L1b5
            r9.append(r4)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L1b5
            goto L131
        L12d:
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r6 = "Failed to resolve target intent service, skipping classname enforcement"
        L131:
            android.util.Log.e(r4, r6)     // Catch: java.lang.Throwable -> L1b5
        L134:
            monitor-exit(r3)
            if (r1 == 0) goto L15e
            java.lang.String r4 = "FirebaseMessaging"
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            if (r4 == 0) goto L157
            java.lang.String r4 = "Restricting intent to a specific service: "
            int r5 = r1.length()
            if (r5 == 0) goto L14c
            java.lang.String r4 = r4.concat(r1)
            goto L152
        L14c:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L152:
            java.lang.String r5 = "FirebaseMessaging"
            android.util.Log.d(r5, r4)
        L157:
            java.lang.String r4 = r0.getPackageName()
            r2.setClassName(r4, r1)
        L15e:
            boolean r1 = r3.m3908c(r0)     // Catch: java.lang.IllegalStateException -> L182 java.lang.SecurityException -> L1a6
            if (r1 == 0) goto L169
            android.content.ComponentName r0 = p057db.C1404i0.m3931a(r0, r2)     // Catch: java.lang.IllegalStateException -> L182 java.lang.SecurityException -> L1a6
            goto L174
        L169:
            android.content.ComponentName r0 = r0.startService(r2)     // Catch: java.lang.IllegalStateException -> L182 java.lang.SecurityException -> L1a6
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r2 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r1, r2)     // Catch: java.lang.IllegalStateException -> L182 java.lang.SecurityException -> L1a6
        L174:
            if (r0 != 0) goto L180
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r0, r1)     // Catch: java.lang.IllegalStateException -> L182 java.lang.SecurityException -> L1a6
            r0 = 404(0x194, float:5.66E-43)
            goto L1b0
        L180:
            r0 = -1
            goto L1b0
        L182:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 45
            r2.<init>(r1)
            java.lang.String r1 = "Failed to start service while in background: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = r2.toString()
            android.util.Log.e(r0, r1)
            r0 = 402(0x192, float:5.63E-43)
            goto L1b0
        L1a6:
            r0 = move-exception
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r2 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r1, r2, r0)
            r0 = 401(0x191, float:5.62E-43)
        L1b0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L1b5:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
