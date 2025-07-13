package p379vh;

/* renamed from: vh.g0 */
/* loaded from: classes.dex */
public class C6701g0<T> extends p379vh.AbstractC6682a<T> implements p379vh.InterfaceC6698f0<T> {
    public C6701g0(p101fh.InterfaceC2175g r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
    }

    @Override // p379vh.InterfaceC6698f0
    /* renamed from: Q */
    public java.lang.Object mo13566Q(p101fh.InterfaceC2172d<? super T> r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.m13573C()
            boolean r1 = r0 instanceof p379vh.InterfaceC6752x0
            if (r1 != 0) goto L16
            boolean r4 = r0 instanceof p379vh.C6739t
            if (r4 != 0) goto L11
            java.lang.Object r4 = p379vh.C6705h1.m13616a(r0)
            goto L41
        L11:
            vh.t r0 = (p379vh.C6739t) r0
            java.lang.Throwable r4 = r0.f26037a
            throw r4
        L16:
            int r0 = r3.m13582P(r0)
            if (r0 < 0) goto L0
            vh.g1$a r0 = new vh.g1$a
            fh.d r4 = gh.C2390b.m6127q(r4)
            r0.<init>(r4, r3)
            r0.m13634x()
            vh.a1 r4 = new vh.a1
            r4.<init>(r0)
            r1 = 0
            r2 = 1
            vh.m0 r4 = r3.mo13554m0(r1, r2, r4)
            vh.e r1 = new vh.e
            r1.<init>(r4)
            r0.mo13609d(r1)
            java.lang.Object r4 = r0.m13633w()
            gh.a r0 = gh.EnumC2389a.f10764Y
        L41:
            return r4
    }

    @Override // p379vh.InterfaceC6698f0
    /* renamed from: h */
    public T mo13567h() {
            r2 = this;
            java.lang.Object r0 = r2.m13573C()
            boolean r1 = r0 instanceof p379vh.InterfaceC6752x0
            r1 = r1 ^ 1
            if (r1 == 0) goto L18
            boolean r1 = r0 instanceof p379vh.C6739t
            if (r1 != 0) goto L13
            java.lang.Object r0 = p379vh.C6705h1.m13616a(r0)
            return r0
        L13:
            vh.t r0 = (p379vh.C6739t) r0
            java.lang.Throwable r0 = r0.f26037a
            throw r0
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job has not completed yet"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
