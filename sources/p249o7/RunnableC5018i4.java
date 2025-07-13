package p249o7;

/* renamed from: o7.i4 */
/* loaded from: classes.dex */
public final class RunnableC5018i4 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19761Y;

    /* renamed from: Z */
    public final /* synthetic */ p249o7.C5116u6 f19762Z;

    /* renamed from: a0 */
    public final /* synthetic */ p249o7.BinderC5042l4 f19763a0;

    public RunnableC5018i4(p249o7.BinderC5042l4 r2, p249o7.C5116u6 r3, int r4) {
            r1 = this;
            r1.f19761Y = r4
            r0 = 1
            if (r4 == r0) goto L23
            r0 = 2
            if (r4 == r0) goto L1b
            r0 = 3
            if (r4 == r0) goto L13
            r1.f19763a0 = r2
            r1.f19762Z = r3
            r1.<init>()
            return
        L13:
            r1.f19763a0 = r2
            r1.f19762Z = r3
            r1.<init>()
            return
        L1b:
            r1.f19763a0 = r2
            r1.f19762Z = r3
            r1.<init>()
            return
        L23:
            r1.f19763a0 = r2
            r1.f19762Z = r3
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f19761Y
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L4a;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L7b
        L6:
            o7.l4 r0 = r7.f19763a0
            o7.m6 r0 = r0.f19823a
            r0.m11347a()
            o7.l4 r0 = r7.f19763a0
            o7.m6 r0 = r0.f19823a
            o7.u6 r1 = r7.f19762Z
            o7.f4 r2 = r0.mo3160b()
            r2.mo3183i()
            r0.m11348g()
            java.lang.String r2 = r1.f20031Y
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            java.lang.String r2 = r1.f20052t0
            o7.g r2 = p249o7.C4997g.m11182b(r2)
            java.lang.String r3 = r1.f20031Y
            o7.g r3 = r0.m11341L(r3)
            com.google.android.gms.measurement.internal.b r4 = r0.mo3162d()
            o7.f3 r4 = r4.f5680n
            java.lang.String r5 = r1.f20031Y
            java.lang.String r6 = "Setting consent, package, consent"
            r4.m11171e(r6, r5, r2)
            java.lang.String r4 = r1.f20031Y
            r0.m11359r(r4, r2)
            boolean r2 = r2.m11191i(r3)
            if (r2 == 0) goto L49
            r0.m11357p(r1)
        L49:
            return
        L4a:
            o7.l4 r0 = r7.f19763a0
            o7.m6 r0 = r0.f19823a
            r0.m11347a()
            o7.l4 r0 = r7.f19763a0
            o7.m6 r0 = r0.f19823a
            o7.u6 r1 = r7.f19762Z
            o7.f4 r2 = r0.mo3160b()
            r2.mo3183i()
            r0.m11348g()
            java.lang.String r2 = r1.f20031Y
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0.m11339J(r1)
            return
        L6a:
            o7.l4 r0 = r7.f19763a0
            o7.m6 r0 = r0.f19823a
            r0.m11347a()
            o7.l4 r0 = r7.f19763a0
            o7.m6 r0 = r0.f19823a
            o7.u6 r1 = r7.f19762Z
            r0.m11357p(r1)
            return
        L7b:
            o7.l4 r0 = r7.f19763a0
            o7.m6 r0 = r0.f19823a
            r0.m11347a()
            o7.l4 r0 = r7.f19763a0
            o7.m6 r0 = r0.f19823a
            o7.u6 r1 = r7.f19762Z
            r0.m11354m(r1)
            return
    }
}
