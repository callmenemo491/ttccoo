package p072e7;

/* renamed from: e7.e7 */
/* loaded from: classes.dex */
public final class C1600e7<T> implements p072e7.InterfaceC1670l7<T> {

    /* renamed from: a */
    public final p072e7.InterfaceC1560a7 f7547a;

    /* renamed from: b */
    public final p072e7.AbstractC1803z7<?, ?> f7548b;

    /* renamed from: c */
    public final boolean f7549c;

    /* renamed from: d */
    public final p072e7.AbstractC1698o5<?> f7550d;

    public C1600e7(p072e7.AbstractC1803z7<?, ?> r1, p072e7.AbstractC1698o5<?> r2, p072e7.InterfaceC1560a7 r3) {
            r0 = this;
            r0.<init>()
            r0.f7548b = r1
            boolean r1 = r2.mo4409c(r3)
            r0.f7549c = r1
            r0.f7550d = r2
            r0.f7547a = r3
            return
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: b */
    public final int mo4165b(T r3) {
            r2 = this;
            e7.z7<?, ?> r0 = r2.f7548b
            java.lang.Object r0 = r0.mo4133c(r3)
            int r0 = r0.hashCode()
            boolean r1 = r2.f7549c
            if (r1 != 0) goto Lf
            return r0
        Lf:
            e7.o5<?> r0 = r2.f7550d
            r0.mo4407a(r3)
            r3 = 0
            throw r3
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: c */
    public final boolean mo4166c(T r2) {
            r1 = this;
            e7.o5<?> r0 = r1.f7550d
            r0.mo4407a(r2)
            r2 = 0
            throw r2
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: e */
    public final int mo4168e(T r3) {
            r2 = this;
            e7.z7<?, ?> r0 = r2.f7548b
            java.lang.Object r1 = r0.mo4133c(r3)
            int r0 = r0.mo4132b(r1)
            boolean r1 = r2.f7549c
            if (r1 != 0) goto Lf
            return r0
        Lf:
            e7.o5<?> r0 = r2.f7550d
            r0.mo4407a(r3)
            r3 = 0
            throw r3
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: f */
    public final void mo4169f(T r4, T r5) {
            r3 = this;
            e7.z7<?, ?> r0 = r3.f7548b
            java.lang.Class<?> r1 = p072e7.C1690n7.f7703a
            java.lang.Object r1 = r0.mo4133c(r4)
            java.lang.Object r2 = r0.mo4133c(r5)
            java.lang.Object r1 = r0.mo4134d(r1, r2)
            r0.mo4136f(r4, r1)
            boolean r4 = r3.f7549c
            if (r4 != 0) goto L18
            return
        L18:
            e7.o5<?> r4 = r3.f7550d
            r4.mo4407a(r5)
            r4 = 0
            throw r4
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: g */
    public final void mo4170g(T r1, p072e7.C1678m5 r2) {
            r0 = this;
            e7.o5<?> r2 = r0.f7550d
            r2.mo4407a(r1)
            r1 = 0
            throw r1
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: h */
    public final boolean mo4171h(T r3, T r4) {
            r2 = this;
            e7.z7<?, ?> r0 = r2.f7548b
            java.lang.Object r0 = r0.mo4133c(r3)
            e7.z7<?, ?> r1 = r2.f7548b
            java.lang.Object r1 = r1.mo4133c(r4)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L14:
            boolean r0 = r2.f7549c
            if (r0 != 0) goto L1a
            r3 = 1
            return r3
        L1a:
            e7.o5<?> r0 = r2.f7550d
            r0.mo4407a(r3)
            e7.o5<?> r3 = r2.f7550d
            r3.mo4407a(r4)
            r3 = 0
            throw r3
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: i */
    public final void mo4172i(T r2) {
            r1 = this;
            e7.z7<?, ?> r0 = r1.f7548b
            r0.mo4135e(r2)
            e7.o5<?> r0 = r1.f7550d
            r0.mo4408b(r2)
            return
    }
}
