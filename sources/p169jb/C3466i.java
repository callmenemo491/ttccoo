package p169jb;

/* renamed from: jb.i */
/* loaded from: classes.dex */
public class C3466i extends p169jb.AbstractC3483z<java.util.concurrent.atomic.AtomicLongArray> {

    /* renamed from: a */
    public final /* synthetic */ p169jb.AbstractC3483z f14938a;

    public C3466i(p169jb.AbstractC3483z r1) {
            r0 = this;
            r0.f14938a = r1
            r0.<init>()
            return
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: a */
    public java.util.concurrent.atomic.AtomicLongArray mo7919a(p290qb.C5612a r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.mo10406a()
        L8:
            boolean r1 = r6.mo10403Q()
            if (r1 == 0) goto L22
            jb.z r1 = r5.f14938a
            java.lang.Object r1 = r1.mo7919a(r6)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            goto L8
        L22:
            r6.mo10412n()
            int r6 = r0.size()
            java.util.concurrent.atomic.AtomicLongArray r1 = new java.util.concurrent.atomic.AtomicLongArray
            r1.<init>(r6)
            r2 = 0
        L2f:
            if (r2 >= r6) goto L41
            java.lang.Object r3 = r0.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r1.set(r2, r3)
            int r2 = r2 + 1
            goto L2f
        L41:
            return r1
    }

    @Override // p169jb.AbstractC3483z
    /* renamed from: b */
    public void mo7920b(p290qb.C5614c r6, java.util.concurrent.atomic.AtomicLongArray r7) {
            r5 = this;
            java.util.concurrent.atomic.AtomicLongArray r7 = (java.util.concurrent.atomic.AtomicLongArray) r7
            r6.mo10420h()
            int r0 = r7.length()
            r1 = 0
        La:
            if (r1 >= r0) goto L1c
            jb.z r2 = r5.f14938a
            long r3 = r7.get(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.mo7920b(r6, r3)
            int r1 = r1 + 1
            goto La
        L1c:
            r6.mo10424n()
            return
    }
}
