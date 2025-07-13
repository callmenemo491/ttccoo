package p185k7;

/* renamed from: k7.j7 */
/* loaded from: classes.dex */
public final class C3858j7<T> implements p185k7.InterfaceC3950q7<T> {

    /* renamed from: a */
    public final p185k7.InterfaceC3802f7 f16702a;

    /* renamed from: b */
    public final p185k7.AbstractC3761c8<?, ?> f16703b;

    /* renamed from: c */
    public final boolean f16704c;

    /* renamed from: d */
    public final p185k7.AbstractC3961r5<?> f16705d;

    public C3858j7(p185k7.AbstractC3761c8<?, ?> r1, p185k7.AbstractC3961r5<?> r2, p185k7.InterfaceC3802f7 r3) {
            r0 = this;
            r0.<init>()
            r0.f16703b = r1
            boolean r1 = r2.mo8921c(r3)
            r0.f16704c = r1
            r0.f16705d = r2
            r0.f16702a = r3
            return
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: a */
    public final void mo8682a(T r4, T r5) {
            r3 = this;
            k7.c8<?, ?> r0 = r3.f16703b
            java.lang.Class<?> r1 = p185k7.C3976s7.f16860a
            java.lang.Object r1 = r0.mo8302c(r4)
            java.lang.Object r2 = r0.mo8302c(r5)
            java.lang.Object r1 = r0.mo8303d(r1, r2)
            r0.mo8307h(r4, r1)
            boolean r4 = r3.f16704c
            if (r4 != 0) goto L18
            return
        L18:
            k7.r5<?> r4 = r3.f16705d
            r4.mo8919a(r5)
            r4 = 0
            throw r4
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: b */
    public final int mo8683b(T r3) {
            r2 = this;
            k7.c8<?, ?> r0 = r2.f16703b
            java.lang.Object r0 = r0.mo8302c(r3)
            int r0 = r0.hashCode()
            boolean r1 = r2.f16704c
            if (r1 != 0) goto Lf
            return r0
        Lf:
            k7.r5<?> r0 = r2.f16705d
            r0.mo8919a(r3)
            r3 = 0
            throw r3
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: c */
    public final void mo8684c(T r2) {
            r1 = this;
            k7.c8<?, ?> r0 = r1.f16703b
            r0.mo8306g(r2)
            k7.r5<?> r0 = r1.f16705d
            r0.mo8920b(r2)
            return
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: d */
    public final T mo8685d() {
            r1 = this;
            k7.f7 r0 = r1.f16702a
            k7.y4 r0 = r0.mo8496e()
            k7.a6 r0 = (p185k7.C3731a6) r0
            k7.d6 r0 = r0.m8202g()
            return r0
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: e */
    public final int mo8686e(T r3) {
            r2 = this;
            k7.c8<?, ?> r0 = r2.f16703b
            java.lang.Object r1 = r0.mo8302c(r3)
            int r0 = r0.mo8301b(r1)
            boolean r1 = r2.f16704c
            if (r1 != 0) goto Lf
            return r0
        Lf:
            k7.r5<?> r0 = r2.f16705d
            r0.mo8919a(r3)
            r3 = 0
            throw r3
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: f */
    public final boolean mo8687f(T r2) {
            r1 = this;
            k7.r5<?> r0 = r1.f16705d
            r0.mo8919a(r2)
            r2 = 0
            throw r2
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: g */
    public final void mo8688g(T r1, p185k7.C3909n5 r2) {
            r0 = this;
            k7.r5<?> r2 = r0.f16705d
            r2.mo8919a(r1)
            r1 = 0
            throw r1
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: h */
    public final boolean mo8689h(T r3, T r4) {
            r2 = this;
            k7.c8<?, ?> r0 = r2.f16703b
            java.lang.Object r0 = r0.mo8302c(r3)
            k7.c8<?, ?> r1 = r2.f16703b
            java.lang.Object r1 = r1.mo8302c(r4)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L14:
            boolean r0 = r2.f16704c
            if (r0 != 0) goto L1a
            r3 = 1
            return r3
        L1a:
            k7.r5<?> r0 = r2.f16705d
            r0.mo8919a(r3)
            k7.r5<?> r3 = r2.f16705d
            r3.mo8919a(r4)
            r3 = 0
            throw r3
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: i */
    public final void mo8690i(T r1, byte[] r2, int r3, int r4, p124h7.C2915vf r5) {
            r0 = this;
            r2 = r1
            k7.d6 r2 = (p185k7.AbstractC3773d6) r2
            k7.d8 r3 = r2.zzc
            k7.d8 r4 = p185k7.C3775d8.f16560f
            if (r3 == r4) goto La
            goto L10
        La:
            k7.d8 r3 = p185k7.C3775d8.m8502b()
            r2.zzc = r3
        L10:
            k7.b6 r1 = (p185k7.AbstractC3745b6) r1
            r1 = 0
            throw r1
    }
}
