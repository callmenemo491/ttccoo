package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public class C0591h {

    /* renamed from: a */
    public final androidx.recyclerview.widget.C0591h.b f3410a;

    /* renamed from: b */
    public final androidx.recyclerview.widget.C0591h.a f3411b;

    /* renamed from: c */
    public final java.util.List<android.view.View> f3412c;

    /* renamed from: androidx.recyclerview.widget.h$a */
    public static class a {

        /* renamed from: a */
        public long f3413a;

        /* renamed from: b */
        public androidx.recyclerview.widget.C0591h.a f3414b;

        public a() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f3413a = r0
                return
        }

        /* renamed from: a */
        public void m2054a(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Ld
                androidx.recyclerview.widget.h$a r1 = r4.f3414b
                if (r1 == 0) goto L16
                int r5 = r5 - r0
                r1.m2054a(r5)
                goto L16
            Ld:
                long r0 = r4.f3413a
                r2 = 1
                long r2 = r2 << r5
                long r2 = ~r2
                long r0 = r0 & r2
                r4.f3413a = r0
            L16:
                return
        }

        /* renamed from: b */
        public int m2055b(int r7) {
                r6 = this;
                androidx.recyclerview.widget.h$a r0 = r6.f3414b
                r1 = 64
                r2 = 1
                if (r0 != 0) goto L18
                if (r7 < r1) goto L11
                long r0 = r6.f3413a
            Lc:
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L11:
                long r0 = r6.f3413a
                long r4 = r2 << r7
                long r4 = r4 - r2
                long r0 = r0 & r4
                goto Lc
            L18:
                if (r7 >= r1) goto L1b
                goto L11
            L1b:
                int r7 = r7 - r1
                int r7 = r0.m2055b(r7)
                long r0 = r6.f3413a
                int r0 = java.lang.Long.bitCount(r0)
                int r0 = r0 + r7
                return r0
        }

        /* renamed from: c */
        public final void m2056c() {
                r1 = this;
                androidx.recyclerview.widget.h$a r0 = r1.f3414b
                if (r0 != 0) goto Lb
                androidx.recyclerview.widget.h$a r0 = new androidx.recyclerview.widget.h$a
                r0.<init>()
                r1.f3414b = r0
            Lb:
                return
        }

        /* renamed from: d */
        public boolean m2057d(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Lf
                r4.m2056c()
                androidx.recyclerview.widget.h$a r1 = r4.f3414b
                int r5 = r5 - r0
                boolean r5 = r1.m2057d(r5)
                return r5
            Lf:
                long r0 = r4.f3413a
                r2 = 1
                long r2 = r2 << r5
                long r0 = r0 & r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L1d
                r5 = 1
                goto L1e
            L1d:
                r5 = 0
            L1e:
                return r5
        }

        /* renamed from: e */
        public void m2058e(int r11, boolean r12) {
                r10 = this;
                r0 = 64
                if (r11 < r0) goto Le
                r10.m2056c()
                androidx.recyclerview.widget.h$a r1 = r10.f3414b
                int r11 = r11 - r0
                r1.m2058e(r11, r12)
                goto L42
            Le:
                long r0 = r10.f3413a
                r2 = -9223372036854775808
                long r2 = r2 & r0
                r4 = 0
                r6 = 1
                r7 = 0
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 == 0) goto L1d
                r2 = 1
                goto L1e
            L1d:
                r2 = 0
            L1e:
                r3 = 1
                long r8 = r3 << r11
                long r8 = r8 - r3
                long r3 = r0 & r8
                long r8 = ~r8
                long r0 = r0 & r8
                long r0 = r0 << r6
                long r0 = r0 | r3
                r10.f3413a = r0
                if (r12 == 0) goto L31
                r10.m2061h(r11)
                goto L34
            L31:
                r10.m2054a(r11)
            L34:
                if (r2 != 0) goto L3a
                androidx.recyclerview.widget.h$a r11 = r10.f3414b
                if (r11 == 0) goto L42
            L3a:
                r10.m2056c()
                androidx.recyclerview.widget.h$a r11 = r10.f3414b
                r11.m2058e(r7, r2)
            L42:
                return
        }

        /* renamed from: f */
        public boolean m2059f(int r13) {
                r12 = this;
                r0 = 64
                if (r13 < r0) goto Lf
                r12.m2056c()
                androidx.recyclerview.widget.h$a r1 = r12.f3414b
                int r13 = r13 - r0
                boolean r13 = r1.m2059f(r13)
                return r13
            Lf:
                r0 = 1
                long r2 = r0 << r13
                long r4 = r12.f3413a
                long r6 = r4 & r2
                r8 = 0
                r13 = 1
                r10 = 0
                int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r11 == 0) goto L21
                r6 = 1
                goto L22
            L21:
                r6 = 0
            L22:
                long r7 = ~r2
                long r4 = r4 & r7
                r12.f3413a = r4
                long r2 = r2 - r0
                long r0 = r4 & r2
                long r2 = ~r2
                long r2 = r2 & r4
                long r2 = java.lang.Long.rotateRight(r2, r13)
                long r0 = r0 | r2
                r12.f3413a = r0
                androidx.recyclerview.widget.h$a r13 = r12.f3414b
                if (r13 == 0) goto L46
                boolean r13 = r13.m2057d(r10)
                if (r13 == 0) goto L41
                r13 = 63
                r12.m2061h(r13)
            L41:
                androidx.recyclerview.widget.h$a r13 = r12.f3414b
                r13.m2059f(r10)
            L46:
                return r6
        }

        /* renamed from: g */
        public void m2060g() {
                r2 = this;
                r0 = 0
                r2.f3413a = r0
                androidx.recyclerview.widget.h$a r0 = r2.f3414b
                if (r0 == 0) goto Lb
                r0.m2060g()
            Lb:
                return
        }

        /* renamed from: h */
        public void m2061h(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Le
                r4.m2056c()
                androidx.recyclerview.widget.h$a r1 = r4.f3414b
                int r5 = r5 - r0
                r1.m2061h(r5)
                goto L16
            Le:
                long r0 = r4.f3413a
                r2 = 1
                long r2 = r2 << r5
                long r0 = r0 | r2
                r4.f3413a = r0
            L16:
                return
        }

        public java.lang.String toString() {
                r3 = this;
                androidx.recyclerview.widget.h$a r0 = r3.f3414b
                if (r0 != 0) goto Lb
                long r0 = r3.f3413a
                java.lang.String r0 = java.lang.Long.toBinaryString(r0)
                goto L2b
            Lb:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                androidx.recyclerview.widget.h$a r1 = r3.f3414b
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "xx"
                r0.append(r1)
                long r1 = r3.f3413a
                java.lang.String r1 = java.lang.Long.toBinaryString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L2b:
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    public interface b {
    }

    public C0591h(androidx.recyclerview.widget.C0591h.b r1) {
            r0 = this;
            r0.<init>()
            r0.f3410a = r1
            androidx.recyclerview.widget.h$a r1 = new androidx.recyclerview.widget.h$a
            r1.<init>()
            r0.f3411b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3412c = r1
            return
    }

    /* renamed from: a */
    public void m2042a(android.view.View r2, int r3, boolean r4) {
            r1 = this;
            if (r3 >= 0) goto Lb
            androidx.recyclerview.widget.h$b r3 = r1.f3410a
            androidx.recyclerview.widget.f0 r3 = (androidx.recyclerview.widget.C0588f0) r3
            int r3 = r3.m2034b()
            goto Lf
        Lb:
            int r3 = r1.m2047f(r3)
        Lf:
            androidx.recyclerview.widget.h$a r0 = r1.f3411b
            r0.m2058e(r3, r4)
            if (r4 == 0) goto L19
            r1.m2050i(r2)
        L19:
            androidx.recyclerview.widget.h$b r4 = r1.f3410a
            androidx.recyclerview.widget.f0 r4 = (androidx.recyclerview.widget.C0588f0) r4
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3408a
            r0.addView(r2, r3)
            androidx.recyclerview.widget.RecyclerView r3 = r4.f3408a
            java.util.Objects.requireNonNull(r3)
            androidx.recyclerview.widget.RecyclerView.m1716K(r2)
            java.util.List<androidx.recyclerview.widget.RecyclerView$o> r4 = r3.f3124C0
            if (r4 == 0) goto L42
            int r4 = r4.size()
        L32:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L42
            java.util.List<androidx.recyclerview.widget.RecyclerView$o> r0 = r3.f3124C0
            java.lang.Object r0 = r0.get(r4)
            androidx.recyclerview.widget.RecyclerView$o r0 = (androidx.recyclerview.widget.RecyclerView.InterfaceC0559o) r0
            r0.mo1900b(r2)
            goto L32
        L42:
            return
    }

    /* renamed from: b */
    public void m2043b(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5, boolean r6) {
            r2 = this;
            if (r4 >= 0) goto Lb
            androidx.recyclerview.widget.h$b r4 = r2.f3410a
            androidx.recyclerview.widget.f0 r4 = (androidx.recyclerview.widget.C0588f0) r4
            int r4 = r4.m2034b()
            goto Lf
        Lb:
            int r4 = r2.m2047f(r4)
        Lf:
            androidx.recyclerview.widget.h$a r0 = r2.f3411b
            r0.m2058e(r4, r6)
            if (r6 == 0) goto L19
            r2.m2050i(r3)
        L19:
            androidx.recyclerview.widget.h$b r6 = r2.f3410a
            androidx.recyclerview.widget.f0 r6 = (androidx.recyclerview.widget.C0588f0) r6
            java.util.Objects.requireNonNull(r6)
            androidx.recyclerview.widget.RecyclerView$b0 r0 = androidx.recyclerview.widget.RecyclerView.m1716K(r3)
            if (r0 == 0) goto L52
            boolean r1 = r0.m1799p()
            if (r1 != 0) goto L4c
            boolean r1 = r0.m1805v()
            if (r1 == 0) goto L33
            goto L4c
        L33:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Called attach on a child which is not detached: "
            r4.append(r5)
            r4.append(r0)
            androidx.recyclerview.widget.RecyclerView r5 = r6.f3408a
            java.lang.String r4 = androidx.recyclerview.widget.C0589g.m2036a(r5, r4)
            r3.<init>(r4)
            throw r3
        L4c:
            int r1 = r0.f3217j
            r1 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            r0.f3217j = r1
        L52:
            androidx.recyclerview.widget.RecyclerView r6 = r6.f3408a
            androidx.recyclerview.widget.RecyclerView.m1718a(r6, r3, r4, r5)
            return
    }

    /* renamed from: c */
    public void m2044c(int r5) {
            r4 = this;
            int r5 = r4.m2047f(r5)
            androidx.recyclerview.widget.h$a r0 = r4.f3411b
            r0.m2059f(r5)
            androidx.recyclerview.widget.h$b r0 = r4.f3410a
            androidx.recyclerview.widget.f0 r0 = (androidx.recyclerview.widget.C0588f0) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.f3408a
            android.view.View r1 = r1.getChildAt(r5)
            if (r1 == 0) goto L46
            androidx.recyclerview.widget.RecyclerView$b0 r1 = androidx.recyclerview.widget.RecyclerView.m1716K(r1)
            if (r1 == 0) goto L46
            boolean r2 = r1.m1799p()
            if (r2 == 0) goto L41
            boolean r2 = r1.m1805v()
            if (r2 == 0) goto L28
            goto L41
        L28:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "called detach on an already detached child "
            r2.append(r3)
            r2.append(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r0.f3408a
            java.lang.String r0 = androidx.recyclerview.widget.C0589g.m2036a(r0, r2)
            r5.<init>(r0)
            throw r5
        L41:
            r2 = 256(0x100, float:3.59E-43)
            r1.m1785b(r2)
        L46:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f3408a
            androidx.recyclerview.widget.RecyclerView.m1719c(r0, r5)
            return
    }

    /* renamed from: d */
    public android.view.View m2045d(int r2) {
            r1 = this;
            int r2 = r1.m2047f(r2)
            androidx.recyclerview.widget.h$b r0 = r1.f3410a
            androidx.recyclerview.widget.f0 r0 = (androidx.recyclerview.widget.C0588f0) r0
            android.view.View r2 = r0.m2033a(r2)
            return r2
    }

    /* renamed from: e */
    public int m2046e() {
            r2 = this;
            androidx.recyclerview.widget.h$b r0 = r2.f3410a
            androidx.recyclerview.widget.f0 r0 = (androidx.recyclerview.widget.C0588f0) r0
            int r0 = r0.m2034b()
            java.util.List<android.view.View> r1 = r2.f3412c
            int r1 = r1.size()
            int r0 = r0 - r1
            return r0
    }

    /* renamed from: f */
    public final int m2047f(int r5) {
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L4
            return r0
        L4:
            androidx.recyclerview.widget.h$b r1 = r4.f3410a
            androidx.recyclerview.widget.f0 r1 = (androidx.recyclerview.widget.C0588f0) r1
            int r1 = r1.m2034b()
            r2 = r5
        Ld:
            if (r2 >= r1) goto L29
            androidx.recyclerview.widget.h$a r3 = r4.f3411b
            int r3 = r3.m2055b(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L27
        L1b:
            androidx.recyclerview.widget.h$a r5 = r4.f3411b
            boolean r5 = r5.m2057d(r2)
            if (r5 == 0) goto L26
            int r2 = r2 + 1
            goto L1b
        L26:
            return r2
        L27:
            int r2 = r2 + r3
            goto Ld
        L29:
            return r0
    }

    /* renamed from: g */
    public android.view.View m2048g(int r2) {
            r1 = this;
            androidx.recyclerview.widget.h$b r0 = r1.f3410a
            androidx.recyclerview.widget.f0 r0 = (androidx.recyclerview.widget.C0588f0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f3408a
            android.view.View r2 = r0.getChildAt(r2)
            return r2
    }

    /* renamed from: h */
    public int m2049h() {
            r1 = this;
            androidx.recyclerview.widget.h$b r0 = r1.f3410a
            androidx.recyclerview.widget.f0 r0 = (androidx.recyclerview.widget.C0588f0) r0
            int r0 = r0.m2034b()
            return r0
    }

    /* renamed from: i */
    public final void m2050i(android.view.View r4) {
            r3 = this;
            java.util.List<android.view.View> r0 = r3.f3412c
            r0.add(r4)
            androidx.recyclerview.widget.h$b r0 = r3.f3410a
            androidx.recyclerview.widget.f0 r0 = (androidx.recyclerview.widget.C0588f0) r0
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.RecyclerView$b0 r4 = androidx.recyclerview.widget.RecyclerView.m1716K(r4)
            if (r4 == 0) goto L28
            androidx.recyclerview.widget.RecyclerView r0 = r0.f3408a
            int r1 = r4.f3224q
            r2 = -1
            if (r1 == r2) goto L1a
            goto L22
        L1a:
            android.view.View r1 = r4.f3208a
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.c.m10555c(r1)
        L22:
            r4.f3223p = r1
            r1 = 4
            r0.m1757h0(r4, r1)
        L28:
            return
    }

    /* renamed from: j */
    public int m2051j(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.h$b r0 = r2.f3410a
            androidx.recyclerview.widget.f0 r0 = (androidx.recyclerview.widget.C0588f0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f3408a
            int r3 = r0.indexOfChild(r3)
            r0 = -1
            if (r3 != r0) goto Le
            return r0
        Le:
            androidx.recyclerview.widget.h$a r1 = r2.f3411b
            boolean r1 = r1.m2057d(r3)
            if (r1 == 0) goto L17
            return r0
        L17:
            androidx.recyclerview.widget.h$a r0 = r2.f3411b
            int r0 = r0.m2055b(r3)
            int r3 = r3 - r0
            return r3
    }

    /* renamed from: k */
    public boolean m2052k(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.f3412c
            boolean r2 = r0.contains(r2)
            return r2
    }

    /* renamed from: l */
    public final boolean m2053l(android.view.View r4) {
            r3 = this;
            java.util.List<android.view.View> r0 = r3.f3412c
            boolean r0 = r0.remove(r4)
            r1 = 0
            if (r0 == 0) goto L21
            androidx.recyclerview.widget.h$b r0 = r3.f3410a
            androidx.recyclerview.widget.f0 r0 = (androidx.recyclerview.widget.C0588f0) r0
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.RecyclerView$b0 r4 = androidx.recyclerview.widget.RecyclerView.m1716K(r4)
            if (r4 == 0) goto L1f
            androidx.recyclerview.widget.RecyclerView r0 = r0.f3408a
            int r2 = r4.f3223p
            r0.m1757h0(r4, r2)
            r4.f3223p = r1
        L1f:
            r4 = 1
            return r4
        L21:
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.recyclerview.widget.h$a r1 = r2.f3411b
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", hidden list:"
            r0.append(r1)
            java.util.List<android.view.View> r1 = r2.f3412c
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
