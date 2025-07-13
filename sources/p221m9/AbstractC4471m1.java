package p221m9;

/* renamed from: m9.m1 */
/* loaded from: classes.dex */
public abstract class AbstractC4471m1<T, B> {
    public AbstractC4471m1() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract void mo10198a(B r1, int r2, int r3);

    /* renamed from: b */
    public abstract void mo10199b(B r1, int r2, long r3);

    /* renamed from: c */
    public abstract void mo10200c(B r1, int r2, T r3);

    /* renamed from: d */
    public abstract void mo10201d(B r1, int r2, p221m9.AbstractC4454h r3);

    /* renamed from: e */
    public abstract void mo10202e(B r1, int r2, long r3);

    /* renamed from: f */
    public abstract B mo10203f(java.lang.Object r1);

    /* renamed from: g */
    public abstract T mo10204g(java.lang.Object r1);

    /* renamed from: h */
    public abstract int mo10205h(T r1);

    /* renamed from: i */
    public abstract int mo10206i(T r1);

    /* renamed from: j */
    public abstract void mo10207j(java.lang.Object r1);

    /* renamed from: k */
    public abstract T mo10208k(T r1, T r2);

    /* renamed from: l */
    public final boolean m10209l(B r7, p221m9.InterfaceC4444d1 r8) {
            r6 = this;
            int r0 = r8.mo9944m()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L61
            if (r0 == r2) goto L59
            r3 = 2
            if (r0 == r3) goto L51
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L28
            if (r0 == r3) goto L26
            r3 = 5
            if (r0 != r3) goto L21
            int r8 = r8.mo9947p()
            r6.mo10198a(r7, r1, r8)
            return r2
        L21:
            m9.a0$a r7 = p221m9.C4434a0.m9898d()
            throw r7
        L26:
            r7 = 0
            return r7
        L28:
            java.lang.Object r0 = r6.mo10210m()
            int r4 = r1 << 3
            r3 = r3 | r4
        L2f:
            int r4 = r8.mo9949r()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L3e
            boolean r4 = r6.m10209l(r0, r8)
            if (r4 != 0) goto L2f
        L3e:
            int r8 = r8.mo9944m()
            if (r3 != r8) goto L4c
            java.lang.Object r8 = r6.mo10214q(r0)
            r6.mo10200c(r7, r1, r8)
            return r2
        L4c:
            m9.a0 r7 = p221m9.C4434a0.m9895a()
            throw r7
        L51:
            m9.h r8 = r8.mo9954w()
            r6.mo10201d(r7, r1, r8)
            return r2
        L59:
            long r3 = r8.mo9937f()
            r6.mo10199b(r7, r1, r3)
            return r2
        L61:
            long r3 = r8.mo9927J()
            r6.mo10202e(r7, r1, r3)
            return r2
    }

    /* renamed from: m */
    public abstract B mo10210m();

    /* renamed from: n */
    public abstract void mo10211n(java.lang.Object r1, B r2);

    /* renamed from: o */
    public abstract void mo10212o(java.lang.Object r1, T r2);

    /* renamed from: p */
    public abstract boolean mo10213p(p221m9.InterfaceC4444d1 r1);

    /* renamed from: q */
    public abstract T mo10214q(B r1);

    /* renamed from: r */
    public abstract void mo10215r(T r1, p221m9.InterfaceC4498v1 r2);

    /* renamed from: s */
    public abstract void mo10216s(T r1, p221m9.InterfaceC4498v1 r2);
}
