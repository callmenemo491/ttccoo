package p459zh;

/* renamed from: zh.j */
/* loaded from: classes.dex */
public class C7344j<E> {

    /* renamed from: a */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f28097a = null;
    private volatile /* synthetic */ java.lang.Object _cur;

    static {
            java.lang.Class<zh.j> r0 = p459zh.C7344j.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_cur"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            p459zh.C7344j.f28097a = r0
            return
    }

    public C7344j(boolean r3) {
            r2 = this;
            r2.<init>()
            zh.k r0 = new zh.k
            r1 = 8
            r0.<init>(r1, r3)
            r2._cur = r0
            return
    }

    /* renamed from: a */
    public final boolean m14426a(E r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._cur
            zh.k r0 = (p459zh.C7345k) r0
            int r1 = r0.m14430a(r4)
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L13
            r0 = 2
            if (r1 == r0) goto L11
            goto L0
        L11:
            r4 = 0
            return r4
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7344j.f28097a
            zh.k r2 = r0.m14434e()
            r1.compareAndSet(r3, r0, r2)
            goto L0
        L1d:
            return r2
    }

    /* renamed from: b */
    public final void m14427b() {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._cur
            zh.k r0 = (p459zh.C7345k) r0
            boolean r1 = r0.m14431b()
            if (r1 == 0) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7344j.f28097a
            zh.k r2 = r0.m14434e()
            r1.compareAndSet(r3, r0, r2)
            goto L0
    }

    /* renamed from: c */
    public final int m14428c() {
            r1 = this;
            java.lang.Object r0 = r1._cur
            zh.k r0 = (p459zh.C7345k) r0
            int r0 = r0.m14432c()
            return r0
    }

    /* renamed from: d */
    public final E m14429d() {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._cur
            zh.k r0 = (p459zh.C7345k) r0
            java.lang.Object r1 = r0.m14435f()
            zh.p r2 = p459zh.C7345k.f28100g
            if (r1 == r2) goto Ld
            return r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7344j.f28097a
            zh.k r2 = r0.m14434e()
            r1.compareAndSet(r3, r0, r2)
            goto L0
    }
}
