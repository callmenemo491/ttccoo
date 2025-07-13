package p419xh;

/* renamed from: xh.i */
/* loaded from: classes.dex */
public final class C7081i extends p439yh.AbstractC7206c<p419xh.C7079g<?>> {

    /* renamed from: a */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f27416a = null;
    public volatile /* synthetic */ java.lang.Object _state;

    static {
            java.lang.Class<xh.i> r0 = p419xh.C7081i.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            p419xh.C7081i.f27416a = r0
            return
    }

    public C7081i() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._state = r0
            return
    }

    @Override // p439yh.AbstractC7206c
    /* renamed from: a */
    public boolean mo14184a(p419xh.C7079g<?> r1) {
            r0 = this;
            xh.g r1 = (p419xh.C7079g) r1
            java.lang.Object r1 = r0._state
            if (r1 == 0) goto L8
            r1 = 0
            goto Ld
        L8:
            zh.p r1 = p419xh.C7080h.f27414a
            r0._state = r1
            r1 = 1
        Ld:
            return r1
    }

    /* renamed from: b */
    public p101fh.InterfaceC2172d[] m14185b(java.lang.Object r1) {
            r0 = this;
            xh.g r1 = (p419xh.C7079g) r1
            r1 = 0
            r0._state = r1
            kotlin.coroutines.Continuation<kotlin.Unit>[] r1 = p439yh.C7205b.f27746a
            return r1
    }
}
