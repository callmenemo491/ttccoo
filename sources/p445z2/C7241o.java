package p445z2;

/* renamed from: z2.o */
/* loaded from: classes.dex */
public class C7241o extends androidx.fragment.app.ComponentCallbacksC0395n {

    /* renamed from: U0 */
    public final p445z2.C7227a f27829U0;

    /* renamed from: V0 */
    public final p445z2.InterfaceC7239m f27830V0;

    /* renamed from: W0 */
    public final java.util.Set<p445z2.C7241o> f27831W0;

    /* renamed from: X0 */
    public p445z2.C7241o f27832X0;

    /* renamed from: Y0 */
    public com.bumptech.glide.ComponentCallbacks2C1006j f27833Y0;

    /* renamed from: Z0 */
    public androidx.fragment.app.ComponentCallbacksC0395n f27834Z0;

    /* renamed from: z2.o$a */
    public class a implements p445z2.InterfaceC7239m {

        /* renamed from: Y */
        public final /* synthetic */ p445z2.C7241o f27835Y;

        public a(p445z2.C7241o r1) {
                r0 = this;
                r0.f27835Y = r1
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = "{fragment="
                r0.append(r1)
                z2.o r1 = r2.f27835Y
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C7241o() {
            r2 = this;
            z2.a r0 = new z2.a
            r0.<init>()
            r2.<init>()
            z2.o$a r1 = new z2.o$a
            r1.<init>(r2)
            r2.f27830V0 = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.f27831W0 = r1
            r2.f27829U0 = r0
            return
    }

    /* renamed from: D0 */
    public final androidx.fragment.app.ComponentCallbacksC0395n m14311D0() {
            r1 = this;
            androidx.fragment.app.n r0 = r1.f2297s0
            if (r0 == 0) goto L5
            goto L7
        L5:
            androidx.fragment.app.n r0 = r1.f27834Z0
        L7:
            return r0
    }

    /* renamed from: E0 */
    public final void m14312E0(android.content.Context r2, androidx.fragment.app.AbstractC0375d0 r3) {
            r1 = this;
            r1.m14313F0()
            com.bumptech.glide.c r2 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r2)
            z2.l r2 = r2.f5102d0
            r0 = 0
            z2.o r2 = r2.m14303i(r3, r0)
            r1.f27832X0 = r2
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L1d
            z2.o r2 = r1.f27832X0
            java.util.Set<z2.o> r2 = r2.f27831W0
            r2.add(r1)
        L1d:
            return
    }

    /* renamed from: F0 */
    public final void m14313F0() {
            r1 = this;
            z2.o r0 = r1.f27832X0
            if (r0 == 0) goto Lc
            java.util.Set<z2.o> r0 = r0.f27831W0
            r0.remove(r1)
            r0 = 0
            r1.f27832X0 = r0
        Lc:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: T */
    public void mo1230T(android.content.Context r4) {
            r3 = this;
            super.mo1230T(r4)
            r4 = r3
        L4:
            androidx.fragment.app.n r0 = r4.f2297s0
            if (r0 == 0) goto La
            r4 = r0
            goto L4
        La:
            androidx.fragment.app.d0 r4 = r4.f2294p0
            r0 = 5
            java.lang.String r1 = "SupportRMFragment"
            if (r4 != 0) goto L1d
            boolean r4 = android.util.Log.isLoggable(r1, r0)
            if (r4 == 0) goto L1c
            java.lang.String r4 = "Unable to register fragment with root, ancestor detached"
            android.util.Log.w(r1, r4)
        L1c:
            return
        L1d:
            android.content.Context r2 = r3.m1339v()     // Catch: java.lang.IllegalStateException -> L25
            r3.m14312E0(r2, r4)     // Catch: java.lang.IllegalStateException -> L25
            goto L31
        L25:
            r4 = move-exception
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L31
            java.lang.String r0 = "Unable to register fragment with root"
            android.util.Log.w(r1, r0, r4)
        L31:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: X */
    public void mo1318X() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            z2.a r0 = r1.f27829U0
            r0.m14288a()
            r1.m14313F0()
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: Z */
    public void mo1232Z() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            r0 = 0
            r1.f27834Z0 = r0
            r1.m14313F0()
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: g0 */
    public void mo1235g0() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            z2.a r0 = r1.f27829U0
            r0.m14289b()
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: h0 */
    public void mo1236h0() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            z2.a r0 = r1.f27829U0
            r0.m14290d()
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{parent="
            r0.append(r1)
            androidx.fragment.app.n r1 = r2.m14311D0()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
