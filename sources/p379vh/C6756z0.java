package p379vh;

/* renamed from: vh.z0 */
/* loaded from: classes.dex */
public final class C6756z0 extends p379vh.AbstractC6693d1 {

    /* renamed from: d0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f26052d0 = null;
    private volatile /* synthetic */ int _invoked;

    /* renamed from: c0 */
    public final mh.InterfaceC4620l<java.lang.Throwable, ch.C0985l> f26053c0;

    static {
            java.lang.Class<vh.z0> r0 = p379vh.C6756z0.class
            java.lang.String r1 = "_invoked"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p379vh.C6756z0.f26052d0 = r0
            return
    }

    public C6756z0(mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r1) {
            r0 = this;
            r0.<init>()
            r0.f26053c0 = r1
            r1 = 0
            r0._invoked = r1
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public /* bridge */ /* synthetic */ ch.C0985l mo107b(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.mo13549q(r1)
            ch.l r1 = ch.C0985l.f5061a
            return r1
    }

    @Override // p379vh.AbstractC6745v
    /* renamed from: q */
    public void mo13549q(java.lang.Throwable r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p379vh.C6756z0.f26052d0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto Lf
            mh.l<java.lang.Throwable, ch.l> r0 = r3.f26053c0
            r0.mo107b(r4)
        Lf:
            return
    }
}
