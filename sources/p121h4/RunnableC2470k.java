package p121h4;

/* renamed from: h4.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2470k implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f11053Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f11054Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f11055a0;

    /* renamed from: b0 */
    public final /* synthetic */ long f11056b0;

    /* renamed from: c0 */
    public final /* synthetic */ long f11057c0;

    public /* synthetic */ RunnableC2470k(p121h4.InterfaceC2473n.a r2, java.lang.String r3, long r4, long r6) {
            r1 = this;
            r0 = 0
            r1.f11053Y = r0
            r1.<init>()
            r1.f11054Z = r2
            r1.f11055a0 = r3
            r1.f11056b0 = r4
            r1.f11057c0 = r6
            return
    }

    public /* synthetic */ RunnableC2470k(p387w5.InterfaceC6812o.a r2, java.lang.String r3, long r4, long r6) {
            r1 = this;
            r0 = 1
            r1.f11053Y = r0
            r1.<init>()
            r1.f11054Z = r2
            r1.f11055a0 = r3
            r1.f11056b0 = r4
            r1.f11057c0 = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f11053Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            java.lang.Object r0 = r7.f11054Z
            h4.n$a r0 = (p121h4.InterfaceC2473n.a) r0
            java.lang.String r2 = r7.f11055a0
            long r3 = r7.f11056b0
            long r5 = r7.f11057c0
            h4.n r1 = r0.f11064b
            int r0 = p371v5.C6552b0.f25624a
            r1.mo5288W(r2, r3, r5)
            return
        L18:
            java.lang.Object r0 = r7.f11054Z
            w5.o$a r0 = (p387w5.InterfaceC6812o.a) r0
            java.lang.String r2 = r7.f11055a0
            long r3 = r7.f11056b0
            long r5 = r7.f11057c0
            w5.o r1 = r0.f26518b
            int r0 = p371v5.C6552b0.f25624a
            r1.mo5303r(r2, r3, r5)
            return
    }
}
