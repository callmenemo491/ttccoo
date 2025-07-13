package p249o7;

/* renamed from: o7.b5 */
/* loaded from: classes.dex */
public final class RunnableC4963b5 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19603Y;

    /* renamed from: Z */
    public final /* synthetic */ p249o7.C4997g f19604Z;

    /* renamed from: a0 */
    public final /* synthetic */ int f19605a0;

    /* renamed from: b0 */
    public final /* synthetic */ long f19606b0;

    /* renamed from: c0 */
    public final /* synthetic */ boolean f19607c0;

    /* renamed from: d0 */
    public final /* synthetic */ p249o7.C4979d5 f19608d0;

    public RunnableC4963b5(p249o7.C4979d5 r2, p249o7.C4997g r3, int r4, long r5, boolean r7, int r8) {
            r1 = this;
            r1.f19603Y = r8
            r0 = 1
            if (r8 == r0) goto L13
            r1.f19608d0 = r2
            r1.f19604Z = r3
            r1.f19605a0 = r4
            r1.f19606b0 = r5
            r1.f19607c0 = r7
            r1.<init>()
            return
        L13:
            r1.f19608d0 = r2
            r1.f19604Z = r3
            r1.f19605a0 = r4
            r1.f19606b0 = r5
            r1.f19607c0 = r7
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.f19603Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L1c
        L6:
            o7.d5 r0 = r9.f19608d0
            o7.g r1 = r9.f19604Z
            r0.m11143z(r1)
            o7.d5 r2 = r9.f19608d0
            o7.g r3 = r9.f19604Z
            int r4 = r9.f19605a0
            long r5 = r9.f19606b0
            boolean r8 = r9.f19607c0
            r7 = 0
            p249o7.C4979d5.m11120H(r2, r3, r4, r5, r7, r8)
            return
        L1c:
            o7.d5 r0 = r9.f19608d0
            o7.g r1 = r9.f19604Z
            r0.m11143z(r1)
            o7.d5 r2 = r9.f19608d0
            o7.g r3 = r9.f19604Z
            int r4 = r9.f19605a0
            long r5 = r9.f19606b0
            boolean r8 = r9.f19607c0
            r7 = 0
            p249o7.C4979d5.m11120H(r2, r3, r4, r5, r7, r8)
            return
    }
}
