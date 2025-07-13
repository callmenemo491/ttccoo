package p379vh;

/* renamed from: vh.i0 */
/* loaded from: classes.dex */
public final class C6707i0<T> extends p459zh.C7349o<T> {

    /* renamed from: b0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f26000b0 = null;
    private volatile /* synthetic */ int _decision;

    static {
            java.lang.Class<vh.i0> r0 = p379vh.C6707i0.class
            java.lang.String r1 = "_decision"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p379vh.C6707i0.f26000b0 = r0
            return
    }

    public C6707i0(p101fh.InterfaceC2175g r1, p101fh.InterfaceC2172d<? super T> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0._decision = r1
            return
    }

    @Override // p459zh.C7349o, p379vh.AbstractC6682a
    /* renamed from: Y */
    public void mo13543Y(java.lang.Object r5) {
            r4 = this;
        L0:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L16
            if (r0 != r2) goto La
            goto L1f
        La:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p379vh.C6707i0.f26000b0
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L0
            r1 = 1
        L1f:
            if (r1 == 0) goto L22
            return
        L22:
            fh.d<T> r0 = r4.f28108a0
            fh.d r0 = gh.C2390b.m6127q(r0)
            fh.d<T> r1 = r4.f28108a0
            java.lang.Object r5 = p209lh.C4304a.m9595A(r5, r1)
            r1 = 0
            p459zh.C7340f.m14418b(r0, r5, r1, r3)
            return
    }

    /* renamed from: b0 */
    public final java.lang.Object m13637b0() {
            r3 = this;
        L0:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L15
            r2 = 2
            if (r0 != r2) goto L9
            goto L1f
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p379vh.C6707i0.f26000b0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            r1 = 1
        L1f:
            if (r1 == 0) goto L24
            gh.a r0 = gh.EnumC2389a.f10764Y
            return r0
        L24:
            java.lang.Object r0 = r3.m13573C()
            java.lang.Object r0 = p379vh.C6705h1.m13616a(r0)
            boolean r1 = r0 instanceof p379vh.C6739t
            if (r1 != 0) goto L31
            return r0
        L31:
            vh.t r0 = (p379vh.C6739t) r0
            java.lang.Throwable r0 = r0.f26037a
            throw r0
    }

    @Override // p459zh.C7349o, p379vh.C6702g1
    /* renamed from: e */
    public void mo13589e(java.lang.Object r1) {
            r0 = this;
            r0.mo13543Y(r1)
            return
    }
}
