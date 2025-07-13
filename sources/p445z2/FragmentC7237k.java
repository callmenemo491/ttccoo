package p445z2;

@java.lang.Deprecated
/* renamed from: z2.k */
/* loaded from: classes.dex */
public class FragmentC7237k extends android.app.Fragment {

    /* renamed from: Y */
    public final p445z2.C7227a f27808Y;

    /* renamed from: Z */
    public final p445z2.InterfaceC7239m f27809Z;

    /* renamed from: a0 */
    public final java.util.Set<p445z2.FragmentC7237k> f27810a0;

    /* renamed from: b0 */
    public com.bumptech.glide.ComponentCallbacks2C1006j f27811b0;

    /* renamed from: c0 */
    public p445z2.FragmentC7237k f27812c0;

    /* renamed from: d0 */
    public android.app.Fragment f27813d0;

    /* renamed from: z2.k$a */
    public class a implements p445z2.InterfaceC7239m {

        /* renamed from: Y */
        public final /* synthetic */ p445z2.FragmentC7237k f27814Y;

        public a(p445z2.FragmentC7237k r1) {
                r0 = this;
                r0.f27814Y = r1
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
                z2.k r1 = r2.f27814Y
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public FragmentC7237k() {
            r2 = this;
            z2.a r0 = new z2.a
            r0.<init>()
            r2.<init>()
            z2.k$a r1 = new z2.k$a
            r1.<init>(r2)
            r2.f27809Z = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.f27810a0 = r1
            r2.f27808Y = r0
            return
    }

    /* renamed from: a */
    public final void m14292a(android.app.Activity r3) {
            r2 = this;
            r2.m14293b()
            com.bumptech.glide.c r0 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r3)
            z2.l r0 = r0.f5102d0
            java.util.Objects.requireNonNull(r0)
            android.app.FragmentManager r3 = r3.getFragmentManager()
            r1 = 0
            z2.k r3 = r0.m14302h(r3, r1)
            r2.f27812c0 = r3
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L24
            z2.k r3 = r2.f27812c0
            java.util.Set<z2.k> r3 = r3.f27810a0
            r3.add(r2)
        L24:
            return
    }

    /* renamed from: b */
    public final void m14293b() {
            r1 = this;
            z2.k r0 = r1.f27812c0
            if (r0 == 0) goto Lc
            java.util.Set<z2.k> r0 = r0.f27810a0
            r0.remove(r1)
            r0 = 0
            r1.f27812c0 = r0
        Lc:
            return
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity r3) {
            r2 = this;
            super.onAttach(r3)
            r2.m14292a(r3)     // Catch: java.lang.IllegalStateException -> L7
            goto L16
        L7:
            r3 = move-exception
            r0 = 5
            java.lang.String r1 = "RMFragment"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = "Unable to register fragment with root"
            android.util.Log.w(r1, r0, r3)
        L16:
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            z2.a r0 = r1.f27808Y
            r0.m14288a()
            r1.m14293b()
            return
    }

    @Override // android.app.Fragment
    public void onDetach() {
            r0 = this;
            super.onDetach()
            r0.m14293b()
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            z2.a r0 = r1.f27808Y
            r0.m14289b()
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            z2.a r0 = r1.f27808Y
            r0.m14290d()
            return
    }

    @Override // android.app.Fragment
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{parent="
            r0.append(r1)
            android.app.Fragment r1 = r2.getParentFragment()
            if (r1 == 0) goto L18
            goto L1a
        L18:
            android.app.Fragment r1 = r2.f27813d0
        L1a:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
