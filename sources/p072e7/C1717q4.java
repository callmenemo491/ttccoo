package p072e7;

/* renamed from: e7.q4 */
/* loaded from: classes.dex */
public final class C1717q4 extends p072e7.AbstractC1677m4 {

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p072e7.C1764v4, java.lang.Thread> f7754a;

    /* renamed from: b */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p072e7.C1764v4, p072e7.C1764v4> f7755b;

    /* renamed from: c */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p072e7.AbstractC1773w4, p072e7.C1764v4> f7756c;

    /* renamed from: d */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p072e7.AbstractC1773w4, p072e7.C1707p4> f7757d;

    /* renamed from: e */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p072e7.AbstractC1773w4, java.lang.Object> f7758e;

    public C1717q4(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p072e7.C1764v4, java.lang.Thread> r1, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p072e7.C1764v4, p072e7.C1764v4> r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p072e7.AbstractC1773w4, p072e7.C1764v4> r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p072e7.AbstractC1773w4, p072e7.C1707p4> r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<p072e7.AbstractC1773w4, java.lang.Object> r5) {
            r0 = this;
            r0.<init>()
            r0.f7754a = r1
            r0.f7755b = r2
            r0.f7756c = r3
            r0.f7757d = r4
            r0.f7758e = r5
            return
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: a */
    public final void mo4335a(p072e7.C1764v4 r2, p072e7.C1764v4 r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<e7.v4, e7.v4> r0 = r1.f7755b
            r0.lazySet(r2, r3)
            return
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: b */
    public final void mo4336b(p072e7.C1764v4 r2, java.lang.Thread r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<e7.v4, java.lang.Thread> r0 = r1.f7754a
            r0.lazySet(r2, r3)
            return
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: c */
    public final boolean mo4337c(p072e7.AbstractC1773w4<?> r2, p072e7.C1707p4 r3, p072e7.C1707p4 r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<e7.w4, e7.p4> r0 = r1.f7757d
            boolean r2 = r0.compareAndSet(r2, r3, r4)
            return r2
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: d */
    public final boolean mo4338d(p072e7.AbstractC1773w4<?> r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<e7.w4, java.lang.Object> r0 = r1.f7758e
            boolean r2 = r0.compareAndSet(r2, r3, r4)
            return r2
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: e */
    public final boolean mo4339e(p072e7.AbstractC1773w4<?> r2, p072e7.C1764v4 r3, p072e7.C1764v4 r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<e7.w4, e7.v4> r0 = r1.f7756c
            boolean r2 = r0.compareAndSet(r2, r3, r4)
            return r2
    }
}
