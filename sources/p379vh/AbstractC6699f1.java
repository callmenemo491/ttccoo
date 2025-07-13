package p379vh;

/* renamed from: vh.f1 */
/* loaded from: classes.dex */
public abstract class AbstractC6699f1 extends p379vh.AbstractC6745v implements p379vh.InterfaceC6719m0, p379vh.InterfaceC6752x0 {

    /* renamed from: b0 */
    public p379vh.C6702g1 f25973b0;

    public AbstractC6699f1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p379vh.InterfaceC6752x0
    /* renamed from: a */
    public boolean mo13568a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p379vh.InterfaceC6752x0
    /* renamed from: c */
    public p379vh.C6717l1 mo13569c() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p379vh.InterfaceC6719m0
    /* renamed from: h */
    public void mo13570h() {
            r4 = this;
            vh.g1 r0 = r4.m13571r()
        L4:
            java.lang.Object r1 = r0.m13573C()
            boolean r2 = r1 instanceof p379vh.AbstractC6699f1
            if (r2 == 0) goto L1a
            if (r1 == r4) goto Lf
            goto L29
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p379vh.C6702g1.f25974Y
            vh.n0 r3 = p379vh.C6705h1.f25994g
            boolean r1 = r2.compareAndSet(r0, r1, r3)
            if (r1 == 0) goto L4
            goto L29
        L1a:
            boolean r0 = r1 instanceof p379vh.InterfaceC6752x0
            if (r0 == 0) goto L29
            vh.x0 r1 = (p379vh.InterfaceC6752x0) r1
            vh.l1 r0 = r1.mo13569c()
            if (r0 == 0) goto L29
            r4.m14425p()
        L29:
            return
    }

    /* renamed from: r */
    public final p379vh.C6702g1 m13571r() {
            r1 = this;
            vh.g1 r0 = r1.f25973b0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "job"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    @Override // p459zh.C7343i
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = gh.C2390b.m6121k(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            vh.g1 r1 = r2.m13571r()
            java.lang.String r1 = gh.C2390b.m6121k(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
