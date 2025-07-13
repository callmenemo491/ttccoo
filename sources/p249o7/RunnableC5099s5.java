package p249o7;

/* renamed from: o7.s5 */
/* loaded from: classes.dex */
public final class RunnableC5099s5 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f20000Y;

    /* renamed from: Z */
    public final /* synthetic */ p249o7.InterfaceC5152z2 f20001Z;

    /* renamed from: a0 */
    public final /* synthetic */ p249o7.ServiceConnectionC5115u5 f20002a0;

    public RunnableC5099s5(p249o7.ServiceConnectionC5115u5 r2, p249o7.InterfaceC5152z2 r3, int r4) {
            r1 = this;
            r1.f20000Y = r4
            r0 = 1
            if (r4 == r0) goto Ld
            r1.f20002a0 = r2
            r1.f20001Z = r3
            r1.<init>()
            return
        Ld:
            r1.f20002a0 = r2
            r1.f20001Z = r3
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f20000Y
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L44
        L7:
            o7.u5 r0 = r4.f20002a0
            monitor-enter(r0)
            o7.u5 r2 = r4.f20002a0     // Catch: java.lang.Throwable -> L41
            r2.f20028Y = r1     // Catch: java.lang.Throwable -> L41
            o7.u5 r1 = r4.f20002a0     // Catch: java.lang.Throwable -> L41
            o7.v5 r1 = r1.f20030a0     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.m11428o()     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L3f
            o7.u5 r1 = r4.f20002a0     // Catch: java.lang.Throwable -> L41
            o7.v5 r1 = r1.f20030a0     // Catch: java.lang.Throwable -> L41
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a     // Catch: java.lang.Throwable -> L41
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L41
            o7.f3 r1 = r1.f5680n     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "Connected to service"
            r1.m11169c(r2)     // Catch: java.lang.Throwable -> L41
            o7.u5 r1 = r4.f20002a0     // Catch: java.lang.Throwable -> L41
            o7.v5 r1 = r1.f20030a0     // Catch: java.lang.Throwable -> L41
            o7.z2 r2 = r4.f20001Z     // Catch: java.lang.Throwable -> L41
            r1.mo3183i()     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L41
            r1.f20135d = r2     // Catch: java.lang.Throwable -> L41
            r1.m11433t()     // Catch: java.lang.Throwable -> L41
            r1.m11432s()     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return
        L41:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r1
        L44:
            o7.u5 r0 = r4.f20002a0
            monitor-enter(r0)
            o7.u5 r2 = r4.f20002a0     // Catch: java.lang.Throwable -> L7e
            r2.f20028Y = r1     // Catch: java.lang.Throwable -> L7e
            o7.u5 r1 = r4.f20002a0     // Catch: java.lang.Throwable -> L7e
            o7.v5 r1 = r1.f20030a0     // Catch: java.lang.Throwable -> L7e
            boolean r1 = r1.m11428o()     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L7c
            o7.u5 r1 = r4.f20002a0     // Catch: java.lang.Throwable -> L7e
            o7.v5 r1 = r1.f20030a0     // Catch: java.lang.Throwable -> L7e
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a     // Catch: java.lang.Throwable -> L7e
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L7e
            o7.f3 r1 = r1.f5679m     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "Connected to remote service"
            r1.m11169c(r2)     // Catch: java.lang.Throwable -> L7e
            o7.u5 r1 = r4.f20002a0     // Catch: java.lang.Throwable -> L7e
            o7.v5 r1 = r1.f20030a0     // Catch: java.lang.Throwable -> L7e
            o7.z2 r2 = r4.f20001Z     // Catch: java.lang.Throwable -> L7e
            r1.mo3183i()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L7e
            r1.f20135d = r2     // Catch: java.lang.Throwable -> L7e
            r1.m11433t()     // Catch: java.lang.Throwable -> L7e
            r1.m11432s()     // Catch: java.lang.Throwable -> L7e
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            return
        L7e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            throw r1
    }
}
