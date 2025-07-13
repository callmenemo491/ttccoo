package p459zh;

/* renamed from: zh.b */
/* loaded from: classes.dex */
public abstract class AbstractC7336b<T> extends p459zh.AbstractC7347m {

    /* renamed from: a */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f28081a = null;
    private volatile /* synthetic */ java.lang.Object _consensus;

    static {
            java.lang.Class<zh.b> r0 = p459zh.AbstractC7336b.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_consensus"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            p459zh.AbstractC7336b.f28081a = r0
            return
    }

    public AbstractC7336b() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = p459zh.C7335a.f28080a
            r1._consensus = r0
            return
    }

    @Override // p459zh.AbstractC7347m
    /* renamed from: a */
    public final java.lang.Object mo14411a(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3._consensus
            java.lang.Object r1 = p459zh.C7335a.f28080a
            if (r0 != r1) goto L1b
            java.lang.Object r0 = r3.mo13608c(r4)
            java.lang.Object r2 = r3._consensus
            if (r2 == r1) goto L10
            r0 = r2
            goto L1b
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p459zh.AbstractC7336b.f28081a
            boolean r1 = r2.compareAndSet(r3, r1, r0)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            java.lang.Object r0 = r3._consensus
        L1b:
            r3.mo14412b(r4, r0)
            return r0
    }

    /* renamed from: b */
    public abstract void mo14412b(T r1, java.lang.Object r2);

    /* renamed from: c */
    public abstract java.lang.Object mo13608c(T r1);
}
