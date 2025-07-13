package p162j4;

/* renamed from: j4.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3402g implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f14739Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f14740Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f14741a0;

    /* renamed from: b0 */
    public final /* synthetic */ int f14742b0;

    public /* synthetic */ RunnableC3402g(p162j4.InterfaceC3403h.a r2, p162j4.InterfaceC3403h r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f14739Y = r0
            r1.<init>()
            r1.f14740Z = r2
            r1.f14741a0 = r3
            r1.f14742b0 = r4
            return
    }

    public /* synthetic */ RunnableC3402g(java.util.concurrent.CopyOnWriteArraySet r2, int r3, p371v5.C6564n.a r4) {
            r1 = this;
            r0 = 1
            r1.f14739Y = r0
            r1.<init>()
            r1.f14740Z = r2
            r1.f14742b0 = r3
            r1.f14741a0 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f14739Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            java.lang.Object r0 = r7.f14740Z
            j4.h$a r0 = (p162j4.InterfaceC3403h.a) r0
            java.lang.Object r1 = r7.f14741a0
            j4.h r1 = (p162j4.InterfaceC3403h) r1
            int r2 = r7.f14742b0
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            int r3 = r0.f14743a
            g5.r$a r0 = r0.f14744b
            r1.mo5402o(r3, r0, r2)
            return
        L1e:
            java.lang.Object r0 = r7.f14740Z
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            int r1 = r7.f14742b0
            java.lang.Object r2 = r7.f14741a0
            v5.n$a r2 = (p371v5.C6564n.a) r2
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r0.next()
            v5.n$c r3 = (p371v5.C6564n.c) r3
            boolean r4 = r3.f25669d
            if (r4 != 0) goto L2c
            r4 = -1
            r5 = 1
            if (r1 == r4) goto L4d
            v5.k$b r4 = r3.f25667b
            boolean r6 = r4.f25657b
            r6 = r6 ^ r5
            p371v5.C6549a.m13291e(r6)
            android.util.SparseBooleanArray r4 = r4.f25656a
            r4.append(r1, r5)
        L4d:
            r3.f25668c = r5
            T r3 = r3.f25666a
            r2.mo24b(r3)
            goto L2c
        L55:
            return
    }
}
