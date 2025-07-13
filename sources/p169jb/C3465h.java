package p169jb;

/* renamed from: jb.h */
/* loaded from: classes.dex */
public class C3465h extends p169jb.AbstractC3483z<java.util.concurrent.atomic.AtomicLong> {

    /* renamed from: a */
    public final /* synthetic */ p169jb.AbstractC3483z f14937a;

    public C3465h(p169jb.AbstractC3483z r1) {
            r0 = this;
            r0.f14937a = r1
            r0.<init>()
            return
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public java.util.concurrent.atomic.AtomicLong mo7919a(p290qb.C5612a r4) {
            r3 = this;
            jb.z r0 = r3.f14937a
            java.lang.Object r4 = r0.mo7919a(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            long r1 = r4.longValue()
            r0.<init>(r1)
            return r0
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r4, java.util.concurrent.atomic.AtomicLong r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicLong r5 = (java.util.concurrent.atomic.AtomicLong) r5
            jb.z r0 = r3.f14937a
            long r1 = r5.get()
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r0.mo7920b(r4, r5)
            return
    }
}
