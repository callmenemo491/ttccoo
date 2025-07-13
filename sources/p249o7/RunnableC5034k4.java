package p249o7;

/* renamed from: o7.k4 */
/* loaded from: classes.dex */
public final class RunnableC5034k4 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19800Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f19801Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f19802a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.Object f19803b0;

    /* renamed from: c0 */
    public final /* synthetic */ long f19804c0;

    /* renamed from: d0 */
    public final /* synthetic */ java.lang.Object f19805d0;

    public RunnableC5034k4(p249o7.C4979d5 r2, java.lang.String r3, java.lang.String r4, java.lang.Object r5, long r6) {
            r1 = this;
            r0 = 1
            r1.f19800Y = r0
            r1.f19805d0 = r2
            r1.f19801Z = r3
            r1.f19802a0 = r4
            r1.f19803b0 = r5
            r1.f19804c0 = r6
            r1.<init>()
            return
    }

    public RunnableC5034k4(p249o7.BinderC5042l4 r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6) {
            r1 = this;
            r0 = 0
            r1.f19800Y = r0
            r1.f19805d0 = r2
            r1.f19801Z = r3
            r1.f19802a0 = r4
            r1.f19803b0 = r5
            r1.f19804c0 = r6
            r1.<init>()
            return
    }

    public RunnableC5034k4(p249o7.C5051m5 r2, android.os.Bundle r3, p249o7.C5027j5 r4, p249o7.C5027j5 r5, long r6) {
            r1 = this;
            r0 = 2
            r1.f19800Y = r0
            r1.f19805d0 = r2
            r1.f19801Z = r3
            r1.f19802a0 = r4
            r1.f19803b0 = r5
            r1.f19804c0 = r6
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f19800Y
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L5e
        L6:
            java.lang.Object r0 = r11.f19805d0
            r1 = r0
            o7.d5 r1 = (p249o7.C4979d5) r1
            java.lang.Object r0 = r11.f19801Z
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r11.f19802a0
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r11.f19803b0
            long r5 = r11.f19804c0
            r1.m11123C(r2, r3, r4, r5)
            return
        L1d:
            java.lang.Object r0 = r11.f19801Z
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L38
            java.lang.Object r0 = r11.f19805d0
            o7.l4 r0 = (p249o7.BinderC5042l4) r0
            o7.m6 r0 = r0.f19823a
            com.google.android.gms.measurement.internal.d r0 = r0.f19871l
            o7.m5 r0 = r0.m3178x()
            java.lang.Object r1 = r11.f19802a0
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            r0.m11325s(r1, r2)
            goto L5a
        L38:
            java.lang.Object r0 = r11.f19803b0
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r11.f19805d0
            o7.l4 r0 = (p249o7.BinderC5042l4) r0
            o7.m6 r0 = r0.f19823a
            com.google.android.gms.measurement.internal.d r0 = r0.f19871l
            o7.m5 r0 = r0.m3178x()
            java.lang.Object r1 = r11.f19802a0
            java.lang.String r1 = (java.lang.String) r1
            r0.mo3183i()
            monitor-enter(r0)
            java.lang.String r2 = r0.f19856m     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L57
            r2.equals(r1)     // Catch: java.lang.Throwable -> L5b
        L57:
            r0.f19856m = r1     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
        L5a:
            return
        L5b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r1
        L5e:
            java.lang.Object r0 = r11.f19805d0
            r1 = r0
            o7.m5 r1 = (p249o7.C5051m5) r1
            java.lang.Object r0 = r11.f19801Z
            r5 = r0
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.Object r0 = r11.f19802a0
            o7.j5 r0 = (p249o7.C5027j5) r0
            java.lang.Object r2 = r11.f19803b0
            r8 = r2
            o7.j5 r8 = (p249o7.C5027j5) r8
            long r9 = r11.f19804c0
            java.lang.String r2 = "screen_name"
            r5.remove(r2)
            java.lang.String r2 = "screen_class"
            r5.remove(r2)
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            com.google.android.gms.measurement.internal.f r2 = r2.m3158A()
            r3 = 0
            r6 = 0
            r7 = 0
            java.lang.String r4 = "screen_view"
            android.os.Bundle r7 = r2.m3234s0(r3, r4, r5, r6, r7)
            r6 = 1
            r2 = r0
            r3 = r8
            r4 = r9
            r1.m11320n(r2, r3, r4, r6, r7)
            return
    }
}
